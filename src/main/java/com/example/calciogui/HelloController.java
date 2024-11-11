package com.example.calciogui;

import calcio.CalciatoreStraniero;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.scene.control.TextArea;
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
    private TextField nazionalita;
    @FXML
    private TextArea output;
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
        if(nazionalita.getText().isEmpty()){
            if (squadra.addCalciatore(new Calciatore(nome.getText(), Integer.parseInt(goal.getText()), capitano.isSelected()))) {
                output.setText("giocatore aggiunto");
            } else {
                output.setText("giocatore non aggiunto: è già presente un capitano");
            }
        }else{
            if (squadra.addCalciatore(new CalciatoreStraniero(nome.getText(), Integer.parseInt(goal.getText()), capitano.isSelected(),nazionalita.getText()))) {
                output.setText("giocatore aggiunto");
            } else {
                output.setText("giocatore non aggiunto: è già presente un capitano");
            }
        }

    }

    @FXML
    protected void second() {
        output.setText(squadra.printSquadra());
    }

    @FXML
    protected void third() {
        if(nazionalita.getText().isEmpty()){
            if (squadra.editGiocatore(new Calciatore(nome.getText(), Integer.parseInt(goal.getText()), capitano.isSelected()))) {
                output.setText("giocatore modificato");
            } else {
                output.setText("giocatore non presente");
            }
        }else{
            if (squadra.editGiocatore(new CalciatoreStraniero(nome.getText(), Integer.parseInt(goal.getText()), capitano.isSelected(),nazionalita.getText()))) {
                output.setText("giocatore modificato");
            } else {
                output.setText("giocatore non presente");
            }
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