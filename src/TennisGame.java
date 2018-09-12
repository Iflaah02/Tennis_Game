
public class TennisGame {
	
	private int p1;
	private int p2;
	private int scoreFlag;
	
	public TennisGame() {
		p1 = 0;
		p2 = 0;
	}

	public String getScore() {
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
		if(p1 <= 3 && p2 <= 3) {
			String score = getPlayerScore(p1);

			score += "-";
            score += getPlayerScore(p2);
            return score;
		} else {
			if(p1 == p2) {
				return "deuce";
			}

			if(p1 - p2 >= 2) {
				return "game player1";
			}
			if(p2 - p1 >= 2) {
				return "game player2";
			}

			if(p1 - p2 == 1) {
			    return "advantage player1";
            }
            if(p2 - p1 == 1) {
			    return "advantage player1";
            }


		}
		return "";
	}

	public void playerOneScore() {
		p1++;
	}

	public void playerTwoScores() {
		p2++;
	}

	private String getPlayerScore(int playerScore) {
        switch(playerScore) {
            case 0:
                return "love";
            case 1:
                return "fifteen";
            case 2:
                return "thirty";
            case 3:
                return "forty";
        }
        return "";
    }
}
