package ui;

import domain.Punt;
import domain.Rechthoek;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;

public class RechthoekApp {
        private Label invoerXLabel, invoerYLabel, invoerHoogteLabel, invoerBreedteLabel;
        private TextField invoerX, invoerY, invoerHoogte, invoerBreedte;
        private Alert foutenboodschap = new Alert(Alert.AlertType.WARNING);

        private Rechthoek rechthoek;

        public RechthoekApp(GridPane root) {

            invoerBreedteLabel = new Label("Geef de breedte van de rechthoek ");
            invoerBreedte = new TextField();
            invoerHoogteLabel = new Label("Geef de hoogte van de rechthoek ");
            invoerHoogte = new TextField();
            invoerXLabel =  new Label("Geef de x-coördinaat van het punt ");
            invoerX= new TextField();
            invoerYLabel = new Label("Geef de y-coördinaat van het punt ");
            invoerY = new TextField();


            root.add(invoerBreedteLabel,0,0);
            root.add(invoerBreedte,1,0);

            invoerHoogte.setOnAction(eventIngaveX ->{
                try {
                    Integer.parseInt(invoerBreedteLabel.getText());
                    root.add(invoerHoogteLabel, 0, 1);
                    root.add(invoerHoogte, 1, 1);
                }
                catch(NumberFormatException e){
                    invoerX.clear();
                    foutenboodschap.setTitle("Warning");
                    foutenboodschap.setContentText("Breedte moet een geheel getal zijn");
                    foutenboodschap.showAndWait();
                }
            });

            root.add(invoerHoogteLabel,0,0);
            root.add(invoerHoogte,1,0);

            invoerBreedte.setOnAction(eventIngaveX ->{
                try {
                    Integer.parseInt(invoerHoogteLabel.getText());
                    root.add(invoerBreedteLabel, 0, 1);
                    root.add(invoerBreedte, 1, 1);
                }
                catch(NumberFormatException e){
                    invoerX.clear();
                    foutenboodschap.setTitle("Warning");
                    foutenboodschap.setContentText("Hoogte moet een geheel getal zijn");
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
                    rechthoek = new Rechthoek((new Punt(Integer.parseInt(invoerX.getText()), Integer.parseInt(invoerY.getText()))),Integer.parseInt(invoerBreedte.getText()),Integer.parseInt(invoerHoogte.getText()));
                    root.getChildren().clear();

                    Text uitvoer = new Text();
                    uitvoer.setText(rechthoek.toString());
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

