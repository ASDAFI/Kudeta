package com.company;

public class Card {
    private boolean alive;
    private boolean inGame;
    private int id;
    private String name;

    public Card(int id, boolean inGame, String name) {
        this.alive = inGame;
        this.inGame = inGame;
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public boolean isAlive() {
        return alive;
    }

    public boolean isInGame() {
        return inGame;
    }

    public void setAlive() {
        this.alive = true;
    }

    public void setInGame() {
        this.inGame = true;
    }

    public void setDead() {
        this.alive = false;
    }

    public void setOutOfGame() {
        this.inGame = false;
    }

}
