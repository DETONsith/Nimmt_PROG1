package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javafx.concurrent.Task;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import model.Carta;
import model.PlayerPlace;
import model.SignedCard;
import model.Tabuleiro;

public class MainScreenController {

    Tabuleiro tabuleiro;
    ImageView[][] crtGrid;
    Text[][] lblGrid;
    ImageView[] crtTopo;
    Text[] lblTopo;

    @FXML
    private Button btn_action;

    @FXML
    private ImageView crt_00;

    @FXML
    private ImageView crt_01;

    @FXML
    private ImageView crt_02;

    @FXML
    private ImageView crt_03;

    @FXML
    private ImageView crt_04;

    @FXML
    private ImageView crt_10;

    @FXML
    private ImageView crt_11;

    @FXML
    private ImageView crt_12;

    @FXML
    private ImageView crt_13;

    @FXML
    private ImageView crt_14;

    @FXML
    private ImageView crt_20;

    @FXML
    private ImageView crt_21;

    @FXML
    private ImageView crt_22;

    @FXML
    private ImageView crt_23;

    @FXML
    private ImageView crt_24;

    @FXML
    private ImageView crt_30;

    @FXML
    private ImageView crt_31;

    @FXML
    private ImageView crt_32;

    @FXML
    private ImageView crt_33;

    @FXML
    private ImageView crt_34;

    @FXML
    private ImageView crt_40;

    @FXML
    private ImageView crt_41;

    @FXML
    private ImageView crt_42;

    @FXML
    private ImageView crt_43;

    @FXML
    private ImageView crt_44;

    @FXML
    private ImageView crttopo_00;

    @FXML
    private ImageView crttopo_01;

    @FXML
    private ImageView crttopo_02;

    @FXML
    private ImageView crttopo_03;

    @FXML
    private ImageView crttopo_04;

    @FXML
    private ImageView crttopo_05;

    @FXML
    private ImageView crttopo_10;

    @FXML
    private ImageView crttopo_11;

    @FXML
    private ImageView crttopo_12;

    @FXML
    private ImageView crttopo_13;

    @FXML
    private ImageView crttopo_14;

    @FXML
    private ImageView crttopo_15;

    @FXML
    private Text lbl_00;

    @FXML
    private Text lbl_01;

    @FXML
    private Text lbl_02;

    @FXML
    private Text lbl_03;

    @FXML
    private Text lbl_04;

    @FXML
    private Text lbl_10;

    @FXML
    private Text lbl_11;

    @FXML
    private Text lbl_12;

    @FXML
    private Text lbl_13;

    @FXML
    private Text lbl_14;

    @FXML
    private Text lbl_20;

    @FXML
    private Text lbl_21;

    @FXML
    private Text lbl_22;

    @FXML
    private Text lbl_23;

    @FXML
    private Text lbl_24;

    @FXML
    private Text lbl_30;

    @FXML
    private Text lbl_31;

    @FXML
    private Text lbl_32;

    @FXML
    private Text lbl_33;

    @FXML
    private Text lbl_34;

    @FXML
    private Text lbl_40;

    @FXML
    private Text lbl_41;

    @FXML
    private Text lbl_42;

    @FXML
    private Text lbl_43;

    @FXML
    private Text lbl_44;

    @FXML
    private Text lblplayer1;

    @FXML
    private Text lblplayer2;

    @FXML
    private Text lblplayer3;

    @FXML
    private Text lblplayer4;

    @FXML
    private Text lblplayer5;

    @FXML
    private Text lblplayer6;

    @FXML
    private Text lbltopo_00;

    @FXML
    private Text lbltopo_01;

    @FXML
    private Text lbltopo_02;

    @FXML
    private Text lbltopo_03;

    @FXML
    private Text lbltopo_04;

    @FXML
    private Text lbltopo_05;

    @FXML
    private Text lbltopo_10;

    @FXML
    private Text lbltopo_11;

    @FXML
    private Text lbltopo_12;

    @FXML
    private Text lbltopo_13;

