package model;

import java.util.ArrayList;

public class Hand {
    ArrayList<Carta> cartas;
    int selectedCard;
    public Hand(){
        this.cartas = new ArrayList<Carta>();
        this.selectedCard = -1;
    }
    public void addCard(Carta carta){
        this.cartas.add(carta);
    }
    public void removeCard(int index){
        this.cartas.remove(index);
    }
    public void selectCard(int index){
        this.selectedCard = index;
    }
    public Carta pickCard(){
        Carta carta = this.cartas.get(this.selectedCard);
        this.removeCard(this.selectedCard);
        return carta;
    }
    public Carta pickRandomCard(){
        int randomIndex = (int) (Math.random() * this.cartas.size());
        this.selectCard(randomIndex);
        return this.pickCard();
    }

}
