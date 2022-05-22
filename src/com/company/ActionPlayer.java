package com.company;

import com.company.action.Action;
import com.company.player.Player;

public class ActionPlayer {
    Action action;
    Player player;

    public ActionPlayer(Action action, Player player) {
        this.action = action;
        this.player = player;
    }



    public Action getAction() {
        return action;
    }

    public Player getPlayer() {
        return player;
    }
}
