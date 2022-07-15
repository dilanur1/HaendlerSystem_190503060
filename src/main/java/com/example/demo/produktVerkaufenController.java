package com.example.demo;

import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.collections.transformation.SortedList;
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
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.scene.image.ImageView;
import javafx.scene.control.Label;

public class produktVerkaufenController implements Initializable {
    @FXML
    private Label keineprodukLabel;

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

    @FXML
    private TextField suche;

    public TextField getSuche() {
        return suche;
    }

    public void setSuche(TextField suche) {
        this.suche = suche;
    }

    @FXML
    private Button löschen;

    public Button getDatum_aendern() {
        return datum_aendern;
    }

    public void setDatum_aendern(Button datum_aendern) {
        this.datum_aendern = datum_aendern;
    }

    public Button getKundenid_aendern() {
        return kundenid_aendern;
    }

    public void setKundenid_aendern(Button kundenid_aendern) {
        this.kundenid_aendern = kundenid_aendern;
    }

    public Button getPid_aendern() {
        return pid_aendern;
    }

    public void setPid_aendern(Button pid_aendern) {
        this.pid_aendern = pid_aendern;
    }

    public Button getService_aendern() {
        return service_aendern;
    }

    public void setService_aendern(Button service_aendern) {
        this.service_aendern = service_aendern;
    }

    public Button getZahlmethod_aendern() {
        return zahlmethod_aendern;
    }

    public void setZahlmethod_aendern(Button zahlmethod_aendern) {
        this.zahlmethod_aendern = zahlmethod_aendern;
    }

    @FXML
    private Button datum_aendern;
    @FXML
    private Button kundenid_aendern;
    @FXML
    private Button pid_aendern;

    @FXML
    private Button service_aendern;
    @FXML
    private Button zahlmethod_aendern;

    public void setLöschen(Button löschen) {
        this.löschen = löschen;
    }

    public void setRefreshimg(ImageView refreshimg) {
        this.refreshimg = refreshimg;
    }

    public Button getLöschen() {
        return löschen;
    }

    public ImageView getRefreshimg() {
        return refreshimg;
    }

    public Button getBackhomepage() {
        return backhomepage;
    }

    @FXML
    private ImageView refreshimg;

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
    private Button speichernVerkauf;

    public Button getSpeichernVerkauf() {
        return speichernVerkauf;
    }

