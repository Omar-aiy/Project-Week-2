package domain;
import javafx.scene.paint.Color;
import java.awt.*;

public abstract class Vorm  implements Drawable {
    private Color kleur;
    private boolean isZichtbaar;

    public Vorm (Color kleur, boolean iszichtbaar){
        setKleur(kleur);
    }
    public Vorm(boolean isZichtbaar){
        kleur= Color.WHITE;
    }

    public Color getKleur() {
        return kleur;
    }

    public void setKleur(Color kleur) {
        this.kleur = kleur;
    }


    }
    public boolean isZichtbaar(){

    }
    public void setZichtbaar(boolean zichtbaar){

    }

    @Override
    public String toString() {
        return "Vorm{" +
                "kleur=" + kleur +
                '}';
    }
}
