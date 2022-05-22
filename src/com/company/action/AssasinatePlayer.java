package com.company.action;

import com.company.player.Player;

public class AssasinatePlayer implements Action {
    Player player;
    Player target;

    public AssasinatePlayer(Player player, Player target) {
        this.player = player;//.Copy();
        this.target = target;//.Copy();
    }

    public void execute() {
        target.ChooseDeathCard();
    }

    public boolean isValidate(){
        if((player.getFirstCard().getName().equals("Assasin") && player.getFirstCard().isAlive()) ||
                (player.getSecondCard().getName().equals("Assasin") && player.getSecondCard().isAlive())){
            return true;
        }
        return false;
    }


    public void punish(Player player) {
        player.ChooseDeathCard();
    }

    public boolean isChallengable(){
        return true;
    }

    public void log() {
        System.out.println(player.getId() + " Assasinate " + target.getId());
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
        return "Assasinate";
    }
}
