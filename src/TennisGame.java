
public class TennisGame {
	
	private int p1;
	private int p2;
	private int scoreFlag;
	
	public TennisGame() {
		// TO BE IMPLEMENTED
		System.out.println("I am constructor");
		
	}

	public String getScore() {
		System.out.println("I am method for displaying score");
		// Here is the format of the scores: "player1Score - player2Score"
		if(p1==0 && p2==0)
			return "Love-Love";
		// "0 - 0"
		else if(p1==1 && p2==1)
			return "Fifteen-Fifteen";
		// "15 - 15"
		// "30 - 30"
		else if(p1==2 && p2==2)
			return "Thirty-thirty";
		// "deuce"
		else if(p1==p2 && p1>2)	
			return "deuce";
		// "15 - 0", "0 - 15"
		else if(p1==1 && p2==0)
			return "Fifteen-Zero";
		
		else if(p1==0 && p2==1)
			return "Zero-Fifteen";
		// "30 - 0", "0 - 30"
		else if(p1==2 && p2==0)
			return "Thirty-Zero";
		
		else if(p1==0 && p2==2)
			return "Zero-Thirty";
		// "40 - 0", "0 - 40"
		else if(p1==3 && p2==0)
			return "Forty-Zero";
		
		else if(p1==0 && p2==3)
			return "Zero-Forty";
		// "30 - 15", "15 - 30"
		else if(p1==2 && p2==1)
			return "Thirty-Fifteen";
		
		else if(p1==1 && p2==2)
			return "Fifteen-Thirty";			
		// "40 - 15", "15 - 40"
		else if(p1==3 && p2==1)
			return "Forty-Fifteen";
		
		else if(p1==1 && p2==3)
			return "Fifteen-Forty";	
		// "advantage player1"
		else if(p1>p2 && p2>=3)
			return "advantage player1";	
		else if(p2>p1 && p1>=3)
			return "advantage player2";	
		// "advantage player2"
		// "game player1"
		else if(p1>p2+1)
			return "Player 1 won";
		// "game player2"
		else if(p2>p1+1)
			return "Player 2 won";
		// TO BE IMPLEMENTED
		
		return "";
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
}
