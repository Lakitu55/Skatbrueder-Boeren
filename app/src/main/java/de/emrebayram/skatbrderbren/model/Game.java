package de.emrebayram.skatbrderbren.model;

import java.util.ArrayList;

/**
 * Simple model to represent a game. This class will include the players and the gamemode.
 */

public class Game {

    private ArrayList<Player> mPlayers;
    private int mScoreToWin;

    /**
     * Constructor for creating a game. Pass players and the scrore to win.
     * @param players an {@link ArrayList} containing the players
     * @param scoreToWin an int containing the score to win
     */
    public Game(ArrayList<Player> players, int scoreToWin) {
        this.mPlayers = players;
        this.mScoreToWin = scoreToWin;
    }
}
