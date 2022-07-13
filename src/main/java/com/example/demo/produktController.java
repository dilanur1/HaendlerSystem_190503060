package com.example.demo;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class produktController implements Initializable {
    @FXML
    private TableColumn<Produkt,String> kategorie;

    @FXML
    private TableColumn<Produkt, Boolean> lagerbestand;

    @FXML
    private TableColumn<Produkt, Double> lange;

    @FXML
    private TableColumn<Produkt, String> model;

    @FXML
    private TableColumn<Produkt, Double> preis;

    @FXML
    private TableView<Produkt> produktlist;
    @FXML
    private TableColumn<Produkt, Double> breite;

    @FXML
    private TableColumn<Produkt, Integer> col_prıd;

    @FXML
    private TableColumn<Produkt, Integer> garantiezeit;

    public TableColumn<Produkt, String> getKategorie() {
        return kategorie;
    }

    public TableColumn<Produkt, Boolean> getLagerbestand() {
        return lagerbestand;
    }

    public TableColumn<Produkt, Double> getLange() {
        return lange;
    }

    public TableColumn<Produkt, String> getModel() {
        return model;
    }

    public TableColumn<Produkt, Double> getPreis() {
        return preis;
    }

    public TableView<Produkt> getProduktlist() {
        return produktlist;
    }

    public TableColumn<Produkt, Double> getBreite() {
        return breite;
    }

    public TableColumn<Produkt, Integer> getCol_prıd() {
        return col_prıd;
    }

    public TableColumn<Produkt, Integer> getGarantiezeit() {
        return garantiezeit;
    }

    public TableColumn<Produkt, Double> getHohe() {
        return hohe;
    }

    public ImageView getImageView1() {
        return imageView1;
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

    public ObservableList<Produkt> getObservableList() {
        return observableList;
    }

    public void setKategorie(TableColumn<Produkt, String> kategorie) {
        this.kategorie = kategorie;
    }

    public void setLagerbestand(TableColumn<Produkt, Boolean> lagerbestand) {
        this.lagerbestand = lagerbestand;
    }

    public void setLange(TableColumn<Produkt, Double> lange) {
        this.lange = lange;
    }

    public void setModel(TableColumn<Produkt, String> model) {
        this.model = model;
    }

    public void setPreis(TableColumn<Produkt, Double> preis) {
        this.preis = preis;
    }

    public void setProduktlist(TableView<Produkt> produktlist) {
        this.produktlist = produktlist;
    }

    public void setBreite(TableColumn<Produkt, Double> breite) {
        this.breite = breite;
    }

    public void setCol_prıd(TableColumn<Produkt, Integer> col_prıd) {
        this.col_prıd = col_prıd;
    }

    public void setGarantiezeit(TableColumn<Produkt, Integer> garantiezeit) {
        this.garantiezeit = garantiezeit;
    }

    public void setHohe(TableColumn<Produkt, Double> hohe) {
        this.hohe = hohe;
    }

    public void setImageView1(ImageView imageView1) {
        this.imageView1 = imageView1;
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

    public void setObservableList(ObservableList<Produkt> observableList) {
        this.observableList = observableList;
    }

    @FXML
    private TableColumn<Produkt, Double> hohe;
    @FXML
    private ImageView imageView1;
    @FXML
    private Stage stage;
    private Scene scene;
    private Parent root;

    public void switchToHomepage(ActionEvent event) throws IOException {
        root= FXMLLoader.load((getClass().getResource("homepage.fxml")));
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        scene=new Scene(root);
        stage.setScene(scene);
        stage.show();

    }
    //produkt ekleme formunu açar
    public void produktAdd(ActionEvent event){
        try{
            FXMLLoader fxmlLoader=new FXMLLoader(getClass().getResource("produktForm.fxml"));
            Parent root=(Parent) fxmlLoader.load();
            Stage stage=new Stage();
            stage.setTitle("Produktformular");
            stage.setScene(new Scene(root));
            stage.show();
        }catch (Exception e){
        }
    }

    public void refreshTable(ActionEvent event) throws IOException {
        root= FXMLLoader.load((getClass().getResource("produkt.fxml")));
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        scene=new Scene(root);
        stage.setScene(scene);
        stage.show();
    }


    //produkt güncelleme formunu açar
    public void produktAktualisiereForm(ActionEvent event){
        try{
            FXMLLoader fxmlLoader=new FXMLLoader(getClass().getResource("produktAktual.fxml"));
            Parent root=(Parent) fxmlLoader.load();
            Stage stage=new Stage();
            stage.setTitle("Produktformular");
            stage.setScene(new Scene(root));
            stage.show();
        }catch (Exception e){
        }
    }

    public void löscheVonProduktList(ActionEvent event){
        produktlist.getItems().removeAll(produktlist.getSelectionModel().getSelectedItem());
        //System.out.println(produktlist.getSelectionModel().getSelectedItem().getPid());
        //DatabaseConnection conn= (DatabaseConnection) DatabaseConnection.getConnection();
        int id=produktlist.getSelectionModel().getSelectedItem().getPid();
        //String sql="delete from personal where id_nummer=" +id;
        DatabaseConnection conn= new DatabaseConnection();
        conn.löscheProduktFromDB(id);
    }


    ObservableList<Produkt> observableList= FXCollections.observableArrayList();
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        File file1=new File(("C:\\Users\\Eylül\\IdeaProjects\\demo\\src\\main\\java\\com\\example\\demo\\2022-05-13 (11).png"));
        Image image1=new Image(file1.toURI().toString());
        imageView1.setImage(image1);


        col_prıd.setCellValueFactory(new PropertyValueFactory<>("pid"));
        preis.setCellValueFactory(new PropertyValueFactory<>("preis"));
        kategorie.setCellValueFactory(new PropertyValueFactory<>("kategorie"));
        garantiezeit.setCellValueFactory(new PropertyValueFactory<>("garantiezeit"));
        model.setCellValueFactory(new PropertyValueFactory<>("modell"));
        lagerbestand.setCellValueFactory(new PropertyValueFactory<>("lagerbestand"));
        hohe.setCellValueFactory(new PropertyValueFactory<>("hohe"));
        breite.setCellValueFactory(new PropertyValueFactory<>("breite"));
        lange.setCellValueFactory(new PropertyValueFactory<>("lange"));


        DatabaseConnection connection=new DatabaseConnection();
        produktlist.setItems(connection.getDataprodukts());
    }
}
