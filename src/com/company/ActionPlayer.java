package com.company;

import com.company.action.Action;

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
