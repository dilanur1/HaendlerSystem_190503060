package com.example.demo;

import java.util.Date;

public class Produkt {
    private int pid;
    private double preis;
    private String kategorie;
    private int garantieZeit;
    private String modell;
    private String lagerbestand;
    private double höhe;
    private double breite;
    private double länge;
    private int pvid;

    public Produkt(int produkt_id, double preis, String kategorie, int garantiezeit, String modell, String lagerbestand, double höhe, double breite, double länge,int pvid) {
        pid=produkt_id;
        this.preis=preis;
        this.kategorie=kategorie;
        this.garantieZeit=garantiezeit;
        this.modell=modell;
        this.lagerbestand=lagerbestand;
        this.höhe=höhe;
        this.breite=breite;
        this.länge=länge;
        this.pvid=pvid;
    }

    public void setKategorie(String kategorie) {
        this.kategorie = kategorie;
    }
    public String getKategorie() {
        return kategorie;
    }

    public void setGarantieZeit(int garantieZeit) {
        this.garantieZeit = garantieZeit;
    }
    public int getGarantieZeit() {
        return garantieZeit;
    }

    public void setLagerbestand(String lagerbestand) {
        this.lagerbestand = lagerbestand;
    }
    public String isLagerbestand() {
        return lagerbestand;
    }

    public void setModell(String modell) {
        this.modell = modell;
    }
    public String getModell() {
        return modell;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }
    public int getPid() {
        return pid;
    }

    public void setPreis(double preis) {
        this.preis = preis;
    }
    public double getPreis() {
        return preis;
    }

    public void setHöhe(double höhe) {
        this.höhe = höhe;
    }

    public void setBreite(double breite) {
        this.breite = breite;
    }

    public void setLänge(double länge) {
        this.länge = länge;
    }

    public void service(Date datum) {
    }

    public double getHöhe() {
        return höhe;
    }

    public double getBreite() {
        return breite;
    }

    public double getLänge() {
        return länge;
    }

    public String getLagerbestand() {
        return lagerbestand;
    }

    public int getPvid() {
        return pvid;
    }

    public void setPvid(int pvid) {
        this.pvid = pvid;
    }
}
