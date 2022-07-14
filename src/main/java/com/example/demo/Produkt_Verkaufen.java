package com.example.demo;

public class Produkt_Verkaufen {
    private  int id;
    private int kunden_id;
    private int produkt_id;
    private String zahlmethode;
    private String datum;
    private String service;

    public Produkt_Verkaufen(int id, int kunden_id, int produkt_id, String zahlmethode, String datum, String service) {
        this.id = id;
        this.kunden_id = kunden_id;
        this.produkt_id = produkt_id;
        this.zahlmethode = zahlmethode;
        this.datum = datum;
        this.service = service;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setKunden_id(int kunden_id) {
        this.kunden_id = kunden_id;
    }

    public void setProdukt_id(int produkt_id) {
        this.produkt_id = produkt_id;
    }

    public void setZahlmethode(String zahlmethode) {
        this.zahlmethode = zahlmethode;
    }

    public void setDatum(String datum) {
        this.datum = datum;
    }

    public void setService(String service) {
        this.service = service;
    }

    public int getId() {
        return id;
    }

    public int getKunden_id() {
        return kunden_id;
    }

    public int getProdukt_id() {
        return produkt_id;
    }

    public String getZahlmethode() {
        return zahlmethode;
    }

    public String getDatum() {
        return datum;
    }

    public String getService() {
        return service;
    }
}
