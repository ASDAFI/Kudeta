package com.company.reaction;
import com.company.player.Player;


public class Shield implements Reaction {
    Player player;
    Player target;

    public Shield(Player player, Player target) {
        this.player = player;
        this.target = target;
    }

    public boolean isValidate() {
        if((player.getFirstCard().getName().equals("Contessa") && player.getFirstCard().isAlive()) ||
                (player.getSecondCard().getName().equals("Contessa") && player.getSecondCard().isAlive())) {
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
