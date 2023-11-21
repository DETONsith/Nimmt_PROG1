package model;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Baralho {
    List<String> baralho = criarBaralho(109);

    for (String carta : baralho){
        System.out.println(carta);
    }

    public static List<String> criarBaralho(int numCartas){
        List<String> baralho = new ArrayList<>();

        for (int i = 1; i <= numCartas; i++){
            baralho.add(String.valueOf(i));
        }
    }
}


