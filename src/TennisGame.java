
public class TennisGame {
	
	private int p1;
	private int p2;
	private int scoreFlag;
	
	public TennisGame() {
		// TO BE IMPLEMENTED
		System.out.println("I am constructor");
		p1 = 0;
		p2 = 0;
		scoreFlag = 0;
		
		//score test
		p1 = 15;
		getScore();
		p2 = 15;
		getScore();
		p2 = 30;
		getScore();
		p1 = 30;
		getScore();
		p2 = 40;
		getScore();
		p1 = 40;
		getScore();
		p2 = 50;
		getScore();
		p1 = 50;
		getScore();
		p1 = 60;
		getScore();
		p1 = 70;
		getScore();
		
		
	}

	public String getScore() {
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
		
		if (p1 < 30 || p2 < 30)
			System.out.println(p1 + " - "  +p2);
		else if (p1 == p2 && p1 >= 30) {
			System.out.println("Deuche"); 
			scoreFlag = 0;
		}
		else if(p1 >= 30 && p2 >= 30 && p1 > p2)
			scoreFlag = scoreFlag +1;
		else if(p1 >= 30 && p2 >= 30 && p1 < p2)
			scoreFlag = scoreFlag -1;
		
			
		switch (scoreFlag){
		case 1:
			System.out.println("Advatage player1");
			break;
		case 2:
			System.out.println("Game player1");
			break;
		case -1:
			System.out.println("Advatage player 2");
			break;
		case -2:
			System.out.println("Game player 2");
			break;
		}

		return "";
	}
}
