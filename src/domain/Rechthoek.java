package domain;

import org.w3c.dom.DOMException;

public class Rechthoek {
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

    public int getHoogte() {
        return Hoogte;
    }
     public String toString(){
        return "Rechthoek: Linkerbovenhoek: " + getLinkerBovenhoek().toString() + " - breedte: " + getBreedte() + " - hoogte: " + getHoogte();
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
}
