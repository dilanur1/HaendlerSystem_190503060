package com.example.demo;;
import java.util.ArrayList;

import java.util.Date;
public class Kunde extends Person {
    private int kundenid;
    //private ArrayList<Personal> betreuendePersonal = new ArrayList();
    private int pvid;
    //private ArrayList<Integer> einkaufteProdukt = new ArrayList();

    public Kunde(String idNummer, String vorname, String nachname, String geburtsdatum,String geschlecht,String adresse,String telefonnummer,int kundenid,int pvid) {
        super(idNummer, vorname, nachname,geburtsdatum,geschlecht,adresse,telefonnummer);
        this.kundenid = kundenid;
        this.pvid=pvid;
    }

    public Kunde(int kundenID) {
        super();
        this.kundenid=kundenID;
    }
/*
    public Kunde(String idnummer, String vorname, String nachname, String gbdatum, String adress, String telno) {
        super(idnummer, vorname, nachname,gbdatum,adress,telno);
    }

 */




    public void getPvid(int pvid) {
        this.pvid=pvid;
    }

    public void setKundenid(int kundenid) {
        this.kundenid = kundenid;

    }



    public int getKundenid() {
        return kundenid;
    }


    public int getPvid() {
        return pvid;
    }


}

