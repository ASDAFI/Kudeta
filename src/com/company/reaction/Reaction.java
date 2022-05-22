package com.company.reaction;
import com.company.player.Player;

public interface Reaction {
    boolean isValidate();
    void punish(Player player);
    boolean isChallengable();
    void log();
}

