package com.example.demo;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.collections.transformation.SortedList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import java.io.File;
import java.io.IOException;
import java.sql.*;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class personalController implements Initializable {
    @FXML
    private TableColumn<Personal,String> col_benutzername;
    @FXML
    private TableColumn<Personal,String> col_pass;
    @FXML
    private TableColumn<Personal,Integer> col_pıd;
    @FXML
    private ImageView imageView1;
    @FXML
    private TableColumn<Personal,String> pcol_adres;
    @FXML
    private TableColumn<Personal,String> pcol_gbdat;
    @FXML
    private TableColumn<Personal,String> pcol_geschlecht;
    @FXML
    private TableColumn<Personal,String> pcol_idnum;
    @FXML
    private TableColumn<Personal,String> pcol_nachname;
    @FXML
    private TableColumn<Personal,String> pcol_tel;
    @FXML
    private TableColumn<Personal,String> pcol_vorname;
    @FXML
    private Button personal_add;
    @FXML
    private Button personal_aktual;
    @FXML
    private Button personal_lösche;
    @FXML
    private TableView<Personal> personallist;
    @FXML
    private TextField filterfield;

    public TextField getFilterfield() {
        return filterfield;
    }

    public void setFilterfield(TextField filterfield) {
        this.filterfield = filterfield;
    }
    ObservableList<Personal> dataList;

    public ObservableList<Personal> getDataList() {
        return dataList;
    }

    public void setDataList(ObservableList<Personal> dataList) {
        this.dataList = dataList;
    }

    public void setPersonallist(TableView<Personal> personallist) {
        this.personallist = personallist;
    }

    public TableColumn<Personal, String> getCol_benutzername() {
        return col_benutzername;
    }

    public TableColumn<Personal, String> getCol_pass() {
        return col_pass;
    }

    public TableColumn<Personal, Integer> getCol_pıd() {
        return col_pıd;
    }

    public ImageView getImageView1() {
        return imageView1;
    }

    public TableColumn<Personal, String> getPcol_adres() {
        return pcol_adres;
    }

    public TableColumn<Personal, String> getPcol_gbdat() {
        return pcol_gbdat;
    }

    public TableColumn<Personal, String> getPcol_geschlecht() {
        return pcol_geschlecht;
    }

    public TableColumn<Personal, String> getPcol_idnum() {
        return pcol_idnum;
    }

    public TableColumn<Personal, String> getPcol_nachname() {
        return pcol_nachname;
    }

    public TableColumn<Personal, String> getPcol_tel() {
        return pcol_tel;
    }

    public TableColumn<Personal, String> getPcol_vorname() {
        return pcol_vorname;
    }

    public Button getPersonal_add() {
        return personal_add;
    }

    public Button getPersonal_aktual() {
        return personal_aktual;
    }

    public Button getPersonal_lösche() {
        return personal_lösche;
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

    public void setCol_benutzername(TableColumn<Personal, String> col_benutzername) {
        this.col_benutzername = col_benutzername;
    }

    public void setCol_pass(TableColumn<Personal, String> col_pass) {
        this.col_pass = col_pass;
    }

    public void setCol_pıd(TableColumn<Personal, Integer> col_pıd) {
        this.col_pıd = col_pıd;
    }

    public void setImageView1(ImageView imageView1) {
        this.imageView1 = imageView1;
    }

    public void setPcol_adres(TableColumn<Personal, String> pcol_adres) {
        this.pcol_adres = pcol_adres;
    }

    public void setPcol_gbdat(TableColumn<Personal, String> pcol_gbdat) {
        this.pcol_gbdat = pcol_gbdat;
    }

    public void setPcol_geschlecht(TableColumn<Personal, String> pcol_geschlecht) {
        this.pcol_geschlecht = pcol_geschlecht;
    }

    public void setPcol_idnum(TableColumn<Personal, String> pcol_idnum) {
        this.pcol_idnum = pcol_idnum;
    }

    public void setPcol_nachname(TableColumn<Personal, String> pcol_nachname) {
        this.pcol_nachname = pcol_nachname;
    }

    public void setPcol_tel(TableColumn<Personal, String> pcol_tel) {
        this.pcol_tel = pcol_tel;
    }

    public void setPcol_vorname(TableColumn<Personal, String> pcol_vorname) {
        this.pcol_vorname = pcol_vorname;
    }

    public void setPersonal_add(Button personal_add) {
        this.personal_add = personal_add;
    }

    public void setPersonal_aktual(Button personal_aktual) {
        this.personal_aktual = personal_aktual;
    }

    public void setPersonal_lösche(Button personal_lösche) {
        this.personal_lösche = personal_lösche;
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

    public void personalAdd(ActionEvent event){
        try{
            FXMLLoader fxmlLoader=new FXMLLoader(getClass().getResource("addierungForm.fxml"));
            Parent root=(Parent) fxmlLoader.load();
            Stage stage=new Stage();
            stage.setTitle("Personalformular");
            stage.setScene(new Scene(root));
            stage.show();
        }catch (Exception e){
            System.out.println("nicht");
        }
    }

    public void personalUpdate(ActionEvent event){
        /*

        int pid =personallist.getSelectionModel().getSelectedItem().getIdPersonal();
        String idnummer=personallist.getSelectionModel().getSelectedItem().getIdNummer();
        String vorname=personallist.getSelectionModel().getSelectedItem().getVorname();
        String nachname=personallist.getSelectionModel().getSelectedItem().getNachname();
        String benutzername=personallist.getSelectionModel().getSelectedItem().getBenutzername();
        String pass=personallist.getSelectionModel().getSelectedItem().getPasswort();
        String gbdatum=personallist.getSelectionModel().getSelectedItem().getGeburtsdatum();
        String adresse=personallist.getSelectionModel().getSelectedItem().getAdress();
        String telno=personallist.getSelectionModel().getSelectedItem().getTelefonnummer();

        //System.out.println(pid+idnummer+vorname+nachname+benutzername+pass+gbdatum+adresse+telno);
        personalFormController p=new personalFormController();
        p.aktualiserePersonal(event,pid,idnummer,vorname,nachname,benutzername,pass,gbdatum,adresse,telno);
        //System.out.println(personallist.getSelectionModel().getSelectedItem().getIdNummer());

         */

        try{
            FXMLLoader fxmlLoader=new FXMLLoader(getClass().getResource("aktualPersonalForm.fxml"));
            Parent root=(Parent) fxmlLoader.load();
            Stage stage=new Stage();
            stage.setTitle("Personal aktulieren formular");
            stage.setScene(new Scene(root));
            stage.show();
        }catch (Exception e){
            System.out.println("nicht");
        }
        
    }


    public void löscheVonPersonalList(ActionEvent event){
        /*
        personallist.getItems().removeAll(personallist.getSelectionModel().getSelectedItem());
        System.out.println(personallist.getSelectionModel().getSelectedItem().getIdNummer());
        String id=personallist.getSelectionModel().getSelectedItem().getIdNummer();

         */
        int selected_id=personallist.getSelectionModel().getSelectedIndex();
        personallist.getItems().remove(selected_id);
        String id=personallist.getSelectionModel().getSelectedItem().getIdNummer();
        System.out.println(personallist.getSelectionModel().getSelectedItem().getName());
        DatabaseConnection conn= new DatabaseConnection();
        conn.löschePersonalFromDB(id);
    }

    public void refreshPersonalTable(ActionEvent event) throws IOException {
        root= FXMLLoader.load((getClass().getResource("personal.fxml")));
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        scene=new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    public void search_user(){
        DatabaseConnection connection=new DatabaseConnection();
        pcol_idnum.setCellValueFactory(new PropertyValueFactory<>("idNummer"));
        pcol_vorname.setCellValueFactory(new PropertyValueFactory<>("vorname"));
        pcol_nachname.setCellValueFactory(new PropertyValueFactory<>("nachname"));
        pcol_gbdat.setCellValueFactory(new PropertyValueFactory<>("geburtsdatum"));
        pcol_geschlecht.setCellValueFactory(new PropertyValueFactory<>("geschlecht"));
        pcol_adres.setCellValueFactory(new PropertyValueFactory<>("adress"));
        pcol_tel.setCellValueFactory(new PropertyValueFactory<>("telefonnummer"));
        col_pıd.setCellValueFactory(new PropertyValueFactory<>("idPersonal"));
        col_benutzername.setCellValueFactory(new PropertyValueFactory<>("benutzername"));
        col_pass.setCellValueFactory(new PropertyValueFactory<>("passwort"));

        dataList=connection.getDatausers();
        personallist.setItems(dataList);
        FilteredList<Personal> filteredData=new FilteredList<>(dataList,b ->true);

        filterfield.textProperty().addListener((observable,oldValue,newValue ) ->{
            filteredData.setPredicate(personal -> {
                if (newValue==null || newValue.isEmpty()){
                    return true;
                }
                String lowerCaseFilter=newValue.toLowerCase();
                if (personal.getBenutzername().toLowerCase().indexOf(lowerCaseFilter)!= -1){
                    return true;
                }else if (personal.getPasswort().toLowerCase().indexOf(lowerCaseFilter)!=-1){
                    return true;
                }
                else if (personal.getName().toLowerCase().indexOf(lowerCaseFilter)!=-1){
                    return true;
                }
                else{
                    return false;
                }
            });
        });
        SortedList<Personal> sortedData=new SortedList<>(filteredData);
        sortedData.comparatorProperty().bind(personallist.comparatorProperty());
        personallist.setItems(sortedData);




    }

    public TableView<Personal> getPersonallist() {

        return personallist;
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        File file1 = new File(("C:\\Users\\Eylül\\IdeaProjects\\demo\\src\\main\\java\\com\\example\\demo\\2022-05-13 (11).png"));
        Image image1 = new Image(file1.toURI().toString());
        imageView1.setImage(image1);


        pcol_idnum.setCellValueFactory(new PropertyValueFactory<>("idNummer"));
        pcol_vorname.setCellValueFactory(new PropertyValueFactory<>("vorname"));
        pcol_nachname.setCellValueFactory(new PropertyValueFactory<>("nachname"));
        pcol_gbdat.setCellValueFactory(new PropertyValueFactory<>("geburtsdatum"));
        pcol_geschlecht.setCellValueFactory(new PropertyValueFactory<>("geschlecht"));
        pcol_adres.setCellValueFactory(new PropertyValueFactory<>("adress"));
        pcol_tel.setCellValueFactory(new PropertyValueFactory<>("telefonnummer"));
        col_pıd.setCellValueFactory(new PropertyValueFactory<>("idPersonal"));
        col_benutzername.setCellValueFactory(new PropertyValueFactory<>("benutzername"));
        col_pass.setCellValueFactory(new PropertyValueFactory<>("passwort"));
        DatabaseConnection connection = new DatabaseConnection();
        personallist.setItems(connection.getDatausers());

        search_user();


    }
}



