package com.example.demo;

import java.util.Date;

public class Person {
    private String idNummer;
    private String vorname;
    private String nachname;
    //private Date geburtsdatum;
   // private String geschlecht;
    //private Adress adresse;
    //private String telnummer;
/*
    public Adress getAdresse() {
        return adresse;
    }

    public void setAdresse(Adress adresse) {
        this.adresse = adresse;
    }

    public String getTelnummer() {
        return telnummer;
    }

    public void setTelnummer(String telnummer) {
        this.telnummer = telnummer;
    }

    public Date getGeburtsdatum() {
        return geburtsdatum;
    }

    public void setGeburtsdatum(Date geburtsdatum) {
        this.geburtsdatum = geburtsdatum;
    }

    public String getGeschlecht() {
        return geschlecht;
    }

    public void setGeschlecht(String geschlecht) {
        this.geschlecht = geschlecht;
    }
    */

    public String getName() {
        return vorname;
    }

    public void setName(String name) {
        this.vorname = name;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public String getIdNummer() {
        return idNummer;
    }

    public void setIdNummer(String idNummer) {
        this.idNummer = idNummer;
    }




}