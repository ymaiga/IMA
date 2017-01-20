package esir3.im.libs;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.code.geocoder.Geocoder;
import com.google.code.geocoder.GeocoderRequestBuilder;
import com.google.code.geocoder.model.GeocodeResponse;
import com.google.code.geocoder.model.GeocoderRequest;
import com.google.code.geocoder.model.GeocoderResult;

import twitter4j.GeoLocation;
import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;

public class LibTw implements LibTwI {

	private static final boolean DEBUG = false;
	private Twitter twitter;

	public LibTw() {
		twitter = new TwitterFactory().getInstance();
	}

	public int getPropPositif(List<String> params) {
		// return tweetsSuperieurSeuil(params,100,).size();
		return 0;
	}

	public int getPropNegatif(List<String> params) {
		return 0;
	}

	public int count(List<String> requete) {
		int counter = 0;
		Query query = createQuery(requete);
		QueryResult result = null;

		do {
			try {
				result = twitter.search(query);
			} catch (TwitterException e) {
				e.printStackTrace();
			}
			counter += result.getCount();
		} while ((query = result.nextQuery()) != null);
		if (DEBUG) {
			System.out.println(counter);
		}
		return counter;
	}

	public List<String> getTweets(List<String> requete) {

		List<String> tweetsResult = new ArrayList<String>();

		Query query = createQuery(requete);

		QueryResult result = null;

		do {
			try {
				result = twitter.search(query);
			} catch (TwitterException e) {
				e.printStackTrace();
			}
			List<Status> tweets = result.getTweets();
			int i = 0;

			for (Status tweet : tweets) {
				if (DEBUG) {
					// System.out.println(tweet.toString());
					// i++;
					// System.out.println(i + " :=> @" +
					// tweet.getUser().getScreenName() + " - " +
					// tweet.getText());
				}

				tweetsResult.add(new TweetIma(tweet.getCreatedAt(), tweet.getText()).toString());

			}
		} while ((query = result.nextQuery()) != null);
		
		if (DEBUG) {
			System.out.println(tweetsResult.toString());
		}

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
		if(geoCoderResults.size() > 0){
			latitude = geoCoderResults.get(0).getGeometry().getLocation().getLat().floatValue();
			longitude = geoCoderResults.get(0).getGeometry().getLocation().getLng().floatValue();
		}

		return new GeoLocation(latitude, longitude);

	}

	// public int findSentiment(String tweet) {
	// int mainSentiment = 0;
	// int longest = 0;
	//
	// StanfordCoreNLP pipeline = new StanfordCoreNLP("MyPropFile.properties");
	// if (tweet != null && tweet.length() > 0) {
	// Annotation annotation = pipeline.process(tweet);
	// System.out.println(annotation.toString());
	//
	// for (CoreMap sentence :
	// annotation.get(CoreAnnotations.SentencesAnnotation.class)) {
	// System.out.println(sentence.get(SentimentClass.class));
	// }
	//
	// for (CoreMap sentence :
	// annotation.get(CoreAnnotations.SentencesAnnotation.class)) {
	// Tree tree = sentence.get(SentimentAnnotatedTree.class);
	//
	// int sentiment = RNNCoreAnnotations.getPredictedClass(tree);
	// String partText = sentence.toString();
	// if (partText.length() > longest) {
	// mainSentiment = sentiment;
	// longest = partText.length();
	// }
	// }
	// }
	//
	// return mainSentiment;
	//
	// }

	private Query createQuery(List<String> requete) {
		StringBuilder owner = new StringBuilder();
		boolean ownerFound = false;
		List<String> referenceUser = new ArrayList<String>();
		List<String> hashtag = new ArrayList<String>();
		List<String> localisation = new ArrayList<String>();

		// on divise la liste de parametre entre les filtres, les references des
		// utilisateur et le proprietaire du tweet
		for (String param : requete) {
			char typeParam = param.trim().charAt(0);
			// si on est sur un @
			if (typeParam == '@') {
				// le premier @ represente le owner du tweet
				if (!ownerFound) {
					ownerFound = true;
					owner.append(param);
				} else {
					// les autres @ sont des references d'autre utilisateurs
					referenceUser.add(param.substring(1));
				}
			} else if (typeParam == '#') {
				hashtag.add(param);
			} else if (typeParam == '!') {
				localisation.add(param);
			}
		}

		// creation de la query
		StringBuilder twitterQuery = new StringBuilder();
		// ajout du owner
		if (ownerFound) {
			twitterQuery.append(owner.toString()).append(" ");
		}
		// ajout des hashtags
		for (String tag : hashtag) {
			twitterQuery.append(tag).append(" ");
		}
		// ajout des references sur les users
		for (String reference : referenceUser) {
			twitterQuery.append(reference).append(" ");
		}
		// creation de la requête
		Query query = new Query(twitterQuery.toString());

		// pour chaque localisation
		for (String adresse : localisation) {
			// on cherche les coordonnées
			GeoLocation geo = getLocation(adresse);
			// on complète la query
			query.geoCode(geo, 62, "mi");
		}
		query.setCount(1000);
		return query;

	}

}
