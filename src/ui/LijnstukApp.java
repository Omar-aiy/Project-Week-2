package ui;


import domain.LijnStuk;
import domain.Punt;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;


public class LijnstukApp {
    private Punt punt1 = new Punt(12, 25);
    private Punt punt2 = new Punt(69, 58);
    private LijnStuk lijnstuk;

    public LijnstukApp(GridPane root) {
        // Punt 1

        // Punt 2

        this.punt1 = new PuntApp(root).getPunt();
        root = new GridPane();

        this.punt2 = new PuntApp(root).getPunt();

        this.lijnstuk = new LijnStuk();
        this.makeLijnstuk();
    }

    public void makeLijnstuk() {
        this.lijnstuk.setStartEnEindPunt(punt1, punt2);
    }

}
