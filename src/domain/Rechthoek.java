package domain;

import javafx.scene.Node;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

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
        Rectangle rechthoekGebouw = new Rectangle(this.getLinkerBovenhoek().getX(), this.getLinkerBovenhoek().getY(), this.getBreedte(), this.getHoogte());
        rechthoekGebouw.setFill(this.getKleur());
        rechthoekGebouw.setStroke(Color.BLACK);

        root.getChildren().add(rechthoekGebouw);

    }
}
