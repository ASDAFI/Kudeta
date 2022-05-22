package com.company.action;

import com.company.Player;

public class Kudeta implements  Action {
    Player player;
    Player target;

    public Kudeta(Player player, Player target) {
        this.player = player.Copy();
        this.target = target.Copy();
    }

    public boolean isChallengable() {
        return false;
    }

    public boolean isValidate(){
        return true;
    }


    public void execute() {
        target.ChooseDeathCard();
        player.removeCoins(7);
    }

    public void log() {
        System.out.println(player.getId() +  " Kudeta against " + target.getId());
    }

    public void punish(Player player) {

    }

    public boolean isPermitted(){
        if(player.getCoins() < 7)
            return false;
        return true;
    }

    public boolean hasReaction() {
        return false;
    }
}
