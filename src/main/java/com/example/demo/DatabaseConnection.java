package com.example.demo;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;


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
                        rs.getString("modell"),rs.getString("lagerbestand"),rs.getDouble("höhe"),
                        rs.getDouble("breite"),rs.getDouble("länge"));
                produktList.add(produkt);
            }
        }catch (Exception e){
            e.printStackTrace();
            e.getCause();
        }
        return produktList;
    }



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
                        rs.getInt("kundenid"), rs.getString("zahlungsinfo"));
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
        String sql="delete from personal where id_nummer=" +id;
        try {
            PreparedStatement ps=conn.prepareStatement(sql);
            ps.execute();
        }catch (Exception e){
        }
    }

    public void löscheProduktFromDB(int id) {
        conn=DatabaseConnection.getConnection();
        String sql="delete from produkt where produkt_id=" +id;
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



}