    @FXML
    private Text lbltopo_14;

    @FXML
    private Text lbltopo_15;

    @FXML
    private TextField playername1;

    @FXML
    private TextField playername2;

    @FXML
    private TextField playername3;

    @FXML
    private TextField playername4;

    @FXML
    private TextField playername5;

    @FXML
    private TextField playername6;

    @FXML
    private TextField playerpoints1;

    @FXML
    private TextField playerpoints2;

    @FXML
    private TextField playerpoints3;

    @FXML
    private TextField playerpoints4;

    @FXML
    private TextField playerpoints5;

    @FXML
    private TextField playerpoints6;

    @FXML
    void on_btn_action_click(ActionEvent event) {
        if (activePlayer.getHand().getSelectedCardIndex() == -1) {
            return;
        }
        checkround();
    }

    @FXML
    void cartatopo00(MouseEvent event) {
        enfaseCard(0);
        if(activePlayer.getHand().getCards().get(0) == null){
            return;
        }
        activePlayer.getHand().selectCard(0);
    }

    @FXML
    void cartatopo01(MouseEvent event) {
       if(activePlayer.getHand().getCards().get(1) == null){
        return; 
       }
        enfaseCard(1);
       
        activePlayer.getHand().selectCard(1);
    }

    @FXML
    void cartatopo02(MouseEvent event) {
        if(activePlayer.getHand().getCards().get(2) == null){
        return; 
       }
        enfaseCard(2);
        activePlayer.getHand().selectCard(2);
    }

    @FXML
    void cartatopo03(MouseEvent event) {
        if(activePlayer.getHand().getCards().get(3) == null){
        return; 
       }
        enfaseCard(3);
        activePlayer.getHand().selectCard(3);
    }

    @FXML
    void cartatopo04(MouseEvent event) {
        if(activePlayer.getHand().getCards().get(4) == null){
        return; 
       }
        enfaseCard(4);
        activePlayer.getHand().selectCard(4);
    }

    @FXML
    void cartatopo05(MouseEvent event) {
        if(activePlayer.getHand().getCards().get(5) == null){
        return; 
       }
        enfaseCard(5);
        activePlayer.getHand().selectCard(5);
    }

    @FXML
    void cartatopo10(MouseEvent event) {
        if(activePlayer.getHand().getCards().get(6) == null){
        return; 
       }
        enfaseCard(6);
        activePlayer.getHand().selectCard(6);
    }

    @FXML
    void cartatopo11(MouseEvent event) {
        if(activePlayer.getHand().getCards().get(7) == null){
        return; 
       }
        enfaseCard(7);
        activePlayer.getHand().selectCard(7);
    }

    @FXML
    void cartatopo12(MouseEvent event) {
        if(activePlayer.getHand().getCards().get(8) == null){
        return; 
       }
        enfaseCard(8);
        activePlayer.getHand().selectCard(8);
    }

     @FXML
    void cartatopo13(MouseEvent event) {
        if(activePlayer.getHand().getCards().get(9) == null){
        return; 
       }
        enfaseCard(9);
        activePlayer.getHand().selectCard(9);
    }


    @FXML
    void cartatopo14(MouseEvent event) {
        if(activePlayer.getHand().getCards().get(10) == null){
        return; 
       }
        enfaseCard(10);
        activePlayer.getHand().selectCard(10);
    }

    @FXML
    void cartatopo15(MouseEvent event) {
        if(activePlayer.getHand().getCards().get(11) == null){
        return; 
       }
        enfaseCard(11);
        activePlayer.getHand().selectCard(11);
    }

   
    private List<TextField> playerNames = new ArrayList<>();
    private List<TextField> playerPoints = new ArrayList<>();
    private List<Text> playerLabels = new ArrayList<>();
    private PlayerPlace activePlayer;

