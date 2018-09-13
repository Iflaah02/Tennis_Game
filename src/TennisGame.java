
public class TennisGame {


	private int p1;
	private int p2;
	private int scoreFlag;

	public TennisGame() {
		// TO BE IMPLEMENTED
		//System.out.println("I am constructor");
		p1 = 0; 
		p2 = 0; 
		scoreFlag = 0; 
	}

	public String getScore() {
		// System.out.println("I am method for displaying score");
		// Here is the format of the scores: "player1Score - player2Score"
		
		String score = new String(); 
		
		// "0 - 0"
		if(p1 == 0 && p2 == 0) {
			score = "0 - 0"; 
		}// "15 - 15"
		else if(p1 == 1 & p2 == 1) {
			score = "15 - 15"; 
		}// "30 - 30"
		else if(p1 == 2 && p2 == 2) {
			score = "30 - 30"; 
		}// "deuce"
		else if(p1 == 3 && p2 == 3) {
			score = "deuce"; 
		}// "15 - 0", "0 - 15"
		else if(p1 == 1 && p2 == 0)
		{
			score = "15 - 0"; 
		}
		else if(p1 == 0 && p2 == 1)
		{
			score = "0 - 15"; 
		}// "30 - 0", "0 - 30"
		else if(p1 == 2 && p2 == 0)
		{
			score = "30 - 0"; 
		}
		else if(p1 == 0 && p2 == 2)
		{
			score = "0 - 30"; 
		}// "40 - 0", "0 - 40"
		else if(p1 == 3 && p2 == 0)
		{
			score = "40 - 0"; 
		}
		else if(p1 == 0 && p2 == 3)
		{
			score = "0 - 40"; 
		}// "30 - 15", "15 - 30"
		else if(p1 == 2 && p2 == 1)
		{
			score = "30 - 15"; 
		}
		else if(p1 == 1 && p2 == 2)
		{
			score = "15 - 30"; 
		}// "40 - 15", "15 - 40"
		else if(p1 == 3 && p2 == 1)
		{
			score = "40 - 15"; 
		}
		else if(p1 == 1 && p2 == 3)
		{
			score = "15 - 40"; 
		}// "40 - 30", "30 - 40"
		else if(p1 == 3 && p2 == 2)
		{
			score = "40 - 30"; 
		}
		else if(p1 == 2 && p2 == 3)
		{
			score = "30 - 40"; 
		}// "advantage player1"
		else if(p1 - p2 == 1 && p1 > 3 )
		{
			score = "advantage player1"; 
		}// "advantage player2"
		else if(p2 - p1 == 1 && p2 > 3)
		{
			score = "advantage player2"; 
		}// "game player1"
		else if(p1 - p2 > 1 && p1 > 3)
		{
			scoreFlag = 1; 
			score = "game player1";
		}// "game player2"
		else if(p2 - p1 > 1 && p2 > 3)
		{
			scoreFlag = 1; 
			score = "game player2";
		}
		else if(p1 == p2)
		{
			score = "deuce"; 
		}

		// TO BE IMPLEMENTED
		return score;
	}
	
	public int getP1() {
		return p1;
	}

	public void setP1(int p1) {
		this.p1 = p1;
	}

	public int getP2() {
		return p2;
	}

	public void setP2(int p2) {
		this.p2 = p2;
	}
	
	public int getScoreFlag() {
		return scoreFlag;
	}

	public void setScoreFlag(int scoreFlag) {
		this.scoreFlag = scoreFlag;
	}
}
