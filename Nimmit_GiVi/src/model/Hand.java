package model;

import java.util.ArrayList;

public class Hand {
    //Responsável pelo controle da mão do jogador e das cartas que serão adicionadas a ela
    //métodos todos publicos pois não há necessidade de encapsulamento para processamento interno
    ArrayList<Carta> cartas;
    int selectedCard;
    public Hand(){
        this.cartas = new ArrayList<Carta>();
        this.selectedCard = -1;
    }

    public int getSelectedCardIndex(){
        return this.selectedCard;
    }

    public void clearSelectedCards(){
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

    public ArrayList<Carta> getCards(){
        return this.cartas;
    }

    public void printCards(){
        //debug only
        for (Carta carta : this.cartas){
            System.out.println(carta.getNumber() + " " + carta.getValue());
        }
    }

}
