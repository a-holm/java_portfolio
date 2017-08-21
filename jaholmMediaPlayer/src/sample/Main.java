package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.awt.*;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Player player = new Player("file:///J:/testvideo512kb.mp4");
        Scene scene = new Scene(player, 320,270, Color.DARKCYAN);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Jaholm Media Player");
        primaryStage.show();
//        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
//
//
//
    }


    public static void main(String[] args) {
        launch(args);
    }
}
