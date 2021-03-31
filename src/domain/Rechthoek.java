package domain;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import org.w3c.dom.DOMException;

import java.util.Objects;

public class Rechthoek extends Vorm {
    private Punt LinkerBovenhoek;
    private int Breedte;
    private int Hoogte;

    public Rechthoek(Punt hoek, int b, int h){
        if (b > 0) {
            this.Breedte = b;
        } else {
            throw new DomainException("Cannot be less then zero");
        }
        if (h > 0) {
            this.Hoogte = h;
        } else {
            throw new DomainException("Cannot be less then zero");
        }
        if (hoek != null) {
            this.LinkerBovenhoek = hoek;
        } else {
            throw new DomainException("Cannot be less then zero");
        }
    }



    public Punt getLinkerBovenhoek() {
        return LinkerBovenhoek;
    }

    public int getBreedte() {
        return Breedte;
    }

    @Override
    public Omhullende getOmhullende(){
        Omhullende a = new Omhullende(LinkerBovenhoek,Breedte,Hoogte);
        return a;
    }

    public int getHoogte() {
        return Hoogte;
    }
     public String toString(){
        return "Rechthoek: Linkerbovenhoek: " + getLinkerBovenhoek().toString() + " - breedte: " + getBreedte() + " - hoogte: " + getHoogte() + "\n" + getOmhullende().toString();
     }

     public boolean equals(Rechthoek a){
        if (a == null){
            return false;
        } else {
            if (a.getHoogte() == Hoogte && a.getBreedte() == Breedte && a.getLinkerBovenhoek().equals(LinkerBovenhoek)){
                return true;
            } else {
                return false;
            }
        }
     }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Rechthoek)) return false;
        Rechthoek rechthoek = (Rechthoek) o;
        return Breedte == rechthoek.Breedte &&
                Hoogte == rechthoek.Hoogte &&
                Objects.equals(LinkerBovenhoek, rechthoek.LinkerBovenhoek);
    }

    @Override
    public void teken(Pane root) {

    }
}
