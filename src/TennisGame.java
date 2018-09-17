
public class TennisGame {
	
	private int p1;
	private int p2;
	private int scoreFlag;
	private int advantageFlag;
	private int gameFlag;
	
	public TennisGame() {
		// TO BE IMPLEMENTED
		p1 = 0;
		p2 = 0;
		advantageFlag = 0;
		gameFlag = 0;
		System.out.println("Game Starts!\n");
	}

	public String getScore() {
		//return("I am method for displaying score");
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
		
		if(p1==0 && p2==0) {
			return("0 - 0");
		}
		if(p1==15 && p2==15){
			return("15 - 15");
		}
		if(p1==30 && p2==30){
			return("30 - 30");
		}
		if(p1==40 && p2==40){
			return("deuce");
		}//p1
		if(p1==30 && p2==15){
			return("30 - 15");
		}
		if(p1==15 && p2==30){
			return("15 - 30");
		}
		if(p1==40 && p2==15){
			return("40 - 15");
		}
		if(p1==15 && p2==40){
			return("15 - 40");
		}
		if(p1==40 && p2==30){
			return("40 - 30");
		}
		if(p1==30 && p2==40){
			return("30 - 40");
		}
		if(p1==15 && p2==0){
			return("15 - 0");
		}
		if(p1==30 && p2==0){
			return("30 - 0");
		}
		if(p1==40 && p2==0){
			return("40 - 0");
		}//p2
		if(p1==0 && p2==15){
			return("0 - 15");
		}
		if(p1==0 && p2==30){
			return("0 - 30");
		}
		if(p1==0 && p2==40){
			return("0 - 40");
		}//advantage
		if(p1 > 40 && p1-10==p2) {
			advantageFlag = 1;
			return("advantage player1");
		}
		if(p2 > 40 && p2-10==p1) {
			advantageFlag = 2;
			return("advantage player2");
		}//game
		if(p1 > 40 && p1-20==p2 && advantageFlag == 1) {
			gameFlag = 1;
			return("game player1");
		}
		else if(p1 == p2) {
			advantageFlag = 0;
			return("deuce");
		}
		if(p1 > p2 && p1 == 50 && advantageFlag == 0) {
			gameFlag = 1;
			return("game player1");
		}
		if(p2 > p1 && p2 == 50 && advantageFlag == 0) {
			gameFlag = 1;
			return("game player2");
		}
		
		if(p2 > 40 && p2-20==p1 && advantageFlag == 2) {
			gameFlag = 1;
			return("game player2");
		}
		else if(p1 == p2) {
			advantageFlag = 0;
			return("deuce");
		}
		
		return "";
	}
	
	public int getp1score() {
		return p1;
	}
	public int getp2score() {
		return p2;
	}
	
	public int getGameFlag() {
		return gameFlag;
	}
	
	public void setScore(int p1score, int p2score) {
		if(Math.random() < 0.5) {
			if(p1score < 30) {
			p1 = p1score + 15;
			}
			else {
				p1 = p1score + 10;
			}
		}
		else {
			if(p2score < 30) {
			p2 = p2score + 15;
			}
			else {
				p2 = p2score + 10;
			}
		}
	}
	
	
}
	