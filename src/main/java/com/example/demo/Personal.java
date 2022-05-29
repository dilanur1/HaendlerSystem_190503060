package com.example.demo;
import java.util.ArrayList;

public class Personal extends Person{
    private int personalnummer;
    private String benutzername;
    private String passwort;
    private ArrayList<Kunde> betreuteKunde;

    public Personal(String name,String nachname,int personalnummer){
        super();
        this.personalnummer=personalnummer;
    }

    public void setBenutzername(String benutzername) {
        this.benutzername = benutzername;
    }

    public void setBetreuteKunde(ArrayList<Kunde> betreuteKunde) {
        this.betreuteKunde = betreuteKunde;
    }

    public void setPasswort(String passwort) {
        this.passwort = passwort;
    }

    public int getPersonalnummer() {
        return personalnummer;
    }

    public String getPasswort() {
        return passwort;
    }

    public ArrayList<Kunde> getBetreuteKunde() {
        return betreuteKunde;
    }

    public String getBenutzername() {
        return benutzername;
    }

    public void setPersonalnummer(int personalnummer) {
        this.personalnummer = personalnummer;
    }

    public void addProdukt(int pid){}

    public void aktualisiereProdukt(int pid){}

    public void löscheProdukt(int pid){}

    public void sucheProdukt(int personalnummer){}
    public void sucheProdukt(String modell){}


    public void addPersonal(int personalnummer){}

    public void aktualisierePersonal(int personalnummer){}

    public void löschePersonal(int personalnummer){}


    public void addKunde(int kundenid){}

    public void aktualisiereKunde(int kundenid){}

    public void löscheKunde(int kundenid){}

    public void login(String benutzername, String passwort){}
    public void logout(){}

    public void verkaufen(int personalnummer, int pid, int kundenid){}

}
