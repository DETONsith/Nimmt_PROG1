package model;

public class Player {
    int id;
    String name;
    String username;
    boolean isIA;

    public Player(int id, String name, String username, boolean isIA) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.isIA = isIA;
    }

    public int getId() { return id; }

    public String getName() { return name; }

    public String getUsername() { return username; }

    public boolean isIA() { return isIA; }



}
