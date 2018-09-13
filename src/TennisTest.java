import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class TennisTest {

    @Test
    void testGame1() {

        TennisGame game = new TennisGame();

        assertEquals("0 - 0", game.getScore());
        assertFalse(game.isEnded());

        assertTrue(game.handleCommand("p1"));
        assertEquals("15 - 0", game.getScore());

        assertTrue(game.handleCommand("p1"));
        assertEquals("30 - 0", game.getScore());

        assertTrue(game.handleCommand("p1"));
        assertEquals("40 - 0", game.getScore());

        assertTrue(game.handleCommand("p1"));
        assertEquals("game player 1", game.getScore());
        assertTrue(game.isEnded());
    }

    @Test
    void testGame2() {

        TennisGame game = new TennisGame();

        assertEquals("0 - 0", game.getScore());
        assertFalse(game.isEnded());

        assertTrue(game.handleCommand("p2"));
        assertEquals("0 - 15", game.getScore());

        assertTrue(game.handleCommand("p2"));
        assertEquals("0 - 30", game.getScore());

        assertTrue(game.handleCommand("p2"));
        assertEquals("0 - 40", game.getScore());

        assertTrue(game.handleCommand("p2"));
        assertEquals("game player 2", game.getScore());
        assertTrue(game.isEnded());
    }


    @Test
    void testGame3() {

        TennisGame game = new TennisGame();

        assertEquals("0 - 0", game.getScore());
        assertFalse(game.isEnded());

        assertTrue(game.handleCommand("p1"));
        assertEquals("15 - 0", game.getScore());

        assertTrue(game.handleCommand("p2"));
        assertEquals("15 - 15", game.getScore());

        assertTrue(game.handleCommand("p2"));
        assertEquals("15 - 30", game.getScore());

        assertTrue(game.handleCommand("p2"));
        assertEquals("15 - 40", game.getScore());

        assertTrue(game.handleCommand("p1"));
        assertEquals("30 - 40", game.getScore());

        assertTrue(game.handleCommand("p1"));
        assertEquals("deuce", game.getScore());

        assertTrue(game.handleCommand("p1"));
        assertEquals("advantage player 1", game.getScore());

        assertTrue(game.handleCommand("p1"));
        assertEquals("game player 1", game.getScore());
        assertTrue(game.isEnded());
    }

    @Test
    void testGame4() {

        TennisGame game = new TennisGame();

        assertEquals("0 - 0", game.getScore());
        assertFalse(game.isEnded());

        assertTrue(game.handleCommand("p1"));
        assertEquals("15 - 0", game.getScore());

        assertTrue(game.handleCommand("p2"));
        assertEquals("15 - 15", game.getScore());

        assertTrue(game.handleCommand("p2"));
        assertEquals("15 - 30", game.getScore());

        assertTrue(game.handleCommand("p2"));
        assertEquals("15 - 40", game.getScore());

        assertTrue(game.handleCommand("p1"));
        assertEquals("30 - 40", game.getScore());

        assertTrue(game.handleCommand("p1"));
        assertEquals("deuce", game.getScore());

        assertTrue(game.handleCommand("p1"));
        assertEquals("advantage player 1", game.getScore());

        assertTrue(game.handleCommand("p2"));
        assertEquals("deuce", game.getScore());
        assertFalse(game.isEnded());

        assertTrue(game.handleCommand("p2"));
        assertEquals("avantage player 2", game.getScore());

        assertTrue(game.handleCommand("p2"));
        assertEquals("game player 2", game.getScore());
        assertTrue(game.isEnded());

    }
}
