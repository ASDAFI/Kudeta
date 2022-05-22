package com.company.action;

import com.company.Player;

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
        if((player.firstCard.getName().equals("Assasin") && player.firstCard.isAlive()) || (player.secondCard.getName().equals("Assasin") && player.secondCard.isAlive())){
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


}
