/* Wii Tennis 
 - A game is won by the first player to have won at least four points in total and at least two points more than the opponent. 
 - The running score of each game is described in a manner peculiar to tennis: 
   scores from zero to three points are described as "love", "fifteen", "thirty", and "forty" respectively.
 - If at least three points have been scored by each player, and the scores are equal, the score is "deuce". 
 - If at least three points have been scored by each side and a player has one more point than his opponent, 
   the score of the game is "advantage" for the player in the lead.
*/

public class TennisGame {
	
	// Player 1
	private String p1_name;
	private pointScore p1_score = pointScore.LOVE;
	// Player 2
	private String p2_name;
	private pointScore p2_score = pointScore.LOVE;
    
	public TennisGame(String player1_name, String player2_name) {
		// TO BE IMPLEMENTED
		System.out.println("I am constructor");
		System.out.println("Game is starting");
		System.out.println(player1_name + " VS " + player2_name);

		this.p1_name = player1_name;
		this.p2_name = player2_name;
	}
    public void setScore(pointScore p1_score2, pointScore p2_score2) {
    	this.p1_score = p1_score2;
    	this.p2_score = p2_score2;
    }
	public String getScore() {
		System.out.println("I am method for displaying score");
		// Here is the format of the scores: "player1Score - player2Score"
		// "0 - 0"
		// "15 - 15"
		// "30 - 30"
		// "deuce"
		// "15 - 0", "0 - 15"
		// "30 - 0", "0 - 30"
		// "40 - 0", "0 - 40"
		// "30 - 15", "15 - 30"
		// "40 - 15", "15 - 40"
		// "advantage player1"
		// "advantage player2"
		// "game player1"
		// "game player2"

		// TO BE IMPLEMENTED
		
        if (isTie()) {
        	return scoreForTie();
        } else if (isTieBreaker()) {
            return scoreForTieBreaker();
        }
        return getScores();
	}
	
	/* Boolean operators */
    private boolean isTie() {
        return p1_score == p2_score;
    }
    
    private boolean isTieBreaker() {
    	return (this.p1_score == pointScore.FORTY || this.p2_score == pointScore.FORTY) && p1_score != p2_score;
    }
    
    /* Score operators */
    private String getScores() {
    	String score = "";
		switch (this.p1_score) {
			case LOVE:
				score += "00-";
				break;
			case FIFTEEN:
				score += "15-";
				break;
			case THIRTY:
				score += "30-";
				break;
			case FORTY:
				score += "40-";
				break;
			case OVER_FORTY:
				return this.p1_name + " has won the game!";
		}
		
		switch (this.p2_score) {
		case LOVE:
			score += "00";
			break;
		case FIFTEEN:
			score += "15";
			break;
		case THIRTY:
			score += "30";
			break;
		case FORTY:
			score += "40";
			break;
		case OVER_FORTY:
			return this.p2_name + " has won the game!";
		}
        return score;
    }

    private String scoreForTieBreaker() {
    	
    	// Advantage checks
    	if (this.p1_score.ordinal() > this.p2_score.ordinal()) {    		
	    	// Switch case here !
    		switch (this.p1_score) {
	    		case OVER_FORTY:
	    			return this.p1_name + " has won the game!";
	    		default:
	    			return "Advantage for " + this.p1_name + " | " + getScores();
    		}
    	} else if (p2_score.ordinal() > p1_score.ordinal()) {
    		switch (this.p2_score) {
    		case OVER_FORTY:
    			return this.p2_name + " has won the game!";
    		default:
    			return "Advantage for " + this.p2_name + " | " + getScores();
    		}
    	}
    	return "Game has not started";
    }

	
    
    private String scoreForTie() {
    	// Does not matter if we check p1 score or p2 score since they are same
        switch (this.p1_score) {
        case LOVE:
            return "Love-All";
        case FIFTEEN:
            return "Fifteen-All";
        case THIRTY:
            return "Thirty-All";
        default:
            return "Deuce";
        }
    }
    
    // pointScore enum - ideally change this into its own file
    public enum pointScore {
        LOVE,
        FIFTEEN, // 15
        THIRTY, // 30
        FORTY, // 40
        OVER_FORTY // >40
    }
}
