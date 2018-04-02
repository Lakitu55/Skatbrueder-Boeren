package de.emrebayram.skatbrderbren.model;

import java.util.ArrayList;

/**
 * Simple model to represent a game. This class will include the players and the gamemode.
 */

public class Game {

    private ArrayList<Player> mPlayers;
    private int mScoreToWin;
    private ArrayList<Round> mRounds;

    /**
     * Simple getter method for returning the score to win of this game
     * @return the score to win as int
     */
    public int getScoreToWin() {
        return mScoreToWin;
    }

    /**
     * Setter method for setting the score to win of this game
     * @param scoreToWin the score to win of this game
     */
    public void setScoreToWin(int scoreToWin) {
        this.mScoreToWin = scoreToWin;
    }

    /**
     * Constructor for creating a game. Requires the scrore to win.
     * @param scoreToWin an int containing the score to win
     */
    public Game(int scoreToWin) {
        this.mPlayers = new ArrayList<>();
        this.mScoreToWin = scoreToWin;
        mRounds = new ArrayList<>();
    }

    /**
     * Getter for the played rounds in a game. The rounds are ordered.
     * @return an arraylist of rounds
     */
    public ArrayList<Round> getRounds() {
        return mRounds;
    }

    /**
     * Method to add a round to the game.
     * @param roundToAdd the played round containing the score.
     */
    public void addRound(Round roundToAdd) {
        mRounds.add(roundToAdd);
    }

    /**
     * Method to add a new player. The player will be added to an array list.
     * @param newPlayer a new {@link Player} to add the game
     */
    public void addPlayer(Player newPlayer) {
        mPlayers.add(newPlayer);
    }

    /**
     * Method to remove a player from the game. The player will be removed from the array list,
     * therefore the player must exist in the array. Will return true if the player could be removed
     * , false otherwise
     * @param player a new {@link Player} to add the game
     * @return true, if the passed player was found in in the array list and could be removed,
     * otherwise false
     */
    public boolean removePlayer(Player player) {
        return mPlayers.remove(player);
    }

    /**
     * Getter method for the count of players.
     * @return return the count of the players from the players array
     */
    public int getPlayerCount() {
        return mPlayers.size();
    }
}
