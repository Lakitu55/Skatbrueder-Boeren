package de.emrebayram.skatbrderbren;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;

import de.emrebayram.skatbrderbren.model.Game;
import de.emrebayram.skatbrderbren.model.Player;


import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Unit tests for testing the model class {@link Game}
 */
public class CreateGameTest {

    @Test
    public void createGame_AddPlayer_IncreasesCountOfPlayers() {
        Game game = new Game(301);
        int initalCount = game.getPlayerCount();
        game.addPlayer(new Player("test"));
        assertThat(initalCount < game.getPlayerCount(), is(true));
    }
}
