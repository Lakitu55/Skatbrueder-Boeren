package de.emrebayram.skatbrderbren.model;

/**
 * Simple model to represent a round played in a game. This model contains the score of the played
 * round.
 */
public class Round {

    private int mScore;

    public Round(int score) {
        mScore = score;
    }

    public int getScore() {
        return mScore;
    }

    public void setScore(int score) {
        this.mScore = score;
    }
}
