package ui;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class FxLijnstukApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        GridPane root = new GridPane();
        Scene scene = new Scene(root,400,400);

        LijnstukApp lijnstukApp = new LijnstukApp(root);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Lijnstuk App");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
