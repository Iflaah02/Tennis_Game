import java.util.Random;

public class TennisGame {
	
	private int point;
	private int p1;
	private int p2;
	private int scoreFlag;
	
	public TennisGame() {
		// TO BE IMPLEMENTED
		System.out.println("I am constructor");
		p1 = 0;
		p2 = 0;
		scoreFlag = 0;
		while (scoreFlag < 5) {
			playRound();
		}	
	}
	
	public void playRound() {
		Random rand = new Random();
		point = rand.nextInt(1); // who won an exchange is determined by a random integer.
		
		scoreFlag++; // update number of round played
		
		// distribute the point won:
		if (point == 0) {
			p1 = addPoint(p1);
		}
		else {
			p2 = addPoint(p2);
		}
	}
	
	public int addPoint(int player) {
		// updates the score of a player according to tennis rules.
		if (player == 30) {
			player = 40;
		}
		else {
			player= player+15; // player1 won!
		}
		return player;
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

		// TO BE IMPLEMENTED
		if (scoreFlag < 5) {
			System.out.println(p1+" - "+p2);
		}
		
		if(p1 == p2 && scoreFlag == 4) {
			System.out.println("deuce");
			// stop playing
		}
		else if (scoreFlag < 5){
			if (p1-p2 == 55) {
				System.out.println("game player1");
				// stop playing
			}
			else if (p2-p1 == 55) {
				System.out.println("game player2");
				// stop playing
			}
			else if (p1-p2 == 10) {
				System.out.println("advantage player1");
				// stop playing
			}
			else {
				System.out.println("advantage player2");
				// stop playing
			}
		}
		
		
		return "";
	}
}
