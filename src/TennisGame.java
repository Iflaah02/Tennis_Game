public class TennisGame {
	
	private int p1;
	private String p1Score;
	private int p2;
	private String p2Score;
	private int scoreFlag;
	private String scoreResult;
	private boolean gameEnded;
	
	public TennisGame() {
		p1 = 0;
		p2 = 0;
		scoreFlag = 0;
		scoreResult = "";
		p1Score = "";
		p2Score = "";
		gameEnded = false;
		System.out.println("Game is ready to begin.");
		
	}
	
	public boolean getGameEnded() {
		return gameEnded;
	}
	
	public void restartGame() {
		p1 = 0;
		p2 = 0;
		scoreFlag = 0;
		scoreResult = "";
		p1Score = "";
		p2Score = "";
		gameEnded = false;
		System.out.println("Game has been reset");
	}

	public String getScore(int point) {;
		if(point == 1) {
			System.out.println("Player 1 scored!");
			p1++;
		}else {
			System.out.println("Player 2 scored!");
			p2++;
		}
		scoreFlag = p1 - p2;
		
		switch(p1) {
			case 0:
				p1Score = "0";
				break;
			case 1:
				p1Score = "15";
				break;
			case 2:
				p1Score = "30";
				break;
			case 3:
				p1Score = "40";
				break;
			default:
				p1Score = "";
				break;
		}
		
		switch(p2) {
			case 0:
				p2Score = "0";
				break;
			case 1:
				p2Score = "15";
				break;
			case 2:
				p2Score = "30";
				break;
			case 3:
				p2Score = "40";
				break;
			default:
				p2Score = "";
				break;
		}
		
		switch(scoreFlag) {
			case 0:
				if(p1 > 2 && p2 > 2) {
					scoreResult = "Deuce!";
				}else {
					scoreResult = p1Score + " - " + p2Score;
				}
				break;
			case 1: 
				if(p1 > 2 && p2 > 2) {
					scoreResult = "Player 1 advantage!";
				}else {
					scoreResult = p1Score + " - " + p2Score;
				}
				break;
			case 2: 
				if(p1 > 3) {
					scoreResult = "Game player 1!";
					gameEnded = true;
				}else {
					scoreResult = p1Score + " - " + p2Score;
				}
				break;
			case 3: 
				if(p1 > 3) {
					scoreResult = "Game player 1!";
					gameEnded = true;
				}else {
					scoreResult = p1Score + " - " + p2Score;
				}
				break;	
			case 4:
				if(p1 > 3) {
					scoreResult = "Game player 1!";
					gameEnded = true;
				}else {
					scoreResult = p1Score + " - " + p2Score;
				}
				break;
			case -1: 
				if(p1 > 2 && p2 > 2) {
					scoreResult = "Player 2 advantage!";
				}else {
					scoreResult = p1Score + " - " + p2Score;
				}
				break;
			case -2: 
				if(p2 > 3) {
					scoreResult = "Game player 2!";
					gameEnded = true;
				}else {
					scoreResult = p1Score + " - " + p2Score;
				}
				break;
			case -3: 
				if(p2 > 3) {
					scoreResult = "Game player 2!";
					gameEnded = true;
				}else {
					scoreResult = p1Score + " - " + p2Score;
				}
				break;	
			case -4:
				if(p2 > 3) {
					scoreResult = "Game player 2!";
					gameEnded = true;
				}else {
					scoreResult = p1Score + " - " + p2Score;
				}
				break;

			default:
				scoreResult = "Something fucked up!";
				break;
		}
		
		return scoreResult;
	}
}
