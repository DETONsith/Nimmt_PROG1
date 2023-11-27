package model;

import java.util.ArrayList;

public class Grade {
    Carta[][] grid;
    ArrayList<SignedCard> cardstoadd;

    public Grade() {
        grid = new Carta[5][5];
    }
    
    public void setCarta(int x, int y, Carta carta) {
        grid[x][y] = carta;
    }

    public Carta[] getRow(int x){
        return grid[x];
    }

    public void addCard(SignedCard carta){
        this.cardstoadd.add(carta);
        orderCards();
    }

    private void orderCards(){ //ordenando com bubble sort
        for (int i = 0; i < this.cardstoadd.size(); i++){
            for (int j = i+1; j < this.cardstoadd.size(); j++){
                if (this.cardstoadd.get(i).getCarta().getValue() < this.cardstoadd.get(j).getCarta().getValue()){
                    SignedCard carta = this.cardstoadd.get(i);
                    this.cardstoadd.set(i, this.cardstoadd.get(j));
                    this.cardstoadd.set(j, carta);
                }
            }
        }
    }
}
