package com.example.demo;

import java.util.Date;

public class Zahlungsinfo {
    private int id;
    private String typ;
    private Date datum;
    private double betrag;
    private Kunde zahlenderKunde=new Kunde();

    public Zahlungsinfo(Kunde zahlenderKunde) {
        this.zahlenderKunde = zahlenderKunde;
    }

    public void setBetrag(double betrag) {
        this.betrag = betrag;
    }

    public double getBetrag() {
        return betrag;
    }

    public Date getDatum() {
        return datum;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Kunde getZahlenderKunde() {
        return zahlenderKunde;
    }

    public void setZahlenderKunde(Kunde zahlenderKunde) {
        this.zahlenderKunde = zahlenderKunde;
    }

    public String getTyp() {
        return typ;
    }

    public void setTyp(String typ) {
        this.typ = typ;
    }
}
