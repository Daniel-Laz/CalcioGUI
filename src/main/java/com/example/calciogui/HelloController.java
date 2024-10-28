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
    private Button fourth;
    @FXML
    private Button fifth;
    @FXML
    private Button sixth;

    @FXML
    protected void first() {
        if (squadra.addCalciatore(nome.getText(), Integer.parseInt(goal.getText()), capitano.isSelected())) {
            output.setText("giocatore aggiunto");
        } else {
            output.setText("giocatore non aggiunto - è già presente un capitano");
        }
    }

    @FXML
    protected void second() {
        output.setText(squadra.printSquadra());
    }

    @FXML
    protected void third() {
        if (squadra.editGiocatore(nome.getText(), nome.getText(), Integer.parseInt(goal.getText()), capitano.isSelected())) {
            output.setText("giocatore modificato");
        } else {
            output.setText("giocatore non presente");
        }
    }

    @FXML
    protected void fourth() {
        if (squadra.delGiocatore(nome.getText())){
            output.setText("giocatore eliminato");
        } else {
            output.setText("giocatore non trovato");
        }
    }

    @FXML
    protected void fifth() {
        output.setText(squadra.goal5());
    }

    @FXML
    protected void sixth() {
        output.setText(squadra.getCapitano());
    }

}