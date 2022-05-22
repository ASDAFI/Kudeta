package com.company.action;

import com.company.player.Player;

public interface Action {
    void execute();
    boolean isValidate();
    void punish(Player player);
    boolean isChallengable();
    void log();
    boolean isPermitted();
    boolean hasReaction();
    Player getTarget();
    boolean hasTarget();
    String getName();
}
