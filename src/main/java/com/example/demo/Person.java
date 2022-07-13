package com.example.demo;

public class Person {
    private String idNummer;
    private String vorname;
    private String nachname;
    private String geburtsdatum;
    private String geschlecht;
    private String  adress;
    private String telefonnummer;

    public Person(String idnummer, String vorname, String nachname, String gbdatum, String adress, String telno) {
        this.idNummer = idnummer;
        this.vorname = vorname;
        this.nachname = nachname;
        this.geburtsdatum = gbdatum;
        this.adress = adress;
        this.telefonnummer = telno;
    }

    public String getVorname() {
        return vorname;
    }

    public String getGeburtsdatum() {
        return geburtsdatum;
    }

    public String getGeschlecht() {
        return geschlecht;
    }

    public String getAdress() {
        return adress;
    }

    public String getTelefonnummer() {
        return telefonnummer;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public void setGeburtsdatum(String geburtsdatum) {
        this.geburtsdatum = geburtsdatum;
    }

    public void setGeschlecht(String geschlecht) {
        this.geschlecht = geschlecht;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void setTelefonnummer(String telefonnummer) {
        this.telefonnummer = telefonnummer;
    }

    public Person(String idNummer, String vorname, String nachname, String geburtsdatum, String geschlecht, String adress, String telefonnummer) {
        this.idNummer = idNummer;
        this.vorname = vorname;
        this.nachname = nachname;
        this.geburtsdatum = geburtsdatum;
        this.geschlecht = geschlecht;
        this.adress = adress;
        this.telefonnummer = telefonnummer;
    }


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
    public void setIdNummer(String idNummer) {
        this.idNummer = idNummer;
    }


    public String getIdNummer() {
        return idNummer;
    }





}