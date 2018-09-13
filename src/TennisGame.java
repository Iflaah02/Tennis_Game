import java.util.Arrays;
import java.util.List;

public class TennisGame {
	
	private int p1;
	private int p2;
	private int scoreFlag;
	/*Who wins the next point is based on user input*/
	public TennisGame() {
		// TO BE IMPLEMENTED
		System.out.println("I am constructor");
		p1 = 0;
		p2 = 0;
		scoreFlag = 0;
		
	}
	
	public int getFlag() {
		return scoreFlag;
	}

	public String getScore() {
		String score = null;
		int flag = this.getFlag();
		List<String> pointsDescription = Arrays.asList("love", "fifteen", "thirty", "forty");
		System.out.println("I am method for displaying score");

	        if (p1 >= 3 && p2 >= 3) {
	            if (p2 - p1 >= 2) {
	                return getLeadPlayer().getName() + " won"; //!!
	            } else if (p1 == p2) {
	                return "deuce";
	            } else {
	                return "advantage " + getLeadPlayer().getName(); //!!
	            }
	        } else {
	            return player1.getScoreDescription() + ", " + player2.getScoreDescription(); //!!
	        }
	    
		// Here is the format of the scores: "player1Score - player2Score"
		// "0 - 0", scoreFlag 0
		
		// "15 - 0", "0 - 15", scoreFlag 1
		
		// "15 - 15"
		// "30 - 0", "0 - 30", scoreFlag 2
		
		// "30 - 15", "15 - 30"
		// "40 - 0", "0 - 40", scoreFlag 3
		
		// "30 - 30"
		// "40 - 15", "15 - 40"
		// "game player1"
		// "game player2", scoreFlag 4
		
		// "40 - 30", "30 - 40"
		// "game player1"
		// "game player2", scoreFlag 5
		
		// "deuce", scoreFlag 6
		// "game player1"
		// "game player2"
		
		// "advantage player1"
		// "advantage player2", scoreFlag 7
		
		// "game player1"
		// "game player2", scoreFlag 8

		// TO BE IMPLEMENTED
		String output = String.format("player1 - player2\n%s", score);
		return output;
	}
}
