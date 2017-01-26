package esir3.im.libs;

import java.util.ArrayList;
import java.util.List;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {

	public LibTw myLibTw = null;
	public List<TweetIma> listTweets = null;
	public List<String> params = null;

	/**
	 * Create the test case
	 *
	 * @param testName
	 *            name of the test case
	 */
	public AppTest(String testName) {
		super(testName);
		myLibTw = new LibTw();
		params = new ArrayList<String>();

	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite() {
		return new TestSuite(AppTest.class);
	}

	/**
	 * Rigourous Test :-)
	 */
	public void testApp() {
		assertTrue(true);
	}

	public void testGetTweets() {
		params.add("@corentinHcd");
		listTweets = myLibTw.getTweetsIma(params);
		assert (listTweets != null);
	}

	public void testGetCount() {
		int count = 0;
		params.add("#Gauche");
		params.add("!Rennes");
		count = myLibTw.count(params);
		assert (count > 0);
	}
	
	
	public void testplot(){
		params.add("#Gauche");
		params.add("!Rennes");
		myLibTw.plot(params);		
	}
	
	public void testTweetGetScore() {
		String testNeutre = "Je suis heureux et triste à la fois";
		String testPositif = "Je suis heureux";
		String testSuperPositif = "Je suis heureux et genereux";
		String testNegatif = "Je suis triste";
		System.out.println("'"+testNeutre +"' --> SCORE = "+ myLibTw.tweetGetScore(testNeutre));
		System.out.println("'"+testPositif +"' --> SCORE = "+ myLibTw.tweetGetScore(testPositif));
		System.out.println("'"+testSuperPositif +"' --> SCORE = "+ myLibTw.tweetGetScore(testSuperPositif));
		System.out.println("'"+testNegatif +"' --> SCORE = "+ myLibTw.tweetGetScore(testNegatif));
	}
	
	public void testGetPropNegatif(){
		params.add("#Gauche");
		params.add("!Rennes");
		myLibTw.getPropPositif(params);
	}

}
