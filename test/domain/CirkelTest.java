package domain;

import org.junit.Before;
import org.junit.Test;
import domain.Cirkel;



import static org.junit.Assert.*;

public class CirkelTest {
    private Punt geldigMiddelpunt, geldigmiddelpunt2;
    private int geldigeRadius;
    private Cirkel cirkel, cirkel2, cirkel3, cirkel4, cirkel5;


    @Before
    public void setUp() throws Exception {
        geldigMiddelpunt = new Punt(200, 300);
        geldigmiddelpunt2 = new Punt(201, 300);
        geldigeRadius = 50;
        cirkel = new Cirkel(geldigMiddelpunt, geldigeRadius);
        cirkel2 = new Cirkel(geldigMiddelpunt, geldigeRadius);
        cirkel3 = null;
        cirkel4 = new Cirkel(geldigmiddelpunt2, geldigeRadius);
        cirkel5 = new Cirkel(geldigMiddelpunt, 49);


    }


    @Test(expected = DomainException.class)
    public void test_Cirkel_Met_negatieve_straal_Gooit_IllegalargumentException() {
        new Cirkel(geldigMiddelpunt, -2);
    }

    @Test(expected = DomainException.class)
    public void test_Cirkel_Met_null_als_middelpunt_Gooit_IllegalargumentException() {
        new Cirkel(null, 5);
    }

    @Test
    public void test_Cirkel_Met_geldige_straal_en_geldig_middelpunt_Maakt_object() {
        Cirkel cirkel = new Cirkel(geldigMiddelpunt, geldigeRadius);
        assertEquals(geldigMiddelpunt, cirkel.getMiddelPunt());
        assertEquals(geldigeRadius, cirkel.getRadius(), 0.01);

    }

    @Test
    public void test_Cirkel_gelijk_wannneer_zelfde_middelpunt_en_straal_Geeft_true() {
        assertTrue(cirkel.getMiddelPunt() == cirkel2.getMiddelPunt() && cirkel.getRadius() == cirkel2.getRadius());
    }

    @Test
    public void test_Cirkel_verschillend_wanneer_cirkel2_is_null_geeft_false() {
        assertFalse(cirkel == cirkel3);
    }

    @Test
    public void test_Cirkel_verschillend_wanneer_verschillend_middelpunt_geeft_false() {
        assertFalse(cirkel == cirkel4);
    }

    @Test
    public void test_Cirkel_verschillend_wanneer_verschillend_straal_geeft_false() {
        assertFalse(cirkel == cirkel5);
    }

    @Test(expected = DomainException.class)
    public void test_Cirkel_straal_gelijk_aan_0_Gooit_IllegalargumentException() {
        new Cirkel(geldigMiddelpunt, 0);
    }











}