package controller;
import java.util.ArrayList;
import java.util.List;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import model.Carta;
import model.Player;
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

    private List<TextField> playerNames = new ArrayList<>();
    private List<TextField> playerPoints = new ArrayList<>();
    private List<Text> playerLabels = new ArrayList<>();
    private PlayerPlace activePlayer;
    public void initialize(){
        this.crtGrid = new ImageView[][]{
            {crt_00, crt_01, crt_02, crt_03, crt_04},
            {crt_10, crt_11, crt_12, crt_13, crt_14},
            {crt_20, crt_21, crt_22, crt_23, crt_24},
            {crt_30, crt_31, crt_32, crt_33, crt_34},
            {crt_40, crt_41, crt_42, crt_43, crt_44}
        };
        this.lblGrid = new Text[][]{
            {lbl_00, lbl_01, lbl_02, lbl_03, lbl_04},
            {lbl_10, lbl_11, lbl_12, lbl_13, lbl_14},
            {lbl_20, lbl_21, lbl_22, lbl_23, lbl_24},
            {lbl_30, lbl_31, lbl_32, lbl_33, lbl_34},
            {lbl_40, lbl_41, lbl_42, lbl_43, lbl_44}
        };
        
        crtTopo = new ImageView[]{
            crttopo_00, crttopo_01, crttopo_02, crttopo_03, crttopo_04, crttopo_05,
            crttopo_10, crttopo_11, crttopo_12, crttopo_13, crttopo_14, crttopo_15
        };

        lblTopo = new Text[]{
            lbltopo_00, lbltopo_01, lbltopo_02, lbltopo_03, lbltopo_04, lbltopo_05,
            lbltopo_10, lbltopo_11, lbltopo_12, lbltopo_13, lbltopo_14, lbltopo_15
        };



        playerNames.add(playername1);
        playerNames.add(playername2);
        playerNames.add(playername3);
        playerNames.add(playername4);
        playerNames.add(playername5);
        playerNames.add(playername6);

        playerPoints.add(playerpoints1);
        playerPoints.add(playerpoints2);
        playerPoints.add(playerpoints3);
        playerPoints.add(playerpoints4);
        playerPoints.add(playerpoints5);
        playerPoints.add(playerpoints6);

        playerLabels.add(lblplayer1);
        playerLabels.add(lblplayer2);
        playerLabels.add(lblplayer3);
        playerLabels.add(lblplayer4);
        playerLabels.add(lblplayer5);
        playerLabels.add(lblplayer6);
        
        
    }
    

    public void setTabuleiro(Tabuleiro tabuleiro) {
        this.tabuleiro = tabuleiro;
        System.out.println("Tabuleiro setado");
        System.out.println(this.tabuleiro);
        this.tabuleiro.gameStart();
        activePlayer = this.tabuleiro.getPlayers().get(0);
        renderGrid();
        uptadePlayerFields();       
        System.out.println("Jogador ativo: ");
    }

    private void processRoundCards(){
        ArrayList<SignedCard> cards = this.tabuleiro.getCardsinBoard();
        for(SignedCard card : cards){
            this.tabuleiro.processPlay(card);
            this.renderGrid();
            this.uptadePlayerFields();
            this.sleep(3000);
        }
    }

    private void renderGrid(){
        Carta[][] grid = this.tabuleiro.getGrid();
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++){ 
                if (grid[i][j] == null){
                    crtGrid[i][j].setImage(null);
                    lblGrid[i][j].setText("");
                    continue;
                }
                crtGrid[i][j].setImage(grid[i][j].getImage());
                lblGrid[i][j].setText(Integer.toString(grid[i][j].getNumber()));
            }
        }
        for(int i = 0; i < 12; i++){
            if(i < this.activePlayer.getHandSize()){
                Carta card = this.activePlayer.getHand().getCards().get(i);
                crtTopo[i].setImage(card.getImage());
                lblTopo[i].setText(Integer.toString(card.getNumber()));
            }else{
                crtTopo[i].setVisible(false);
                lblTopo[i].setVisible(false);
            }
        }
    }

    private void uptadePlayerFields(){
        List<PlayerPlace> players = tabuleiro.getPlayers();

        int size = players.size();

        for(int i = 0; i<6; i++){
            if(i < size){
                PlayerPlace player = players.get(i);
                playerNames.get(i).setText(player.getPlayer().getName());
                playerPoints.get(i).setText(Integer.toString(player.getScore()));            
            }else{
                playerNames.get(i).setVisible(false);
                playerPoints.get(i).setVisible(false);
                playerLabels.get(i).setVisible(false);
            }
        }
    }

    private void sleep(int miliseconds){
         try {
            Thread.sleep(miliseconds); // Sleep for 3 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
    }
}

}

