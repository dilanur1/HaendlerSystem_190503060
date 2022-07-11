package com.example.demo;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class produktFormController implements Initializable {
    @FXML
    private ComboBox<String> cbox_kategorie;

    public ComboBox getCbox_kategorie() {
        return cbox_kategorie;
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        cbox_kategorie.getItems().addAll("Haushaltsgeräte","TV","Kleine Haus Geräte","Heizung-Kühlung","Eingebaut");
    }
}
