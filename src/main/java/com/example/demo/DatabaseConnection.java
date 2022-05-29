package com.example.demo;;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.io.IOException;
import java.sql.*;
import java.util.Set;
import java.sql.Connection;
import java.sql.DriverManager;





//Class.forName("com.mysql.cj.jdbc.Driver");
//databaseLink = DriverManager.getConnection(url,databaseUser,databasePassword);





public class DatabaseConnection {

    public  static Connection conn ;

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
    public static ObservableList<Personal> getDatausers(){
        ObservableList<Personal> list = FXCollections.observableArrayList();
        try{
            PreparedStatement ps =conn.prepareStatement("select * from personal");
            ResultSet rs=ps.executeQuery();

            while (rs.next()){
                list.add(new Personal(Integer.parseInt(rs.getString("idPersonal")),rs.getString("vorname")),rs.getString("nachname"),rs.getString("benutzername"),rs.getString("passwort"),Integer.parseInt(rs.getString("idNummer")));
            }
        }catch (Exception e){

        }
        return list;
    }





}