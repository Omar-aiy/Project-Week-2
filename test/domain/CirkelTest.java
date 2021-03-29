package domain;

import org.junit.Before;
import org.junit.Test;
import domain.*;


import static org.junit.Assert.*;

public class CirkelTest {
    private Punt geldigMiddelpunt;
    private int geldigeRadius;
    private Cirkel cirkel;




    @Before
    public void setUp() throws Exception {
        geldigMiddelpunt = new Punt(200, 300);
        geldigeRadius = 50;

        cirkel = new Cirkel(geldigMiddelpunt, geldigeRadius);


    }

  /*  @Test(expected = IllegalArgumentException.class)
    public void test_Cirkel_Met_null_als_middelpunt_Gooit_IllegalargumentException() {
        new Cirkel(null, geldige);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_Cirkel_Met_nul_als_straal_Gooit_IllegalargumentException() {
        new Cirkel(geldigMiddelpunt, 0);
    }


    @Test(expected = IllegalArgumentException.class)
    public void test_Cirkel_Met_straal_groter_dan_één_van_coordinaten_middelpunt_Gooit_IllegalargumentException() {
        new Cirkel(geldigMiddelpunt, 250);
    }

    @Test
    public void test_Cirkel_Met_straal_gelijk_dan_kleinste_coordinaten_middelpunt_Maakt_object() {
        Cirkel cirkel = new Cirkel(geldigMiddelpunt, maximumStraal);
        assertEquals(geldigMiddelpunt,cirkel.getMiddelpunt());
        assertEquals(maximumStraal,cirkel.getStraal(),0.01);
    }

    @Test
    public void test_Cirkel_Met_geldige_straal_en_geldig_middelpunt_Maakt_object() {
        Cirkel cirkel = new Cirkel(geldigMiddelpunt, geldigeStraal);
        assertEquals(geldigMiddelpunt,cirkel.getMiddelpunt());
        assertEquals(geldigeStraal,cirkel.getStraal(),0.01);
    }

    @Test
    public void test_getOppervlakte() {
        assertEquals(7853.9816, cirkel.getOppervlakte(), 0.001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_isPuntInCirkel_Met_null_als_punt_Gooit_IllegalargumentException() {
        cirkel.isPuntInCirkel(null);
    }

    @Test
    public void test_isPuntInCirkel_Met_punt_met_coordinaat_groter_dan_straal_Geeft_false() {
        assertFalse(cirkel.isPuntInCirkel(puntMetXGroterDanStraal));
    }

    @Test
    public void test_isPuntInCirkel_Met_punt_met_coordinaat_gelijk_aan_straal_Geeft_true() {
        assertTrue(cirkel.isPuntInCirkel(puntMetXGelijkAanStraal));
    }

    @Test
    public void test_isPuntInCirkel_Met_punt_met_coordinaat_kleiner_dan_straal_Geeft_true() {
        assertTrue(cirkel.isPuntInCirkel(puntMetXKleinerDanStraal));
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_vergrootStraal_Met_faktor_kleiner_dan_1_Gooit_IllegalargumentException() {
        cirkel.vergrootStraal(0.5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_vergrootStraal_Met_faktor_gelijk_aan_1_Gooit_IllegalargumentException() {
        cirkel.vergrootStraal(1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_vergrootStraal_Met_nieuwe_straal_groter_dan_kleinste_coordinaten_middelpunt_Gooit_IllegalargumentException() {
        cirkel.vergrootStraal(teGroteFactor);
    }

    @Test
    public void test_vergrootStraal_Met_nieuwe_straal_gelijk_aan_kleinste_coordinaten_middelpunt_Maakt_object() {
        double straal = cirkel.getStraal();
        cirkel.vergrootStraal(andereGeldigeFactor);
        assertEquals(straal*andergeldigeFactor,cirkel.getStraal(),0.0001);
    }

    @Test
    public void test_vergrootStraal_Met_nieuwe_straal_kleiner_dan_kleinste_coordinaten_middelpun_Maakt_object(){
        double straal = cirkel.getStraal();
        cirkel.vergrootStraal(geldigeFactor);
        assertEquals(straal*andergeldigeFactor,cirkel.getStraal(),0.0001);
    } */

    @Test(expected = IllegalArgumentException.class)
    public void test_Cirkel_Met_negatieve_straal_Gooit_IllegalargumentException(){
        new Cirkel(geldigMiddelpunt,-2);}

    @Test(expected = IllegalArgumentException.class)
    public void test_Cirkel_Met_null_als_middelpunt_Gooit_IllegalargumentException(){
        new Cirkel(null, 5);}


}