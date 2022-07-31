package com.example.demo;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.CheckBox;

import java.util.ArrayList;

public class Student {
    private int id;
    private String naam;
    private String gebruikersnaam;
    private String wachtwoord;
    private Boolean aanwezig;

    private String klascode;
    private CheckBox check;

    private ObservableList<Student> studenten = FXCollections.observableArrayList();

    public Student(){
        Student student1 = new Student(1, "Thijmen Perdon", "thijmon", "geheim", true, "v1c");
        Student student2 = new Student(2, "Niels Perdon", "nielson", "geheim", true, "v1c");
        Student student3 = new Student(3, "Pieter Pan", "pieterpan", "geheim", true, "v1d");
        Student student4 = new Student(4, "Pieter Jan", "pieterjan", "geheim", true, "v1d");
        studenten.add(student1);
        studenten.add(student2);
        studenten.add(student3);
        studenten.add(student4);
    }

    public Student(int id,String naam,String gebruikersnaam, String wachtwoord,Boolean aanwezig, String klascode){
        this.id =id;
        this.naam = naam;
        this.gebruikersnaam = gebruikersnaam;
        this.wachtwoord = wachtwoord;
        this.aanwezig = aanwezig;
        this.check = new CheckBox();
        this.klascode = klascode;
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

    public Boolean getAanwezig() {
        return aanwezig;
    }

    public String getKlascode() {
        return klascode;
    }

    public void setKlascode(String klascode) {
        this.klascode = klascode;
    }

    public CheckBox getCheck() {
        return check;
    }

    public void setCheck(CheckBox check) {
        this.check = check;
    }

    public void setAanwezig(Boolean aanwezig) {
        this.aanwezig = aanwezig;
    }

    public ObservableList<Student> getStudenten() {
        return studenten;
    }
}
