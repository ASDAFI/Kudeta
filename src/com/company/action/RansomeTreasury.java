package com.company.action;
import com.company.player.Player;

public class RansomeTreasury implements Action {
    Player player;
    Player target;

    public RansomeTreasury(Player player) {
        this.player = player;
    }

    public void execute() {
        player.addCoins(3);
    }

    public boolean isValidate() {
        if((player.getFirstCard().getName().equals("Duke") && player.getFirstCard().isAlive()) ||
                (player.getSecondCard().getName().equals("Duke") && player.getSecondCard().isAlive())) {
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

    public boolean hasTarget() {
        return false;
    }

    public Player getTarget() {
        return target;
    }

    public String getName(){
        return "Ransome Treasury";
    }
}


