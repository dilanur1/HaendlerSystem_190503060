package com.example.demo;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class produktFormController implements Initializable {

    @FXML
    private TextField breite_txt;

    @FXML
    private CheckBox cb_ja;

    @FXML
    private CheckBox cb_nein;

    @FXML
    private ComboBox<String> cbox_kategorie;

    @FXML
    private TextField garantiezeit_txt;

    @FXML
    private TextField höhe_txt;

    @FXML
    private TextField lange_txt;

    @FXML
    private TextField modell_txt;

    @FXML
    private TextField preis_txt;

    @FXML
    private TextField proıdtxt;

    public TextField getBreite_txt() {
        return breite_txt;
    }

    public CheckBox getCb_ja() {
        return cb_ja;
    }

    public CheckBox getCb_nein() {
        return cb_nein;
    }

    public TextField getGarantiezeit_txt() {
        return garantiezeit_txt;
    }

    public TextField getHöhe_txt() {
        return höhe_txt;
    }

    public TextField getLange_txt() {
        return lange_txt;
    }

    public TextField getModell_txt() {
        return modell_txt;
    }

    public TextField getPreis_txt() {
        return preis_txt;
    }

    public TextField getProıdtxt() {
        return proıdtxt;
    }

    public void setBreite_txt(TextField breite_txt) {
        this.breite_txt = breite_txt;
    }

    public void setCb_ja(CheckBox cb_ja) {
        this.cb_ja = cb_ja;
    }

    public void setCb_nein(CheckBox cb_nein) {
        this.cb_nein = cb_nein;
    }

    public void setCbox_kategorie(ComboBox<?> cbox_kategorie) {
        this.cbox_kategorie = (ComboBox<String>) cbox_kategorie;
    }

    public void setGarantiezeit_txt(TextField garantiezeit_txt) {
        this.garantiezeit_txt = garantiezeit_txt;
    }

    public void setHöhe_txt(TextField höhe_txt) {
        this.höhe_txt = höhe_txt;
    }

    public void setLange_txt(TextField lange_txt) {
        this.lange_txt = lange_txt;
    }

    public void setModell_txt(TextField modell_txt) {
        this.modell_txt = modell_txt;
    }

    public void setPreis_txt(TextField preis_txt) {
        this.preis_txt = preis_txt;
    }

    public void setProıdtxt(TextField proıdtxt) {
        this.proıdtxt = proıdtxt;
    }



    public ComboBox getCbox_kategorie() {
        return cbox_kategorie;
    }
    private Stage stage;
    Scene scene;
    private Parent root;

    public void speichern(ActionEvent event) throws IOException {
        DatabaseConnection connection=new DatabaseConnection();
        connection.addProduktsToDB(Integer.parseInt(proıdtxt.getText()),Double.parseDouble(preis_txt.getText()), cbox_kategorie.getSelectionModel().getSelectedItem(),Integer.parseInt(garantiezeit_txt.getText()),modell_txt.getText(),cb_ja.getText(), Double.parseDouble(lange_txt.getText()),Double.parseDouble(breite_txt.getText()),Double.parseDouble(höhe_txt.getText()));

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        System.out.println("Sie sind erfolgreich speichern!");
        stage.close();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        cbox_kategorie.getItems().addAll("Haushaltsgerate","TV","Kleine Haus Gerate","Heizung-Kuhlung","Eingebaut");
    }
}
