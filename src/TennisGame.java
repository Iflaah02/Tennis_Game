
public class TennisGame {
	
	private int p1Score = 0;
	private int p2Score = 0;
	private String p1Name="eka";
	private String p2Name="toka";
	
	
	
public TennisGame(int p1Score, int p2Score, String p1Name, String p2Name) {
		super();
		this.p1Score = p1Score;
		this.p2Score = p2Score;
		this.p1Name = p1Name;
		this.p2Name = p2Name;
	}

//	public TennisGame(String playerOneName, String playerTwoName) {
//		this.playerOneName = playerOneName;
//		this.playerTwoName = playerTwoName;
//	}
	
	
	public TennisGame() {
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
		
		
		
		System.out.println("I am constructor");
		
		
		
	}

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
		return "";
	}
}
