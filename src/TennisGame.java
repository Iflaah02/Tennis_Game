
public class TennisGame {
	
	private int p1;
	private int p2;
	private int scoreFlag;
	
	public TennisGame() {
		// TO BE IMPLEMENTED
		
	
		System.out.println("I am constructor");
		
	}

	public String getScore() {
		scoreFlag = getRandomNumber();
		
		if(scoreFlag == 1) {
			p1 = p1 + 1;
		} else {
			p2 = p2 + 1;
		}
		System.out.println("I am method for displaying score");
		// Here is the format of the scores: "player1Score - player2Score"
		// "0 - 0"
		if((p1 == 0)&&(p2 == 0)) {
			System.out.println("0 - 0");
		}
		// "15 - 15"
		if((p1 == 1)&&(p2 == 1)) {
			System.out.println("15 - 15");
		}
		// "30 - 30"
		if((p1 == 2)&&(p2 == 2)) {
			System.out.println("30 - 30");
		}
		// "deuce"
		if((p1 == 3)&&(p2 == 3)) {
			System.out.println("deuce");
		}
		// "15 - 0", "0 - 15"
		if((p1 == 1)&&(p2 == 0)) {
			System.out.println("15 - 0");
		}
		if((p1 == 0)&&(p2 == 1)) {
			System.out.println("0 - 15");
		}
		// "30 - 0", "0 - 30"
		if((p1 == 2)&&(p2 == 0)) {
			System.out.println("30 - 0");
		}
		if((p1 == 0)&&(p2 == 2)) {
			System.out.println("0 - 30");
		}
		// "40 - 0", "0 - 40"
		if((p1 == 3)&&(p2 == 0)) {
			System.out.println("40 - 0");
		}
		if((p1 == 0)&&(p2 == 3)) {
			System.out.println("0 - 40");
		}
		// "30 - 15", "15 - 30"
		if((p1 == 2)&&(p2 == 1)) {
			System.out.println("30 - 15");
		}
		if((p1 == 1)&&(p2 == 2)) {
			System.out.println("15 - 30");
		}
		// "40 - 15", "15 - 40"
		if((p1 == 3)&&(p2 == 1)) {
			System.out.println("40 - 15");
		}
		if((p1 == 1)&&(p2 == 3)) {
			System.out.println("15 - 40");
		}
		// "advantage player1"
		if((p1 >= 3  )&&(p2 >= 3 )&&(p1 > p2)) {
			System.out.println("advantage player1");
		}
		// "advantage player2"
		if((p1 >= 3  )&&(p2 >= 3 )&&(p1 < p2)) {
			System.out.println("advantage player2");
		}
		// "game player1"
		if((p1 >= 4 )&&(p2 < p1 + 2)) {
			System.out.println("game player1");
		}
		// "game player2"
		if((p1 < p2 + 2 )&&(p2 >= 4)) {
			System.out.println("game player2");
		}

		// TO BE IMPLEMENTED
		return "";
	}

	public static int getRandomNumber () {
		int x = (int)(Math.random()*((2-1) + 1)) + 1;
		return x;
		
	}
}
