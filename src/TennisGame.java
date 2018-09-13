
 public class TennisGame {
	
	private int p1;
	private int p2;
	private int scoreFlag;
	
	public TennisGame() {
		// TO BE IMPLEMENTED
		this.p1 = p1;
        this.p2 = p2;
        this.scoreFlag = scoreFlag;
		System.out.println("I am not a programmer");	
	}

	public String getScore() {
		
		System.out.println("I am trying to figure out how to solve it");
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
		
		if (p1 >= 3 && p2 >= 3) {
            if (Math.abs(p2 - p1) >= 2) {
                return  "p1 won";
            } else if (p1== p2) {
                return "deuce";
            } else {
                return "advantage ";
            }
        } else {
            return "";
            
        }
		
		// TO BE IMPLEMENTED
		// return "";
	}
} 

