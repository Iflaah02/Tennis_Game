
public class TennisGame {

	private int p1;
	private int p2;
	private int scoreFlag;

	public TennisGame() {
		// TO BE IMPLEMENTED
		// System.out.println("I am constructor");

	}

	public String getScore() {

		// Here is the format of the scores: "player1Score - player2Score"
		// "0 - 0"
		if (p1 == 0 && p2 == 0) {
			return "love-love";
		} else if (p1 == 1 && p2 == 1) {
			return "fifteen-fifteen";
		}
		// "15 - 15"
		else if (p1 == 2 && p2 == 2) {
			return "deuce";
		}
		// "30 - 30"
		else if (p1 == 2 && p2 == 2) {
			return "thirty-thirty";
		}
		else if (p1 == 3 && p2 == 3) {
			return "deuce";
		}
		// "deuce"
		else if (p1 == 1 && p2 == 0) {
			return "fiften-love";
		}
		// "15 - 0", "0 - 15"
		else if (p1 == 0 && p2 == 1) {
			return "love-fifteen";
		} else if (p1 == 1 && p2 == 0) {
			return "fifteen-love";
		} else if (p1 == 2 && p2 == 0) {
			return "thirty-love";
		}
		// "30 - 0", "0 - 30"
		else if (p1 == 0 && p2 == 2) {
			return "love-thirty";
		}

		// "40 - 0", "0 - 40"
		else if (p1 == 0 && p2 == 3) {
			return "forty-love";
		} else if (p1 == 3 && p2 == 0) {
			return "forty-love";
		}
		// "30 - 15", "15 - 30"
		else if (p1 == 2 && p2 == 1) {
			return "thirty-fifteen";
		} else if (p1 == 1 && p2 == 2) {
			return "fifteen-thirty";
		}
		// "40 - 15", "15 - 40"
		else if (p1 == 3 && p2 == 1) {
			return "forty-fifteen";
		} else if (p1 == 1 && p2 == 3) {
			return "fifteen-forty";
		} else if (p1 == 3 && p2 == 3) {
			if (p1 > p2) {
				return "Player one has adavnatge";
			} else {
				return "Player two has adavnatge";
			}
		}
		// "advantage player1"

		// "advantage player2"
		// "game player1"
		// "game player2"
		else if (p1 > p2) {
			scoreFlag=3;
			return "Player one won the game";

		} else if (p2 > p1) {
			scoreFlag=3;
			return "Player two won the game";

		}

		// TO BE IMPLEMENTED
		return "";
	}

	protected int getP1() {
		return p1;
	}

	protected void setP1(int p1) {
		this.p1 = p1;
	}

	protected int getP2() {
		return p2;
	}

	protected void setP2(int p2) {
		this.p2 = p2;
	}

	protected int getScoreFlag() {
		return scoreFlag;
	}

	protected void setScoreFlag(int scoreFlag) {
		this.scoreFlag = scoreFlag;
	}

}
