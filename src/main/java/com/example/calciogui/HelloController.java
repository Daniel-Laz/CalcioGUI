package com.example.calciogui;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import calcio.Calciatore;
import calcio.Squadra;

public class HelloController {
    private Squadra squadra= new Squadra();
    @FXML
    private TextField nome;

    @FXML
    private TextField goal;
    @FXML
    private CheckBox capitano;

    @FXML
    private Label output;
    @FXML
    private Button second;
    @FXML
    private Button first;
    @FXML
    private Button third;


    @FXML
    protected void second() {
        output.setText(squadra.printSquadra());
    }

    @FXML
    protected void first() {

        if (squadra.addCalciatore(nome.getText(), Integer.parseInt(goal.getText()), capitano.isSelected())) {
            output.setText("giocatore aggiunto");
        } else {
            output.setText("giocatore non aggiunto - è già presente un capitano");
        }
    }
    @FXML
    protected void third() {
        output.setText(squadra.printSquadra());

        if (squadra.editGiocatore(nome.getText(), nome.getText(), Integer.parseInt(goal.getText()), capitano.isSelected())) {
            output.setText("giocatore modificato");
        } else {
            output.setText("giocatore non presente");
        }
    }

}