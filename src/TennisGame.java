import java.util.Scanner;

public class TennisGame {
	
	private int p1Score = 0;
	private int p2Score = 0;
	private String p1Name="eka";
	private String p2Name="toka";
	
	
	
public TennisGame() {
	super();
		this.p1Score = p1Score;
		this.p2Score = p2Score;
		this.p1Name = p1Name;
		this.p2Name = p2Name;
	}

public String getScore() {

	if (hasWinner()) {
		return playerWithHighestScore() + " wins";
	}
	
	if (hasAdvantage()) { 
		return "Advantage " + playerWithHighestScore(); 
	}
	
	if (isDeuce())
		return "Deuce";
	
	if(p1Score == p2Score) {
		return translateScore(p1Score) + " all";
	}
	
	return translateScore(p1Score) + "," + translateScore(p2Score);
}

private boolean isDeuce() {
	return p1Score >= 3 && p2Score == p1Score;
}

private String playerWithHighestScore() {
	if (p1Score > p2Score) {
		return p1Name;
	} else {
		return p2Name;
	}
}

private boolean hasWinner() {
	if(p2Score >= 4 && p2Score >= p1Score + 2 )
		return true;
	if(p1Score >= 4 && p1Score >= p2Score + 2)
		return true;
	return false;
}

private boolean hasAdvantage() {
	if (p2Score >= 4 && p2Score == p1Score + 1)
		return true;
	if (p1Score >= 4 && p1Score == p2Score + 1)
		return true;
	
	return false;

}

public void p1Scores() {
	p1Score++;
}

public void p2Scores() {
	p2Score++;
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


//	public TennisGame(String p1Name, String p2Name) {
//		this.p1Name = p1Name;
//		this.p2Name = p2Name;
//	}
	
	
	//public TennisGame() {
		// TO BE IMPLEMENTED
		// jebujee
		/*Wii Tennis 
A game is won by the first player to have won at least four points in total and at least two points more than the opponent. 
The running score of each game is described in a manner peculiar to tennis: scores from zero to three points are described as 
"love", "fifteen", "thirty", and "forty" respectively. 
If at least three points have been scored by each player, and the scores are equal, the score is "deuce". 
If at least three points have been scored by each side and a player has one more point than his opponent, 
the score of the game is "advantage" for the player in the lead
*/
		
		
		
		
		
		
	//}

	//////public String getScore() {
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

		// TO BE IMPLEMENTED
//		return "";
//	}
}
