package com.example.demo;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;

import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;


public class personalFormController implements Initializable {
    @FXML
    private TextField benutzernamefield;

    @FXML
    private CheckBox checkbox_frau;

    @FXML
    private CheckBox checkbox_mann;

    @FXML
    private TextField idnum_field;

    @FXML
    private TextArea padres_field;

    @FXML
    private PasswordField passwortfield;

    @FXML
    private TextField pgbdatum_field;

    @FXML
    private TextField pid_field;

    @FXML
    private TextField pnachnamefield;

    @FXML
    private TextField ptelno_field;

    @FXML
    private TextField pvornamefield;

/*
    @FXML
    public void aktualiserePersonal(ActionEvent event,int pid,String idnummer,String vorname,String nachname,String benutzername,String pass,String gbdatum,String adresse,String telno){

        pid_field.setId(String.valueOf(pid));
        idnum_field.setText(idnummer);
        pvornamefield.setText(vorname);
        pnachnamefield.setText(nachname);
        benutzernamefield.setText(benutzername);
        passwortfield.setText(pass);
        pgbdatum_field.setText(gbdatum);
        padres_field.setText(adresse);
        ptelno_field.setText(telno);



    }

 */
/*
    @FXML
    public void aktualiserePersonal(ActionEvent event)  {

        connection=DatabaseConnection.getConnection();
        String personal_id=pid_field.getText();
        String id_nummer=idnum_field.getText();
        String vorname=pvornamefield.getText();
        String nachname=pnachnamefield.getText();
        String benutzername=benutzernamefield.getText();
        String passwort=passwortfield.getText();
        String gbdatum=pgbdatum_field.getText();
        String adresse=padres_field.getText();
        String telno=ptelno_field.getText();

    }

 */



/*
    String query=null;
    Connection connection=null;
    PreparedStatement preparedStatement=null;
    Personal personal=null;
    ResultSet resultSet=null;
    private boolean update=false;
    private int personalid;



 */

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

}
