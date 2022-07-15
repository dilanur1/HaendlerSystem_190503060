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
import javafx.scene.control.TextField;
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

public class kundeController implements Initializable {
    @FXML
    private TableColumn<Kunde, String> col_id;

    @FXML
    private TableColumn<Kunde, String> col_kvorname;

    @FXML
    private TableColumn<Kunde, String> col_knachname;

    @FXML
    private TableColumn<Kunde, String> col_kgbdatum;

    @FXML
    private TableColumn<Kunde, String> col_kgeschlecht;
    @FXML
    private TableColumn<Kunde, String> col_kadress;
    @FXML
    private TableColumn<Kunde, String> col_ktel;
    @FXML
    private TableColumn<Kunde, Integer> col_kid;
    @FXML
    private TableColumn<Kunde, Integer> col_pvid;

    @FXML
    private TableView<Kunde> kundenlist;

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

    public void refreshKundeTable(ActionEvent event) throws IOException {
        //System.out.println(kundenlist.fixedCellSizeProperty());
        root= FXMLLoader.load((getClass().getResource("kunde.fxml")));
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        scene=new Scene(root);
        stage.setScene(scene);
        stage.show();


    }

    public void kundeAdd(ActionEvent event){
        try{
            FXMLLoader fxmlLoader=new FXMLLoader(getClass().getResource("kundeForm.fxml"));
            Parent root=(Parent) fxmlLoader.load();
            Stage stage=new Stage();
            stage.setTitle("Kundeformular");
            stage.setScene(new Scene(root));
            stage.show();
        }catch (Exception e){
        }
    }

    public void setCol_id(TableColumn<Kunde, String> col_id) {
        this.col_id = col_id;
    }

    public void setCol_kvorname(TableColumn<Kunde, String> col_kvorname) {
        this.col_kvorname = col_kvorname;
    }

    public void setCol_knachname(TableColumn<Kunde, String> col_knachname) {
        this.col_knachname = col_knachname;
    }

    public void setCol_kgbdatum(TableColumn<Kunde, String> col_kgbdatum) {
        this.col_kgbdatum = col_kgbdatum;
    }

    public void setCol_kgeschlecht(TableColumn<Kunde, String> col_kgeschlecht) {
        this.col_kgeschlecht = col_kgeschlecht;
    }

    public void setCol_kadress(TableColumn<Kunde, String> col_kadress) {
        this.col_kadress = col_kadress;
    }

    public void setCol_ktel(TableColumn<Kunde, String> col_ktel) {
        this.col_ktel = col_ktel;
    }

    public void setCol_kid(TableColumn<Kunde, Integer> col_kid) {
        this.col_kid = col_kid;
    }

    public void setCol_pvid(TableColumn<Kunde, Integer> col_pvid) {
        this.col_pvid = col_pvid;
    }

