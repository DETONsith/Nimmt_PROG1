package model;

public class SignedCard {
    Carta carta;
    Player player;

    public SignedCard(Carta carta, Player player) {
        this.carta = carta;
        this.player = player;
    }

    public Carta getCarta() { return carta; }
    public Player getPlayer() { return player; }
}
