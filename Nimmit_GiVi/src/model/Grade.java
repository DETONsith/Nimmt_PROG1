package model;

import java.util.ArrayList;

public class Grade {
    Carta[][] grid;
    ArrayList<SignedCard> cardstoadd;

    public Grade() {
        grid = new Carta[5][5];
    }
    
    public ArrayList<SignedCard> getCardstoadd() {
        return cardstoadd;
    }

    public void setCarta(int x, int y, Carta carta) {
        grid[x][y] = carta;
    }

    public Carta[] getRow(int x){
        return grid[x];
    }

    public Carta[][] getGrid() { return grid; }

    public void clearRow(int x){
        for (int i = 0; i < 5; i++){
            grid[x][i] = null;
        }
    }

    public void setupInitialCards(Carta cartas[]){
        if(cartas.length != 5){
            return;
        }
        for (int i = 0; i < 5; i++){
            this.setCarta(i, 0, cartas[i]);
        }
    }

    public void addCard(SignedCard carta){
        this.cardstoadd.add(carta);
        orderCards();
    }

    public void printgrid(){
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++){ 
                if (this.grid[i][j] == null){
                    System.out.print("0 ");
                    continue;
                }
                System.out.print(this.grid[i][j].getNumber() + " ");
            }
            System.out.println();
        }
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



    public Integer processCard(SignedCard carta){
        Integer playerscore = 0;
        Integer[][] rightestcard = getRightestCards();
            Integer closestcard[] =  getClosestCard(rightestcard, carta); //0 = value, 1 = column, 2 = row
            if(closestcard[0] == 110){ //essa carta é a menor que todas, então vai coletar a linha com a maior carta
                int highestrow = getHighestRow();
                Carta collectedRow[] = getRow(highestrow);
                Integer sumvalue = 0;
                for (int i = 1; i < 5; i++){
                    //CALCULAR A SOMA DO VALOR DAS CARTAS E SALVAR EM UM LUGAR PARA VINCULAR ESSE VALOR COM O JOGADOR
                    sumvalue += collectedRow[i].getValue();
                }
                clearRow(highestrow);
                setCarta(highestrow, 0, carta.getCarta());
                //VINCULAR O VALOR DAS CARTAS COM O JOGADOR
                playerscore = sumvalue;
            }
            else if(closestcard[1] == 3){
                Carta collectedRow[] = getRow(closestcard[2]);
                Integer sumvalue = 0;
                for (int i = 1; i < 5; i++){
                    //CALCULAR A SOMA DO VALOR DAS CARTAS E SALVAR EM UM LUGAR PARA VINCULAR ESSE VALOR COM O JOGADOR
                    sumvalue += collectedRow[i].getValue();
                }
                clearRow(closestcard[2]);
                setCarta(closestcard[2], 0, carta.getCarta());
                //VINCULAR O VALOR DAS CARTAS COM O JOGADOR
                playerscore = sumvalue;
            }
            else{
                setCarta(closestcard[2], closestcard[1]+1, carta.getCarta());
            }
            return playerscore;
    }

    
    

    private Integer[][] getRightestCards(){
        Integer[][] rightestcard = new Integer [5][2];
        for (int i = 0; i < 5; i++){ //pega todas as cartas mais a direita de cada linha
                for (int j = 0; j < 5; j++){
                    if(this.grid[i][j] == null){
                        break;
                    }
                    else{
                        rightestcard[5][0] = this.grid[i][j].getNumber(); //0 = card number
                        rightestcard[5][1] = j; // 1 = column
                    }
                }
            }
        return rightestcard;
    }

    private Integer[] getClosestCard(Integer[][] rightestCard, SignedCard carta){
        Integer closestcard[] = new Integer[2]; //0 = value, 1 = column, 2 = row
        closestcard[0] = 110;
        for (int i = 0; i < 5; i++){ //de cada carta mais a direita pega a mais proxima da carta e que é menor que ela (carta-carta_na_grid = menor valor)
            if(rightestCard[i][0] > carta.getCarta().getNumber()){
                continue;
            }else{
                if(closestcard[0] == 110){
                    closestcard[0] = rightestCard[i][0];
                    closestcard[1] = rightestCard[i][1];
                    closestcard[2] = i;
                }
                else{
                    if(carta.getCarta().getNumber()-rightestCard[i][0] < carta.getCarta().getNumber() - closestcard[0]){
                        closestcard[0] = rightestCard[i][0];
                        closestcard[1] = rightestCard[i][1];
                        closestcard[2] = i;
                    }
                }
            }
        }
        return closestcard;
    }

    private int getHighestRow(){ //retorna o número linha com a carta mais alta
        Integer[][] rightestcards = getRightestCards();
        Integer[] highestrow = new Integer[2];
        highestrow[0] = rightestcards[0][0];
        highestrow[1] = 0;

        for (int i = 1; i < 5; i++){
            if(rightestcards[i][0] > highestrow[0]){
                highestrow[0] = rightestcards[i][0];
                highestrow[1] = i;
            }
        }
        return highestrow[1];
    }
}


