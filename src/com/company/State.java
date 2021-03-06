package com.company;
import com.company.action.Action;
import com.company.reaction.Reaction;
import com.company.player.Player;

public class State {

    Player[] players;
    Card[] cards;
    int round;

    public State(Player[] players, Card[] cards, int round) {
        this.players = players;
        this.cards = cards;
        this.round = round;
    }

    public void Setup() {
        this.cards = new Card[15];
        for (int i = 0; i < 15; i+=5) {
            this.cards[i] = new Card(i, true, "Ambassador");
            this.cards[i+1] = new Card(i+1, true, "Assassin");
            this.cards[i+2] = new Card(i+2, true, "Contessa");
            this.cards[i+3] = new Card(i+3, true, "Duke");
            this.cards[i+4] = new Card(i+4, true, "Captain");
        }




    }

    public Player ChallengeAction(Action action, int index) {
        Player player;
        for (int i = index + 1; i < players.length; i++) {
            player = players[i];
            if (player.isAlive() && player.isChallenged(action, this)) {
                return player;
            }
        }
        for (int i = 0; i < index; i++) {
            player = players[i];
            if (player.isAlive() && player.isChallenged(action, this)) {
                return player;
            }
        }
        return null;

    }

    public Player ChallengeReaction(Reaction reaction, int index) {
        Player player;
        for (int i = index + 1; i < players.length; i++) {
            player = players[i];
            if (player.isAlive() && player.isChallengedReaction(reaction, this)) {
                return player;
            }
        }
        for (int i = 0; i < index; i++) {
            player = players[i];
            if (player.isAlive() && player.isChallengedReaction(reaction, this)) {
                return player;
            }
        }
        return null;

    }

    public ActionPlayer getActionPlayer(int index) {
        if (players[index].isAlive()) {
            return new ActionPlayer(players[index].getAction(this), players[index]);
        }
        return null;
    }

    public ReactionPlayer getReaction(Action action, int index) {
        Reaction reaction;
        Player player;
        for (int i = index + 1; i < players.length; i++) {
            player = players[i];
            if (!player.isAlive()) {
                continue;
            }

            reaction = player.getReaction(action, this);
            if (reaction != null) {
                return new ReactionPlayer(reaction, player);
            }
        }
        for (int i = 0; i < index; i++) {
            player = players[i];
            if (!player.isAlive()) {
                continue;
            }

            reaction = player.getReaction(action, this);
            if (reaction != null) {
                return new ReactionPlayer(reaction, player);
            }
        }
        return null;
    }

    public boolean isFinished() {
        int n = 0;
        for (Player player : players) {
            if (player.isAlive()) {
                n ++;
            }
        }
        if(n > 1)
            return false;
        return true;
    }

    public void runRound() {
        Player player;
        Player challenger;
        ActionPlayer action;
        ReactionPlayer reaction;

        for (int i = 0; i < players.length; i++) {
            action = getActionPlayer(i);
            if (action == null) {
                continue;
            }

            reaction = getReaction(action.action, i);
            if (reaction != null) {
                challenger = ChallengeReaction(reaction.reaction, i);
                if (challenger == null) {
                    continue;
                } else {
                    if (reaction.reaction.isValidate()) {
                        reaction.reaction.punish(challenger);
                        continue;
                    } else {
                        reaction.reaction.punish(reaction.player);

                    }
                }
            }
            challenger = null;
            challenger = ChallengeAction(action.action, i);
            if (challenger != null) {
                if (action.action.isValidate()) {
                    action.action.punish(challenger);
                } else {
                    action.action.punish(action.player);
                    continue;
                }
            }
            action.action.execute();
        }
        round ++;
    }
}