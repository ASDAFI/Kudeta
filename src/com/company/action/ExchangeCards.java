package com.company.action;

import com.company.Player;

public class ExchangeCards implements Action {
    Player player;
    Player target;
    public ExchangeCards(Player player) {
        this.player = player;
    }

    public void execute() {
        player.exchangeCards();
    }

    public void log() {
        System.out.println(player.getId() + " Exchange cards.");
    }
     public boolean isValidate() {
        if((player.firstCard.getName().equals("Ambassador") && player.firstCard.isAlive()) ||
                (player.secondCard.getName().equals("Ambassador") && player.secondCard.isAlive())) {
            return true;
        }
        return false;
     }

     public void punish(Player player) {
        player.ChooseDeathCard();
     }

    public boolean isChallengable() {
        return true;
    }


    public boolean hasReaction() {
        return false;
    }

    public boolean isPermitted(){
        return true;
    }
    public boolean hasTarget() {
        return false;
    }
    public Player getTarget() {
        return target;
    }

    public String getName(){
        return "Exchange Cards";
    }
}
