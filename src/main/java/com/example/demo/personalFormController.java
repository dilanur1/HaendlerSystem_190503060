package com.example.demo;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.lang.Integer.*;

import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import static java.lang.Integer.parseInt;


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

    private Stage stage;
    Scene scene;
    private Parent root;

    public void setBenutzernamefield(TextField benutzernamefield) {
        this.benutzernamefield = benutzernamefield;
    }

    public void setCheckbox_frau(CheckBox checkbox_frau) {
        this.checkbox_frau = checkbox_frau;
    }

    public void setCheckbox_mann(CheckBox checkbox_mann) {
        this.checkbox_mann = checkbox_mann;
    }

    public void setIdnum_field(TextField idnum_field) {
        this.idnum_field = idnum_field;
    }

    public void setPadres_field(TextArea padres_field) {
        this.padres_field = padres_field;
    }

    public void setPasswortfield(PasswordField passwortfield) {
        this.passwortfield = passwortfield;
    }

    public void setPgbdatum_field(TextField pgbdatum_field) {
        this.pgbdatum_field = pgbdatum_field;
    }

    public void setPid_field(TextField pid_field) {
        this.pid_field = pid_field;
    }

    public void setPnachnamefield(TextField pnachnamefield) {
        this.pnachnamefield = pnachnamefield;
    }

    public void setPtelno_field(TextField ptelno_field) {
        this.ptelno_field = ptelno_field;
    }

    public void setPvornamefield(TextField pvornamefield) {
        this.pvornamefield = pvornamefield;
    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    public void setScene(Scene scene) {
        this.scene = scene;
    }

    public void setRoot(Parent root) {
        this.root = root;
    }

    public TextField getBenutzernamefield() {
        return benutzernamefield;
    }

    public CheckBox getCheckbox_frau() {
        return checkbox_frau;
    }

    public CheckBox getCheckbox_mann() {
        return checkbox_mann;
    }

    public TextField getIdnum_field() {
        return idnum_field;
    }

    public TextArea getPadres_field() {
        return padres_field;
    }

    public PasswordField getPasswortfield() {
        return passwortfield;
    }

    public TextField getPgbdatum_field() {
        return pgbdatum_field;
    }

    public TextField getPid_field() {
        return pid_field;
    }

    public TextField getPnachnamefield() {
        return pnachnamefield;
    }

    public TextField getPtelno_field() {
        return ptelno_field;
    }

    public TextField getPvornamefield() {
        return pvornamefield;
    }

    public Stage getStage() {
        return stage;
    }

    public Scene getScene() {
        return scene;
    }

    public Parent getRoot() {
        return root;
    }

    public void speichern(ActionEvent event) throws IOException {
        DatabaseConnection connection=new DatabaseConnection();
        connection.addPersonalsToDB(idnum_field.getText(),pvornamefield.getText(),
                pnachnamefield.getText(),pgbdatum_field.getText(),checkbox_frau.getText(),padres_field.getText(),ptelno_field.getText(),
                Integer.parseInt(pid_field.getText()),benutzernamefield.getText(),passwortfield.getText());

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        System.out.println("Sie sind erfolgreich speichern!");
        stage.close();

    }
        /*
        Personal personal=new Personal(idnum_field.getText(),pvornamefield.getText(),
                pnachnamefield.getText(),pgbdatum_field.getText(),checkbox_frau.getText(),padres_field.getText(),ptelno_field.getText(),
                Integer.parseInt(pid_field.getText()),benutzernamefield.getText(),passwortfield.getText());
        personalController p1=new personalController();
        DatabaseConnection p=new DatabaseConnection();
        ObservableList<Personal> personals= p.getDatausers();//personals =tablodaki veriler listesi


        personals.add(personal);
        p1.getPersonallist().setItems(personals);
    }

         */

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
