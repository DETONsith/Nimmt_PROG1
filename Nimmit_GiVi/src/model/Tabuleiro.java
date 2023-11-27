package model;

import java.util.ArrayList;
import java.util.List;

public class Tabuleiro {
    ArrayList<PlayerPlace> players;
    Baralho baralho;
    Grade grid;

    public Tabuleiro() {
        this.players = new ArrayList<>();
        this.baralho = new Baralho();
        this.grid = new Grade();
    }

    private void addPlayer(PlayerPlace player) {
        this.players.add(player);
    }

    public void addCardtoGrid(SignedCard carta) {
        this.grid.addCard(carta);
    }

    public <Iterator> void startRound(){
        if (this.players.getFirst().getHandSize() == 0){
            checkWinner();
        }
    }
    
    public void checkWinner(){
        List<PlayerPlace> winner = new ArrayList<>();
        for (PlayerPlace player : this.players){
                winner.add(player);
        }
        int smallest_score = 100;
        for (PlayerPlace player: winner){
            if (player.getScore() < smallest_score){
                smallest_score = player.getScore();
            }
        }

        for (PlayerPlace player: winner){
            if (player.getScore() > smallest_score){
                winner.remove(player);
            }
        }

        if (winner.size() == 1){
            System.out.println("O vencedor é o jogador " + winner.get(0).player.getName());
        }
        else{
            System.out.println("Empate entre os jogadores: ");
            for (PlayerPlace player: winner){
                System.out.println(player.player.getName());
            }
        }

    } 

    public void processPlay(){
        for (SignedCard carta : this.grid.cardstoadd){

        }
    }

}


