package domain;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

import java.util.Objects;

public class Cirkel extends Vorm implements Drawable{
    private Punt middelPunt;
    private int radius;

    public Cirkel(Punt middelpunt, int straal) {
        if (middelpunt == null) throw new DomainException();
        if (straal <= 0) throw new DomainException();
        if (straal > Math.min(middelpunt.getX(), middelpunt.getY())) throw new DomainException();
        this.middelPunt = middelpunt;
        this.radius = straal;
    }

    public Punt getMiddelPunt() {
        return middelPunt;
    }

    public void setMiddelPunt(Punt middelPunt) {
        this.middelPunt = middelPunt;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public Omhullende getOmhullende(){
        Punt punt= new Punt (middelPunt.getX()-radius, middelPunt.getY()-radius);
        Omhullende a = new Omhullende(punt,radius*2, radius*2);
        return a;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cirkel cirkel = (Cirkel) o;
        return Double.compare(cirkel.radius, radius) == 0 && Objects.equals(middelPunt, cirkel.middelPunt);
    }





    @Override
    public String toString() {
        return "Cirkel met middelpunt " + getMiddelPunt().toString() + " en straal " + getRadius();
    }

    @Override
    public void teken(Pane root) {
        //kleur en fx oproepen

    }
}
