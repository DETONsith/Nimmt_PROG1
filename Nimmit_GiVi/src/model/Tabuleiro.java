package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class Tabuleiro {
    ArrayList<PlayerPlace> players;
    Baralho baralho;
    Grade grid;

    Iterator<PlayerPlace> playerIterator;

    public Tabuleiro(ArrayList<PlayerPlace> players) {
        this.players = players;
        this.baralho = new Baralho();
        this.grid = new Grade();
        this.playerIterator = this.players.iterator();
    }

    public ArrayList<PlayerPlace> getPlayers() {
        return players;
    }

    public ArrayList<SignedCard> getCardsinBoard() {
        return grid.getCardstoadd();
    }

    public Carta[][] getGrid() {
        return grid.getGrid();
    }

    public void addCardtoGrid(SignedCard carta) {
        this.grid.addCard(carta);
    }

    public void startRound() {
        if (this.players.getFirst().getHandSize() == 0) {
            checkWinner();
        } else {
            this.grid.printgrid();
        }
    }

    public PlayerPlace getNextPlayer() {
        if (!this.playerIterator.hasNext()) {
            this.playerIterator = this.players.iterator();
        }
        return this.playerIterator.next();
    }

    public void gameStart() {
        for (PlayerPlace player : this.players) {
            player.giveCards(this.baralho.pickCards(3));
        }
        ArrayList<Carta> cartas = this.baralho.pickCards(5);
        this.grid.setupInitialCards(cartas.toArray(new Carta[cartas.size()]));
        startRound();
    }

    public String checkWinner() {
        String winnerText = "";
        List<PlayerPlace> winner = new ArrayList<>();
        for (PlayerPlace player : this.players) {
            winner.add(player);
        }
        int smallest_score = 100;
        for (PlayerPlace player : winner) {
            if (player.getScore() < smallest_score) {
                smallest_score = player.getScore();
            }
        }

        for (PlayerPlace player : this.players) {
            if (player.getScore() > smallest_score) {
                winner.remove(player);
            }
        }

        if (winner.size() == 1) {
            System.out.println("O vencedor é o jogador " + winner.get(0).player.getName());
            winnerText = "O vencedor é o jogador " + winner.get(0).player.getName();
        } else {
            winnerText = "Empate entre os jogadores: [";
            for (PlayerPlace player : winner) {
                System.out.println(player.player.getName());
                winnerText += player.player.getName() + ", ";
            }
            winnerText = winnerText.substring(0, winnerText.length() - 2);
            winnerText += "]";
        }

        for (PlayerPlace player : this.players) {
            winnerText += "\n" + "------------------\n" + player.player.getName() + "\n";
            if (player.getPlayer().cartasColetadas.size() == 0){
                winnerText += "Não coletou nenhuma carta";
            }
            else{
                winnerText += "coletou as cartas: [";
             
            for (Carta carta : player.getPlayer().cartasColetadas) {
                winnerText += carta.getNumber() + ", ";
            }
            //remove last ,
            winnerText = winnerText.substring(0, winnerText.length() - 2);
            winnerText += "]";
            }
            
            winnerText += "\n";
            winnerText += "e ficou com " + player.getScore() + " pontos";

        }

        return winnerText;

    }

    public void removeCardsFromBoard() {
        this.grid.clearRoundCards();
    }

    public void processPlay(SignedCard carta) {

        int score = grid.processCard(carta);

        ArrayList<PlayerPlace> current_players = getPlayers();
        for (PlayerPlace player : current_players) {
            if (player.getPlayer() == carta.getPlayer()) {
                player.increaseScore(score);

            }
        }

    }

}
