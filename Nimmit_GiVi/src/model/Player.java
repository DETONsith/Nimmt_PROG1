package model;

public class Player {
    int id;
    String name;
    String username;

    public Player(int id, String name, String username) {
        this.id = id;
        this.name = name;
        this.username = username;
    }

    public int getId() { return id; }

    public String getName() { return name; }

    public String getUsername() { return username; }



}
