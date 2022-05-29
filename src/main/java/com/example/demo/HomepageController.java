package com.example.demo;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import java.sql.Connection;
import java.net.URL;
import java.sql.ResultSet;
import java.util.ResourceBundle;
import java.sql.PreparedStatement;

import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class HomepageController implements Initializable {

    @FXML
    private Button personalgoruntule;

    public Button getPersonalgoruntule() {
        return personalgoruntule;
    }

    @FXML
    private Label startseite;
    public Label getStartseite() {
        return startseite;
    }

    @FXML
    private TableView<Personal> tablepersonal;

    @FXML
    private TableColumn<Personal, String > col_benutzername;

    @FXML
    private TableColumn<Personal, Integer> col_idpersonal;

    @FXML
    private TableColumn<Personal, String> col_nachname;

    @FXML
    private TableColumn<Personal, String> col_pass;

    @FXML
    private TableColumn<Personal, String> col_vorname;
    @FXML
    private TableColumn<Personal, Integer> col_idNummer;



    @FXML
    private ComboBox cbprodukt;
    public ComboBox getCbprodukt() {
        return cbprodukt;
    }
    @FXML
    private ComboBox cbpersonal;
    public ComboBox getCbpersonal() {
        return cbpersonal;
    }
    @FXML
    private ComboBox cbkunde;
    public ComboBox getCbkunde() {
        return cbkunde;
    }
    @FXML
    private ComboBox cbeinstellung;


    public ComboBox getCbeinstellung() {
        return cbeinstellung;
    }
    private String[] produktSec={"Produkt hinzufügen","Produkt löschen","Produkte aktuailisieren"};
    private String[] personalSec={"Personal hinzufügen","Personal löschen","Personal aktuailisieren"};
    private String[] kundeSec={"Kunde hinzufügen","Kunde löschen","Kunde aktuailisieren"};
    private String[] einstellungSec={""};

    ObservableList<Personal> listM;
    int index=-1;
    Connection conn=null;
    ResultSet rs=null;
    PreparedStatement pst=null;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        cbpersonal.getItems().addAll(personalSec);
        cbkunde.getItems().addAll(kundeSec);
        cbprodukt.getItems().addAll(produktSec);

        col_idpersonal.setCellValueFactory(new PropertyValueFactory<Personal,Integer>("idPersonal"));
        col_vorname.setCellValueFactory(new PropertyValueFactory<Personal,String>("name"));
        col_nachname.setCellValueFactory(new PropertyValueFactory<Personal,String>("nachname"));
        col_benutzername.setCellValueFactory(new PropertyValueFactory<Personal,String>("benutzername"));
        col_pass.setCellValueFactory(new PropertyValueFactory<Personal,String>("passwort"));

    }
}
