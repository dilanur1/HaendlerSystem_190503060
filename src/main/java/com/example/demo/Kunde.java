package com.example.demo;;
import java.util.ArrayList;

import java.util.Date;
public class Kunde extends Person {
    private int kundenid;
    private ArrayList<Personal> betreuendePersonal = new ArrayList();
    private int pvid;
    private ArrayList<Produkt> einkaufteProdukt = new ArrayList();

    public Kunde(String idNummer, String vorname, String nachname, String geburtsdatum,String geschlecht,String adresse,String telefonnummer,int kundenid,int pvid) {
        super(idNummer, vorname, nachname,geburtsdatum,geschlecht,adresse,telefonnummer);
        this.kundenid = kundenid;
        this.pvid=pvid;
    }
/*
    public Kunde(String idnummer, String vorname, String nachname, String gbdatum, String adress, String telno) {
        super(idnummer, vorname, nachname,gbdatum,adress,telno);
    }

 */


    public void setBetreuendePersonal(ArrayList<Personal> betreuendePersonal) {
        this.betreuendePersonal = betreuendePersonal;
    }

    public void setZ(int pvid) {
        this.pvid=pvid;
    }

    public void setKundenid(int kundenid) {
        this.kundenid = kundenid;

    }

    public void setEinkaufteProdukt(ArrayList<Produkt> einkaufteProdukt) {
        this.einkaufteProdukt = einkaufteProdukt;
    }

    public int getKundenid() {
        return kundenid;
    }

    public ArrayList<Personal> getBetreuendePersonal() {
        return betreuendePersonal;
    }

    public ArrayList<Produkt> getEinkaufteProdukt() {
        return einkaufteProdukt;
    }

    public int getZ() {
        return pvid;
    }


}

