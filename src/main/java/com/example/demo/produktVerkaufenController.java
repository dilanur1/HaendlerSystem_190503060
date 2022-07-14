package com.example.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class produktVerkaufenController implements Initializable {

    @FXML
    private TextField verkaufidfield;

    public void setVerkaufidfield(TextField verkaufidfield) {
        this.verkaufidfield = verkaufidfield;
    }

    public TextField getVerkaufidfield() {
        return verkaufidfield;
    }

    @FXML
    private Button aktualisiereList;

    @FXML
    private Button backhomepage;

    @FXML
    private Button backhomepage1;

    @FXML
    private Button backhomepage2;

    @FXML
    private Button backhomepage3;

    @FXML
    private Button backhomepage4;

    @FXML
    private Button backhomepage5;

    @FXML
    private TableColumn<Produkt_Verkaufen,String> datumcol;

    @FXML
    private TextField datumfield;

    @FXML
    private TableColumn<Produkt_Verkaufen, Integer> idcol;

    @FXML
    private CheckBox jacb;

    @FXML
    private TableColumn<Produkt_Verkaufen, Integer> kidcol;

    @FXML
    private TextField kundenıdfield;

    @FXML
    private CheckBox neincb;

    @FXML
    private TableColumn<Produkt_Verkaufen, Integer> pidcol;

    @FXML
    private TextField produktidfield;

    @FXML
    private TableView<Produkt_Verkaufen> produktverkaufentable;

    @FXML
    private TableColumn<Produkt_Verkaufen,String> servicecol;

    @FXML
    private TableColumn<Produkt_Verkaufen,String> zahlmethodcol;

    @FXML
    private ComboBox<String> zahlmethodfield;

    @FXML
    void aktualisierePVList(ActionEvent event) {

    }
    @FXML
    private Stage stage;
    private Scene scene;
    private Parent root;

    public void setAktualisiereList(Button aktualisiereList) {
        this.aktualisiereList = aktualisiereList;
    }

    public void setBackhomepage(Button backhomepage) {
        this.backhomepage = backhomepage;
    }

    public void setBackhomepage1(Button backhomepage1) {
        this.backhomepage1 = backhomepage1;
    }

    public void setBackhomepage2(Button backhomepage2) {
        this.backhomepage2 = backhomepage2;
    }

    public void setBackhomepage3(Button backhomepage3) {
        this.backhomepage3 = backhomepage3;
    }

    public void setBackhomepage4(Button backhomepage4) {
        this.backhomepage4 = backhomepage4;
    }

    public void setBackhomepage5(Button backhomepage5) {
        this.backhomepage5 = backhomepage5;
    }

    public void setDatumcol(TableColumn<Produkt_Verkaufen, String> datumcol) {
        this.datumcol = datumcol;
    }

    public void setDatumfield(TextField datumfield) {
        this.datumfield = datumfield;
    }

    public void setIdcol(TableColumn<Produkt_Verkaufen, Integer> idcol) {
        this.idcol = idcol;
    }

    public void setJacb(CheckBox jacb) {
        this.jacb = jacb;
    }

    public void setKidcol(TableColumn<Produkt_Verkaufen, Integer> kidcol) {
        this.kidcol = kidcol;
    }

    public void setKundenıdfield(TextField kundenıdfield) {
        this.kundenıdfield = kundenıdfield;
    }

    public void setNeincb(CheckBox neincb) {
        this.neincb = neincb;
    }

    public void setPidcol(TableColumn<Produkt_Verkaufen, Integer> pidcol) {
        this.pidcol = pidcol;
    }

    public void setProduktidfield(TextField produktidfield) {
        this.produktidfield = produktidfield;
    }

    public void setProduktverkaufentable(TableView<Produkt_Verkaufen> produktverkaufentable) {
        this.produktverkaufentable = produktverkaufentable;
    }

    public void setServicecol(TableColumn<Produkt_Verkaufen, String> servicecol) {
        this.servicecol = servicecol;
    }

    public void setZahlmethodcol(TableColumn<Produkt_Verkaufen, String> zahlmethodcol) {
        this.zahlmethodcol = zahlmethodcol;
    }

    public void setZahlmethodfield(ComboBox<String> zahlmethodfield) {
        this.zahlmethodfield = zahlmethodfield;
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

    public Button getAktualisiereList() {
        return aktualisiereList;
    }

    public Button getBackhomepage() {
        return backhomepage;
    }

    public Button getBackhomepage1() {
        return backhomepage1;
    }

    public Button getBackhomepage2() {
        return backhomepage2;
    }

    public Button getBackhomepage3() {
        return backhomepage3;
    }

    public Button getBackhomepage4() {
        return backhomepage4;
    }

    public Button getBackhomepage5() {
        return backhomepage5;
    }

    public TableColumn<Produkt_Verkaufen, String> getDatumcol() {
        return datumcol;
    }

    public TextField getDatumfield() {
        return datumfield;
    }

    public TableColumn<Produkt_Verkaufen, Integer> getIdcol() {
        return idcol;
    }

    public CheckBox getJacb() {
        return jacb;
    }

    public TableColumn<Produkt_Verkaufen, Integer> getKidcol() {
        return kidcol;
    }

    public TextField getKundenıdfield() {
        return kundenıdfield;
    }

    public CheckBox getNeincb() {
        return neincb;
    }

    public TableColumn<Produkt_Verkaufen, Integer> getPidcol() {
        return pidcol;
    }

    public TextField getProduktidfield() {
        return produktidfield;
    }

    public TableView<Produkt_Verkaufen> getProduktverkaufentable() {
        return produktverkaufentable;
    }

    public TableColumn<Produkt_Verkaufen, String> getServicecol() {
        return servicecol;
    }

    public TableColumn<Produkt_Verkaufen, String> getZahlmethodcol() {
        return zahlmethodcol;
    }

    public ComboBox<String> getZahlmethodfield() {
        return zahlmethodfield;
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

    @FXML
    void switchToHomepage(ActionEvent event) throws IOException {
        root= FXMLLoader.load((getClass().getResource("homepage.fxml")));
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        scene=new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        zahlmethodfield.getItems().addAll("kredit kart","barzahlung");

        idcol.setCellValueFactory(new PropertyValueFactory<>("id"));
        kidcol.setCellValueFactory(new PropertyValueFactory<>("kunden_id"));
        pidcol.setCellValueFactory(new PropertyValueFactory<>("produkt_id"));
        zahlmethodcol.setCellValueFactory(new PropertyValueFactory<>("zahlmethode"));
        datumcol.setCellValueFactory(new PropertyValueFactory<>("datum"));
        servicecol.setCellValueFactory(new PropertyValueFactory<>("service"));

        DatabaseConnection connection = new DatabaseConnection();
        produktverkaufentable.setItems(connection.getDataPV());
    }
}