    public void initialize() {
        this.crtGrid = new ImageView[][] {
            { crt_00, crt_01, crt_02, crt_03, crt_04 },
            { crt_10, crt_11, crt_12, crt_13, crt_14 },
            { crt_20, crt_21, crt_22, crt_23, crt_24 },
            { crt_30, crt_31, crt_32, crt_33, crt_34 },
            { crt_40, crt_41, crt_42, crt_43, crt_44 }
        };
        this.lblGrid = new Text[][] {
            { lbl_00, lbl_01, lbl_02, lbl_03, lbl_04 },
            { lbl_10, lbl_11, lbl_12, lbl_13, lbl_14 },
            { lbl_20, lbl_21, lbl_22, lbl_23, lbl_24 },
            { lbl_30, lbl_31, lbl_32, lbl_33, lbl_34 },
            { lbl_40, lbl_41, lbl_42, lbl_43, lbl_44 }
        };

        crtTopo = new ImageView[] {
            crttopo_00, crttopo_01, crttopo_02, crttopo_03, crttopo_04, crttopo_05, crttopo_10, crttopo_11,
            crttopo_12, crttopo_13, crttopo_14, crttopo_15
        };

        lblTopo = new Text[] {
            lbltopo_00, lbltopo_01, lbltopo_02, lbltopo_03, lbltopo_04, lbltopo_05, lbltopo_10, lbltopo_11,
            lbltopo_12, lbltopo_13, lbltopo_14, lbltopo_15  
        };

        playerNames.addAll(Arrays.asList(playername1, playername2, playername3, playername4, playername5, playername6));

        playerPoints.addAll(Arrays.asList(playerpoints1, playerpoints2, playerpoints3, playerpoints4, playerpoints5, playerpoints6));

        playerLabels.addAll(Arrays.asList(lblplayer1, lblplayer2, lblplayer3, lblplayer4, lblplayer5, lblplayer6));
    }

    public void setTabuleiro(Tabuleiro tabuleiro) {
        this.tabuleiro = tabuleiro;
        this.tabuleiro.gameStart();
        activePlayer = this.tabuleiro.getNextPlayer();
        highlightCurrentPlayer();
        renderGrid();
        updatePlayerFields();
    }

    private void checkround() {
        
        
       
        
        this.tabuleiro.addCardtoGrid(new SignedCard(this.activePlayer.playCard(), this.activePlayer.getPlayer()));
        this.activePlayer = this.tabuleiro.getNextPlayer();
        highlightCurrentPlayer();
        this.activePlayer.clearSelectedCard();
        clearEnfaseCards();
         if (this.isAllCardsPlayed()) {
            if (this.processRoundCards() == false){
                return;
            }
        }
        
     
        this.renderGrid();

        if(activePlayer.getPlayer().isIA()){
            checkround();
        }



    }

    private boolean processRoundCards() {
        ArrayList<SignedCard> cards = new ArrayList<>();
        cards = this.tabuleiro.getCardsinBoard();

        //ordena as cartas com bubble sort
        for (int i = 0; i < cards.size(); i++) {
            for (int j = 0; j < cards.size() - 1; j++) {
                if (cards.get(j).getCarta().getNumber() > cards.get(j + 1).getCarta().getNumber()) {
                    SignedCard aux = cards.get(j);
                    cards.set(j, cards.get(j + 1));
                    cards.set(j + 1, aux);
                }
            }
        }

        for (SignedCard card : cards) {
            renderBoardCardsOnTop();
            this.tabuleiro.processPlay(card);
            this.renderGrid();
            this.updatePlayerFields();
        }
        this.tabuleiro.removeCardsFromBoard();
        System.out.println("removeu as cartas do grid");

        if (this.tabuleiro.getPlayers().get(0).getHand().getCards().size() == 0) {
            
            System.out.println("Fim de jogo");
            gotoWinnerScreen(this.tabuleiro.checkWinner());
            return false;
        }
        return true;
    }

