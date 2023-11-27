package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;

public class NameScreenController {

    private int qtdPlayers;
    private int qtdIA;


    @FXML
    private Button botaoJogar;

    @FXML
    private TextField p1name;

    @FXML
    private TextField p2name;

    @FXML
    private TextField p3name;

    @FXML
    private TextField p4name;

    @FXML
    private TextField p5name;

    @FXML
    private TextField p6name;

    @FXML
    void iniciarPartida(ActionEvent event) {
        System.out.println("iniciando partida");
    }

    @FXML
    void playerqtd_changed(KeyEvent event) {

    }

    public void setData(Integer qtdjogadores, Integer qtdIA) {
        this.qtdPlayers = qtdjogadores;
        this.qtdIA = qtdIA;
       
    }
}
