package com.example.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.CheckBox;

import java.net.URL;
import java.util.ResourceBundle;

public class kundeAktualController implements Initializable {

    @FXML
    private TextArea aktual_adresse;

    @FXML
    private TextField aktual_gbdatum;

    @FXML
    private TextField aktual_geschlecht;

    @FXML
    private TextField aktual_idnum;

    @FXML
    private TextField aktual_kid;

    @FXML
    private TextField aktual_nachname;

    @FXML
    private TextField aktual_telno;

    @FXML
    private TextField aktual_vorname;

    @FXML
    private TextField aktual_pvid;

    @FXML
    private Button button_adresse;

    @FXML
    private Button button_gbdatum;

    @FXML
    private Button button_geschlecht;

    @FXML
    private Button button_idnummer;

    @FXML
    private Button button_kid;

    @FXML
    private Button button_nachname;

    @FXML
    private Button button_telno;

    @FXML
    private Button button_vorname;

    @FXML
    private Button button_pvid;
    @FXML
    private CheckBox fraucb;

    @FXML
    private CheckBox manncb;

    @FXML
    void aktualisiereKundenlist(ActionEvent event) {

    }

    @FXML
    void aktualisiereAdresse(ActionEvent event) {
        //System.out.println(aktual_adresse.getText());
        DatabaseConnection connection = new DatabaseConnection();
        connection.aktualisiereAdresseDB(aktual_adresse.getText(),Integer.parseInt(aktual_kid.getText()));
    }

    @FXML
    void aktualisiereGbdatum(ActionEvent event) {

        DatabaseConnection connection = new DatabaseConnection();
        connection.aktualisiereGbdatumDB(aktual_gbdatum.getText(),Integer.parseInt(aktual_kid.getText()));
    }

    @FXML
    void aktualisiereGeschlecht(ActionEvent event) {
        DatabaseConnection connection = new DatabaseConnection();
        if(fraucb.isSelected()){
            connection.aktualisiereGeschlechtDB(fraucb.getText(),Integer.parseInt(aktual_kid.getText()));
        }else if (manncb.isSelected()){
            connection.aktualisiereGeschlechtDB(manncb.getText(),Integer.parseInt(aktual_kid.getText()));

        }
    }

    @FXML
    void aktualisiereIDNummer(ActionEvent event) {
        DatabaseConnection connection = new DatabaseConnection();
        connection.aktualisiereIDNummer(aktual_idnum.getText(),Integer.parseInt(aktual_kid.getText()));
    }

    @FXML
    void aktualisiereNachname(ActionEvent event) {
        DatabaseConnection connection = new DatabaseConnection();
        connection.aktualisiereNachname(aktual_nachname.getText(),Integer.parseInt(aktual_kid.getText()));
    }

    @FXML
    void aktualisiereTelno(ActionEvent event) {
        DatabaseConnection connection = new DatabaseConnection();
        connection.aktualisiereTelno(aktual_telno.getText(),Integer.parseInt(aktual_kid.getText()));
    }

    @FXML
    void aktualisiereVorname(ActionEvent event) {
        DatabaseConnection connection = new DatabaseConnection();
        connection.aktualisiereVorname(aktual_vorname.getText(),Integer.parseInt(aktual_kid.getText()));
    }

    @FXML
    void aktualisierePVID(ActionEvent event) {
        DatabaseConnection connection = new DatabaseConnection();
        connection.aktualisierePVIDdb(Integer.parseInt(aktual_pvid.getText()),Integer.parseInt(aktual_kid.getText()));
    }

    public TextArea getAktual_adresse() {
        return aktual_adresse;
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

    public TextField getAktual_kid() {
        return aktual_kid;
    }

    public TextField getAktual_nachname() {
        return aktual_nachname;
    }

    public TextField getAktual_telno() {
        return aktual_telno;
    }

    public TextField getAktual_vorname() {
        return aktual_vorname;
    }

    public TextField getAktual_pvid() {
        return aktual_pvid;
    }

    public Button getButton_adresse() {
        return button_adresse;
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

    public Button getButton_kid() {
        return button_kid;
    }

    public Button getButton_nachname() {
        return button_nachname;
    }

    public Button getButton_telno() {
        return button_telno;
    }

    public Button getButton_vorname() {
        return button_vorname;
    }

    public Button getButton_pvid() {
        return button_pvid;
    }

    public void setAktual_adresse(TextArea aktual_adresse) {
        this.aktual_adresse = aktual_adresse;
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

    public void setAktual_kid(TextField aktual_kid) {
        this.aktual_kid = aktual_kid;
    }

    public void setAktual_nachname(TextField aktual_nachname) {
        this.aktual_nachname = aktual_nachname;
    }

    public void setAktual_telno(TextField aktual_telno) {
        this.aktual_telno = aktual_telno;
    }

    public void setAktual_vorname(TextField aktual_vorname) {
        this.aktual_vorname = aktual_vorname;
    }

    public void setAktual_pvid(TextField aktual_pvid) {
        this.aktual_pvid = aktual_pvid;
    }

    public void setButton_adresse(Button button_adresse) {
        this.button_adresse = button_adresse;
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

    public void setButton_kid(Button button_kid) {
        this.button_kid = button_kid;
    }

    public void setButton_nachname(Button button_nachname) {
        this.button_nachname = button_nachname;
    }

    public void setButton_telno(Button button_telno) {
        this.button_telno = button_telno;
    }

    public void setButton_vorname(Button button_vorname) {
        this.button_vorname = button_vorname;
    }

    public void setButton_pvid(Button button_pvid) {
        this.button_pvid = button_pvid;
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}