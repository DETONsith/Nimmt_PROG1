package model;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class telaInicial {

    @FXML
    private Button botaoJogar;

    @FXML
    private TextField numIA;

    @FXML
    private TextField numJogadores;

    @FXML
    void iniciarPartida(ActionEvent event) {
        if(numJogadores.getText().isEmpty() || numIA.getText().isEmpty()){
            exibirAlerta("Erro!\nPor favor, preencha os campos vazios!");

            return;
        }
        
        try{
        int qtdJogadores =  Integer.parseInt(numJogadores.getText());
        int qtdIA = Integer.parseInt(numIA.getText());

        if(qtdJogadores < 3 || qtdJogadores > 6 && qtdIA < 1 || qtdIA > 5){
            exibirAlerta("Erro!\nInsira Numeros Validos!");

            return;
        }

            
        }catch(NumberFormatException e){
            exibirAlerta("Insira valores validos para jogadores e IA!\n Certifique-se que sejam numeros!");
        }
        
    }
    
 private void exibirAlerta(String conteudo) {
        Alert alerta = new Alert(Alert.AlertType.ERROR);
        alerta.setContentText(conteudo);
        alerta.showAndWait();
    }
}