    public void setSpeichernVerkauf(Button speichernVerkauf) {
        this.speichernVerkauf = speichernVerkauf;
    }

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
    public void refreshTable(ActionEvent event) throws IOException {
        root= FXMLLoader.load((getClass().getResource("produktVerkaufen.fxml")));
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        scene=new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    ObservableList<Produkt> produkts;
    ObservableList<Kunde> kunden;
    @FXML
    void speichernVerkauf(ActionEvent event) {
        DatabaseConnection connection=new DatabaseConnection();
        int kundenID= Integer.parseInt(kundenıdfield.getText());
        int verkaufID=Integer.parseInt(verkaufidfield.getText());
        int produktID=Integer.parseInt(produktidfield.getText());
        produktController pc=new produktController();
        //pc.getProduktlist().setItems(produkts);
        produkts=connection.getDataprodukts();
        kunden=connection.getDatakunden();
        Produkt produkt=new Produkt(produktID);
        Kunde  kunde=new Kunde(kundenID);
        /*
        if(kunden.contains(kunde)==false){
            keineprodukLabel.setText("Es gibt keine Kunde mit diese ID-Nummer");
        }

         */
        if(produkts.contains(produkt)==false){
            keineprodukLabel.setText("Dieser Produkt ist nicht vorrätig!");
        }
        else{
            connection.löscheProduktFromDB(produktID);
            String service = " ";
            if(jacb.isSelected()){
                service=jacb.getText();
            }else if(neincb.isSelected()){
                service=neincb.getText();
            }
            Produkt_Verkaufen produkt_verkaufen=new Produkt_Verkaufen(Integer.parseInt(verkaufidfield.getText()),Integer.parseInt(kundenıdfield.getText()), Integer.parseInt(produktidfield.getText()),zahlmethodfield.getSelectionModel().getSelectedItem(),datumfield.getText(),service);
            connection.addVerkaufToDB(produkt_verkaufen);
        }


    }



    @FXML
    void löschenVerkauf(ActionEvent event) {
        int id=produktverkaufentable.getSelectionModel().getSelectedItem().getId();
        DatabaseConnection conn= new DatabaseConnection();
        conn.löscheVerkaufFromDB(id);
        produktverkaufentable.getItems().removeAll(produktverkaufentable.getSelectionModel().getSelectedItem());

    }
    @FXML
    void aktualisiereDatum(ActionEvent event) {
        DatabaseConnection connection = new DatabaseConnection();
        connection.aktualisiereDatumDB(datumfield.getText(),Integer.parseInt(verkaufidfield.getText()));
    }

    @FXML
    void aktualisiereKundenID(ActionEvent event) {
        DatabaseConnection connection = new DatabaseConnection();
        connection.aktualisiereKundenidDB(Integer.parseInt(kundenıdfield.getText()),Integer.parseInt(verkaufidfield.getText()));
    }

    @FXML
    void aktualisierePID(ActionEvent event) {
        DatabaseConnection connection = new DatabaseConnection();
        connection.aktualisierePIDDB(Integer.parseInt(produktidfield.getText()),Integer.parseInt(verkaufidfield.getText()));
    }

    @FXML
    void aktualisiereService(ActionEvent event) {
        DatabaseConnection connection = new DatabaseConnection();
        String service = " ";
        if(jacb.isSelected()){
            service=jacb.getText();
        }else if (neincb.isSelected()){
            service=neincb.getText();
        }
        connection.aktualisiereServiceDB(service,Integer.parseInt(verkaufidfield.getText()));
    }

    @FXML
    void aktualisiereZahlmethod(ActionEvent event){
        DatabaseConnection connection = new DatabaseConnection();
        connection.aktualisiereZahlmethodDB(zahlmethodfield.getSelectionModel().getSelectedItem(),Integer.parseInt(verkaufidfield.getText()));
    }

    ObservableList<Produkt_Verkaufen> dataList;

    public ObservableList<Produkt_Verkaufen> getDataList() {
        return dataList;
    }

    public void setDataList(ObservableList<Produkt_Verkaufen> dataList) {
        this.dataList = dataList;
    }
    @FXML
    private TextField filterfield;

    public TextField getFilterfield() {
        return filterfield;
    }

    public void setFilterfield(TextField filterfield) {
        this.filterfield = filterfield;
    }
    @FXML
    public void search_verkauf(){
        DatabaseConnection connection=new DatabaseConnection();

        idcol.setCellValueFactory(new PropertyValueFactory<>("id"));
        kidcol.setCellValueFactory(new PropertyValueFactory<>("kunden_id"));
        pidcol.setCellValueFactory(new PropertyValueFactory<>("produkt_id"));
        zahlmethodcol.setCellValueFactory(new PropertyValueFactory<>("zahlmethode"));
        datumcol.setCellValueFactory(new PropertyValueFactory<>("datum"));
        servicecol.setCellValueFactory(new PropertyValueFactory<>("service"));

        dataList=connection.getDataPV();
        //personallist.setItems(dataList);
        FilteredList<Produkt_Verkaufen> filteredData=new FilteredList<>(dataList, b ->true);

        filterfield.textProperty().addListener((observable,oldValue,newValue ) ->{
            filteredData.setPredicate(produkt_verkaufen -> {
                if (newValue==null || newValue.isEmpty()){
                    return true;
                }
                String lowerCaseFilter=newValue.toLowerCase();

                if (String.valueOf(produkt_verkaufen.getKunden_id()).toLowerCase().indexOf(lowerCaseFilter)!= -1){
                    return true;
                }else if (String.valueOf(produkt_verkaufen.getProdukt_id()).toLowerCase().indexOf(lowerCaseFilter)!=-1){
                    return true;
                }

                else if (produkt_verkaufen.getDatum().toLowerCase().indexOf(lowerCaseFilter)!=-1){
                    return true;
                }
                else{
                    return false;
                }
            });
        });
        SortedList<Produkt_Verkaufen> sortedData=new SortedList<>(filteredData);
        sortedData.comparatorProperty().bind(produktverkaufentable.comparatorProperty());

        produktverkaufentable.setItems(sortedData);





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

        File file1=new File(("C:\\Users\\Eylül\\IdeaProjects\\demo\\src\\main\\java\\com\\example\\demo\\indir-removebg-preview.png"));
        Image image1=new Image(file1.toURI().toString());
        refreshimg.setImage(image1);

        search_verkauf();
    }


}
