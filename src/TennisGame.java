
public class TennisGame {	    
	    
	private int p1;
	private int p2;
	//private int scoreFlag;
	private String playerTwoName;
	private String playerOneName;
	
	public TennisGame(String playerTwoName, String playerOneName) {
		// TO BE IMPLEMENTED
		this.playerOneName = playerOneName;
		this.playerTwoName = playerTwoName;
		System.out.println("I am not a programmer");	
	}

	public String getScore() {		
		System.out.println("I am trying to figure out how to solve it");
		
		 if (hasWinner()) {
				return playerWithHighestScore() + " wins";
			}
			
			if (hasAdvantage()) { 
				return "Advantage " + playerWithHighestScore(); 
			}
			
			if (isDeuce())
				return "Deuce";
			
			if(p1 == p2) {
				return translateScore(p1) + " all";
			}
			
			return translateScore(p1) + "," + translateScore(p2);
		
	}
	
	private boolean isDeuce() {
		return p1 >= 3 && p2 == p1;
	}
	
	private String playerWithHighestScore() {
		if (p1 > p2) {
			return playerOneName;
		} else {
			return playerTwoName;
		}
	}
	
	private boolean hasWinner() {
		if(p2 >= 4 && p2 >= p1 + 2 )
			return true;
		if(p1 >= 4 && p1 >= p2 + 2)
			return true;
		return false;
	}
	
	private boolean hasAdvantage() {
		if (p2 >= 4 && p2 == p1 + 1)
			return true;
		if (p1 >= 4 && p1== p2 + 1)
			return true;
		
		return false;

	}
	
	public void playerOneScores() {
		p1++;
	}

	public void playerTwoScores() {
		p2++;
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
			return "Love";
		}
		throw new IllegalArgumentException("Illegal score: " + score);
	}
} 