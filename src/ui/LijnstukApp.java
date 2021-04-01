package ui;


import domain.LijnStuk;
import domain.Punt;
import domain.Tekening;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;


public class LijnstukApp {
    private Punt punt1 = new Punt(12, 25);
    private Punt punt2 = new Punt(69, 58);
    private LijnStuk lijnstuk;

    public LijnstukApp(GridPane root, Tekening tekening) {


        // Punt 2


    }
    public LijnstukApp(GridPane root){
        this(root,null);
    }

    public void makeLijnstuk() {
        this.lijnstuk.setStartEnEindPunt(punt1, punt2);
    }

}
