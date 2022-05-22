package com.company.reaction;

import com.company.Player;

public class Shield implements Reaction {
    Player player;
    Player target;

    public Shield(Player player, Player target) {
        this.player = player;
        this.target = target;
    }

    public boolean isValidate() {
        if((player.firstCard.getName().equals("Contessa") && player.firstCard.isAlive()) ||
                (player.secondCard.getName().equals("Contessa") && player.secondCard.isAlive())) {
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
        System.out.println(player.getId() + " is using Shield against " + target.getId());
    }
}
