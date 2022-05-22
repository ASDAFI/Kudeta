package com.company.action;

import com.company.Player;

public class RansomeTreasury implements Action {
    Player player;

    public RansomeTreasury(Player player) {
        this.player = player;
    }

    public void execute() {
        player.addCoins(3);
    }

    public boolean isValidate() {
        if((player.firstCard.getName().equals("Duke") && player.firstCard.isAlive()) ||
                (player.secondCard.getName().equals("Duke") && player.secondCard.isAlive())) {
            return true;
        }
        return false;
    }

    public void log() {
        System.out.println(player.getId()+" Ransome Treasury");
    }

    public void punish(Player player) {
        player.ChooseDeathCard();
    }

    public boolean isChallengable() {
        return true;
    }

    public boolean hasReaction(){
        return false;
    }
    public boolean isPermitted() {
        if(player.getCoins() < 10) {
            return true;
        }
        return false;
    }
}


