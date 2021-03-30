package ui;

import domain.*;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;


public class CirkelApp {
    private Label invoerXLabel, invoerYLabel, invoerRadiusLabel;
    private TextField invoerX, invoerY, invoerRadius;
    private Alert foutenboodschap = new Alert(Alert.AlertType.WARNING);

    private Cirkel cirkel;

    public CirkelApp(GridPane root) {

        invoerXLabel = new Label("Geef de x-coördinaat van het middelpunt van de cirkel");
        invoerX = new TextField();
        invoerYLabel = new Label("Geef de y-coördinaat van het middelpunt van de cirkel");
        invoerY = new TextField();
        invoerRadiusLabel =  new Label("Geef de straal van de cirkel");
        invoerRadius= new TextField();


        root.add(invoerRadiusLabel,0,0);
        root.add(invoerRadius,1,0);

        invoerRadius.setOnAction(eventIngaveX ->{
            try {
                Integer.parseInt(invoerRadius.getText());
                root.add(invoerRadiusLabel, 0, 1);
                root.add(invoerRadius, 1, 1);
            }
            catch(NumberFormatException e){
                invoerX.clear();
                foutenboodschap.setTitle("Warning");
                foutenboodschap.setContentText("straal moet een geheel getal zijn");
                foutenboodschap.showAndWait();
            }
        });



        root.add(invoerXLabel,0,0);
        root.add(invoerX,1,0);

        invoerX.setOnAction(eventIngaveX ->{
            try {
                Integer.parseInt(invoerX.getText());
                root.add(invoerYLabel, 0, 1);
                root.add(invoerY, 1, 1);
            }
            catch(NumberFormatException e){
                invoerX.clear();
                foutenboodschap.setTitle("Warning");
                foutenboodschap.setContentText("x coördinaat moet een geheel getal zijn");
                foutenboodschap.showAndWait();
            }
        });

        invoerY.setOnAction(eventIngaveY -> {
            try {
                cirkel = new Cirkel((new Punt(Integer.parseInt(invoerX.getText()), Integer.parseInt(invoerY.getText()))),Integer.parseInt(invoerRadius.getText()));
                root.getChildren().clear();

                Text uitvoer = new Text();
                uitvoer.setText(cirkel.toString());
                root.add(uitvoer, 0, 0);
            } catch(NumberFormatException e){

                invoerY.clear();

                foutenboodschap.setTitle("Warning");
                foutenboodschap.setContentText("y coördinaat moet een geheel getal zijn");
                foutenboodschap.showAndWait();
            }
        });
    }
}


