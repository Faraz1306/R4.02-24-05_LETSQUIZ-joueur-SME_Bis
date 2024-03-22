package org.example;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


import junit.framework.TestCase;
import junit.framework.TestSuite;

import java.util.ArrayList;


/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    public void TestNom(){
        Participant joueurs = new Participant();

        Joueur Kilian = new Joueur("Mbappe", "Kilian", "Kiki");
        //assertEquals(true, Kilian.ModifierNom(nom));
        //assertEquals(true, Kilian.SetScore(score));
        assertEquals(7, Kilian. MockGetScoreKiki());
        assertEquals("Mbappe", Kilian.MockGetNomKiki());
        assertEquals("Kilian", Kilian.MockGetPrenomKiki());
        assertEquals("Kiki",Kilian.MockGetPseudonymeKiki());
        assertEquals(true, joueurs.ajouterjoueur(Kilian));
    }
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
    /*public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        App.main(new String[3]);
        assertTrue( true );
    }
}
