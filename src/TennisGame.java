
public class TennisGame {
	
	private int p1;
	private int p2;
	private int scoreFlag = 0;
	
	public TennisGame() {
		// TO BE IMPLEMENTED
		p1 = 0;
		p2 = 0;
		System.out.println("1 = point to player1");
		System.out.println("2 = point to player2");
		System.out.println("3 = Game Ended");
		
	}
 	public String getScore() {
		//System.out.println("I am method for displaying score");
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
 		if(scoreFlag == 1) {
			resetPoints();
			scoreFlag=0;		
		}
	
	public void resetPoints() {
		p1=0;
		p2=0;
	}
 	private String translateScore(int score) {
		switch (score) {
		case 3:
			return "Forty";
		case 2:
			return "Thirty";
		case 1: 
			return "Fifteen";
		case 0:
			return "Null";
		}
		throw new IllegalArgumentException("Illegal score: " + score);
	}
}