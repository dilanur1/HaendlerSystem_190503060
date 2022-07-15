package com.example.demo;

public class Service {
    private int service_id;
    private int kunden_id;
    private int produkt_id;
    private String datum;
    private String zeit;
    private double servicePreis;

    public Service(int service_id, int kunden_id, int produkt_id, String datum, String zeit, double servicePreis) {
        this.service_id = service_id;
        this.kunden_id = kunden_id;
        this.produkt_id = produkt_id;
        this.datum = datum;
        this.zeit = zeit;
        this.servicePreis = servicePreis;
    }

    public int getService_id() {
        return service_id;
    }

    public void setService_id(int service_id) {
        this.service_id = service_id;
    }

    public int getKunden_id() {
        return kunden_id;
    }

    public void setKunden_id(int kunden_id) {
        this.kunden_id = kunden_id;
    }

    public int getProdukt_id() {
        return produkt_id;
    }

    public void setProdukt_id(int produkt_id) {
        this.produkt_id = produkt_id;
    }

    public String getDatum() {
        return datum;
    }

    public void setDatum(String datum) {
        this.datum = datum;
    }

    public String getZeit() {
        return zeit;
    }

    public void setZeit(String zeit) {
        this.zeit = zeit;
    }

    public double getServicePreis() {
        return servicePreis;
    }

    public void setServicePreis(double servicePreis) {
        this.servicePreis = servicePreis;
    }
}
