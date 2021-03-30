package ui;

import domain.Cirkel;
import domain.Driehoek;
import domain.Tekening;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class DriehoekApp {


        private Label invoerXLabel, invoerYLabel, invoerRadiusLabel;
        private TextField invoerX, invoerY, invoerRadius;
        private Alert foutenboodschap = new Alert(Alert.AlertType.WARNING);

        private Driehoek driehoek;
}
