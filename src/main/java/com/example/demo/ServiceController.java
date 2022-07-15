package com.example.demo;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.scene.control.TableView;
import javafx.scene.control.Label;

public class ServiceController implements Initializable {
    public Label getKeineprodukLabel() {
        return keineprodukLabel;
    }

    public void setKeineprodukLabel(Label keineprodukLabel) {
        this.keineprodukLabel = keineprodukLabel;
    }

    public ObservableList<Produkt> getProdukts() {
        return produkts;
    }

    public void setProdukts(ObservableList<Produkt> produkts) {
        this.produkts = produkts;
    }

    public ObservableList<Kunde> getKunden() {
        return kunden;
    }

    public void setKunden(ObservableList<Kunde> kunden) {
        this.kunden = kunden;
    }

    public ObservableList<Service> getServices() {
        return services;
    }

    public void setServices(ObservableList<Service> services) {
        this.services = services;
    }

    @FXML
    private Button aktualisiereList;

    @FXML
    private Button backhomepage;

    @FXML
    private TableColumn<Service,String > coldatum;

    @FXML
    private TableColumn<Service,Integer> colkid;

    @FXML
    private TableColumn<Service,Integer> colpid;

    @FXML
    private TableColumn<Service,Double> colpreis;

    @FXML
    private TableColumn<Service,Integer> colsid;

    @FXML
    private TableColumn<Service,String> colzeit;

    @FXML
    private TableView<Service> servicetable;

    public Button getAktualisiereList() {
        return aktualisiereList;
    }

    public void setAktualisiereList(Button aktualisiereList) {
        this.aktualisiereList = aktualisiereList;
    }

    public Button getBackhomepage() {
        return backhomepage;
    }

    public void setBackhomepage(Button backhomepage) {
        this.backhomepage = backhomepage;
    }

    public TableColumn<Service, String> getColdatum() {
        return coldatum;
    }

    public void setColdatum(TableColumn<Service, String> coldatum) {
        this.coldatum = coldatum;
    }

    public TableColumn<Service, Integer> getColkid() {
        return colkid;
    }

    public void setColkid(TableColumn<Service, Integer> colkid) {
        this.colkid = colkid;
    }

    public TableColumn<Service, Integer> getColpid() {
        return colpid;
    }

    public void setColpid(TableColumn<Service, Integer> colpid) {
        this.colpid = colpid;
    }

    public TableColumn<Service, Double> getColpreis() {
        return colpreis;
    }

    public void setColpreis(TableColumn<Service, Double> colpreis) {
        this.colpreis = colpreis;
    }

    public TableColumn<Service, Integer> getColsid() {
        return colsid;
    }

    public void setColsid(TableColumn<Service, Integer> colsid) {
        this.colsid = colsid;
    }

    public TableColumn<Service, String> getColzeit() {
        return colzeit;
    }

    public void setColzeit(TableColumn<Service, String> colzeit) {
        this.colzeit = colzeit;
    }

    public TableView<Service> getServicetable() {
        return servicetable;
    }

    public void setServicetable(TableView<Service> servicetable) {
        this.servicetable = servicetable;
    }

    public Button getDatum_aendern() {
        return datum_aendern;
    }

    public void setDatum_aendern(Button datum_aendern) {
        this.datum_aendern = datum_aendern;
    }

    public TextField getDatumfield() {
        return datumfield;
    }

    public void setDatumfield(TextField datumfield) {
        this.datumfield = datumfield;
    }

    public TextField getFilterfield() {
        return filterfield;
    }

    public void setFilterfield(TextField filterfield) {
        this.filterfield = filterfield;
    }

    public TextField getKidfield() {
        return kidfield;
    }

    public void setKidfield(TextField kidfield) {
        this.kidfield = kidfield;
    }

    public Button getKundenid_aendern() {
        return kundenid_aendern;
    }

    public void setKundenid_aendern(Button kundenid_aendern) {
        this.kundenid_aendern = kundenid_aendern;
    }

    public Button getLöschen() {
        return löschen;
    }

    public void setLöschen(Button löschen) {
        this.löschen = löschen;
    }

    public Button getPid_aendern() {
        return pid_aendern;
    }

    public void setPid_aendern(Button pid_aendern) {
        this.pid_aendern = pid_aendern;
    }

    public TextField getPidfield() {
        return pidfield;
    }

    public void setPidfield(TextField pidfield) {
        this.pidfield = pidfield;
    }

    public Button getPreis_aendern() {
        return preis_aendern;
    }

    public void setPreis_aendern(Button preis_aendern) {
        this.preis_aendern = preis_aendern;
    }

    public TextField getPreisfield() {
        return preisfield;
    }

    public void setPreisfield(TextField preisfield) {
        this.preisfield = preisfield;
    }

    public TextField getSidfield() {
        return sidfield;
    }

