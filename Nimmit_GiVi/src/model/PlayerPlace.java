package model;

import java.util.ArrayList;

public class PlayerPlace {
    Player player;
    Hand hand;
    boolean isTurn;
    int score;

    public PlayerPlace(Player player) {
        this.player = player;
        this.hand = new Hand();
        this.isTurn = false;
        this.score = 0;
    }

    public void giveCard(Carta carta){
        this.hand.addCard(carta);
    }

    public void giverCards(ArrayList<Carta> cartas){
        for (Carta carta : cartas){
            this.giveCard(carta);
        }
    }

    public void playCard(){
        if(this.player.isIA()){
            hand.pickRandomCard();
        }
        else{
            hand.pickCard();
        }
        
    }

    public int getHandSize(){
        return this.hand.cartas.size();
    }

    public int getScore(){
        return this.score;
    }

    public void decreaseScore(int value){
        this.score -= value;
    }
    
    public Hand getHand(){
        return this.hand;
    }
}
