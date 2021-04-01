
package ui;

import javafx.application.Application;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import domain.*;

public class FxTekenHangManApp extends Application {
    private Button showNext = new Button("laat de volgende stap zien");

    @Override
    public void start(Stage primaryStage) {
        Pane root = new Pane();
        Scene scene = new Scene(root,400,400);
        TekeningHangMan tekening = new TekeningHangMan("Hangwoman");
        primaryStage.setScene(scene);
        root.getChildren().addAll(showNext);


        primaryStage.setTitle("hangwoman");
        primaryStage.show();
        TekenVenster t = new TekenVenster(root,tekening);

        showNext.setOnAction(eventMaakVolgendeZichtbaar -> {
            try {
                tekening.zetVolgendeZichtbaar();
                new TekenVenster(root, tekening);
            } catch (DomainException e){
               showNext.setDisable(true);
            }
        });


    }

    public static void main(String[] args) {
        launch(args);
    }
}