    public void setKundenlist(TableView<Kunde> kundenlist) {
        this.kundenlist = kundenlist;
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

    public TableColumn<Kunde, String> getCol_id() {
        return col_id;
    }

    public TableColumn<Kunde, String> getCol_kvorname() {
        return col_kvorname;
    }

    public TableColumn<Kunde, String> getCol_knachname() {
        return col_knachname;
    }

    public TableColumn<Kunde, String> getCol_kgbdatum() {
        return col_kgbdatum;
    }

    public TableColumn<Kunde, String> getCol_kgeschlecht() {
        return col_kgeschlecht;
    }

    public TableColumn<Kunde, String> getCol_kadress() {
        return col_kadress;
    }

    public TableColumn<Kunde, String> getCol_ktel() {
        return col_ktel;
    }

    public TableColumn<Kunde, Integer> getCol_kid() {
        return col_kid;
    }

    public TableColumn<Kunde, Integer> getCol_pvid() {
        return col_pvid;
    }

    public TableView<Kunde> getKundenlist() {
        return kundenlist;
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


    //formu açıyor
    public void kundeAktualisiereForm(ActionEvent event) throws IOException{

        try{
            System.out.println("ok");
            FXMLLoader fxmlLoader=new FXMLLoader(getClass().getResource("kundeAktual.fxml"));
            Parent root=(Parent) fxmlLoader.load();
            Stage stage=new Stage();
            stage.setTitle("Kundeformular");
            stage.setScene(new Scene(root));
            stage.show();
        }catch (Exception e) {
        }



    }

    public void löscheVonKundeList(ActionEvent event){
        //System.out.println(produktlist.getSelectionModel().getSelectedItem().getPid());
        //DatabaseConnection conn= (DatabaseConnection) DatabaseConnection.getConnection();
        int id=kundenlist.getSelectionModel().getSelectedItem().getKundenid();
        //String sql="delete from personal where id_nummer=" +id;
        DatabaseConnection conn= new DatabaseConnection();
        conn.löscheKundeFromDB(id);
        kundenlist.getItems().removeAll(kundenlist.getSelectionModel().getSelectedItem());

    }

    ObservableList<Kunde> dataList;
    public ObservableList<Kunde> getDataList() {
        return dataList;
    }
    public void setDataList(ObservableList<Kunde> dataList) {
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
    public void search_kunde(){
        DatabaseConnection connection=new DatabaseConnection();

        col_id.setCellValueFactory(new PropertyValueFactory<>("idNummer"));
        col_kvorname.setCellValueFactory(new PropertyValueFactory<>("vorname"));
        col_knachname.setCellValueFactory(new PropertyValueFactory<>("nachname"));
        col_kgbdatum.setCellValueFactory(new PropertyValueFactory<>("geburtsdatum"));
        col_kgeschlecht.setCellValueFactory(new PropertyValueFactory<>("geschlecht"));
        col_kadress.setCellValueFactory(new PropertyValueFactory<>("adress"));
        col_ktel.setCellValueFactory(new PropertyValueFactory<>("telefonnummer"));
        col_kid.setCellValueFactory(new PropertyValueFactory<>("kundenid"));
        col_pvid.setCellValueFactory(new PropertyValueFactory<>("pvid"));

        ObservableList dataList = connection.getDatakunden();
        kundenlist.setItems(dataList);
        FilteredList<Kunde> filteredData=new FilteredList<>(dataList, b ->true);

        filterfield.textProperty().addListener((observable,oldValue,newValue ) ->{
            filteredData.setPredicate(kunde -> {
                if (newValue==null || newValue.isEmpty()){
                    return true;
                }
                String lowerCaseFilter=newValue.toLowerCase();
                if (kunde.getName().toLowerCase().indexOf(lowerCaseFilter)!= -1){
                    return true;
                }else if (kunde.getIdNummer().toLowerCase().indexOf(lowerCaseFilter)!=-1){
                    return true;
                }
                else if (kunde.getAdress().toLowerCase().indexOf(lowerCaseFilter)!=-1){
                    return true;
                }
                else{
                    return false;
                }
            });
        });
        SortedList<Kunde> sortedData=new SortedList<>(filteredData);
        sortedData.comparatorProperty().bind(kundenlist.comparatorProperty());
        kundenlist.setItems(sortedData);

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        File file1=new File(("C:\\Users\\Eylül\\IdeaProjects\\demo\\src\\main\\java\\com\\example\\demo\\2022-05-13 (11).png"));
        Image image1=new Image(file1.toURI().toString());
        imageView1.setImage(image1);

        col_id.setCellValueFactory(new PropertyValueFactory<>("idNummer"));
        col_kvorname.setCellValueFactory(new PropertyValueFactory<>("vorname"));
        col_knachname.setCellValueFactory(new PropertyValueFactory<>("nachname"));
        col_kgbdatum.setCellValueFactory(new PropertyValueFactory<>("geburtsdatum"));
        col_kgeschlecht.setCellValueFactory(new PropertyValueFactory<>("geschlecht"));
        col_kadress.setCellValueFactory(new PropertyValueFactory<>("adress"));
        col_ktel.setCellValueFactory(new PropertyValueFactory<>("telefonnummer"));
        col_kid.setCellValueFactory(new PropertyValueFactory<>("kundenid"));
        col_pvid.setCellValueFactory(new PropertyValueFactory<>("pvid"));

        DatabaseConnection connection=new DatabaseConnection();
        kundenlist.setItems(connection.getDatakunden());
        search_kunde();


    }


}
