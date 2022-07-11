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

    @FXML
    private TableColumn<Produkt, Double> höhe;
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
        höhe.setCellValueFactory(new PropertyValueFactory<>("höhe"));
        breite.setCellValueFactory(new PropertyValueFactory<>("breite"));
        lange.setCellValueFactory(new PropertyValueFactory<>("länge"));


        DatabaseConnection connection=new DatabaseConnection();
        produktlist.setItems(connection.getDataprodukts());
    }
}
