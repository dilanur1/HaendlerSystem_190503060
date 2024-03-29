package com.example.demo;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.net.URL;
import java.sql.ResultSet;
import java.util.ResourceBundle;
import java.sql.PreparedStatement;

import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class HomepageController implements Initializable {
    @FXML
    private Label anzahlvonprodukt;
    @FXML
    private Label anzahlvonpersonal;
    @FXML
    private Label anzahlvonkunde;

    public void anzahlVonProdukt(ActionEvent event){

        
        anzahlvonprodukt.setText("3");
        produktController p=new produktController();
        anzahlvonprodukt.setText(String.valueOf(p.getArrayListpid()));
        /*
        DatabaseConnection connection=new DatabaseConnection();
        connection.sizeProduktDB();
        anzahlvonprodukt.setText("3");

         */
    }

    public void anzahlVonPersonal(ActionEvent event){
        anzahlvonpersonal.setText("3");
    }

    public void anzahlVonKunde(ActionEvent event){
            DatabaseConnection connection=new DatabaseConnection();
    }



    private Stage stage;
    Scene scene;
    private Parent root;

    public void switchToPersonal(ActionEvent event) throws IOException {

        root= FXMLLoader.load((getClass().getResource("personal.fxml")));
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        scene=new Scene(root);
        stage.setScene(scene);
        stage.show();

    }
    public void switchToProdukt(ActionEvent event) throws IOException {
        root= FXMLLoader.load((getClass().getResource("produkt.fxml")));
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        scene=new Scene(root);
        stage.setScene(scene);
        stage.show();

    }
    public void switchToKunde(ActionEvent event) throws IOException {
        root= FXMLLoader.load((getClass().getResource("kunde.fxml")));
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        scene=new Scene(root);
        stage.setScene(scene);
        stage.show();

    }
    /*public void switchToEinstellung(ActionEvent event) throws IOException {
        root= FXMLLoader.load((getClass().getResource("einstellung.fxml")));
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        scene=new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

     */
    public void switchToPV(ActionEvent event) throws IOException {
        root= FXMLLoader.load((getClass().getResource("produktVerkaufen.fxml")));

        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        scene=new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToService(ActionEvent event) throws IOException{
        root= FXMLLoader.load((getClass().getResource("service.fxml")));

        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        scene=new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void Ausloggen(ActionEvent event) throws IOException{
        root= FXMLLoader.load((getClass().getResource("login.fxml")));

        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        scene=new Scene(root);
        stage.setScene(scene);
        stage.show();
        /*
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        System.out.println("Sie sind erfolgreich ausloggen!");
        stage.close();

         */

    }

    @FXML
    private ImageView imageView1;

    @FXML
    private ImageView homepageicon;


    @FXML
    private Label startseite;
    public Label getStartseite() {
        return startseite;
    }




    ObservableList<Personal> listM;
    int index=-1;
    Connection conn=null;
    ResultSet rs=null;
    PreparedStatement pst=null;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        File file1=new File(("C:\\Users\\Eylül\\IdeaProjects\\demo\\src\\main\\java\\com\\example\\demo\\2022-05-13 (11).png"));
        Image image1=new Image(file1.toURI().toString());
        imageView1.setImage(image1);

        File file2=new File(("C:\\Users\\Eylül\\IdeaProjects\\demo\\src\\main\\java\\com\\example\\demo\\homepage-icon-8.jpg"));
        Image image2=new Image(file2.toURI().toString());
        homepageicon.setImage(image2);



    }
}
