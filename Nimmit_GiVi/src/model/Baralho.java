package model;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Baralho {
    List<Integer> baralho;

    public Baralho() {
        baralho = criarBaralho(109);
        embaralhar();
    }

    public List<Integer> getBaralho() {
        return baralho;
    }


    public static List<Integer> criarBaralho(int numCartas) {
        List<Integer> baralho = new ArrayList<>();

        for (int i = 1; i <= numCartas; i++) {
            baralho.add(i);
        }

        return baralho;
    }

    public void embaralhar(){
        Collections.shuffle(baralho);
    }

    public ArrayList<Carta> pickCards(int numCards){
        ArrayList<Carta> cartas = new ArrayList<>();
        if (numCards > baralho.size()){
            numCards = baralho.size();
        }
        for (int i = 0; i < numCards; i++){
            cartas.add(new Carta(baralho.get(0)));
            baralho.remove(0);
        }
        return cartas;

    }
}


