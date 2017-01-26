package esir3.im.libs;

import java.util.List;

public interface LibTwI {
	
	/**
	 * Retourne les tweets d'une requête
	 * @param params 
	 * @return liste de tweetsIma
	 */
	public List<TweetIma> getTweetsIma(List<String> requete);
	
	/**
	 * Retourne les tweets d'une requête 
	 * @param params 
	 * @return liste de tweets string
	 */
	public String getTweets(List<String> requete);
	
	
	public String plot(List<String> requete);
	

	/**
	 * Retourne le nombre de tweets retournés par la reqête
	 * @param requete
	 * @return nombre de tweet
	 */
	public int count(List<String> requete);

	
	/**
	 * 
	 * @param params
	 * @return
	 */
	public int getPropPositif(List<String> params);
	
	/**
	 * @param params
	 * @return
	 */
	public int getPropNegatif(List<String> params);

}
