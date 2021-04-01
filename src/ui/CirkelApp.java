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

    private Vorm cirkel;

    public CirkelApp(GridPane root) {

        invoerXLabel = new Label("Geef de x-coördinaat van het middelpunt van de cirkel");
        invoerX = new TextField();
        invoerYLabel = new Label("Geef de y-coördinaat van het middelpunt van de cirkel");
        invoerY = new TextField();
        invoerRadiusLabel =  new Label("Geef de straal van de cirkel");
        invoerRadius= new TextField();


        root.add(invoerRadiusLabel,0,0);
        root.add(invoerRadius,1,0);

        invoerRadius.setOnAction(eventIngaveRadius ->{
            try {
                Integer.parseInt(invoerRadius.getText());
                root.add(invoerXLabel, 0, 1);
                root.add(invoerX, 1, 1);
            }
            catch(NumberFormatException e){
                invoerX.clear();
                foutenboodschap.setTitle("Warning");
                foutenboodschap.setContentText("straal moet een geheel getal zijn");
                foutenboodschap.showAndWait();
            }
        });
         public CirkelApp(GridPane root, Tekening tekening) {
            init(root,1);
            invoerRadius.setOnAction(eventIngaveStraal -> {
                try {
                    Punt middelpunt = new Punt(Integer.parseInt(invoerX.getText()),Integer.parseInt(invoerY.getText()));
                    cirkel = new Cirkel(middelpunt, Integer.parseInt(invoerRadius.getText()));
                    tekening.voegToe(cirkel);
                    delete(root);

                } catch (NumberFormatException ne){
                    invoerStraal.clear();
                    foutenboodschap.setTitle("Warning");
                    foutenboodschap.setContentText("straal van de cirkel moet een geheel getal zijn");
                    foutenboodschap.showAndWait();
                }
                catch (DomainException e){
                    delete(root);
                    foutenboodschap.setTitle("Warning");
                    foutenboodschap.setHeaderText(null);
                    foutenboodschap.setContentText(e.getMessage());
                    foutenboodschap.showAndWait();
                }

            });


            private void init(GridPane root, int teller){
                invoerXLabel =  new Label("Geef de x-coördinaat van het middelpunt van de cirkel ");
                invoerX= new TextField();

                invoerYLabel = new Label("Geef de y-coördinaat van het middelpunt van de cirkel ");
                invoerY = new TextField();

                invoerRadiusLabel = new Label("Geef de straal van de cirkel");
                invoerRadius = new TextField();

                root.add(invoerXLabel,0,teller);
                root.add(invoerX,1,teller);

        invoerX.setOnAction(eventIngaveX ->{
            try {
                Integer.parseInt(invoerX.getText());
                root.add(invoerYLabel, 0, 2);
                root.add(invoerY, 1, 2);
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

            private void  delete(GridPane root){
                root.getChildren().remove(invoerXLabel);
                root.getChildren().remove(invoerX);
                root.getChildren().remove(invoerYLabel);
                root.getChildren().remove(invoerY);
                root.getChildren().remove(invoerRadiusLabel);
                root.getChildren().remove(invoerRadius);

            }
}


