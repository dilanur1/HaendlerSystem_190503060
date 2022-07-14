package com.example.demo;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.SingleSelectionModel;


import java.io.IOException;
import java.sql.*;
import java.util.Set;
import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {

    public  static Connection conn ;
    public static PreparedStatement ps;

    public static Connection getConnection() {

        // db parameters
        String databaseName = "mydb";
        String databaseUser = "root";
        String databasePassword = "afrikafonu1.";
        String url = "jdbc:mysql://localhost:3306/" + databaseName;

        try {
            // create a connection to the database
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url,databaseUser,databasePassword);
            System.out.println("Connection to MySQL has been established.");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }



    public boolean validateLogin(String username,String password) {
        Connection connectDb = this.getConnection();

        String verifyLogin = "SELECT count(1) FROM personal WHERE benutzername =  '" + username + "' AND passwort = '" + password + "'" ;

        try {
            Statement statement = connectDb.createStatement();
            ResultSet queryResult = statement.executeQuery(verifyLogin);

            while (queryResult.next()) {
                if (queryResult.getInt(1) == 1) {
                    return true;
                } else {
                    return false;
                }
            }
        }catch(Exception e) {
            e.printStackTrace();
            e.getCause();
        }
        return false;
    }

    public static Connection getConn() {
        return conn;
    }

    public static PreparedStatement getPs() {
        return ps;
    }

    public static ObservableList<Personal> getPersonalList() {
        return personalList;
    }

    public static ObservableList<Produkt> getProduktList() {
        return produktList;
    }

    public static ObservableList<Kunde> getKundenList() {
        return kundenList;
    }

    public static void setConn(Connection conn) {
        DatabaseConnection.conn = conn;
    }

    public static void setPs(PreparedStatement ps) {
        DatabaseConnection.ps = ps;
    }

    public static void setPersonalList(ObservableList<Personal> personalList) {
        DatabaseConnection.personalList = personalList;
    }

    public static void setProduktList(ObservableList<Produkt> produktList) {
        DatabaseConnection.produktList = produktList;
    }

    public static void setKundenList(ObservableList<Kunde> kundenList) {
        DatabaseConnection.kundenList = kundenList;
    }










    private static ObservableList<Personal> personalList=FXCollections.observableArrayList();

    public ObservableList getDatausers(){
        personalList = FXCollections.observableArrayList();
        personalList.clear();
        Connection connection=this.getConnection();
        String sqlkod="SELECT * FROM personal";

        try{
            Statement ps =connection.createStatement();
            ResultSet rs = ps.executeQuery(sqlkod);
                while (rs.next()) {
                    Personal personal=new Personal(rs.getString("id_nummer"),
                            rs.getString("vorname"), rs.getString("nachname"),rs.getString("geburtsdatum"),
                            rs.getString("geschlecht"),rs.getString("adresse"),rs.getString("telefonnummer"),rs.getInt("personal_id"),
                            rs.getString("benutzername"), rs.getString("passwort"));
                    personalList.add(personal);
                }
        }catch (Exception e){
            e.printStackTrace();
            e.getCause();
        }
        return personalList;
    }


    private static ObservableList<Produkt> produktList=FXCollections.observableArrayList();

    public ObservableList getDataprodukts(){
        produktList = FXCollections.observableArrayList();
        produktList.clear();
        Connection connection=this.getConnection();
        String sqlkod="SELECT * FROM produkt";

        try{
            Statement ps =connection.createStatement();
            ResultSet rs=ps.executeQuery(sqlkod);

            while (rs.next()){
                Produkt produkt=new Produkt(rs.getInt("produkt_id"),rs.getDouble("preis"),
                        rs.getString("kategorie"),rs.getInt("garantiezeit"),
                        rs.getString("modell"),rs.getString("lagerbestand"),rs.getDouble("hohe"),
                        rs.getDouble("breite"),rs.getDouble("lange"));
                produktList.add(produkt);
            }
        }catch (Exception e){
            e.printStackTrace();
            e.getCause();
        }
        return produktList;
    }

//seçilenin id sine göre select where komutu yaz

    private static ObservableList<Kunde> kundenList=FXCollections.observableArrayList();
    public ObservableList getDatakunden(){

        kundenList = FXCollections.observableArrayList();
        kundenList.clear();
        Connection connection=this.getConnection();
        String sqlkod="SELECT * FROM kunden";

        try{
            Statement ps =connection.createStatement();
            ResultSet rs = ps.executeQuery(sqlkod);

            while (rs.next()) {
                Kunde kunde=new Kunde(rs.getString("id_nummer"),
                        rs.getString("kunde_vorname"), rs.getString("kunde_nachname"),
                        rs.getString("kunde_gbdatum"), rs.getString("kunde_geschlecht"),
                        rs.getString("kunde_adress"),rs.getString("kunde_telnummer"),
                        rs.getInt("kundenid"), rs.getInt("pvid"));
                kundenList.add(kunde);
            }
        }catch (Exception e){
            e.printStackTrace();
            e.getCause();
        }
        return kundenList;
    }






    public void löschePersonalFromDB(String id){
        conn=DatabaseConnection.getConnection();
        String sql="delete from personal where id_nummer=" +"'"+id+"'";
        System.out.println(sql);
        try {
            PreparedStatement ps=conn.prepareStatement(sql);
            ps.execute();
            personalController p=new personalController();
            p.search_user();
        }catch (Exception e){
        }
    }

    public void löscheProduktFromDB(int id) {
        conn=DatabaseConnection.getConnection();
        String sql="update produkt set lagerbestand='nein' where produkt_id=" +id ;
        try {
            PreparedStatement ps=conn.prepareStatement(sql);
            ps.execute();
        }catch (Exception e){
        }
    }

    public void löscheKundeFromDB(int id) {
        conn=DatabaseConnection.getConnection();
        String sql="delete from kunden where kundenid=" +id;
        try {
            PreparedStatement ps=conn.prepareStatement(sql);
            ps.execute();
        }catch (Exception e){
        }
    }


    public void sizeProduktDB() {
        conn=DatabaseConnection.getConnection();
        String sql="select COUNT(*) from produkt ";
        try {
            PreparedStatement ps=conn.prepareStatement(sql);
            ps.execute();
        }catch (Exception e){
        }

    }

    public void addKundenToDB(String idnummer,String vorname,String nachname,
                              String gbdatum,String geschlecht,String adresse,
                              String telno,int kid,int pvid){

        conn=DatabaseConnection.getConnection();
        String sql="INSERT into kunden(id_nummer,kunde_vorname,kunde_nachname,kunde_gbdatum,kunde_geschlecht,kunde_adress,kunde_telnummer,kundenid,pvid) values(" + "'"+ idnummer+ "'"+ ","+ "'"+ vorname + "'" + ","+ "'" + nachname + "'" + ", " + "'"+ gbdatum+ "'" + ", " + "'"+ geschlecht+ "'" + ", "+"'"+adresse+"'"+", "+"'" +telno+"'"+", " + kid+", " +pvid+")";
        System.out.println(sql);
        try {
            PreparedStatement ps=conn.prepareStatement(sql);
            ps.execute();
        }catch (Exception e){
        }


    }

    public void addPersonalsToDB(String idnummer,String vorname,String nachname,String gbdatum,String geschlecht,String adresse,String telno,int pid,String benutzername,String pass){
        conn=DatabaseConnection.getConnection();
        String sql="INSERT into personal(id_nummer,vorname,nachname,geburtsdatum,geschlecht,adresse,telefonnummer,personal_id,benutzername,passwort) values(" + "'"+ idnummer+ "'"+ ","+ "'"+ vorname + "'" + ","+ "'" + nachname + "'" + ", " + "'"+ gbdatum+ "'" + ", " + "'"+ geschlecht+ "'" + ", "+"'"+adresse+"'"+", "+"'" +telno+"'"+", " + pid+", " +"'"+benutzername+"'"+","+"'"+pass+"'"+")";
        //System.out.println(sql);
        try {
            PreparedStatement ps=conn.prepareStatement(sql);
            ps.execute();
            personalController p=new personalController();
            p.search_user();
        }catch (Exception e){
        }
    }

    public void addProduktsToDB(int proid, double preis, String kategorie, int garantizeit, String modell
            , String lagerbestand, double lange, double breite, double höhe) {
        conn=DatabaseConnection.getConnection();
        String sql="INSERT into produkt(produkt_id,preis,kategorie,garantiezeit,modell,lagerbestand,hohe,breite,lange) values(" + proid+  ","+ preis + ","+ "'" + kategorie + "'" + ", " + garantizeit+  ", " + "'"+ modell+ "'" + ", "+"'"+lagerbestand+"'"+","  +höhe+ ", " + breite+", " + lange+ ")";
        System.out.println(sql);
        try {
            PreparedStatement ps=conn.prepareStatement(sql);
            ps.execute();
        }catch (Exception e){
        }
    }



    public void aktualisiereAdresseDB(String text,int id) {
        conn=DatabaseConnection.getConnection();
        System.out.println(id);
        String sql="update kunden set kunde_adress=" + "'"+text+ "'" + "where kundenid=" +id;
        System.out.println(sql);
        try {
            PreparedStatement ps=conn.prepareStatement(sql);
            ps.execute();
        }catch (Exception e){
        }

    }

    private static ObservableList<Produkt_Verkaufen> PVList=FXCollections.observableArrayList();

    public ObservableList<Produkt_Verkaufen> getDataPV() {
        PVList = FXCollections.observableArrayList();
        PVList.clear();
        Connection connection=this.getConnection();
        String sqlkod="SELECT * FROM produkt_verkaufen";

        try{
            Statement ps =connection.createStatement();
            ResultSet rs = ps.executeQuery(sqlkod);

            while (rs.next()) {
                Produkt_Verkaufen pv=new Produkt_Verkaufen(rs.getInt("id"),
                        rs.getInt("kunden_id"), rs.getInt("produkt_id"),
                        rs.getString("zahlungsmethod"), rs.getString("datum"),
                        rs.getString("service"));
                PVList.add(pv);
            }
        }catch (Exception e){
            e.printStackTrace();
            e.getCause();
        }
        return PVList;
    }
}