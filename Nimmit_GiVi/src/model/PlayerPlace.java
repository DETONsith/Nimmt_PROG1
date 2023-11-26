package model;

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

    public void playCard(){
        if(this.player.isIA()){
            hand.pickRandomCard();
        }
        else{
            hand.pickCard();
        }
        
    }
}
