package com.example.calciogui;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import calcio.Calciatore;
import calcio.Squadra;

public class HelloController {
    @FXML
    private ChoiceBox menu;
    private Squadra squadra= new Squadra();
    @FXML
    private TextField input;
    @FXML
    private Label output;

    @FXML
    protected void executeMenu() {
        Object choice = menu.getValue();
        if(choice.toString().equals("aggiungi giocatore")) {
            String name = input.getText();
            input.setText("");
            int goal = Integer.parseInt(input.getText());
            input.setText("");
            boolean isCapitan = Boolean.parseBoolean(input.getText());
            squadra.addCalciatore(name, goal, isCapitan);
        }else if(choice.toString().equals("visualizza squadra")){
            output.setText(squadra.printSquadra());
        }
    }
}