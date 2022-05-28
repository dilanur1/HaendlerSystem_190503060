package com.example.demo;

import java.util.Date;

public class Produkt {
    private int pid;
    private double preis;
    private String kategorie;
    private int garantieZeit;
    private String modell;
    private boolean lagerbestand;
    private double abmessung;

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

    public void setLagerbestand(boolean lagerbestand) {
        this.lagerbestand = lagerbestand;
    }
    public boolean isLagerbestand() {
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

    public void setAbmessung(double abmessung) {
        this.abmessung = abmessung;
    }
    public double getAbmessung() {
        return abmessung;
    }

    public void service(Date datum) {
    }

}
