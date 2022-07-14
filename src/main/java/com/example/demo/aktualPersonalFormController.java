package com.example.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

public class aktualPersonalFormController implements Initializable {




    @FXML
    private TextArea aktual_adresse;

    @FXML
    private TextField aktual_benutzername;

    @FXML
    private TextField aktual_gbdatum;

    @FXML
    private TextField aktual_geschlecht;

    @FXML
    private TextField aktual_idnum;

    @FXML
    private TextField aktual_nachname;

    @FXML
    private TextField aktual_pass;

    @FXML
    private PasswordField aktual_pass2;

    @FXML
    private TextField aktual_personalid;

    @FXML
    private TextField aktual_telno;

    @FXML
    private TextField aktual_vorname;

    @FXML
    private Button button_adresse;

    @FXML
    private Button button_benutzername;

    @FXML
    private Button button_gbdatum;

    @FXML
    private Button button_geschlecht;

    @FXML
    private Button button_idnummer;

    @FXML
    private Button button_nachname;

    @FXML
    private Button button_pass;

    @FXML
    private Button button_telno;

    @FXML
    private Button button_vorname;

    @FXML
    private CheckBox fraucb;

    @FXML
    private CheckBox manncb;

    public TextArea getAktual_adresse() {
        return aktual_adresse;
    }

    public TextField getAktual_benutzername() {
        return aktual_benutzername;
    }

    public TextField getAktual_gbdatum() {
        return aktual_gbdatum;
    }

    public TextField getAktual_geschlecht() {
        return aktual_geschlecht;
    }

    public TextField getAktual_idnum() {
        return aktual_idnum;
    }

    public TextField getAktual_nachname() {
        return aktual_nachname;
    }

    public TextField getAktual_pass() {
        return aktual_pass;
    }

    public PasswordField getAktual_pass2() {
        return aktual_pass2;
    }

    public TextField getAktual_personalid() {
        return aktual_personalid;
    }

    public TextField getAktual_telno() {
        return aktual_telno;
    }

    public TextField getAktual_vorname() {
        return aktual_vorname;
    }

    public Button getButton_adresse() {
        return button_adresse;
    }

    public Button getButton_benutzername() {
        return button_benutzername;
    }

    public Button getButton_gbdatum() {
        return button_gbdatum;
    }

    public Button getButton_geschlecht() {
        return button_geschlecht;
    }

    public Button getButton_idnummer() {
        return button_idnummer;
    }

    public Button getButton_nachname() {
        return button_nachname;
    }

    public Button getButton_pass() {
        return button_pass;
    }

    public Button getButton_telno() {
        return button_telno;
    }

    public Button getButton_vorname() {
        return button_vorname;
    }

    public CheckBox getFraucb() {
        return fraucb;
    }

    public CheckBox getManncb() {
        return manncb;
    }

    public void setAktual_adresse(TextArea aktual_adresse) {
        this.aktual_adresse = aktual_adresse;
    }

    public void setAktual_benutzername(TextField aktual_benutzername) {
        this.aktual_benutzername = aktual_benutzername;
    }

    public void setAktual_gbdatum(TextField aktual_gbdatum) {
        this.aktual_gbdatum = aktual_gbdatum;
    }

    public void setAktual_geschlecht(TextField aktual_geschlecht) {
        this.aktual_geschlecht = aktual_geschlecht;
    }

    public void setAktual_idnum(TextField aktual_idnum) {
        this.aktual_idnum = aktual_idnum;
    }

    public void setAktual_nachname(TextField aktual_nachname) {
        this.aktual_nachname = aktual_nachname;
    }

    public void setAktual_pass(TextField aktual_pass) {
        this.aktual_pass = aktual_pass;
    }



    public void setAktual_personalid(TextField aktual_personalid) {
        this.aktual_personalid = aktual_personalid;
    }

    public void setAktual_telno(TextField aktual_telno) {
        this.aktual_telno = aktual_telno;
    }

