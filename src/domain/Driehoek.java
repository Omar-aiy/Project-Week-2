package domain;


import javafx.scene.Node;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polyline;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Driehoek extends Vorm {
    private Punt hoekPunt1, hoekPunt2, hoekPunt3;

    public Driehoek(Punt hoekPunt1, Punt hoekPunt2, Punt hoekPunt3) {
        if (hoekPunt1 == null ||hoekPunt2 == null || hoekPunt3 == null) throw new DomainException();
        if (liggenOp1Lijn(hoekPunt1,hoekPunt2,hoekPunt3)) throw new DomainException();

        this.hoekPunt1 =hoekPunt1;
        this.hoekPunt2 = hoekPunt2;
        this.hoekPunt3 = hoekPunt3;
        this.sorteerHoekpunten();

    }

    private void sorteerHoekpunten() {
        List<Punt> puntList = new ArrayList<>();
        puntList.add(hoekPunt1);
        puntList.add(hoekPunt2);
        puntList.add(hoekPunt3);
        Collections.sort(puntList);
        this.hoekPunt1 = puntList.get(0);
        this.hoekPunt2 = puntList.get(1);
        this.hoekPunt3 = puntList.get(2);
    }

    private static boolean liggenOp1Lijn(Punt hoekPunt1, Punt hoekPunt2, Punt hoekPunt3) {
        return ((hoekPunt2.getX() - hoekPunt1.getX()) * (hoekPunt3.getY() - hoekPunt1.getY())) ==
                ((hoekPunt3.getX() - hoekPunt1.getX()) * (hoekPunt2.getY() - hoekPunt1.getY()));
    }

    public Punt getHoekPunt1() {
        return hoekPunt1;
    }

    public Punt getHoekPunt2() {
        return hoekPunt2;
    }

    public Punt getHoekPunt3() {
        return hoekPunt3;
    }
    public Omhullende getOmhullende(){
        Punt punt= new Punt(Math.min(Math.min(hoekPunt1.getX(),hoekPunt2.getX()), hoekPunt3.getX()), Math.min(Math.min(hoekPunt1.getY(),hoekPunt2.getY()), hoekPunt3.getY()));
        int punt2breedte= Math.max(Math.max(hoekPunt1.getX(), hoekPunt2.getX()),hoekPunt3.getX());
        int punt3hoogte= Math.max(Math.max(hoekPunt1.getY(), hoekPunt2.getY()),hoekPunt3.getY());
        Omhullende a = new Omhullende(punt,punt2breedte-punt.getX(), punt3hoogte-punt.getY());
        return a;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Driehoek driehoek = (Driehoek) o;
        return this.getHoekPunt1().equals(driehoek.getHoekPunt1()) &&
                this.getHoekPunt2().equals(driehoek.getHoekPunt2()) &&
                this.getHoekPunt3().equals(driehoek.getHoekPunt3());
    }

    @Override
    public String toString() {
        return "Driehoek: hoekpunt1: " + this.getHoekPunt1() + " - hoekpunt2: " + this.getHoekPunt2() + " - hoekpunt3: " + this.getHoekPunt3();
    }

    @Override
    public void teken(Pane root) {
        Polyline driehoekDak = new Polyline();
        driehoekDak.setFill(this.getKleur());
        driehoekDak.setStroke(Color.BLACK);
        driehoekDak.getPoints().addAll((double) this.getHoekPunt1().getX(), (double) this.getHoekPunt1().getY(), (double) this.getHoekPunt2().getX(),
                (double) this.getHoekPunt2().getY(), (double) this.getHoekPunt3().getX(), (double) this.getHoekPunt3().getY(),(double) this.getHoekPunt1().getX(), (double) this.getHoekPunt1().getY());
        root.getChildren().add(driehoekDak);
    }
}
