package com.company.player;

import com.company.Card;
import com.company.State;
import com.company.action.Action;
import com.company.reaction.Reaction;

public interface Player {
    int getId() ;
    int getCoins() ;
    boolean isAlive();
    void setCoins(int coins);
    void addCoins(int coins);
    void setAlive();
    void setDead();
    void removeCoins(int coins);
    boolean isChallenged(Action action, State state);
    Reaction getReaction(Action action, State state);
    boolean isChallengedReaction(Reaction reaction, State state);
    Card getFirstCard();
    Card getSecondCard();
    void ChooseDeathCard();
    void exchangeCards();
    Action getAction(State state);
    Reaction getReaction(State state, Action action);
}

