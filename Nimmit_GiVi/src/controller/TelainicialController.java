package controller;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;
import javafx.scene.Node;

public class TelainicialController {

    @FXML
    private Button botaoJogar;

    @FXML
    private TextField numIA;

    @FXML
    private TextField numJogadores;

    @FXML
    void iaqtd_changed(KeyEvent event) {
        if (!isDigit(numIA.getText())) {
            numIA.setText("0");
        } else {
            if (Integer.parseInt(numIA.getText()) < 0) {
                numIA.setText("0");
            } else {
                if(isDigit(numJogadores.getText())){
                    if(Integer.parseInt(numIA.getText()) >= Integer.parseInt(numJogadores.getText())){
                        numIA.setText(numJogadores.getText());
                    }
                }
        }
    }
    }

    @FXML
    void iniciarPartida(ActionEvent event) {
         try {
            // Load the FXML file for the "nomearJogadores" scene
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/chooseNames.fxml"));
            Parent root = loader.load();
            NameScreenController nameScreenController = loader.getController();
            nameScreenController.setData(Integer.parseInt(numJogadores.getText()),Integer.parseInt(numIA.getText()));

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

    @FXML
    void playerqtd_changed(KeyEvent event) {
        if (!isDigit(numJogadores.getText())) {
            numJogadores.setText("0");
        } else {
            if (Integer.parseInt(numJogadores.getText()) < 3) {
                numJogadores.setText("3");
            } else if (Integer.parseInt(numJogadores.getText()) > 6) {
                numJogadores.setText("6");
            }
            if (Integer.parseInt(numJogadores.getText()) > 4) {
                numJogadores.setText("4");
            }
        }
    }

    private boolean isDigit(String text) {
        try {
            Integer.parseInt(text);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

}
