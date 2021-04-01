package ui;

import domain.*;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;

public class DriehoekApp {
        private Label invoerHoekpunt1XLabel, invoerHoekpunt1YLabel,invoerHoekpunt2XLabel, invoerHoekpunt2YLabel,invoerHoekpunt3XLabel, invoerHoekpunt3YLabel;
        private TextField invoerHoekpunt1XTekst, invoerHoekpunt1YTekst,invoerHoekpunt2XTekst, invoerHoekpunt2YTekst,invoerHoekpunt3XTekst, invoerHoekpunt3YTekst;
        private Alert foutenboodschap = new Alert(Alert.AlertType.WARNING);

        private Punt hoekPunt1,hoekPunt2,hoekPunt3;
        private Driehoek driehoek;

        public DriehoekApp(GridPane root) {
                init(root,0);
                invoerHoekpunt3YTekst.setOnAction(ingaveY ->{
                        try {
                                Integer.parseInt(invoerHoekpunt3YTekst.getText());
                                hoekPunt1 = new Punt(Integer.parseInt(invoerHoekpunt1XTekst.getText()),Integer.parseInt(invoerHoekpunt1YTekst.getText()));
                                hoekPunt2 = new Punt(Integer.parseInt(invoerHoekpunt2XTekst.getText()),Integer.parseInt(invoerHoekpunt2YTekst.getText()));
                                hoekPunt3 = new Punt(Integer.parseInt(invoerHoekpunt3XTekst.getText()),Integer.parseInt(invoerHoekpunt3YTekst.getText()));

                                Driehoek driehoek = new Driehoek(hoekPunt1, hoekPunt2, hoekPunt3);

                                root.getChildren().clear();
                                Text uitvoer = new Text();
                                uitvoer.setText(driehoek.toString());
                                root.add(uitvoer,0,0);
                        }
                        catch(NumberFormatException e){
                                invoerHoekpunt3YTekst.clear();
                                foutenboodschap.setTitle("Warning");
                                foutenboodschap.setContentText("y-coördinaat moet een geheel getal zijn");
                                foutenboodschap.showAndWait();
                        } catch (DomainException e) {
                                foutenboodschap.setTitle("Warning");
                                foutenboodschap.setContentText(e.getMessage());
                                foutenboodschap.showAndWait();
                        }
                });
        }

        public DriehoekApp(GridPane root, Tekening tekening) {
                init(root,1);
                invoerHoekpunt3YTekst.setOnAction(ingaveY ->{
                        try {
                                Integer.parseInt(invoerHoekpunt3YTekst.getText());
                                hoekPunt1 = new Punt(Integer.parseInt(invoerHoekpunt1XTekst.getText()),Integer.parseInt(invoerHoekpunt1YTekst.getText()));
                                hoekPunt2 = new Punt(Integer.parseInt(invoerHoekpunt2XTekst.getText()),Integer.parseInt(invoerHoekpunt2YTekst.getText()));
                                hoekPunt3 = new Punt(Integer.parseInt(invoerHoekpunt3XTekst.getText()),Integer.parseInt(invoerHoekpunt3YTekst.getText()));

                                Driehoek driehoek = new Driehoek(hoekPunt1, hoekPunt2, hoekPunt3);
                                tekening.voegToe(driehoek);

                                cleanUp(root);
                        } catch(NumberFormatException e){
                                invoerHoekpunt3YTekst.clear();
                                foutenboodschap.setTitle("Warning");
                                foutenboodschap.setContentText("y-coördinaat moet een geheel getal zijn");
                                foutenboodschap.showAndWait();
                        } catch (DomainException e) {
                                foutenboodschap.setTitle("Warning");
                                foutenboodschap.setContentText(e.getMessage());
                                foutenboodschap.showAndWait();
                        }
                });
        }

