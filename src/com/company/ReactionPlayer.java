package com.company;

import com.company.reaction.Reaction;

public class ReactionPlayer {
    Reaction reaction;
    Player player;
    public ReactionPlayer(Reaction reaction, Player player){
        this.reaction = reaction;
        this.player = player;
    }
    public Reaction getReaction(){
        return reaction;
    }
    public Player getPlayer(){
        return player;
    }
}
