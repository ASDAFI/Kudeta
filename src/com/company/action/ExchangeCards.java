package com.company.action;

import com.company.player.Player;

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
        if((player.getFirstCard().getName().equals("Ambassador") && player.getFirstCard().isAlive()) ||
                (player.getSecondCard().getName().equals("Ambassador") && player.getSecondCard().isAlive())) {
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
