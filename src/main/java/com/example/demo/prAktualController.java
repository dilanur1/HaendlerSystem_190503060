package com.example.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class prAktualController implements Initializable {
    public void setAbmessung_aendern(Button abmessung_aendern) {
        this.lange_aendern = abmessung_aendern;
    }

    public void setBreite_eingeben(TextField breite_eingeben) {
        this.breite_eingeben = breite_eingeben;
    }

    public void setGarantiezeit_aendern(Button garantiezeit_aendern) {
        this.garantiezeit_aendern = garantiezeit_aendern;
    }

    public void setGarantiezeit_eingeben(TextField garantiezeit_eingeben) {
        this.garantiezeit_eingeben = garantiezeit_eingeben;
    }

    public void setHohe_eingeben(TextField hohe_eingeben) {
        this.hohe_eingeben = hohe_eingeben;
    }

    public void setJa_eingeben(CheckBox ja_eingeben) {
        this.ja_eingeben = ja_eingeben;
    }

    public void setKategorie_aendern(Button kategorie_aendern) {
        this.kategorie_aendern = kategorie_aendern;
    }

    public void setKategorie_eingeben(ComboBox<String> kategorie_eingeben) {
        this.kategorie_eingeben = kategorie_eingeben;
    }

    public void setKideingeben(TextField kideingeben) {
        this.kideingeben = kideingeben;
    }

    public void setLagerbestand_aendern(Button lagerbestand_aendern) {
        this.lagerbestand_aendern = lagerbestand_aendern;
    }

    public void setLange_eingeben(TextField lange_eingeben) {
        this.lange_eingeben = lange_eingeben;
    }

    public void setModell_aendern(Button modell_aendern) {
        this.modell_aendern = modell_aendern;
    }

    public void setModell_eingeben(TextField modell_eingeben) {
        this.modell_eingeben = modell_eingeben;
    }

    public void setNein_eingeben(CheckBox nein_eingeben) {
        this.nein_eingeben = nein_eingeben;
    }

    public void setPreis_aendern(Button preis_aendern) {
        this.preis_aendern = preis_aendern;
    }

    public void setPreis_eingeben(TextField preis_eingeben) {
        this.preis_eingeben = preis_eingeben;
    }

    public void setPvid_aendern(Button pvid_aendern) {
        this.pvid_aendern = pvid_aendern;
    }

    public void setPvid_eingeben(TextField pvid_eingeben) {
        this.pvid_eingeben = pvid_eingeben;
    }

    public Button getAbmessung_aendern() {
        return lange_aendern;
    }

    public TextField getBreite_eingeben() {
        return breite_eingeben;
    }

    public Button getGarantiezeit_aendern() {
        return garantiezeit_aendern;
    }

    public TextField getGarantiezeit_eingeben() {
        return garantiezeit_eingeben;
    }

    public TextField getHohe_eingeben() {
        return hohe_eingeben;
    }

    public CheckBox getJa_eingeben() {
        return ja_eingeben;
    }

    public Button getKategorie_aendern() {
        return kategorie_aendern;
    }

    public ComboBox<String> getKategorie_eingeben() {
        return kategorie_eingeben;
    }

    public TextField getKideingeben() {
        return kideingeben;
    }

    public Button getLagerbestand_aendern() {
        return lagerbestand_aendern;
    }

    public TextField getLange_eingeben() {
        return lange_eingeben;
    }

    public Button getModell_aendern() {
        return modell_aendern;
    }

    public TextField getModell_eingeben() {
        return modell_eingeben;
    }

    public CheckBox getNein_eingeben() {
        return nein_eingeben;
    }

    public Button getPreis_aendern() {
        return preis_aendern;
    }

    public TextField getPreis_eingeben() {
        return preis_eingeben;
    }

    public Button getPvid_aendern() {
        return pvid_aendern;
    }

    public TextField getPvid_eingeben() {
        return pvid_eingeben;
    }

    @FXML
    private Button lange_aendern;

    @FXML
    private TextField breite_eingeben;

    @FXML
    private Button garantiezeit_aendern;

    @FXML
    private TextField garantiezeit_eingeben;

    @FXML
    private TextField hohe_eingeben;

    @FXML
    private CheckBox ja_eingeben;

    @FXML
    private Button kategorie_aendern;

    @FXML
    private ComboBox<String> kategorie_eingeben;

    @FXML
    private TextField kideingeben;

    @FXML
    private Button lagerbestand_aendern;

    @FXML
    private TextField lange_eingeben;

    @FXML
    private Button modell_aendern;

    @FXML
    private TextField modell_eingeben;

    @FXML
    private CheckBox nein_eingeben;

    @FXML
    private Button preis_aendern;

    @FXML
    private TextField preis_eingeben;

    @FXML
    private Button pvid_aendern;

    @FXML
    private TextField pvid_eingeben;
    @FXML
    private Button breite_aendern;
    @FXML
    private Button hohe_aendern;

    public Button getBreite_aendern() {
        return breite_aendern;
    }

    public Button getHohe_aendern() {
        return hohe_aendern;
    }

    public void setBreite_aendern(Button breite_aendern) {
        this.breite_aendern = breite_aendern;
    }

    public void setHohe_aendern(Button hohe_aendern) {
        this.hohe_aendern = hohe_aendern;
    }

    @FXML
    void aktualisiereLange(ActionEvent event) {
        DatabaseConnection connection = new DatabaseConnection();
        connection.aktualisiereLange(Double.parseDouble(lange_eingeben.getText()),Integer.parseInt(kideingeben.getText()));
    }
    public void aktualisiereBreite(ActionEvent event){
        DatabaseConnection connection = new DatabaseConnection();
        connection.aktualisiereBreite(Double.parseDouble(breite_eingeben.getText()),Integer.parseInt(kideingeben.getText()));

    }
    public void aktualisiereHohe(){
        DatabaseConnection connection = new DatabaseConnection();
        connection.aktualisiereHohe(Double.parseDouble(hohe_eingeben.getText()),Integer.parseInt(kideingeben.getText()));
    }

    @FXML
    void aktualisiereGarantiezeit(ActionEvent event) {
        DatabaseConnection connection = new DatabaseConnection();
        connection.aktualisiereGarantiezeit(Integer.parseInt(garantiezeit_eingeben.getText()),Integer.parseInt(kideingeben.getText()));
    }

    @FXML
    void aktualisiereKategorie(ActionEvent event) {
        DatabaseConnection connection = new DatabaseConnection();
        connection.aktualisiereKategorie(kategorie_eingeben.getSelectionModel().getSelectedItem(),Integer.parseInt(kideingeben.getText()));
    }

    @FXML
    void aktualisiereLagerbestand(ActionEvent event) {
        DatabaseConnection connection = new DatabaseConnection();
        if(ja_eingeben.isSelected()){
            connection.aktualisiereLagerbestand(ja_eingeben.getText(),Integer.parseInt(kideingeben.getText()));
        }else if (nein_eingeben.isSelected()){
            connection.aktualisiereLagerbestand(nein_eingeben.getText(),Integer.parseInt(kideingeben.getText()));

        }
    }

    @FXML
    void aktualisiereModell(ActionEvent event) {
        DatabaseConnection connection = new DatabaseConnection();
        connection.aktualisiereModell(modell_eingeben.getText(),Integer.parseInt(kideingeben.getText()));

    }

    @FXML
    void aktualisierePVID(ActionEvent event) {
        DatabaseConnection connection = new DatabaseConnection();
        connection.aktualisierePVID(Integer.parseInt(pvid_eingeben.getText()),Integer.parseInt(kideingeben.getText()));

    }

    @FXML
    void aktualisierePreis(ActionEvent event) {
        DatabaseConnection connection = new DatabaseConnection();
        connection.aktualisierePreis(Double.parseDouble(preis_eingeben.getText()),Integer.parseInt(kideingeben.getText()));

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        kategorie_eingeben.getItems().addAll("Haushaltsgeraete","TV","Kleine Haus Geraete","Heizung-Kuehlung","Eingebaut");
    }
}

