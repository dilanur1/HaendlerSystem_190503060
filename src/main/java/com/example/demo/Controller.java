/*package com.example.demo;
import javafx.event.ActionEvent;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Controller {
    public void connectButton(ActionEvent event){
        DatabaseConnection connectNow=new DatabaseConnection();
        Connection connectDB=connectNow.getConnection();
        String connectQuery ="SELECT benutzername FROM Personal";

        try {
            Statement statement=connectDB.createStatement();
            ResultSet queryOutput=statement.executeQuery(connectQuery);


        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
*/