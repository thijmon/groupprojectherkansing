package com.example.demo;

public class Docent {
    private int id;
    private String naam;
    private String gebruikersnaam;
    private String wachtwoord;

    public Docent(int id,String naam,String gebruikersnaam, String wachtwoord){
        this.id = id;
        this.naam = naam;
        this.gebruikersnaam = gebruikersnaam;
        this.wachtwoord = wachtwoord;
    }

    public int getId() {
        return id;
    }

    public String getNaam() {
        return naam;
    }

    public String getGebruikersnaam() {
        return gebruikersnaam;
    }

    public String getWachtwoord() {
        return wachtwoord;
    }
}