package com.example.demo;;
import java.util.ArrayList;

import java.util.Date;
public class Kunde extends Person {
    private int kundenid;
    private ArrayList<Personal> betreuendePersonal = new ArrayList();
    private Zahlungsinfo z;
    private ArrayList<Produkt> einkaufteProdukt = new ArrayList();


    public void setBetreuendePersonal(ArrayList<Personal> betreuendePersonal) {
        this.betreuendePersonal = betreuendePersonal;
    }

    public void setZ(Zahlungsinfo z) {
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

    public Zahlungsinfo getZ() {
        return z;
    }

    public void einkaufen(int personalnummer, int pid, int kundenid) {
    }

    public void zurueckgeben(int personalnummer, int pid, int kundenid) {
    }

    public void bezahlen(int pid, int kundenid) {
    }
}

