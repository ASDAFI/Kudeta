package com.company.reaction;

import com.company.player.Player;

public class BanRansome implements Reaction {
    Player player;
    Player target;

    public BanRansome(Player player, Player target) {
        this.player = player;
        this.target = target;
    }


    public boolean isValidate() {
        if(((player.getFirstCard().getName().equals("Ambassador") || player.getFirstCard().getName().equals("Captain"))
                && player.getFirstCard().isAlive()) ||
                ((player.getSecondCard().getName().equals("Ambassador") || player.getSecondCard().getName().equals("Captain"))
                        && player.getSecondCard().isAlive())) {
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
