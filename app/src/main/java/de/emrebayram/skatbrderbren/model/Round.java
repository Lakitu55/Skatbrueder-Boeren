package de.emrebayram.skatbrderbren.model;

/**
 * Simple model to represent a round played in a game. This model contains the score of the played
 * round.
 */
public class Round {

    public static final int SCORE_DIAMOND = 9;
    public static final int SCORE_HEART = 10;
    public static final int SCORE_SPADE = 11;
    public static final int SCORE_CLUB = 12;
    public static final int SCORE_GRAND = 12;

    private int mScore;

    /**
     * Constructor for a round. This constructor needs the score of the played round and the
     * multiplier of the score.
     * @param score the score of the played round as int
     * @param multiplier the multiplier of the played round
     */
    public Round(int score, int multiplier) {
        mScore = score * multiplier;
    }

    public int getScore() {
        return mScore;
    }
}
