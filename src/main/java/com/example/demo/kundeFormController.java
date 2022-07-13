package com.example.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class kundeFormController implements Initializable {

    @FXML
    private CheckBox cb_frau;

    @FXML
    private CheckBox cb_mann;

    @FXML
    private TextArea kadress_txt;

    @FXML
    private TextField kgbdat_txt;

    @FXML
    private TextField kidnum_txt;

    @FXML
    private TextField knachn_txt;

    @FXML
    private TextField ktelno_txt;

    @FXML
    private TextField kundeıd_txt;

    @FXML
    private TextField kvorn_txt;
    @FXML
    private ComboBox zahlmethod_txt;

    @FXML
    void speichern(ActionEvent event) throws IOException {
        DatabaseConnection connection=new DatabaseConnection();
        connection.addKundenToDB(kidnum_txt.getText(),kvorn_txt.getText(),
                knachn_txt.getText(),kgbdat_txt.getText(),cb_frau.getText(),
                kadress_txt.getText(),ktelno_txt.getText(),
                Integer.parseInt(kundeıd_txt.getText()), (String) zahlmethod_txt.getSelectionModel().getSelectedItem());

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        System.out.println("Sie sind erfolgreich speichern!");
        stage.close();
    }

    public void infosInForm(ActionEvent event){
        kidnum_txt.setText("hkhk");
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        zahlmethod_txt.getItems().addAll("Kreditkarte" , "Barzahlung");
    }
}
