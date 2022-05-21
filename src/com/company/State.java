package com.company;
import com.company.action.Action;

public class State {

    Player[] players;
    Card[] cards;
    int round;

    public State(Player[] players, Card[] cards, int round) {
        this.players = players;
        this.cards = cards;
        this.round = round;
    }

    public void runRound() {
        Player player;
        Action action;
        for (int i = 0; i < players.length; i++) {
            player = players[i];
            if(!player.isAlive()) {
                continue;
            }

            action = player.getAction(this);


            // check for reactions


            // check for challenge
            Player challenger;
            for (int j = 0; j < players.length; j++) {
                challenger = players[j];
                if(!challenger.isAlive()) {
                    continue;
                }
                if(challenger.isChallenged(action)) {
                    if(action.isValidate()){
                        action.punish(challenger);

                    } else {
                        action.punish(player);
                    }

                }
            }
        }

    }
}
