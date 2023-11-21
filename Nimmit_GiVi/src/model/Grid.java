package model;

public class Grid {
    Carta[][] grid;

    public Grid() {
        grid = new Carta[5][5];
    }
    
    public void setCarta(int x, int y, Carta carta) {
        grid[x][y] = carta;
    }

    public Carta[] getRow(int x){
        return grid[x];
    }
}
