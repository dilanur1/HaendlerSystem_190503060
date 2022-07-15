package com.example.demo;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;


import java.sql.*;
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
                        rs.getDouble("breite"),rs.getDouble("lange"),rs.getInt("pvid"));
                produktList.add(produkt);
            }
        }catch (Exception e){
            e.printStackTrace();
            e.getCause();
        }
        return produktList;
    }

//seçilenin id sine göre select where komutu yaz
    int count=0;
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
                count++;
                kundenList.add(kunde);

            }
        }catch (Exception e){
            e.printStackTrace();
            e.getCause();
        }
        return kundenList;
    }



    public void löscheVerkaufFromDB(int id) {
        conn=DatabaseConnection.getConnection();
        String sql="delete from produkt_verkaufen where id=" +"'"+id+"'";
        System.out.println(sql);
        try {
            PreparedStatement ps=conn.prepareStatement(sql);
            ps.execute();
            produktVerkaufenController p=new produktVerkaufenController();
            p.search_verkauf();
        }catch (Exception e){
        }
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
        String sql="delete from produkt where produkt_id=" +id ;
        try {
            PreparedStatement ps=conn.prepareStatement(sql);
            ps.execute();
            produktController produkt=new produktController();
            produkt.search_produkt();
        }catch (Exception e){
        }
    }

    public void löscheKundeFromDB(int id) {
        conn=DatabaseConnection.getConnection();
        String sql="delete from kunden where kundenid=" +id;
        try {
            PreparedStatement ps=conn.prepareStatement(sql);
            ps.execute();
            kundeController k=new kundeController();
            k.search_kunde();
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

    public void addKundenToDB(Kunde kunde){
        System.out.println(kunde.getAdress());
        conn=DatabaseConnection.getConnection();
        String sql="INSERT into kunden(id_nummer,kunde_vorname,kunde_nachname,kunde_gbdatum,kunde_geschlecht,kunde_adress,kunde_telnummer,kundenid,pvid) values(" + "'"+ kunde.getIdNummer()+ "'"+ ","+ "'"+ kunde.getName() + "'" + ","+ "'" + kunde.getNachname() + "'" + ", " + "'"+ kunde.getGeburtsdatum()+ "'" + ", " + "'"+ kunde.getGeschlecht()+ "'" + ", "+"'"+kunde.getAdress()+"'"+", "+"'" +kunde.getTelefonnummer()+"'"+", " + kunde.getKundenid()+", " +kunde.getPvid()+")";
        System.out.println(sql);
        try {
            PreparedStatement ps=conn.prepareStatement(sql);
            ps.execute();
            kundeController k=new kundeController();
            k.search_kunde();
        }catch (Exception e){
        }


    }
    public void addVerkaufToDB(Produkt_Verkaufen produkt_verkaufen) {
        conn=DatabaseConnection.getConnection();
        String sql="INSERT into produkt_verkaufen(id,kunden_id,produkt_id,zahlungsmethod,datum,service) values(" +  produkt_verkaufen.getId()+  ","+  produkt_verkaufen.getKunden_id() + "," + produkt_verkaufen.getProdukt_id()  + ", " + "'"+ produkt_verkaufen.getZahlmethode()+ "'" + ", " + "'"+ produkt_verkaufen.getDatum()+ "'" + ", "+"'"+produkt_verkaufen.getService()+"'"+")";
        //System.out.println(sql);
        try {
            PreparedStatement ps=conn.prepareStatement(sql);
            ps.execute();
            produktVerkaufenController p=new produktVerkaufenController();
            p.search_verkauf();
        }catch (Exception e){
        }
    }
    public void addPersonalsToDB(Personal personal){
        conn=DatabaseConnection.getConnection();
        String sql="INSERT into personal(id_nummer,vorname,nachname,geburtsdatum,geschlecht,adresse,telefonnummer,personal_id,benutzername,passwort) values(" + "'"+ personal.getIdNummer()+ "'"+ ","+ "'"+ personal.getName() + "'" + ","+ "'" + personal.getNachname() + "'" + ", " + "'"+ personal.getGeburtsdatum()+ "'" + ", " + "'"+ personal.getGeschlecht()+ "'" + ", "+"'"+personal.getAdress()+"'"+", "+"'" +personal.getTelefonnummer()+"'"+", " + personal.getIdPersonal()+", " +"'"+personal.getBenutzername()+"'"+","+"'"+personal.getPasswort()+"'"+")";
        //System.out.println(sql);
        try {
            PreparedStatement ps=conn.prepareStatement(sql);
            ps.execute();
            personalController p=new personalController();
            p.search_user();
        }catch (Exception e){
        }
    }

    public void addProduktsToDB(Produkt produkt) {
        conn=DatabaseConnection.getConnection();
        String sql="INSERT into produkt(produkt_id,preis,kategorie,garantiezeit,modell,lagerbestand,hohe,breite,lange,pvid) values(" + produkt.getPid()+  ","+ produkt.getPreis() + ","+ "'" + produkt.getKategorie() + "'" + ", " + produkt.getGarantieZeit()+  ", " + "'"+ produkt.getModell()+ "'" + ", "+"'"+produkt.getLagerbestand()+"'"+","  +produkt.getHohe()+ ", " + produkt.getBreite()+", " + produkt.getLange()+","+ produkt.getPvid()+")";
        System.out.println(sql);
        try {
            PreparedStatement ps=conn.prepareStatement(sql);
            ps.execute();
            produktController produkt1=new produktController();
            produkt1.search_produkt();
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

    //KUNDE


    public void aktualisiereAdresseDB(String text,int id) {
        conn=DatabaseConnection.getConnection();
        System.out.println(id);
        String sql="update kunden set kunde_adress=" + "'"+text+ "'" + "where kundenid=" +id;
        //System.out.println(sql);
        try {
            PreparedStatement ps=conn.prepareStatement(sql);
            ps.execute();
        }catch (Exception e){
        }


    }
    public void aktualisiereGbdatumDB(String text,int id){
        conn=DatabaseConnection.getConnection();
        System.out.println(id);
        String sql="update kunden set kunde_gbdatum=" + "'"+text+ "'" + " where kundenid=" +id;
        System.out.println(sql);
        try {
            PreparedStatement ps=conn.prepareStatement(sql);
            ps.execute();
        }catch (Exception e){
        }

    }
    public void aktualisiereGeschlechtDB(String text, int id) {
        conn=DatabaseConnection.getConnection();
        System.out.println(id);
        String sql="update kunden set kunde_geschlecht=" + "'"+text+ "'" + " where kundenid=" +id;
        System.out.println(sql);
        try {
            PreparedStatement ps=conn.prepareStatement(sql);
            ps.execute();
        }catch (Exception e){
        }
    }

    public void aktualisiereIDNummer(String text, int id) {
        conn=DatabaseConnection.getConnection();
        System.out.println(id);
        String sql="update kunden set id_nummer=" + "'"+text+ "'" + " where kundenid=" +id;
        System.out.println(sql);
        try {
            PreparedStatement ps=conn.prepareStatement(sql);
            ps.execute();
        }catch (Exception e){
        }
    }

    public void aktualisiereNachname(String text, int id) {
        conn=DatabaseConnection.getConnection();
        System.out.println(id);
        String sql="update kunden set kunde_nachname=" + "'"+text+ "'" + " where kundenid=" +id;
        System.out.println(sql);
        try {
            PreparedStatement ps=conn.prepareStatement(sql);
            ps.execute();
        }catch (Exception e){
        }
    }


    public void aktualisiereTelno(String text, int id) {
        conn=DatabaseConnection.getConnection();
        System.out.println(id);
        String sql="update kunden set kunde_telnummer=" + "'"+text+ "'" + " where kundenid=" +id;
        System.out.println(sql);
        try {
            PreparedStatement ps=conn.prepareStatement(sql);
            ps.execute();
        }catch (Exception e){
        }
    }

    public void aktualisiereVorname(String text, int id) {
        conn=DatabaseConnection.getConnection();
        System.out.println(id);
        String sql="update kunden set kunde_vorname=" + "'"+text+ "'" + " where kundenid=" +id;
        System.out.println(sql);
        try {
            PreparedStatement ps=conn.prepareStatement(sql);
            ps.execute();
        }catch (Exception e){
        }
    }

    public void aktualisierePVIDdb(int pvid, int id) {
        conn=DatabaseConnection.getConnection();
        System.out.println(id);
        String sql="update kunden set pvid=" +pvid+  " where kundenid=" +id;
        System.out.println(sql);
        try {
            PreparedStatement ps=conn.prepareStatement(sql);
            ps.execute();
        }catch (Exception e){
        }
    }

    //PERSONAL

    public void aktualisiereAdressePersonal(String text, int id) {
        conn=DatabaseConnection.getConnection();
        System.out.println(id);
        String sql="update personal set adresse=" + "'"+text+ "'" + " where personal_id=" +id;
        System.out.println(sql);
        try {
            PreparedStatement ps=conn.prepareStatement(sql);
            ps.execute();
        }catch (Exception e){
        }
    }

    public void aktualisiereBenutzername(String text, int id) {
        conn=DatabaseConnection.getConnection();
        System.out.println(id);
        String sql="update personal set benutzername=" + "'"+text+ "'" + " where personal_id=" +id;
        System.out.println(sql);
        try {
            PreparedStatement ps=conn.prepareStatement(sql);
            ps.execute();
        }catch (Exception e){
        }
    }

    public void aktualisiereGbdatumPersonal(String text, int id) {
        conn=DatabaseConnection.getConnection();
        System.out.println(id);
        String sql="update personal set geburtsdatum=" + "'"+text+ "'" + " where personal_id=" +id;
        System.out.println(sql);
        try {
            PreparedStatement ps=conn.prepareStatement(sql);
            ps.execute();
        }catch (Exception e){
        }
    }

    public void aktualisiereGeschlechtPersonal(String text, int id) {
        conn=DatabaseConnection.getConnection();
        System.out.println(id);
        String sql="update personal set geschlecht=" + "'"+text+ "'" + "where personal_id=" +id;
        System.out.println(sql);
        try {
            PreparedStatement ps=conn.prepareStatement(sql);
            ps.execute();
        }catch (Exception e){
        }
    }

    public void aktualisiereIDNummerPersonal(String text, int id) {
        conn=DatabaseConnection.getConnection();
        System.out.println(id);
        String sql="update personal set id_nummer=" + "'"+text+ "'" + "where personal_id=" +id;
        System.out.println(sql);
        try {
            PreparedStatement ps=conn.prepareStatement(sql);
            ps.execute();
        }catch (Exception e){
        }
    }

    public void aktualisiereNachnamePersonal(String text, int id) {
        conn=DatabaseConnection.getConnection();
        System.out.println(id);
        String sql="update personal set nachname=" + "'"+text+ "'" + " where personal_id=" +id;
        System.out.println(sql);
        try {
            PreparedStatement ps=conn.prepareStatement(sql);
            ps.execute();
        }catch (Exception e){
        }
    }

    public void aktualisierePasswort(String text, int id) {
        conn=DatabaseConnection.getConnection();
        System.out.println(id);
        String sql="update personal set passwort=" + "'"+text+ "'" + " where personal_id=" +id;
        System.out.println(sql);
        try {
            PreparedStatement ps=conn.prepareStatement(sql);
            ps.execute();
        }catch (Exception e){
        }
    }

    public void aktualisiereTelnoPersonal(String text, int id) {
        conn=DatabaseConnection.getConnection();
        System.out.println(id);
        String sql="update personal set telefonnummer=" + "'"+text+ "'" + "where personal_id=" +id;
        System.out.println(sql);
        try {
            PreparedStatement ps=conn.prepareStatement(sql);
            ps.execute();
        }catch (Exception e){
        }
    }
    public void aktualisiereVornamePersonal(String text, int id) {
        conn=DatabaseConnection.getConnection();
        System.out.println(id);
        String sql="update personal set vorname=" + "'"+text+ "'" + " where personal_id=" +id;
        System.out.println(sql);
        try {
            PreparedStatement ps=conn.prepareStatement(sql);
            ps.execute();
        }catch (Exception e){
        }
    }

    //PRODUKT

    public void aktualisiereLange(double text, int id) {
        conn=DatabaseConnection.getConnection();
        System.out.println(id);
        String sql="update produkt set lange=" + text + " where produkt_id=" +id;
        System.out.println(sql);
        try {
            PreparedStatement ps=conn.prepareStatement(sql);
            ps.execute();
        }catch (Exception e){
        }
    }

    public void aktualisiereBreite(double text, int id) {
        conn=DatabaseConnection.getConnection();
        System.out.println(id);
        String sql="update produkt set breite=" + "'"+text+ "'" + " where produkt_id=" +id;
        System.out.println(sql);
        try {
            PreparedStatement ps=conn.prepareStatement(sql);
            ps.execute();
        }catch (Exception e){
        }
    }

    public void aktualisiereHohe(double text, int id) {
        conn=DatabaseConnection.getConnection();
        System.out.println(id);
        String sql="update produkt set hohe=" +text + " where produkt_id=" +id;
        System.out.println(sql);
        try {
            PreparedStatement ps=conn.prepareStatement(sql);
            ps.execute();
        }catch (Exception e){
        }
    }

    public void aktualisiereGarantiezeit(int text, int id) {
        conn=DatabaseConnection.getConnection();
        System.out.println(id);
        String sql="update produkt set garantiezeit=" +text + " where produkt_id=" +id;
        System.out.println(sql);
        try {
            PreparedStatement ps=conn.prepareStatement(sql);
            ps.execute();
        }catch (Exception e){
        }
    }

    public void aktualisiereKategorie(String selectedItem, int id) {
        conn=DatabaseConnection.getConnection();
        System.out.println(id);
        String sql="update produkt set kategorie=" + "'"+ selectedItem+ "'" + " where produkt_id=" +id;
        System.out.println(sql);
        try {
            PreparedStatement ps=conn.prepareStatement(sql);
            ps.execute();
        }catch (Exception e){
        }
    }

    public void aktualisiereLagerbestand(String text, int id) {
        conn=DatabaseConnection.getConnection();
        System.out.println(id);
        String sql="update produkt set lagerbestand=" + "'"+text+ "'" + " where produkt_id=" +id;
        System.out.println(sql);
        try {
            PreparedStatement ps=conn.prepareStatement(sql);
            ps.execute();
        }catch (Exception e){
        }
    }

    public void aktualisiereModell(String text, int id) {
        conn=DatabaseConnection.getConnection();
        System.out.println(id);
        String sql="update produkt set modell=" + "'"+text+ "'" + " where produkt_id=" +id;
        System.out.println(sql);
        try {
            PreparedStatement ps=conn.prepareStatement(sql);
            ps.execute();
        }catch (Exception e){
        }
    }

    public void aktualisierePVID(int pvid, int id) {
        conn=DatabaseConnection.getConnection();
        System.out.println(id);
        String sql="update produkt set pvid=" + pvid + " where produkt_id=" +id;
        System.out.println(sql);
        try {
            PreparedStatement ps=conn.prepareStatement(sql);
            ps.execute();
        }catch (Exception e){
        }
    }

    public void aktualisierePreis(double text, int id) {
        conn=DatabaseConnection.getConnection();
        System.out.println(id);
        String sql="update produkt set preis=" + text+  " where produkt_id=" +id;
        System.out.println(sql);
        try {
            PreparedStatement ps=conn.prepareStatement(sql);
            ps.execute();
        }catch (Exception e){
        }
    }

    public void aktualisiereDatumDB(String text, int id) {
        conn=DatabaseConnection.getConnection();
        System.out.println(id);
        String sql="update produkt_verkaufen set datum=" +"'"+ text+"'"+  " where id=" +id;
        System.out.println(sql);
        try {
            PreparedStatement ps=conn.prepareStatement(sql);
            ps.execute();
        }catch (Exception e){
        }
    }

    public void aktualisiereKundenidDB(int text, int id) {
        conn=DatabaseConnection.getConnection();
        System.out.println(id);
        String sql="update produkt_verkaufen set kunden_id=" + text+  " where id=" +id;
        System.out.println(sql);
        try {
            PreparedStatement ps=conn.prepareStatement(sql);
            ps.execute();
        }catch (Exception e){
        }
    }

    public void aktualisierePIDDB(int text, int id) {
        conn=DatabaseConnection.getConnection();
        System.out.println(id);
        String sql="update produkt_verkaufen set produkt_id=" + text+  " where id=" +id;
        System.out.println(sql);
        try {
            PreparedStatement ps=conn.prepareStatement(sql);
            ps.execute();
        }catch (Exception e){
        }
    }

    public void aktualisiereZahlmethodDB(String text, int id) {
        conn=DatabaseConnection.getConnection();
        System.out.println(id);
        String sql="update produkt_verkaufen set zahlungsmethod=" + "'"+text+"'"+  " where id=" +id;
        System.out.println(sql);
        try {
            PreparedStatement ps=conn.prepareStatement(sql);
            ps.execute();
        }catch (Exception e){
        }
    }

    public void aktualisiereServiceDB(String text, int id) {
        conn=DatabaseConnection.getConnection();
        System.out.println(id);
        String sql="update produkt_verkaufen set service=" + "'"+text+"'"+  " where id=" +id;
        System.out.println(sql);
        try {
            PreparedStatement ps=conn.prepareStatement(sql);
            ps.execute();
        }catch (Exception e){
        }
    }

    public void löscheServiceFromDB(int id) {
        conn=DatabaseConnection.getConnection();
        String sql="delete from service where idservice=" +id;
        try {
            PreparedStatement ps=conn.prepareStatement(sql);
            ps.execute();
            ServiceController s=new ServiceController();
            //s.search_service();
        }catch (Exception e){
        }
    }
    private static ObservableList<Service> serviceList=FXCollections.observableArrayList();

    public ObservableList<Service> getDataservice() {
        serviceList = FXCollections.observableArrayList();
        serviceList.clear();
        Connection connection=this.getConnection();
        String sqlkod="SELECT * FROM service";

        try{
            Statement ps =connection.createStatement();
            ResultSet rs=ps.executeQuery(sqlkod);

            while (rs.next()){
                Service service=new Service(rs.getInt("idservice"),rs.getInt("kunden_id"),
                        rs.getInt("produkt_id"),rs.getString("datum"),
                        rs.getString("zeit"),rs.getDouble("preis"));
                serviceList.add(service);
            }
        }catch (Exception e){
            e.printStackTrace();
            e.getCause();
        }
        return serviceList;
    }

    public void addServiceToDB(Service service1) {
        conn=DatabaseConnection.getConnection();
        String sql="INSERT into service(idservice,kunden_id,produkt_id,datum,zeit,preis) values(" + service1.getService_id()+  ","+ service1.getKunden_id() + "," + service1.getProdukt_id()  + ", " +"'"+ service1.getDatum()+ "'" + ", " + "'"+ service1.getZeit()+ "'" + ", "+service1.getServicePreis()+")";
        //System.out.println(sql);
        try {
            PreparedStatement ps=conn.prepareStatement(sql);
            ps.execute();
            //Se produkt=new produktController();
            //produkt.search_produkt();
        }catch (Exception e){
        }

    }

    public void aktualisiereDatumDBService(String text, int id) {
        conn=DatabaseConnection.getConnection();
        System.out.println(id);
        String sql="update service set datum=" + "'"+text+"'"+  " where idservice=" +id;
        System.out.println(sql);
        try {
            PreparedStatement ps=conn.prepareStatement(sql);
            ps.execute();
        }catch (Exception e){
        }
    }

    public void aktualisiereKundenidDBService(int text, int id) {
        conn=DatabaseConnection.getConnection();
        System.out.println(id);
        String sql="update service set kunden_id=" + text+  " where idservice=" +id;
        System.out.println(sql);
        try {
            PreparedStatement ps=conn.prepareStatement(sql);
            ps.execute();
        }catch (Exception e){
        }
    }

    public void aktualisierePidDBService(int text, int id) {
        conn=DatabaseConnection.getConnection();
        System.out.println(id);
        String sql="update service set produkt_id=" + text+  " where idservice=" +id;
        System.out.println(sql);
        try {
            PreparedStatement ps=conn.prepareStatement(sql);
            ps.execute();
        }catch (Exception e){
        }
    }

    public void aktualisierePreisDBService(double text, int id) {
        conn=DatabaseConnection.getConnection();
        System.out.println(id);
        String sql="update service set preis=" + text+  " where idservice=" +id;
        System.out.println(sql);
        try {
            PreparedStatement ps=conn.prepareStatement(sql);
            ps.execute();
        }catch (Exception e){
        }
    }

    public void aktualisiereZeitDBService(String text, int id) {
        conn=DatabaseConnection.getConnection();
        System.out.println(id);
        String sql="update service set zeit=" + "'" + text+ "'"+ " where idservice=" +id;
        System.out.println(sql);
        try {
            PreparedStatement ps=conn.prepareStatement(sql);
            ps.execute();
        }catch (Exception e){
        }
    }

}