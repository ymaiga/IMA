package esir3.im.libs;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.google.code.geocoder.Geocoder;
import com.google.code.geocoder.GeocoderRequestBuilder;
import com.google.code.geocoder.model.GeocodeResponse;
import com.google.code.geocoder.model.GeocoderRequest;
import com.google.code.geocoder.model.GeocoderResult;

import twitter4j.GeoLocation;
import twitter4j.Paging;
import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;

public class LibTw implements LibTwI {

	private static final boolean DEBUG = false;
	private Twitter twitter;
	private Dictionnaire dico;

	public LibTw() {
		twitter = new TwitterFactory().getInstance();
		dico = new Dictionnaire();
	}

	// renvoi le nombre de tweet
	public int count(List<String> requete) {
		return getTweetsIma(requete).size();
	}

	// renvoie les tweets sous forme de string
	public String getTweets(List<String> requete) {
		return getTweetsIma(requete).toString();
	}

	// renvoi une liste de date
	public String plot(List<String> requete) {
		List<String> res = new ArrayList<String>();
		List<TweetIma> list = getTweetsIma(requete);
		for (TweetIma ima : list) {
			SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
			String formattedDate = formatter.format(ima.getDate());
			//			res.add(formattedDate);

			res.add(getDay(ima.getDate().getDay()));
		}

		PlotIma.plot(res);
		return res.toString();
	}

	private String getDay(int day) {

		String res = "";
		switch (day) {
		case 0:
			res = "7.Dimanche";
			break;
		case 1:
			res = "1.Lundi";
			break;
		case 2:
			res = "2.Mardi";
			break;
		case 3:
			res = "3.Mercredi";
			break;
		case 4:
			res = "4.Jeudi";
			break;
		case 5:
			res = "5.Vendredi";
			break;
		case 6:
			res = "6.Samedi";
			break;

		default:
			break;
		}
		
		return res;
	}

	// recupere les tweets sous forme de list d'objet TweetIma
	public List<TweetIma> getTweetsIma(List<String> requete) {

		StringBuilder owner = new StringBuilder();
		List<String> filtres = new ArrayList<String>();
		List<String> localisations = new ArrayList<String>();
		List<TweetIma> tweetsResult = new ArrayList<TweetIma>();

		boolean userTimeLineRequest = false;
		for (String param : requete) {
			char typeParam = param.trim().charAt(0);

			// le owner est le premier @ que l'on croise, les autres @ sont des
			// filtres
			if (typeParam == '@' && !userTimeLineRequest) {
				owner.append(param.substring(1).trim());
				userTimeLineRequest = true;
			} else if (typeParam == '!') {
				localisations.add(param.substring(1).trim());
			} else {
				filtres.add(param.trim());
			}
		}

		if (userTimeLineRequest) {
			tweetsResult = requestUserTimeLine(owner.toString().trim(), filtres, localisations);
		} else {
			tweetsResult = tweetSearch(filtres, localisations);
		}

		if (DEBUG) {
			System.out.println("DEBUG : ");
			for (TweetIma tweet : tweetsResult) {
				System.out.println(tweet);
			}
		}
		return tweetsResult;
	}

	// recupere la time line d'un utilisateur
	private List<TweetIma> requestUserTimeLine(String owner, List<String> filtre, List<String> localisations) {

		List<TweetIma> tweetsResult = new ArrayList<TweetIma>();

		List<Status> statuses = null;
		try {
			statuses = twitter.getUserTimeline(owner, new Paging(1, 200));
		} catch (TwitterException e) {

		}
		GeoLocation geo = null;
		// si il y a une adresse
		if (!localisations.isEmpty()) {
			geo = getLocation(localisations.get(0));
		}

		// si il y a des tweets
		if (statuses != null) {
			// si il y a des filtres
			if (!filtre.isEmpty()) {
				for (Status tweet : statuses) {
					// pour chaque tweet on verifie que tout les filtres sont
					// dans le tweet
					if (!AllFiltrePresentInTweet(filtre, tweet.getText())) {
						statuses.remove(tweet);
					}
				}
			}
			// si on a un filtre de localisation
			if (geo != null) {
				for (Status tweet : statuses) {
					// si la localisation est mauvaise
					if (tweet.getGeoLocation() != null && !tweet.getGeoLocation().equals(geo)) {
						statuses.remove(tweet);
					}
				}
			}
			for (Status tweet : statuses) {
				TweetIma tweetIma = new TweetIma(tweet.getCreatedAt(), tweet.getText());
				tweetsResult.add(tweetIma);
			}
		}

		return tweetsResult;
	}

