package ui;

import domain.Rechthoek;
import domain.Punt;

public class RechthoekApp {
    public static void main(String[] args) {
        Rechthoek rechthoek = new Rechthoek((new Punt(10,20)),22,23);
        System.out.println(rechthoek.toString());
    }
}
