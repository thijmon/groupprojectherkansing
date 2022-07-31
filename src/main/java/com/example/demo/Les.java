package com.example.demo;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.ArrayList;
import java.util.List;

public class Les {
    private int id;
    private String naam;
    private ObservableList<Student> studenten = FXCollections.observableArrayList();

    public Les(int id, String naam) {
        this.id = id;
        this.naam = naam;
        ObservableList<Student> stdn = new Student().getStudenten();
        studenten.addAll(stdn);
    }

    public ObservableList<Student> getStudenten() {
        return studenten;
    }

    public String getNaam() {
        return naam;
    }
}