    private void renderBoardCardsOnTop(){
        ArrayList<SignedCard> cards = this.tabuleiro.getCardsinBoard();
        ArrayList<Carta> cartas = new ArrayList<>();
        for (SignedCard card : cards) {
            cartas.add(card.getCarta());
        }
        for (int i = 0; i < 12; i++) {
            if(i < cartas.size()){
                crtTopo[i].setImage(cartas.get(i).getImage());
                lblTopo[i].setText(Integer.toString(cartas.get(i).getNumber()));
                lblTopo[i].setFill(cartas.get(i).getColor());
            }
            else{
                Carta carta = new Carta(1);
                crtTopo[i].setImage(carta.nullimage());
                lblTopo[i].setText("");
            }
        }
    }

    private void renderPlayerCardsOnTop(){
        ArrayList<Carta> cartas = this.activePlayer.getHand().getCards();
        for (int i = 0; i < 12; i++) {
            if(i < cartas.size()){
                crtTopo[i].setImage(cartas.get(i).getImage());
                int number = cartas.get(i).getNumber();
                String numberText = (number < 10) ? "0" + number : Integer.toString(number);
                lblTopo[i].setText(numberText);
                lblTopo[i].setFill(cartas.get(i).getColor());
            }
            else{
                Carta carta = new Carta(1);
                crtTopo[i].setImage(carta.nullimage());
                lblTopo[i].setText("");
            }
        }
    }


    private boolean isAllCardsPlayed() {
        if (this.tabuleiro.getCardsinBoard().size() == this.tabuleiro.getPlayers().size()) {
            return true;
        }
        return false;
    }

    private void renderGrid() {
        Carta[][] grid = this.tabuleiro.getGrid();
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (grid[i][j] == null) {
                    crtGrid[i][j].setImage(grid[0][0].nullimage());
                    lblGrid[i][j].setText("");
                    continue;
                }
                crtGrid[i][j].setImage(grid[i][j].getImage());
                
                int number = grid[i][j].getNumber();
                String numberText = (number < 10) ? "0" + number : Integer.toString(number);
                lblGrid[i][j].setText(numberText);
                lblGrid[i][j].setFill(grid[i][j].getColor());
            }
        }
        renderPlayerCardsOnTop();
    }


    private void enfaseCard(Integer index) {
        clearEnfaseCards();
        crtTopo[index].setStyle("-fx-effect: dropshadow(three-pass-box, white, 3, 3, 0, 0);");
    }

    private void clearEnfaseCards(){
        for (ImageView crt : crtTopo) {
            crt.setStyle("");
        }
    }

    private void updatePlayerFields() {
        List<PlayerPlace> players = tabuleiro.getPlayers();

        int size = players.size();

        for (int i = 0; i < 6; i++) {
            if (i < size) {
                PlayerPlace player = players.get(i);
                playerNames.get(i).setText(player.getPlayer().getName());
                playerPoints.get(i).setText(Integer.toString(player.getScore()));
                playerNames.get(i).setEditable(false);
                playerPoints.get(i).setEditable(false);
            } else {
                playerNames.get(i).setVisible(false);
                playerPoints.get(i).setVisible(false);
                playerLabels.get(i).setVisible(false);
            }
        }
    }

    private void highlightCurrentPlayer(){
        for (int i = 0; i < 6; i++) {
            if (i < tabuleiro.getPlayers().size()) {
                if (tabuleiro.getPlayers().get(i) == activePlayer) {
                    playerLabels.get(i).setStyle("-fx-font-weight: bold; -fx-effect: dropshadow(three-pass-box, white, 3, 3, 0, 0);");
                } else {
                    playerLabels.get(i).setStyle("");
                }
            }
        }
    }


    private void gotoWinnerScreen(String winnerText){
        try {
            // Load the FXML file for the "nomearJogadores" scene
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/telaCampeao.fxml"));
            Parent root = loader.load();
            WinnerScreenController winnerScreenController = loader.getController();
            System.out.println(winnerText);
            winnerScreenController.setLabel(winnerText);
            // Get the Stage from the ActionEvent
            Stage stage = (Stage) ((Node) btn_action).getScene().getWindow();

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

}
