package com.company.player;

import com.company.Card;
import com.company.State;
import com.company.action.Action;
import com.company.reaction.Reaction;

public class Bot1 {
    private int id;
    int coins;
    private boolean alive;
    public Card firstCard;
    public Card secondCard;

    public Bot1(int id, int coins, Card[] cards, boolean alive) {
        this.id = id;
        this.coins = coins;
        this.firstCard = cards[0];
        this.secondCard = cards[1];
        this.alive = alive;
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
    public boolean isChallenged(Action action, State state) {
        return false;
    }

    public void setCoins(int coins) {
        this.coins = coins;
    }

    public void exchangeCards() {
    }

    public Reaction getReaction(Action action, State state) {
    }

    public boolean isChallengedReaction(Reaction reaction, State state) {
    }
}
