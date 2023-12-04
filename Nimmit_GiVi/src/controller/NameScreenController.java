package controller;

import java.io.IOException;
import java.util.ArrayList;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import model.Player;
import model.PlayerPlace;
import model.Tabuleiro;

public class NameScreenController {

    private int qtdPlayers;
    private int qtdIA;

    @FXML
    private Button botaoJogar;

    @FXML
    private Text p1label;
    
    @FXML
    private Text p2label;

    @FXML
    private Text p3label;

    @FXML
    private Text p4label;

    @FXML
    private Text p5label;

    @FXML
    private Text p6label;

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

    ArrayList<String> textfields = new ArrayList<String>();
    ArrayList<PlayerPlace> players = new ArrayList<PlayerPlace>();


    
    @FXML
    void iniciarPartida(ActionEvent event) {

        textfields.add(p1name.getText());
        textfields.add(p2name.getText());
        textfields.add(p3name.getText());
        textfields.add(p4name.getText());
        textfields.add(p5name.getText());
        textfields.add(p6name.getText());

        for (int i = qtdPlayers; i > textfields.size(); i--) {
            textfields.remove(i);
        }

        for (int i = 0; i< qtdPlayers-qtdIA; i++){
            players.add(new PlayerPlace(new Player(textfields.get(i), false)));
        }
        for (int i = qtdPlayers-qtdIA; i< qtdPlayers; i++){
            players.add(new PlayerPlace(new Player(textfields.get(i), true)));
        }

        System.out.println("iniciando partida");
        



        try {
            // Load the FXML file for the "nomearJogadores" scene
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/telaPrincipal.fxml"));
            Parent root = loader.load();
            MainScreenController mainController = loader.getController();
            mainController.setTabuleiro(new Tabuleiro(players));

            // Get the Stage from the ActionEvent
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

            // Create a new Scene with the FXML file's root Node as the root node for the Scene
            Scene scene = new Scene(root);

            // Set the Stage's Scene
            stage.setScene(scene);
            stage.setTitle("Nimmit GiVi");
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void startFields() {

        ArrayList<TextField> nameFields = new ArrayList<>();
        ArrayList<Text> labels = new ArrayList<>();

        nameFields.add(p1name);
        nameFields.add(p2name);
        nameFields.add(p3name);
        nameFields.add(p4name);
        nameFields.add(p5name);
        nameFields.add(p6name);

        labels.add(p1label);
        labels.add(p2label);
        labels.add(p3label);
        labels.add(p4label);
        labels.add(p5label);
        labels.add(p6label);

        for (int i = 0; i < nameFields.size(); i++) {
            nameFields.get(i).setVisible(i < qtdPlayers);
            labels.get(i).setVisible(i < qtdPlayers);
        }
    }

    @FXML
    void playerqtd_changed(KeyEvent event) {

    }

    public void setData(Integer qtdjogadores, Integer qtdIA) {
        this.qtdPlayers = qtdjogadores;
        this.qtdIA = qtdIA;
       
    }
}
