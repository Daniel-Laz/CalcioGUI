package com.example.calciogui;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import calcio.Calciatore;
import calcio.Squadra;

public class HelloController {
    private Squadra squadra= new Squadra();
    @FXML
    private TextField input;
    @FXML
    private Label output;
    @FXML
    private Button second;
    @FXML
    private Button first;

    @FXML
    protected void second() {
        output.setText(squadra.printSquadra());
    }

    @FXML
    protected void first() {
        output.setText("inserisci in ordine: nome INVIO goal INVIO capitano? (true o false)");
        if (squadra.addCalciatore(input.getText(), Integer.parseInt(input.getText()), Boolean.parseBoolean(input.getText()))) {
            output.setText("giocatore aggiunto");
        } else {
            output.setText("giocatore non aggiunto - è già presente un capitano");
        }
    }
}