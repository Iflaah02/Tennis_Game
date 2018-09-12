
public class TennisGame {
	
	private int p1;
	private int p2;
	private int scoreFlag;
	
	public TennisGame() {
		// TO BE IMPLEMENTED
		System.out.println("Game Started");
		p1 = 0;
		p2 = 0;
		scoreFlag = 0;
		System.out.println(this.getScore());
	}

	public int getP1() {
		return p1;
	}

	public void setP1(int p1) {
		this.p1 = p1;
	}

	public int getP2() {
		return p2;
	}

	public void setP2(int p2) {
		this.p2 = p2;
	}

	public int getScoreFlag() {
		return scoreFlag;
	}

	public void setScoreFlag(int scoreFlag) {
		this.scoreFlag = scoreFlag;
	}

	public String getScore() {
		//System.out.println("I am method for displaying score");
		// Here is the format of the scores: "player1Score - player2Score"
		// "0 - 0"
		if (p1 == 0 && p2 == 0) {
			return("love - love");
		}
		// "15 - 15"
		else if (p1 == 1 && p2 == 1) {
			return("fifteen - fifteen");
		}
		// "30 - 30"
		else if (p1 == 2 && p2 == 2) {
			return("thirty - thirty");
		}
		// "deuce"
		else if (p1 == p2 && p1 >= 3) {
			return("deuce");
		}
		// "15 - 0", "0 - 15"
		else if (p1 == 1 && p2 == 0) {
			return("fifteen - love");
		}
		else if (p1 == 0 && p2 == 1) {
			return("love - fifteen");
		}
		// "30 - 0", "0 - 30"
		else if (p1 == 2 && p2 == 0) {
			return("thirty - love");
		}
		else if (p1 == 0 && p2 == 2) {
			return("love - thirty");
		}
		// "40 - 0", "0 - 40"
		else if (p1 == 3 && p2 == 0) {
			return("forty - love");
		}
		else if (p1 == 0 && p2 == 3) {
			return("love - forty");
		}
		// "30 - 15", "15 - 30"
		else if (p1 == 2 && p2 == 1) {
			return("thirty - fifteen");
		}
		else if (p1 == 1 && p2 == 2) {
			return("fifteen - thirty");
		}
		// "40 - 15", "15 - 40"
		else if (p1 == 3 && p2 == 1) {
			return("forty - fifteen");
		}
		else if (p1 == 1 && p2 == 3) {
			return("fifteen - forty");
		}
		// "40 - 30", "30 - 40"
		else if (p1 == 3 && p2 == 2) {
			return("forty - thirty");
		}
		else if (p1 == 2 && p2 == 3) {
			return("thirty - forty");
		}
		// "advantage player1"
		else if (p1-p2 == 1 && p2 >= 3) {
			return("advantage player1");
		}
		// "advantage player2"
		else if (p2-p1 == 1 && p1 >= 3) {
			return("advantage player2");
		}
		// "game player1"
		else if (p1 >= 4 && p1-p2 > 1) {
			scoreFlag = 1;
			return("game player1");
		}
		// "game player2"
		else if (p2 >= 4 && p2-p1 > 1){
			scoreFlag = 2;
			return("game player2");
		}
		else {
			return("something obviously wrong, debug");
		}
		// TO BE IMPLEMENTED
		//return "";
	}
}
