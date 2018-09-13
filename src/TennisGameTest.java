
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;



@RunWith(Parameterized.class)
public class TennisGameTest {

	private TennisGame.pointScore p1_score;
	private TennisGame.pointScore p2_score;
	
	private String expectedResult;

	@Before
	public void setUp() throws Exception {
	}	
	
    public TennisGameTest(TennisGame.pointScore p1_score, TennisGame.pointScore p2_score, String expectedResult) {
    	this.p1_score = p1_score;
        this.p2_score = p2_score;
        this.expectedResult = expectedResult;
    }

    
    @Parameters
    public static Collection<Object[]> getAllScores() {
        return Arrays.asList(new Object[][] {
        		
    		// Ties
            { TennisGame.pointScore.LOVE, TennisGame.pointScore.LOVE, "Love-All" },
            { TennisGame.pointScore.FIFTEEN, TennisGame.pointScore.FIFTEEN, "Fifteen-All" },
            { TennisGame.pointScore.THIRTY, TennisGame.pointScore.THIRTY, "Thirty-All"},
            { TennisGame.pointScore.FORTY, TennisGame.pointScore.FORTY, "Deuce"},                                

            // Advantage for player 1
            { TennisGame.pointScore.FIFTEEN, TennisGame.pointScore.LOVE, "15-00"},
            { TennisGame.pointScore.THIRTY, TennisGame.pointScore.LOVE, "30-00"},
            { TennisGame.pointScore.THIRTY, TennisGame.pointScore.FIFTEEN, "30-15"},
            { TennisGame.pointScore.FORTY, TennisGame.pointScore.LOVE, "Advantage for player1 | 40-00"},
            { TennisGame.pointScore.FORTY, TennisGame.pointScore.FIFTEEN, "Advantage for player1 | 40-15"},
            { TennisGame.pointScore.FORTY, TennisGame.pointScore.THIRTY, "Advantage for player1 | 40-30"},

            // Advantage for player 2
            { TennisGame.pointScore.LOVE, TennisGame.pointScore.FIFTEEN, "00-15"},
            { TennisGame.pointScore.LOVE, TennisGame.pointScore.THIRTY, "00-30"},
            { TennisGame.pointScore.FIFTEEN, TennisGame.pointScore.THIRTY, "15-30"},
            { TennisGame.pointScore.LOVE, TennisGame.pointScore.FORTY, "Advantage for player2 | 00-40"},
            { TennisGame.pointScore.FIFTEEN, TennisGame.pointScore.FORTY, "Advantage for player2 | 15-40"},
            { TennisGame.pointScore.THIRTY, TennisGame.pointScore.FORTY, "Advantage for player2 | 30-40"},
            
            //Game for player 1
            { TennisGame.pointScore.OVER_FORTY, TennisGame.pointScore.LOVE, "player1 has won the game!"},
            { TennisGame.pointScore.OVER_FORTY, TennisGame.pointScore.FIFTEEN, "player1 has won the game!"},
            { TennisGame.pointScore.OVER_FORTY, TennisGame.pointScore.THIRTY, "player1 has won the game!"},
            { TennisGame.pointScore.OVER_FORTY, TennisGame.pointScore.FORTY, "player1 has won the game!"},
            
            // Game for player 2
            { TennisGame.pointScore.LOVE, TennisGame.pointScore.OVER_FORTY, "player2 has won the game!"},
            { TennisGame.pointScore.FIFTEEN, TennisGame.pointScore.OVER_FORTY, "player2 has won the game!"},
            { TennisGame.pointScore.THIRTY, TennisGame.pointScore.OVER_FORTY, "player2 has won the game!"},
            { TennisGame.pointScore.FORTY, TennisGame.pointScore.OVER_FORTY, "player2 has won the game!"}
        });
    }
    
    public void checkDifferentResults(TennisGame game) {
    	game.setScore(this.p1_score, this.p2_score);
        assertEquals(this.expectedResult, game.getScore());
    }
    
	@Test
	public void test() {
		TennisGame game = new TennisGame("player1", "player2");
		
		checkDifferentResults(game);
	}

}
