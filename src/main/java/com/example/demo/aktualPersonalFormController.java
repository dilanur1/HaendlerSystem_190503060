package com.example.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class aktualPersonalFormController {

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

    @FXML
    void aktualiserePersonal(ActionEvent event) {

    }

    @FXML
    void infosInForm(ActionEvent event) {
        pid_field.setText("86876");
    }
}