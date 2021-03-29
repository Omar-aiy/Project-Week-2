package domain;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import domain.Speler;

public class SpelerTest {

    private String naam;
    private String anderenaam;
    private int positiveScore;
    private int negativeScore;
    private Speler speler;

    @Before
    public void setUp() throws Exception {
        naam = "Lars";
        anderenaam = "Lies";
        positiveScore = 5;
        negativeScore = -5;
        speler = new Speler(naam);
    }

    @Test
    public void Speler_moet_speler_aanmaken_met_gegeven_naam() {
        speler = new Speler(naam);
        assertEquals(naam, speler.getNaam());
        assertEquals(0, speler.getScore());
    }

    @Test (expected = DomainException.class)
    public void Speler_moet_exception_gooien_als_naam_null() {
        speler = new Speler(null);
    }

    @Test (expected = DomainException.class)
    public void Speler_moet_exception_gooien_als_naam_bestaat_uit_enkel_spaties() {
        speler = new Speler("   ");
    }

    @Test
    public void equals_moet_true_teruggeven_als_naam_en_score_gelijk_zijn(){
        speler.addToScore(positiveScore);
        Speler andereSpeler = new Speler(naam);
        andereSpeler.addToScore(positiveScore);

        assertTrue(speler.equals(andereSpeler));
    }

    @Test
    public void equals_moet_false_teruggeven_als_parameter_null(){
        assertFalse(speler.equals(null));
    }
