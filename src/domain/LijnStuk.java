package domain;
import javafx.scene.Node;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;

public class LijnStuk extends Vorm {
    private Punt startPunt;
    private Punt eindPunt;

    public LijnStuk( Punt startPunt, Punt eindPunt) {

        this.setStartEnEindPunt(startPunt, eindPunt);
    }

    public void setStartEnEindPunt(Punt startPunt, Punt eindPunt) {
        if (startPunt == eindPunt || startPunt == null || eindPunt == null)
            throw new DomainException();

        this.startPunt = startPunt;
        this.eindPunt = eindPunt;
    }

    public Punt getStartPunt() {
        return startPunt;
    }

    public Punt getEindPunt() {
        return eindPunt;
    }

    public Omhullende getOmhullende(){
        Punt punt= new Punt(Math.min(startPunt.getX(),eindPunt.getX()), Math.min(startPunt.getY(),eindPunt.getY()));
        Omhullende a = new Omhullende(punt,Math.abs((startPunt.getX()-eindPunt.getX())),Math.abs((startPunt.getY()-eindPunt.getY())));
        return a;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LijnStuk lijnStuk = (LijnStuk) o;
        return this.startPunt.equals(lijnStuk.getStartPunt()) && this.eindPunt.equals(lijnStuk.getEindPunt());
    }

    @Override
    public String toString() {
        return "Lijn: startpunt: " + this.startPunt + " - eindpunt: " + this.eindPunt;
    }

    @Override
    public void teken(Pane root) {
        Line lijnBoomstam = new Line(this.getStartPunt().getX(), this.getStartPunt().getY(), this.getEindPunt().getX(), this.getEindPunt().getY());
        lijnBoomstam.setStrokeWidth(5);
        lijnBoomstam.setStroke(Color.BLACK);
        root.getChildren().add(lijnBoomstam);
    }
}
