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
    public void setIdPersonal(int idPersonal) {
        this.idPersonal = idPersonal;
    }

    public void setBenutzername(String benutzername) {
        this.benutzername = benutzername;
    }

    public void setPasswort(String passwort) {
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



}
