package com.example.demo;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import java.sql.Connection;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.sql.PreparedStatement;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableColumn.CellDataFeatures;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.util.Callback;

public class HomepageController implements Initializable {
    private ObservableList<Personal> data;

    @FXML
    private Button personalgoruntule;

    public Button getPersonalgoruntule() {
        return personalgoruntule;
    }

    @FXML
    private Label startseite;
    public Label getStartseite() {
        return startseite;
    }

    //@FXML
    //private TableColumn<Personal,String> nachname;
    @FXML
    private TableView<Personal> tablepersonal;
    //@FXML
    //private TableColumn<Personal,String> vorname;
    //@FXML TableColumn<Personal,Integer> personalNummer;
    //DatabaseConnection connect1=new DatabaseConnection();
    @FXML

    private void handleButtonAction(ActionEvent event) {

        tablepersonal.getColumns().clear();

        tablodoldur();

    }

    private void tablodoldur()
    {
        tablepersonal.getColumns().clear();
        Connection c ;
        data = FXCollections.observableArrayList();
        try{
            c = (Connection) DatabaseConnection.getConnection();
            //sql string ifademiz.
            String SQL = "SELECT * from personal";//tablomuzun adı bilgi. id ve adi alanları var.
            //ResultSet
            ResultSet rs = c.createStatement().executeQuery(SQL);

            // TABLO SÜTUNLARINI DİNAMİK OLARAK EKLEYECEĞİMİZ YAPI

            for(int i=0 ; i<rs.getMetaData().getColumnCount(); i++){
                final int j = i;
                TableColumn col = new TableColumn(rs.getMetaData().getColumnName(i+1));
                col.setCellValueFactory(new Callback<CellDataFeatures<ObservableList,String>,ObservableValue<String>>(){
                    public ObservableValue<String> call(CellDataFeatures<ObservableList, String> param) {
                        return new SimpleStringProperty(param.getValue().get(j).toString());
                    }
                });

                tablepersonal.getColumns().addAll(col);
                System.out.println("Column ["+i+"] ");
            }
            //ObservableList e verileri ekleyen döngü
            while(rs.next()){
                //Satırları yinele
                ObservableList<String> row = FXCollections.observableArrayList();
                for(int i=1 ; i<=rs.getMetaData().getColumnCount(); i++){
                    //sütunları yinele
                    row.add(rs.getString(i));
                }
                System.out.println("Satır eklendi "+row );
                data.add((Personal) row);
            }

            //Sonucu tabloya ekleme
            tablepersonal.setItems(data);
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("Hata oluştu");
        }
    }
    @FXML
    private TextField txtad; //txtadi tanımladık. Uyarı verdiği yere tıklayarak TextFieldi import edebiliriz.

    @FXML
    private void handleEkle(ActionEvent event){
        Connection c;

        try{
            c = (Connection) DatabaseConnection.getConnection();
            String query = "insert into personal(vorname) values()"; //sqlimizi yazıyoruz. Değeri aşağıda tanımlayacağız.

            PreparedStatement preparedStmt = c.prepareStatement(query);
            preparedStmt.setString (1, txtad.getText().toString()); //? ile belirttiğimiz değer.
            preparedStmt.execute();//komutu çalıştırıyoruz
            tablodoldur();//tablomuzu yeniliyoruz.
            txtad.setText("d");//txtadi temizliyoruz.

        }
        catch(Exception e){
            System.out.println(e.toString());
        }
    }


    @FXML
    private ComboBox cbprodukt;
    public ComboBox getCbprodukt() {
        return cbprodukt;
    }
    @FXML
    private ComboBox cbpersonal;
    public ComboBox getCbpersonal() {
        return cbpersonal;
    }
    @FXML
    private ComboBox cbkunde;
    public ComboBox getCbkunde() {
        return cbkunde;
    }
    @FXML
    private ComboBox cbeinstellung;


    public ComboBox getCbeinstellung() {
        return cbeinstellung;
    }
    private String[] produktSec={"Produkt hinzufügen","Produkt löschen","Produkte aktuailisieren"};
    private String[] personalSec={"Personal hinzufügen","Personal löschen","Personal aktuailisieren"};
    private String[] kundeSec={"Kunde hinzufügen","Kunde löschen","Kunde aktuailisieren"};
    private String[] einstellungSec={""};


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        cbpersonal.getItems().addAll(personalSec);
        cbkunde.getItems().addAll(kundeSec);
        cbprodukt.getItems().addAll(produktSec);


    }
}
