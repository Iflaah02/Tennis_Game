
public class TennisGame {
	
	private int point;
	private int p1;
	private int p2;
	private int scoreFlag;
	private int winner;
	private boolean advp1;
	private boolean advp2;
	private String player1;
	private String player2;
	private String score;
	
	public TennisGame(){
		// TO BE IMPLEMENTED
		//default names for players
		this.player1 = "Player 1";
		this.player2 = "Player 2";
		//and let's be sure the score is 0-0 at the start
		this.p1 = 0;
		this.p2 = 0;
		this.scoreFlag = 0;
		this.winner = 0;
	}

	//player1 gets a point
	public void pointP1() {
		System.out.println("Point for player1!");
		p1++;
	}
	
	//player2 gets a point
	public void pointP2() {
		System.out.println("Point for player2!");
		p2++;
	}
	
	public String getScore() {
		//System.out.println("I am method for displaying score");
		// Here is the format of the scores: "player1Score - player2Score"
		if (deuce())
			return "deuce";
		if (advantage())
			return ("advantage player " + scoreFlag);
		if (gameEnd()){
			return ("Player " + winner + " wins!");
		}
		else
			return(player1 + " " + scoreBoard(p1) + "-" + scoreBoard(p2) + " " + player2);
		
	}
	
	
	//here we check, if the game is deuce (40-40, ...)
	private boolean deuce(){
		return p1 >= 3 && p1 == p2;
	}
	
	//here we check, if the either of players have advantage
	private boolean advantage(){
		//I use this scoreFlag to report, which player has the advantage
		scoreFlag = 0;
		if(p1 >= 4 && p1 == p2+1){
			scoreFlag = 1;
			return true;
		}
		if(p2 >= 4 && p2 == p1+1){
			scoreFlag = 2;
			return true;
		}
		return false;
	}
	
	//boolean method to check end game conditions
	public boolean gameEnd() {
		if(p1 >= 4 && p1 >= p2+2){
			winner = 1;
			return true;
		}
		if(p2 >= 4 && p2 >= p1+2){
			winner = 2;
			return true;
		}
		return false;
	}

	public String scoreBoard(int abc){
		//System.out.println("abc:"+abc);
		switch(abc){
			case 0: score = "love";
					break;
			case 1: score = "fifteen";
					break;
			case 2: score = "thirty";
					break;
			case 3: score = "forty";
					break;
		}
		return score;
	}
	
	//setter for name1
	public void setPlayer1(String player1){
		this.player1 = player1;
	}

	//and name2
	public void setPlayer2(String player2){
		this.player2 = player2;
	}	
	
	//getter for name1
	public String getPlayer1(){
		return (player1);
	}
	
	//and name2
	public String getPlayer2(){
		return (player2);
	}	
}