    public void setSidfield(TextField sidfield) {
        this.sidfield = sidfield;
    }

    public Button getSpeichernService() {
        return speichernService;
    }

    public void setSpeichernService(Button speichernService) {
        this.speichernService = speichernService;
    }

    public Button getZeit_aendern() {
        return zeit_aendern;
    }

    public void setZeit_aendern(Button zeit_aendern) {
        this.zeit_aendern = zeit_aendern;
    }

    public TextField getZeitfield() {
        return zeitfield;
    }

    public void setZeitfield(TextField zeitfield) {
        this.zeitfield = zeitfield;
    }

    public Stage getStage() {
        return stage;
    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    public Scene getScene() {
        return scene;
    }

    public void setScene(Scene scene) {
        this.scene = scene;
    }

    public Parent getRoot() {
        return root;
    }

    public void setRoot(Parent root) {
        this.root = root;
    }
    @FXML
    private Label keineprodukLabel;

    @FXML
    private Button datum_aendern;

    @FXML
    private TextField datumfield;

    @FXML
    private TextField filterfield;

    @FXML
    private TextField kidfield;

    @FXML
    private Button kundenid_aendern;

    @FXML
    private Button löschen;

    @FXML
    private Button pid_aendern;

    @FXML
    private TextField pidfield;

    @FXML
    private Button preis_aendern;

    @FXML
    private TextField preisfield;

    @FXML
    private TextField sidfield;

    @FXML
    private Button speichernService;

    @FXML
    private Button zeit_aendern;

    @FXML
    private TextField zeitfield;

    @FXML
    void aktualisiereDatum(ActionEvent event) {
        DatabaseConnection connection = new DatabaseConnection();
        connection.aktualisiereDatumDBService(datumfield.getText(),Integer.parseInt(sidfield.getText()));
    }

    @FXML
    void aktualisiereKundenID(ActionEvent event) {
        DatabaseConnection connection = new DatabaseConnection();
        connection.aktualisiereKundenidDBService(Integer.parseInt(kidfield.getText()),Integer.parseInt(sidfield.getText()));
    }

    @FXML
    void aktualisierePID(ActionEvent event) {
        DatabaseConnection connection = new DatabaseConnection();
        connection.aktualisierePidDBService(Integer.parseInt(pidfield.getText()),Integer.parseInt(sidfield.getText()));
    }

    @FXML
    void aktualisierePreis(ActionEvent event) {
        DatabaseConnection connection = new DatabaseConnection();
        connection.aktualisierePreisDBService(Double.parseDouble(preisfield.getText()),Integer.parseInt(sidfield.getText()));
    }

    @FXML
    void aktualisiereZeit(ActionEvent event) {
        DatabaseConnection connection = new DatabaseConnection();
        connection.aktualisiereZeitDBService(zeitfield.getText(),Integer.parseInt(sidfield.getText()));
    }

    @FXML
    void löschenService(ActionEvent event) {
        int id=servicetable.getSelectionModel().getSelectedItem().getService_id();
        DatabaseConnection conn= new DatabaseConnection();
        conn.löscheServiceFromDB(id);
        servicetable.getItems().removeAll(servicetable.getSelectionModel().getSelectedItem());
    }

    @FXML
    void refreshTable(ActionEvent event) throws IOException{
        root= FXMLLoader.load((getClass().getResource("service.fxml")));
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        scene=new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    ObservableList<Produkt> produkts;
    ObservableList<Kunde> kunden;
    ObservableList<Service> services;
    @FXML
    public void speichernService(ActionEvent event) {
        DatabaseConnection connection=new DatabaseConnection();
        int kundenID= Integer.parseInt(kidfield.getText());
        int serviceID=Integer.parseInt(sidfield.getText());
        int produktID=Integer.parseInt(pidfield.getText());
        Service service1=new Service(Integer.parseInt(sidfield.getText()),Integer.parseInt(kidfield.getText()), Integer.parseInt(pidfield.getText()),datumfield.getText(),zeitfield.getText(),Double.parseDouble(preisfield.getText()));
        connection.addServiceToDB(service1);



    }


    @FXML
    private Stage stage;
    private Scene scene;
    private Parent root;
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
        colsid.setCellValueFactory(new PropertyValueFactory<>("service_id"));
        colkid.setCellValueFactory(new PropertyValueFactory<>("kunden_id"));
        colpid.setCellValueFactory(new PropertyValueFactory<>("produkt_id"));
        coldatum.setCellValueFactory(new PropertyValueFactory<>("datum"));
        colzeit.setCellValueFactory(new PropertyValueFactory<>("zeit"));
        colpreis.setCellValueFactory(new PropertyValueFactory<>("servicePreis"));

        DatabaseConnection connection = new DatabaseConnection();
        servicetable.setItems(connection.getDataservice());
    }
}
