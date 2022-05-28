package com.example.demo;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Objects;
import java.util.ResourceBundle;

public class LoginController implements Initializable {




    //private ImageView myImageView
    //Image myImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("loginIcon.jpeg")));
    @FXML
    private  ImageView imageView;
    //Image myImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("2022-05-13%20(11).png")));
    //Image myImage;

    @FXML
    private Label label;
    @FXML
    private TextField benutzername;
    @FXML
    private PasswordField passwort;

    public LoginController() {
        //if("C:\\Users\\Eylül\\IdeaProjects\\demo\\src\\main\\images1"!=null)myImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("C:\\\\Users\\\\Eylül\\\\IdeaProjects\\\\demo\\\\src\\\\main\\\\images1")));

    }

    public Label getLabel() {
        return label;
    }

    public TextField getBenutzername() {
        return benutzername;
    }

    public PasswordField getPasswort() {
        return passwort;
    }

    public void login() throws  IOException{
        if(benutzername.getText().isBlank() ==false && passwort.getText().isBlank() == false){
            validateLogin();
        }
        else{
            label.setText("Bitte geben Sie ihre \nBenutzername und Passwort ein.");
        }


    }
    public void validateLogin() throws IOException {

        DatabaseConnection connectNow = new DatabaseConnection();


        boolean result = connectNow.validateLogin(benutzername.getText(),passwort.getText());

        if(result == true) {
            HelloApplication m = new HelloApplication();
            m.changeScene("homepage.fxml");
        }else {
            label.setText("Falsch Passwort. \nVersuchen Sie wieder.!!!");
        }

    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

            File file=new File(("@../../../../images1/2022-05-13%20(11).png"));
            Image image=new Image(file.toURI().toString());
            imageView.setImage(image);



    }
}