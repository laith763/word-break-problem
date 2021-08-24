package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.File;
import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    public  String string="laithbadaha";

    public  List<String> dictionary=Arrays.asList("this", "th", "is", "famous", "word", "break", "b", "r", "e", "a", "k", "br", "bre", "brea", "ak", "problem" );


    @FXML
    private TextField dictionatyTextFild;//save in dictionaty dont forget


    @FXML
    public TextField stringTextFild;

    @FXML
    public ListView<String> listView;

    @FXML
    private ImageView photo;
    @FXML
    public  Button buttonShos;

    @FXML
    void clickAWordBreak() {
        listView.getItems().clear();
        if (checkWord(dictionary, string))
        {
            listView.getItems().clear();
            listView.getItems().add("You Can Split This String");
            buttonShos.setVisible(true);
        }
        else {
            listView.getItems().clear();

            listView.getItems().add("You Can't Split This String");
            buttonShos.setVisible(false);
        }
        if (string.isEmpty() && dictionary.isEmpty() )
        {
            listView.getItems().add("You Can't Split This String");
            buttonShos.setVisible(false);
        }
    }



    @FXML
    void EnterAStringButton() {
        listView.getItems().clear();
        string=stringTextFild.getText().toLowerCase();
      ///  string.toLowerCase();
        stringTextFild.clear();
        if (string.isEmpty())
        {
            listView.getItems().add("Enter A String First");
        }

    }

    @FXML
    void EnterInDectButon() {
        listView.getItems().clear();


          //  dictionary = Collections.singletonList(dictionatyTextFild.getText());
            String str = dictionatyTextFild.getText().toLowerCase();
            dictionary = Arrays.asList(str.split(" "));
            dictionatyTextFild.clear();
            if (str.isEmpty())
             {
                 listView.getItems().add("The Dictionary Is Empty");

             }




    }
    @FXML
     public void showAWordBreak() {

        if (!string.isEmpty() && !dictionary.isEmpty() )
        {
           // listView.getItems().add("dfsafasf");
            buttonShos.setVisible(false);
            wordBreak(dictionary,string, " ");
        }
        else {

            listView.getItems().add("dfsafasf");

        }


    }

    public void  wordBreak(List<String> dictionary, String string, String output){
        



        if (string.length() == 0) {
           // System.out.println(output);
            listView.getItems().add(output);
            return ;
        }



        for (int i = 1; i <= string.length(); i++)
        {
            String prefix = string.substring(0, i);
            if (dictionary.contains(prefix)) {
                wordBreak(dictionary, string.substring(i), output + " " + prefix);


            }
        }






    }
    public  boolean checkWord(List<String> dictionary, String string)
    {
        if (string.length() == 0) {
            return true;
        }

        for (int i = 1; i <= string.length(); i++)
        {

            String prefix = string.substring(0, i);

            if (dictionary.contains(prefix) && checkWord(dictionary, string.substring(i))) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle){
        File photoFile = new File("@../../../../Desktop/HCI/image/b.png");
        Image photoImage = new Image(photoFile.toURI().toString());
        photo.setImage(photoImage);
        buttonShos.setVisible(false);


   }



}
