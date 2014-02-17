package net.jwnaylor.git.experience;

import junit.framework.TestCase;

/**
 * Unit test for simple App.
 */
public class SayHelloMessageTest extends TestCase {
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
	
    public SayHelloMessageTest( String testName )
    {
        super( testName );
    }

    /**
     * Rigourous Test :-)
     */
    public void testSayHello()
    {
        assertEquals( "Did not say hello", "Hello World!", new SayHelloMessage().toString());
    }
}
