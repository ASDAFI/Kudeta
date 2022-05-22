package com.company.reaction;

import com.company.Player;

public interface Reaction {
    void execute();
    boolean isValidate();
    void punish(Player player);
    boolean isChallengable();
    void log();
}

