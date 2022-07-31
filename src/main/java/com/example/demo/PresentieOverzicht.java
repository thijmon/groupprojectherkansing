package com.example.demo;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class PresentieOverzicht {

    Les l1 = new Les(1, "intro");
    Les l2 = new Les(2, "casus");

    @FXML
    private TableColumn<Student, Boolean> studentaanwezig;

    @FXML
    private TableView<Student> studententable;

    @FXML
    private TableColumn<Student, Integer> studentid;

    @FXML
    private TableColumn<Student, String> studentnaam;

    @FXML
    private TableColumn<?, ?> check;

    @FXML
    private ChoiceBox<String> klassenbox;

    @FXML
    private ChoiceBox<String> lessenbox;
    ObservableList<String> klassenboxList = FXCollections.observableArrayList("v1c", "v1d");
    ObservableList<String> lessenboxList = FXCollections.observableArrayList("intro", "casus");

    @FXML
    private Button updateBtn;


    @FXML
    void updateBtn(ActionEvent event) {
        if (lessenbox.getSelectionModel().getSelectedItem().equals("intro")){
            for(Student s : l1.getStudenten()){
                if (s.getCheck().isSelected()){
                    s.setAanwezig(true);
                    studententable.refresh();
                } else {
                    s.setAanwezig(false);
                    studententable.refresh();
                }
            }
        } else {
            for (Student s : l2.getStudenten()) {
                if (s.getCheck().isSelected()) {
                    s.setAanwezig(true);
                    studententable.refresh();
                } else {
                    s.setAanwezig(false);
                    studententable.refresh();
                }
            }
        }

    }

    @FXML
    void filter(ActionEvent event) {
        initialize();
        studententable.refresh();
    }

    @FXML
    public void initialize(){
        klassenbox.setItems(klassenboxList);
        lessenbox.setItems(lessenboxList);
        studentid.setCellValueFactory(new PropertyValueFactory<Student, Integer>("id"));
        studentnaam.setCellValueFactory(new PropertyValueFactory<Student, String>("naam"));
        studentaanwezig.setCellValueFactory(new PropertyValueFactory<Student, Boolean>("aanwezig"));
        check.setCellValueFactory(new PropertyValueFactory<>("check"));
        String klas = klassenbox.getSelectionModel().getSelectedItem();
        String les = lessenbox.getSelectionModel().getSelectedItem();
        ObservableList<Student> gefilterdeStudenten = FXCollections.observableArrayList();
        if(les != null) {
            if (les.equals("intro")) {
                for (Student s : l1.getStudenten()) {
                    if (s.getKlascode().equals(klas)) {
                        gefilterdeStudenten.add(s);
                    }
                }
                studententable.setItems(gefilterdeStudenten);
            } else {
                for (Student s : l2.getStudenten()) {
                    if (s.getKlascode().equals(klas)) {
                        gefilterdeStudenten.add(s);
                    }
                }
                studententable.setItems(gefilterdeStudenten);
            }
        }
        else {
            studententable.getItems().clear();
        }
    }
}