        private void init(GridPane root , int teller){
                invoerHoekpunt1XLabel =  new Label("Geef de x-coördinaat van het eerste punt ");
                invoerHoekpunt1YLabel = new Label("Geef de y-coördinaat van het eerste punt ");
                invoerHoekpunt2XLabel =  new Label("Geef de x-coördinaat van het tweede punt ");
                invoerHoekpunt2YLabel = new Label("Geef de y-coördinaat van het tweede punt ");
                invoerHoekpunt3XLabel =  new Label("Geef de x-coördinaat van het derde punt ");
                invoerHoekpunt3YLabel = new Label("Geef de y-coördinaat van het derde punt ");

                invoerHoekpunt1XTekst= new TextField();
                invoerHoekpunt1YTekst = new TextField();
                invoerHoekpunt2XTekst= new TextField();
                invoerHoekpunt2YTekst = new TextField();
                invoerHoekpunt3XTekst= new TextField();
                invoerHoekpunt3YTekst = new TextField();

                root.add(invoerHoekpunt1XLabel,0,teller);
                root.add(invoerHoekpunt1XTekst,1,teller);

                invoerHoekpunt1XTekst.setOnAction(ingaveX ->{
                        try {
                                Integer.parseInt(invoerHoekpunt1XTekst.getText());
                                root.add(invoerHoekpunt1YLabel, 0, teller+1);
                                root.add(invoerHoekpunt1YTekst, 1, teller+1);
                        }
                        catch(NumberFormatException e){
                                invoerHoekpunt1XTekst.clear();
                                foutenboodschap.setTitle("Warning");
                                foutenboodschap.setContentText("x-coördinaat moet een geheel getal zijn");
                                foutenboodschap.showAndWait();
                        }
                });

                invoerHoekpunt1YTekst.setOnAction(ingaveY ->{
                        try {
                                Integer.parseInt(invoerHoekpunt1YTekst.getText());
                                root.add(invoerHoekpunt2XLabel, 0, teller+2);
                                root.add(invoerHoekpunt2XTekst, 1, teller+2);
                        }
                        catch(NumberFormatException e){
                                invoerHoekpunt1YTekst.clear();
                                foutenboodschap.setTitle("Warning");
                                foutenboodschap.setContentText("y-coördinaat moet een geheel getal zijn");
                                foutenboodschap.showAndWait();
                        }
                });

                invoerHoekpunt2XTekst.setOnAction(ingaveX ->{
                        try {
                                Integer.parseInt(invoerHoekpunt2XTekst.getText());
                                root.add(invoerHoekpunt2YLabel, 0, teller+3);
                                root.add(invoerHoekpunt2YTekst, 1, teller+3);
                        }
                        catch(NumberFormatException e){
                                invoerHoekpunt2XTekst.clear();
                                foutenboodschap.setTitle("Warning");
                                foutenboodschap.setContentText("x-coördinaat moet een geheel getal zijn");
                                foutenboodschap.showAndWait();
                        }
                });

                invoerHoekpunt2YTekst.setOnAction(ingaveY ->{
                        try {
                                Integer.parseInt(invoerHoekpunt2YTekst.getText());
                                root.add(invoerHoekpunt3XLabel, 0, teller+4);
                                root.add(invoerHoekpunt3XTekst, 1, teller+4);
                        }
                        catch(NumberFormatException e){
                                invoerHoekpunt2YTekst.clear();
                                foutenboodschap.setTitle("Warning");
                                foutenboodschap.setContentText("y-coördinaat moet een geheel getal zijn");
                                foutenboodschap.showAndWait();
                        }
                });

                invoerHoekpunt3XTekst.setOnAction(ingaveX ->{
                        try {
                                Integer.parseInt(invoerHoekpunt3XTekst.getText());
                                root.add(invoerHoekpunt3YLabel, 0, teller+5);
                                root.add(invoerHoekpunt3YTekst, 1, teller+5);
                        }
                        catch(NumberFormatException e){
                                invoerHoekpunt3XTekst.clear();
                                foutenboodschap.setTitle("Warning");
                                foutenboodschap.setContentText("x-coördinaat moet een geheel getal zijn");
                                foutenboodschap.showAndWait();
                        }
                });
        }

        private void cleanUp(GridPane root){
                root.getChildren().remove(invoerHoekpunt1XLabel);
                root.getChildren().remove(invoerHoekpunt2XLabel);
                root.getChildren().remove(invoerHoekpunt3XLabel);
                root.getChildren().remove(invoerHoekpunt1YLabel);
                root.getChildren().remove(invoerHoekpunt2YLabel);
                root.getChildren().remove(invoerHoekpunt3YLabel);

                root.getChildren().remove(invoerHoekpunt1XTekst);
                root.getChildren().remove(invoerHoekpunt2XTekst);
                root.getChildren().remove(invoerHoekpunt3XTekst);
                root.getChildren().remove(invoerHoekpunt1YTekst);
                root.getChildren().remove(invoerHoekpunt2YTekst);
                root.getChildren().remove(invoerHoekpunt3YTekst);
        }
}
