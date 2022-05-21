package com.company.action;
import com.company.Player;

public class RansomePlayer implements Action {
    Player player;
    Player target;

    public RansomePlayer(Player player, Player target) {
        this.player = player;
        this.target = target;
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
        if ((player.firstCard.getName().equals("captain") && player.firstCard.isAlive()) ||
                (player.secondCard.getName().equals("captain") && player.secondCard.isAlive())) {
            return true;
        }
        return false;
    }

    public void punish(Player player) {

    }

    public boolean isChallengable() {
        return true;
    }

    public void log(){
        System.out.println(player.getId() + " ransome " + target.getId());
    }

}
