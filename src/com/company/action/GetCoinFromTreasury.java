package com.company.action;
import com.company.Player;

public class GetCoinFromTreasury implements Action {
    int coins;
    Player player;

    public GetCoinFromTreasury(Player player, int coins) {
        this.coins = coins;
        this.player = player; //.Copy();
    }

    public void log() {
        System.out.println("Player " + player.getId() + " got " + coins + " coins from treasury");
    }

    public void execute() {
        player.addCoins(coins);
    }

    public boolean isValidate(){
        return true;
    }

    public void punish(Player player) {

    }
    public boolean isChallengable(){
        if(coins == 1){
            return false;
        }
        return true;
    }
    public boolean isPermitted(){
        if(player.getCoins() >= 10){
            return false;
        }
        return true;
    }

    public boolean hasReaction() {
        if(coins == 1) {
            return false;
        }
        return true;
    }
}



