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
import java.sql.*;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class personalController implements Initializable {
    @FXML
    private TableColumn<Personal,String> col_benutzername;

    @FXML
    private TableColumn<Personal,String> col_pass;

    @FXML
    private TableColumn<Personal,Integer> col_pıd;

    @FXML
    private ImageView imageView1;

    @FXML
    private TableColumn<Personal,String> pcol_adres;

    @FXML
    private TableColumn<Personal,String> pcol_gbdat;

    @FXML
    private TableColumn<Personal,String> pcol_geschlecht;

    @FXML
    private TableColumn<Personal,String> pcol_idnum;

    @FXML
    private TableColumn<Personal,String> pcol_nachname;

    @FXML
    private TableColumn<Personal,String> pcol_tel;

    @FXML
    private TableColumn<Personal,String> pcol_vorname;

    @FXML
    private Button personal_add;

    @FXML
    private Button personal_aktual;

    @FXML
    private Button personal_lösche;

    @FXML
    private TableView<Personal> personallist;
    @FXML
    private Stage stage;
    private Scene scene;
    private Parent root;

    public void switchToHomepage(ActionEvent event) throws IOException {
        root= FXMLLoader.load((getClass().getResource("homepage.fxml")));
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        scene=new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    public void personalAdd(ActionEvent event){
        try{
            FXMLLoader fxmlLoader=new FXMLLoader(getClass().getResource("addierungForm.fxml"));
            Parent root=(Parent) fxmlLoader.load();
            Stage stage=new Stage();
            stage.setTitle("Personalformular");
            stage.setScene(new Scene(root));
            stage.show();
        }catch (Exception e){
            System.out.println("nicht");
        }
    }

    public void personalUpdate(ActionEvent event){
        /*

        int pid =personallist.getSelectionModel().getSelectedItem().getIdPersonal();
        String idnummer=personallist.getSelectionModel().getSelectedItem().getIdNummer();
        String vorname=personallist.getSelectionModel().getSelectedItem().getVorname();
        String nachname=personallist.getSelectionModel().getSelectedItem().getNachname();
        String benutzername=personallist.getSelectionModel().getSelectedItem().getBenutzername();
        String pass=personallist.getSelectionModel().getSelectedItem().getPasswort();
        String gbdatum=personallist.getSelectionModel().getSelectedItem().getGeburtsdatum();
        String adresse=personallist.getSelectionModel().getSelectedItem().getAdress();
        String telno=personallist.getSelectionModel().getSelectedItem().getTelefonnummer();

        //System.out.println(pid+idnummer+vorname+nachname+benutzername+pass+gbdatum+adresse+telno);
        personalFormController p=new personalFormController();
        p.aktualiserePersonal(event,pid,idnummer,vorname,nachname,benutzername,pass,gbdatum,adresse,telno);
        //System.out.println(personallist.getSelectionModel().getSelectedItem().getIdNummer());

         */

        try{
            FXMLLoader fxmlLoader=new FXMLLoader(getClass().getResource("aktualPersonalForm.fxml"));
            Parent root=(Parent) fxmlLoader.load();
            Stage stage=new Stage();
            stage.setTitle("Personalformular");
            stage.setScene(new Scene(root));
            stage.show();
        }catch (Exception e){
            System.out.println("nicht");
        }
        
    }


    public void löscheVonPersonalList(ActionEvent event){
        personallist.getItems().removeAll(personallist.getSelectionModel().getSelectedItem());
        System.out.println(personallist.getSelectionModel().getSelectedItem().getIdNummer());
        String id=personallist.getSelectionModel().getSelectedItem().getIdNummer();
        DatabaseConnection conn= new DatabaseConnection();
        conn.löschePersonalFromDB(id);
    }



    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        File file1=new File(("C:\\Users\\Eylül\\IdeaProjects\\demo\\src\\main\\java\\com\\example\\demo\\2022-05-13 (11).png"));
        Image image1=new Image(file1.toURI().toString());
        imageView1.setImage(image1);


        pcol_idnum.setCellValueFactory(new PropertyValueFactory<>("idNummer"));
        pcol_vorname.setCellValueFactory(new PropertyValueFactory<>("vorname"));
        pcol_nachname.setCellValueFactory(new PropertyValueFactory<>("nachname"));
        pcol_gbdat.setCellValueFactory(new PropertyValueFactory<>("geburtsdatum"));
        pcol_geschlecht.setCellValueFactory(new PropertyValueFactory<>("geschlecht"));
        pcol_adres.setCellValueFactory(new PropertyValueFactory<>("adress"));
        pcol_tel.setCellValueFactory(new PropertyValueFactory<>("telefonnummer"));
        col_pıd.setCellValueFactory(new PropertyValueFactory<>("idPersonal"));
        col_benutzername.setCellValueFactory(new PropertyValueFactory<>("benutzername"));
        col_pass.setCellValueFactory(new PropertyValueFactory<>("passwort"));
        DatabaseConnection connection=new DatabaseConnection();
        personallist.setItems(connection.getDatausers());
/*
        try {
            Connection con=DatabaseConnection.getConnection();
            ResultSet rs=con.createStatement().executeQuery("SELECT * FROM mydb.personal;");
            while (rs.next()){
                System.out.println("girdi");
                observableList.addAll(new Personal(rs.getInt("Personal ID"),
                        rs.getString("Vorname"),rs.getString("Nachname"),
                        rs.getString("Benutzername"),rs.getString("Passwort")));

            }
            System.out.println(observableList);
        } catch (SQLException e) {
            e.printStackTrace();
        }




        personallist.setItems(observableList);


 */

    }

}
