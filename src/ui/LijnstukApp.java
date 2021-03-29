package ui;

import domain.LijnStuk;
import domain.Punt;

public class LijnstukApp {
    public static void main(String[] args) {
        LijnStuk lijnStuk = new LijnStuk(new Punt(12, 25), new Punt(47,89));
        System.out.println(lijnStuk);
    }
}
