package model;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Baralho {
    List<String> baralho;

    public Baralho() {
        baralho = criarBaralho(109);
    }

    public List<String> getBaralho() {
        return baralho;
    }
    public static List<String> criarBaralho(int numCartas) {
        List<String> baralho = new ArrayList<>();

        for (int i = 1; i <= numCartas; i++) {
            baralho.add(String.valueOf(i));
        }

        return baralho;
    }

    public void embaralhar(){
        Collections.shuffle(baralho);
    }
}


