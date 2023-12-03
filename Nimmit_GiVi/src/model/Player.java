package model;

import java.util.ArrayList;
import java.util.List;

public class Player {
    String name;
    boolean isIA;
    List<Carta> cartasColetadas;

    public Player(String name, boolean isIA) {
        this.name = name;
        this.isIA = isIA;
        this.cartasColetadas = new ArrayList<Carta>();
    }


    public String getName() { return name; }


    public boolean isIA() { return isIA; }

    public void addCartaColetada(Carta carta){
        this.cartasColetadas.add(carta);
    }



}
