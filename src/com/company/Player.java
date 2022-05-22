package com.company;
import com.company.action.Action;

public class Player {
    private int id;
    int coins;
    private boolean alive;
    public Card firstCard;
    public Card secondCard;

    public Player(int id, int coins, Card[] cards, boolean alive) {
        this.id = id;
        this.coins = coins;
        this.firstCard = cards[0];
        this.secondCard = cards[1];
        this.alive = alive;
    }

    public Player Copy() {
        return new Player(this.id, this.coins, new Card[]{this.firstCard, this.secondCard}, this.alive);
    }

    public int getId() {
        return id;
    }

    public int getCoins() {
        return coins;
    }

    public boolean isAlive() {
        return alive;
    }

    public void addCoins(int coins) {
        this.coins += coins;
    }
    public void removeCoins(int coins) {
        this.coins -= coins;
    }

    public Action getAction(State state) {
        return null;
    }

    public void ChooseDeathCard() {

    }
    public boolean isChallenged(Action action) {
        return false;
    }

    public void setCoins(int coins) {
        this.coins = coins;
    }

    public void exchangeCards() {
    }
}