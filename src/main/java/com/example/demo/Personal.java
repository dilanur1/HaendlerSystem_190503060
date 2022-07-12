package com.example.demo;
import java.util.ArrayList;

public class Personal extends Person{
    private int idPersonal;
    private String benutzername;
    private String passwort;
    //rivate ArrayList<Kunde> betreuteKunde;


    public Personal(String idNummer, String vorname, String nachname,
                    String geburtsdatum, String geschlecht, String adress,
                    String telefonnummer, int idPersonal, String benutzername,
                    String passwort) {
        super(idNummer, vorname, nachname, geburtsdatum, geschlecht, adress, telefonnummer);
        this.idPersonal = idPersonal;
        this.benutzername = benutzername;
        this.passwort = passwort;
    }

    public int getIdPersonal() {
        return idPersonal;
    }

    public String getBenutzername() {
        return benutzername;
    }

    public String getPasswort() {
        return passwort;
    }

    public void setIdPersonal(int idPersonal) {
        this.idPersonal = idPersonal;
    }

    public void setBenutzername(String benutzername) {
        this.benutzername = benutzername;
    }

    public void setPasswort(String passwort) {
        this.passwort = passwort;
    }
    /*
    public void setVorname(String vorname){this.vorname=vorname;}
    public String getVorname(){return vorname;}
    public void setNachname(String nachname){this.nachname=nachname;}
    public String getNachname(){return nachname;}

    public void setBenutzername(String benutzername) {
        this.benutzername = benutzername;
    }

    //public void setBetreuteKunde(ArrayList<Kunde> betreuteKunde) {
        //this.betreuteKunde = betreuteKunde;
    //}

    public void setPasswort(String passwort) {
        this.passwort = passwort;
    }

    public int getPersonalnummer() {
        return idPersonal;
    }

    public String getPasswort() {
        return passwort;
    }

    //public ArrayList<Kunde> getBetreuteKunde() {
        //return betreuteKunde;
    //}

    public String getBenutzername() {
        return benutzername;
    }

    public void setPersonalnummer(int personalnummer) {
        this.idPersonal = personalnummer;
    }

    public void addProdukt(int pid){}

    public void aktualisiereProdukt(int pid){}

    public void löscheProdukt(int pid){}

    public void sucheProdukt(int personalnummer){}
    public void sucheProdukt(String modell){}


    public void addPersonal(int personalnummer){}

    public void aktualisierePersonal(int personalnummer){}

    public void löschePersonal(int personalnummer){}


    public void addKunde(int kundenid){}

    public void aktualisiereKunde(int kundenid){}

    public void löscheKunde(int kundenid){}

    public void login(String benutzername, String passwort){}
    public void logout(){}

    public void verkaufen(int personalnummer, int pid, int kundenid){}

 */

}