    public void setAktual_vorname(TextField aktual_vorname) {
        this.aktual_vorname = aktual_vorname;
    }

    public void setButton_adresse(Button button_adresse) {
        this.button_adresse = button_adresse;
    }

    public void setButton_benutzername(Button button_benutzername) {
        this.button_benutzername = button_benutzername;
    }

    public void setButton_gbdatum(Button button_gbdatum) {
        this.button_gbdatum = button_gbdatum;
    }

    public void setButton_geschlecht(Button button_geschlecht) {
        this.button_geschlecht = button_geschlecht;
    }

    public void setButton_idnummer(Button button_idnummer) {
        this.button_idnummer = button_idnummer;
    }

    public void setButton_nachname(Button button_nachname) {
        this.button_nachname = button_nachname;
    }

    public void setButton_pass(Button button_pass) {
        this.button_pass = button_pass;
    }

    public void setButton_telno(Button button_telno) {
        this.button_telno = button_telno;
    }

    public void setButton_vorname(Button button_vorname) {
        this.button_vorname = button_vorname;
    }

    public void setFraucb(CheckBox fraucb) {
        this.fraucb = fraucb;
    }

    public void setManncb(CheckBox manncb) {
        this.manncb = manncb;
    }

    @FXML
    void aktualisiereAdresse(ActionEvent event) {
        DatabaseConnection connection = new DatabaseConnection();
        connection.aktualisiereAdressePersonal(aktual_adresse.getText(),Integer.parseInt(aktual_personalid.getText()));
    }

    @FXML
    void aktualisiereBenutzername(ActionEvent event) {
        DatabaseConnection connection = new DatabaseConnection();
        connection.aktualisiereBenutzername(aktual_benutzername.getText(),Integer.parseInt(aktual_personalid.getText()));
    }

    @FXML
    void aktualisiereGbdatum(ActionEvent event) {
        DatabaseConnection connection = new DatabaseConnection();
        connection.aktualisiereGbdatumPersonal(aktual_gbdatum.getText(),Integer.parseInt(aktual_personalid.getText()));
    }

    @FXML
    void aktualisiereGeschlecht(ActionEvent event) {
        DatabaseConnection connection = new DatabaseConnection();
        if(fraucb.isSelected()){
            connection.aktualisiereGeschlechtPersonal(fraucb.getText(),Integer.parseInt(aktual_personalid.getText()));
        }else if (manncb.isSelected()){
            connection.aktualisiereGeschlechtPersonal(manncb.getText(),Integer.parseInt(aktual_personalid.getText()));

        }
    }

    @FXML
    void aktualisiereIDNummer(ActionEvent event) {
        DatabaseConnection connection = new DatabaseConnection();
        connection.aktualisiereIDNummerPersonal(aktual_idnum.getText(),Integer.parseInt(aktual_personalid.getText()));
    }

    @FXML
    void aktualisiereNachname(ActionEvent event) {
        DatabaseConnection connection = new DatabaseConnection();
        connection.aktualisiereNachnamePersonal(aktual_nachname.getText(),Integer.parseInt(aktual_personalid.getText()));
    }

    @FXML
    void aktualisierePasswort(ActionEvent event) {
        DatabaseConnection connection = new DatabaseConnection();
        connection.aktualisierePasswort(aktual_pass.getText(),Integer.parseInt(aktual_personalid.getText()));


    }


    @FXML
    void aktualisiereTelno(ActionEvent event) {
        DatabaseConnection connection = new DatabaseConnection();
        connection.aktualisiereTelnoPersonal(aktual_telno.getText(),Integer.parseInt(aktual_personalid.getText()));
    }

    @FXML
    void aktualisiereVorname(ActionEvent event) {
        DatabaseConnection connection = new DatabaseConnection();
        connection.aktualisiereVornamePersonal(aktual_vorname.getText(),Integer.parseInt(aktual_personalid.getText()));
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
