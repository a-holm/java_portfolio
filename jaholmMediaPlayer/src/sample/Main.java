package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.paint.Color;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import java.io.File;
import java.net.MalformedURLException;

public class Main extends Application {
    FileChooser fileChooser;
    //Change this to a local file
    Player player = new Player("file:///J:/sample.mp4");

    public void start(final Stage primaryStage) throws Exception{
        MenuItem open = new MenuItem("Open");
        Menu file = new Menu("File");
        MenuBar menu = new MenuBar();

        file.getItems().add(open);
        menu.getMenus().add(file);

        fileChooser = new FileChooser();

        open.setOnAction(new EventHandler<ActionEvent>() {

            public void handle(ActionEvent event) {
                System.out.println("test1");
                player.player.pause();

                File file = fileChooser.showOpenDialog(primaryStage);

                if (file != null){
                    try {
                        player = new Player(file.toURI().toURL().toExternalForm());
                        Scene scene = new Scene(player, 560,380, Color.DARKCYAN);
                        primaryStage.setScene(scene);
                    } catch (MalformedURLException e1){

                        e1.printStackTrace();
                    }
                }
            }
        });

        player.setTop(menu);
        Scene scene = new Scene(player, 560,380, Color.DARKCYAN);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Jaholm Media Player");
        primaryStage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }
}
