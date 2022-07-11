package com.example.demo;;
import java.util.ArrayList;

import java.util.Date;
public class Kunde extends Person {
    private int kundenid;
    private ArrayList<Personal> betreuendePersonal = new ArrayList();
    private String z;
    private ArrayList<Produkt> einkaufteProdukt = new ArrayList();

    public Kunde(String idNummer, String vorname, String nachname, String geburtsdatum,String geschlecht,String adresse,String telefonnummer,int kundenid,String z) {
        super(idNummer, vorname, nachname,geburtsdatum,geschlecht,adresse,telefonnummer);
        this.kundenid = kundenid;
        this.z=z;
    }


    public void setBetreuendePersonal(ArrayList<Personal> betreuendePersonal) {
        this.betreuendePersonal = betreuendePersonal;
    }

    public void setZ(String z) {
        this.z = z;
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

    public String getZ() {
        return z;
    }

    public void einkaufen(int personalnummer, int pid, int kundenid) {
    }

    public void zurueckgeben(int personalnummer, int pid, int kundenid) {
    }

    public void bezahlen(int pid, int kundenid) {
    }
}

