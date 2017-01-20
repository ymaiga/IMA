package esir3.im.libs;

import java.util.ArrayList;
import java.util.List;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
    
    public void testGetTweets(){
    	List<String> listTweets = null;
		LibTw myLibTw = new LibTw();
		List<String> params = new ArrayList<String>();
		params.add("#Rennes");
		params.add("!Rennes");
		listTweets = myLibTw.getTweets(params);
		assert(listTweets != null);
    }
    
    public void testGetCount(){
    	int count = 0;
		LibTw myLibTw = new LibTw();
		List<String> params = new ArrayList<String>();
		params.add("#Rennes");
		params.add("!Rennes");
		count = myLibTw.count(params);
		assert(count > 0);
    }
}
