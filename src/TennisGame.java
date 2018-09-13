
public class TennisGame {
	
	private int p1;
	private int p2;
	private int scoreFlag = 0;
	
	public TennisGame() {
		// TO BE IMPLEMENTED
		p1 = 0;
		p2 = 0;
		System.out.println("The game begins");
		
	}
	
	public void updateScore() {
		if(Math.random() < 0.5) {
			p1++;
		}else {
			p2++;
		}
	}

	public int flag() {
		return scoreFlag;
	}
	
	public String getScore() {
		System.out.println("The score is:");
		
		switch (p1) {  

			case 0:
					switch (p2) {
					case 0:
							return "0 - 0";
					case 1:
							return "0 - 15";
					case 2:
							return "0 - 30";
					case 3:
							return "0 - 40";
					case 4:
							scoreFlag = 1;
							return "game player2";	
					}
					break;
				
			case 1:
					switch (p2) {
					case 0:
							return "15 - 0";
					case 1:
							return "15 - 15";
					case 2:
							return "15 - 30";
					case 3:
							return "15 - 40";
					case 4:
							scoreFlag = 1;
							return "game player2";
					
					}
					break;
			
			case 2:
					switch (p2) {
					case 0:
						return "30 - 0";
					case 1:
						return "30 - 15";
					case 2:
						return "30 - 30";
					case 3:
						return "30 - 40";
					case 4:
						scoreFlag = 1;
						return "game player2";
			
					}
					break;
					
			case 3:
					switch (p2) {
					case 0:
						return "40 - 0";
					case 1:
						return "40 - 15";
					case 2:
						return "40 - 30";
					case 3:
						return "deuce";
					case 4:
						return "Advantage player2";
	
					}
					break;
					
			case 4:
					switch (p2) {
					case 0:
						scoreFlag = 1;
						return "game player1";
					case 1:
						scoreFlag = 1;
						return "game player1";
					case 2:
						scoreFlag = 1;
						return "game player1";
					case 3:
						scoreFlag = 1;
						return "game player1";
					case 4:
						return "deuce";
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
		return "virhe, ei pisteita";
	}
}
