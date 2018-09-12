public class TennisGame {
	
	private int p1;
	private int p2;
	private String scoreString;
	private Boolean gameOver;
	
	public TennisGame() {
		this.p1 = 0;
		this.p2 = 0;
		this.scoreString = "";
		this.gameOver = false;
	}
	
	public void setPlayerOneScore(int score) {
		this.p1 = score;
	}
	
	public void setPlayerTwoScore(int score) {
		this.p2 = score;
	}
	
	public String getScoreString(int score) throws TennisGameException {
		switch (score) {
			case 0:
				scoreString = "0";
				break;
			case 1:
				scoreString = "15";
				break;
			case 2:
				scoreString = "30";
				break;
			case 3:
				scoreString = "40";
				break;
			default:
				throw new TennisGameException("invalid score");
		}
		
		return scoreString;
	}

	public String getScore() {
		if (this.p1 >= 4 && this.p1 - this.p2 >= 2) {
			return "game player1";
		} else if (this.p2 >= 4 && this.p2 - this.p1 >= 2) {
			return "game player2";
		} else if (this.p1 >= 3 && this.p2 >= 3 && this.p1 == this.p2) {
			return "deuce";
		} else if (this.p1 >= 3 && this.p2 >= 3 && this.p1 - this.p2 == 1) {
			return "advantage player1";
		} else if (this.p2 >= 3 && this.p1 >= 3 && this.p2 - this.p1 == 1) {
			return "advantage player2";
		} else {
			String p1Str = "";
			String p2Str = "";
			try {
				 p1Str = this.getScoreString(this.p1);
				 p2Str = this.getScoreString(this.p2);
			} catch (TennisGameException tge) {
				System.out.println("Invalid score value");
				System.exit(1);
			}
			return p1Str + " - " + p2Str;
		}
	}
}
