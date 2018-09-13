
public class TennisGame {
	
	private int p1;
	private int p2;
	
	public TennisGame() {
		p1 = 0;
		p2 = 0;
		System.out.println("I am constructor");
	}

	public String getScore() {
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
		
		String finalScore = "";
		
		if((p1 >= 4 || p2 >= 4) && ((p1 - p2) >= 2)) {
			finalScore = "game player1";
		}else if((p1 >= 4 || p2 >= 4) && ((p2 - p1) >= 2)) {
			finalScore = "game player2";
		}else if((p1 >= 3 && p2 >= 3) && (p1 == p2)) {
			finalScore = "deuce";
		}else if((p1 >= 3 && p2 >= 3) && (p1 > p2)) {
			finalScore = "advantage player1";
		}else if((p1 >= 3 && p2 >= 3) && (p1 < p2)) {
			finalScore = "advantage player2";
		}else {
			finalScore = (getPlayerScoreString(p1) + " - " + getPlayerScoreString(p2));
		}
		
		return finalScore;
	}
	
	public String getPlayerScoreString(int playerScore) {
		String returnString = "";
		switch(playerScore){
			case 0: 	returnString = "0";
						break;
			case 1: 	returnString = "15";
						break;
			case 2: 	returnString = "30";
						break;
			case 3: 	returnString = "40";
						break;
			default:	returnString = "40";
						break;
		}
		return returnString;
	}
	
	public void winRoundForPlayer(int player) {
		if(player == 1) {
			p1++;
		}else {
			p2++;
		}
	}
}
