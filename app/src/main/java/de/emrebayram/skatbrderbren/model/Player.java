package de.emrebayram.skatbrderbren.model;

/**
 * Simple model class representing a player. Provides fields for the name and the score of a player.
 */

public class Player {

    private String mName;
    private int mScore;

    public Player(String name) {
        this.mName = name;
        this.mScore = 0;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        this.mName = name;
    }

    public int getScore() {
        return mScore;
    }

    public void setScore(int score) {
        this.mScore = score;
    }
}
