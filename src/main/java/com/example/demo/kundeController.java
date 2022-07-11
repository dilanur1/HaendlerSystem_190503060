package com.example.demo;

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
    private TableColumn<Kunde, String> col_zahlinfo;

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
        col_kadress.setCellValueFactory(new PropertyValueFactory<>("adresse"));
        col_ktel.setCellValueFactory(new PropertyValueFactory<>("telefonnummer"));
        col_kid.setCellValueFactory(new PropertyValueFactory<>("kundenid"));
        col_zahlinfo.setCellValueFactory(new PropertyValueFactory<>("z"));

        DatabaseConnection connection=new DatabaseConnection();
        kundenlist.setItems(connection.getDatakunden());
    }


}
