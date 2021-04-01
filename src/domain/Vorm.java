package domain;
import javafx.scene.Node;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import java.awt.*;

public abstract class Vorm  implements Drawable {
    private Color kleur= Color.WHITE;
    private boolean isZichtbaar;


    public Color getKleur() {
        return kleur;
    }

    public void setKleur(Color kleur) {
        this.kleur = kleur;
    }

    public boolean isZichtbaar(){
        return isZichtbaar;
    }

    protected abstract Omhullende getOmhullende();

    public void setZichtbaar(boolean zichtbaar){
        this.isZichtbaar = zichtbaar;
    }



}