	// Verifie que tout les filtres sont présent dans le tweet
	private boolean AllFiltrePresentInTweet(List<String> filtres, String tweetText) {
		boolean allFiltrePresent = true;
		for (String filtre : filtres) {
			if (!tweetText.contains(filtre)) {
				allFiltrePresent = false;
				break;
			}
		}
		return allFiltrePresent;
	}

	// requête non timeLine
	private List<TweetIma> tweetSearch(List<String> filtres, List<String> localisations) {

		// creation de la query
		List<TweetIma> tweetsResult = new ArrayList<TweetIma>();

		StringBuilder twitterQuery = new StringBuilder();

		// ajout des filtres
		for (String filtre : filtres) {
			twitterQuery.append(filtre).append(" ");
		}

		// creation de la requête
		Query query = new Query(twitterQuery.toString().trim());

		// pour chaque localisation
		for (String adresse : localisations) {
			// on cherche les coordonnées
			GeoLocation geo = getLocation(adresse);
			// on complète la query
			query.geoCode(geo, 62, "mi");
		}
		query.setCount(1000);
		QueryResult result = null;
		do {
			try {
				result = twitter.search(query);
			} catch (TwitterException e) {
				e.printStackTrace();
			}
			List<Status> tweets = result.getTweets();
			for (Status tweet : tweets) {
				TweetIma tweetIma = new TweetIma(tweet.getCreatedAt(), tweet.getText());
				tweetsResult.add(tweetIma);
			}
		} while ((query = result.nextQuery()) != null);

		return tweetsResult;
	}

	// transforme une adresse en longitude et latitude
	private GeoLocation getLocation(String adresse) {

		final Geocoder geocoder = new Geocoder();
		// Paris par défault
		float latitude = 48.85f;
		float longitude = 2.35f;

		// on créé une requête geoCoder
		GeocoderRequest geocoderRequest = new GeocoderRequestBuilder().setAddress(adresse).getGeocoderRequest();
		GeocodeResponse geocoderResponse = null;
		try {
			geocoderResponse = geocoder.geocode(geocoderRequest);
		} catch (IOException e) {
			e.printStackTrace();
		}
		// resulte
		List<GeocoderResult> geoCoderResults = geocoderResponse.getResults();
		if (geoCoderResults.size() > 0) {
			latitude = geoCoderResults.get(0).getGeometry().getLocation().getLat().floatValue();
			longitude = geoCoderResults.get(0).getGeometry().getLocation().getLng().floatValue();
		}

		return new GeoLocation(latitude, longitude);

	}

	public int tweetGetScore(String tweet) {
		// diviser le tweet en mots
		ArrayList<String> wordsList = new ArrayList<String>(Arrays.asList(tweet.split(" ")));
		ArrayList<String> wordsListFiltered = dico.filter(wordsList);
		return dico.getScore(wordsListFiltered);
	}

	public int getPropPositif(List<String> params) {
		int counter = 0;
		List<TweetIma> tweets = getTweetsIma(params);
		for (TweetIma tweet : tweets) {
			if (tweetGetScore(tweet.getText()) > 0) {
				counter++;
			}
		}
		return counter;
	}

	public int getPropNegatif(List<String> params) {
		int counter = 0;
		List<TweetIma> tweets = getTweetsIma(params);
		for (TweetIma tweet : tweets) {
			if (tweetGetScore(tweet.getText()) < 0) {
				counter++;
			}
		}
		return counter;
	}

}
