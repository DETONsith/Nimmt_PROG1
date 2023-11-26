package model;

import java.util.ArrayList;

public class Grade {
    Carta[][] grid;
    ArrayList<Carta> cardstoadd;

    public Grade() {
        grid = new Carta[5][5];
    }
    
    public void setCarta(int x, int y, Carta carta) {
        grid[x][y] = carta;
    }

    public Carta[] getRow(int x){
        return grid[x];
    }

    public void addCard(Carta carta){
        this.cardstoadd.add(carta);
    }

    private void orderCards(){ //ordenando com bubble sort
        for (int i = 0; i < this.cardstoadd.size(); i++){
            for (int j = i+1; j < this.cardstoadd.size(); j++){
                if (this.cardstoadd.get(i).getValue() < this.cardstoadd.get(j).getValue()){
                    Carta carta = this.cardstoadd.get(i);
                    this.cardstoadd.set(i, this.cardstoadd.get(j));
                    this.cardstoadd.set(j, carta);
                }
            }
        }
    }
}
