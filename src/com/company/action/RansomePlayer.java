package com.company.action;

import com.company.player.Player;

public class RansomePlayer implements Action {
    Player player;
    Player target;

    public RansomePlayer(Player player, Player target) {
        this.player = player;//.Copy();
        this.target = target;//.Copy();
    }

    public void execute() {
        if(target.getCoins() <= 2){
            player.addCoins(target.getCoins());
            target.setCoins(0);
        } else {
            player.addCoins(2);
            target.removeCoins(2);
        }

    }


    public boolean isValidate() {
        if ((player.getFirstCard().getName().equals("Captain") && player.getFirstCard().isAlive()) ||
                (player.getSecondCard().getName().equals("Captain") && player.getSecondCard().isAlive())) {
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

    public void log(){
        System.out.println(player.getId() + " ransome " + target.getId());
    }

    public boolean isPermitted(){
        return true;
    }

    public boolean hasReaction(){
        return true;
    }

    public boolean hasTarget() {
        return true;
    }

    public Player getTarget() {
        return target;
    }

    public String getName(){
        return "Ransome";
    }
}
