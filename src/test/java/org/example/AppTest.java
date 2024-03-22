package org.example;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;


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
        Joueur Titouan = new Joueur("Titouan", "Deschamp", "Titi");
        //assertEquals(true, Kilian.ModifierNom(nom));
        //assertEquals(true, Kilian.SetScore(score));
        assertEquals(7, Kilian. MockGetScore());
        assertEquals("Mbappe", Kilian.MockGetNom());
        assertEquals("Kilian", Kilian.MockGetPrenom());
        assertEquals("Kiki",Kilian.MockGetPseudonyme());
        assertEquals(true, joueurs.ajouterjoueur(Kilian));
        assertEquals(7, Kilian. MockGetScore());
        assertEquals("Deschamp", Titouan.MockGetNom());
        assertEquals("Titouan", Titouan.MockGetPrenom());
        assertEquals("Titi",Titouan.MockGetPseudonyme());
        assertEquals(true, joueurs.ajouterjoueur(Titouan));
        assertEquals(true,Titouan.MockSetscore(7));
        assertEquals(4,Titouan.MockGetScore());

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
