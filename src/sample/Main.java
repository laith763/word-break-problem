package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("login.fxml"));
        primaryStage.setTitle("Project1");
       // List<String> dictionary = Arrays.asList("laith", "badaha","l","a","i","t" ,"h" ,"lai" ,"th" );
        ////getText()
        // input string
       // String string = "laithbadaha";
       // Controller.wordBreak(Controller.dictionary, string, "");


        primaryStage.setScene(new Scene(root, 520, 340));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
