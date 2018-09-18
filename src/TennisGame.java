
public class TennisGame {
	
	private boolean gameEnd;
	private int p1pts;
	private int p2pts;
	private int scoreFlag;
	
	public TennisGame() {
		// TO BE IMPLEMENTED
		System.out.println("I am constructor");
		p1pts = 0;
		p2pts = 0;
		gameEnd = false ;
		
	}
	
	private void checkGameEnded() {
		if (p1pts>=4 && p1pts-p2pts>=2) {
			gameEnd = true; 
			}
		else if (p2pts>=4 && p2pts-p1pts>=2) {
			gameEnd = true;
			}
	}
	
	private String getScore(int points) {
		switch (points)	{
		case 0: return "love";
		case 1: return "15";
		case 2: return "30";
		case 3: return "40";
		default: return "40";
		} 		
	}
	
	public void player1Scored() throws TennisGameException {
		if (gameEnd) {
			throw new TennisGameException();
			}
		else {
			p1pts++;
			checkGameEnded();
		}			
	}
	
	public void player2Scored() throws TennisGameException {
		if (gameEnd) {
			throw new TennisGameException();
			}
		else {
			p2pts++;
			checkGameEnded();
		}			
	} 
	//I hope this was how it was supposed to be made

	public String getScore() {
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

		// TO BE IMPLEMENTED
		String p1Score = getScore(p1pts);
		String p2Score = getScore(p2pts);
		
		if (gameEnd) {
			if (p1pts > p2pts) {
				return "player1 wins"; 
				}
			else {
				return "player2 wins";
				}
		}
		
		if (p1pts >= 3 && p1pts == p2pts) {
			return "deuce";
			}
		
		if (p1pts >= 4 && p1pts - p2pts == 1) {
			return "player1 has advantage";
			}
		
		if (p2pts >= 4 && p2pts - p1pts == 1) {
			return "player2 has advantage";		
			}					
		
		return  p1Score + " - " + p2Score ;
	}
}
