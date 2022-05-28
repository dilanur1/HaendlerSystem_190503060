package com.example.demo;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class HomepageController implements Initializable {
    @FXML
    private Label startseite;

    public Label getStartseite() {
        return startseite;
    }
    @FXML
    private Label produkt;

    public Label getProdukt() {
        return produkt;
    }
    @FXML
    private Label personal;

    public Label getPersonal() {
        return personal;
    }
    @FXML
    private Label kunde;

    public Label getKunde() {
        return kunde;
    }
    @FXML
    private Label einstellung;

    public Label getEinstellung() {
        return einstellung;
    }
    @FXML
    private ChoiceBox cbprodukt;

    public ChoiceBox getCbprodukt() {
        return cbprodukt;
    }
    @FXML
    private ChoiceBox cbpersonal;

    public ChoiceBox getCbpersonal() {
        return cbpersonal;
    }
    @FXML
    private ChoiceBox cbkunde;

    public ChoiceBox getCbkunde() {
        return cbkunde;
    }
    @FXML
    private ChoiceBox cbeinstellung;

    public ChoiceBox getCbeinstellung() {
        return cbeinstellung;
    }
    private String[] produktsec={"add","lösche"};
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        cbprodukt.getItems().addAll(produktsec);
    }
}
