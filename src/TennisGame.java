import java.util.Random;

public class TennisGame {
	
	private int p1 = 0;
	private int p2 = 0;
	private Random random = new Random();
	
	public TennisGame() {
		// TO BE IMPLEMENTED
		// System.out.println("I am constructor");
	}
	
	public void playSingleRandomMatch() {
		// Random player wins
		if (random.nextInt() % 2 == 0) {
			p1++;
		} else {
			p2++;
		}
	}
	
	public boolean gameHasEnded() {
		if (p1 <= 3 && p2 <= 3) {
			return false;
		} else if (p1 - p2 >= 2 || p2 - p1 >= 2) {
			return true;
		} else {
			return false;
		}
	}

	public String getScore() {
		// System.out.println("I am method for displaying score");
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

		if (p1 >= 3 && p1 == p2) {
			return "deuce";
		} else if (p1 > 3 && p1 == p2 + 1) {
			return "advantage player1";
		} else if (p2 > 3 && p2 == p1 + 1) {
			return "advantage player2";
		} else if (p1 > 3 && p1 - p2 >= 2) {
			return "game player1";
		} else if (p2 > 3 && p2 - p1 >= 2) {
			return "game player2";
		} else {
			return getSingleScoreString(p1) + " - " + getSingleScoreString(p2);
		}
	}
	
	private String getSingleScoreString(int individualScore) {
		switch (individualScore) {
		case 0: return "0";
		case 1: return "15";
		case 2: return "30";
		case 3: return "40";
		default: return "ERROR";
		}
	}
}
