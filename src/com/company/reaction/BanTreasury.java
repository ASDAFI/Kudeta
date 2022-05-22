package com.company.reaction;

import com.company.Player;

public class BanTreasury implements Reaction{
    Player player;
    Player target;
    public BanTreasury(Player player, Player target){
        this.player = player;
        this.target = target;
    }



    public boolean isValidate() {
        if((player.firstCard.getName().equals("Duke") && player.firstCard.isAlive()) ||
                (player.secondCard.getName().equals("Duke") && player.secondCard.isAlive())) {
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

    public void log() {
        System.out.println(player.getId() + " Ban Treasury " + target.getId());
    }

}
