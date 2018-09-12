

public class TennisGame {
	
	private int p1;
	private int p2;
	private int scoreFlag;
	
	public TennisGame() {
		System.out.println("Game starting");
		p1 = 0;
		p2 = 0;
		scoreFlag = 0;
		
			
	}

	public Integer getScore(int result) {
		
		if(result == 1) {
			p1 = p1 + 1;
		}
		if (result == 2) {
			p2 = p2 + 1;
		}
		
		//System.out.printf("The score is " + p1 +" " + p2 + "\n");
		
		if(p1 == 0 && p2 == 0) {
			System.out.printf("0 - 0");
			
		} else if(p1 == 1 && p2 == 1) {
			System.out.printf("15 - 15");
			
		} else if(p1 == 2 && p2 == 2) {
			System.out.printf("30 - 30");
			
		} else if(p1 > 2 && p2 > 2 && p1 == p2) {
			System.out.printf("deuce");
			
		} else if(p1 == 1 && p2 == 0) {
			System.out.printf("15 - 0");
			
		} else if(p1 == 0 && p2 == 1) {
			System.out.printf("0 - 15");
			
		} else if(p1 == 2 && p2 == 0) {
			System.out.printf("30 - 0");
			
		} else if(p1 == 0 && p2 == 2) {
			System.out.printf("0 - 30");
			
		} else if(p1 == 3 && p2 == 0) {
			System.out.printf("40 - 0");
			
		} else if(p1 == 0 && p2 == 3) {
			System.out.printf("0 - 40");
			
		} else if(p1 == 2 && p2 == 1) {
			System.out.printf("30 - 15");
			
		} else if(p1 == 1 && p2 == 2) {
			System.out.printf("15 - 30");
			
		} else if(p1 == 3 && p2 == 1) {
			System.out.printf("40 - 15");
			
		} else if(p1 == 1 && p2 == 3) {
			System.out.printf("15 - 40");
			
		} else if(p1 == 0 && p2 == 0) {
			System.out.printf("0 - 0");
			
		} else if(p1 == 3 && p2 == 2) {
			System.out.printf("40 - 30");
			
		} else if(p1 == 2 && p2 == 3) {
			System.out.printf("30 - 40");
			
		}	
		if(p1 > 3 || p2 > 3 ) {
			if(p1 == p2 + 1) {
				System.out.printf("advantage player 1");
			}
			if(p2 == p1 + 1) {
				System.out.printf("advantage player 2");
			}
		}
		if(p1 > 3 || p2 > 3 ) {
			if(p1 > p2 + 1) {
				System.out.printf("game player 1");
				scoreFlag = 1;
			}
			if(p2 > p1 + 1) {
				System.out.printf("game player 2");
				scoreFlag = 1;
			}
		}
		
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
		return scoreFlag;
	}
}
