package com.example.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.io.IOException;

public class Login {

    Docent d1 = new Docent(1, "Mirko Pelgrom", "mirkop", "geheim");

    @FXML
    private Text errorMsg;

    @FXML
    private TextField gebruikersnaam;

    @FXML
    private Button loginBtn;

    @FXML
    private PasswordField wachtwoord;

    @FXML
    void login(ActionEvent event) throws IOException {
        checkLogin();
    }

    private void checkLogin() throws IOException {
        HelloApplication application = new HelloApplication();
        if(gebruikersnaam.getText().toString().equals(d1.getGebruikersnaam()) && wachtwoord.getText().toString().equals(d1.getWachtwoord())){
            // change to presentie overzicht
            application.changeScene("PresentieOverzicht.fxml");
        } else {
            errorMsg.setText("Verkeerde inloggegevens");
        }
    }

}
