package com.company.reaction;

import com.company.Player;

public class BanRansome implements Reaction {
    Player player;
    Player target;

    public BanRansome(Player player, Player target) {
        this.player = player;
        this.target = target;
    }


    public boolean isValidate() {
        if(((player.firstCard.getName().equals("Ambassador") || player.firstCard.getName().equals("Captain"))
                && player.firstCard.isAlive()) ||
                ((player.secondCard.getName().equals("Ambassador") || player.secondCard.getName().equals("Captain"))
                        && player.secondCard.isAlive())) {
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
        System.out.println(player.getId() + " BanRansome " + target.getId());
    }
}
