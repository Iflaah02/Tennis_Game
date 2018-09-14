
public class TennisGame {
	
	private int p1 = 0;
	private int p2 = 0;
	private int scoreFlag = 0;
	private int roundN;
	private int advantage = 0;
	private int end = 0;
	
	public TennisGame() {
		p1 = 0;
		p2 = 0;
		roundN = 0;
		System.out.println("The game begins" + "\n");
		while(scoreFlag == 0) {
			updateScore();
			if(end == 1) {
				System.out.println("After " + roundN + " rounds the score is:");
				if(end == 1) {
					System.out.println("game player1");
					scoreFlag = 1;
				}
				if(end == 2) {
					System.out.println("game player2");
					scoreFlag = 1;
				}
			}else {
				System.out.println(getScore() + "\n");
			}
		}	
	}
	
	public void updateScore() {
		
		if(Math.random() <= 0.5 && advantage != 1 && advantage != 2) {
			p1++;
		}else {
			p2++;
		}
		
		if(advantage == 1) {
			if(Math.random() <= 0.5) {
				p1++;
				end = 1;
			}else{
				advantage = 0;
				p1 = 4;
				p2 = 4;
			}	
		}
		
		if(advantage == 2) {
			if(Math.random() <= 0.5) {
				p1 = 4;
				p2 = 4;
				advantage = 0;
			}else{
				p2++;
				end = 2;
			}	
		}
		roundN++;
	}

	
	public String getScore() {
		if(roundN == 1) {
			System.out.println("After the first round the score is:");
		}else {
			System.out.println("After " + roundN + " rounds the score is:");
		}
		
		
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
					default: 
						scoreFlag = 1;
						return "game player2";
					}
				
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
					default: 
						scoreFlag = 1;
						return "game player2";
					
					}
			
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
					default: 
						scoreFlag = 1;
						return "game player2";
			
					}
					
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
						advantage = 2;
						return "Advantage player2";
					case 5:
						scoreFlag = 1;
						return "game player2";
					default: 
						scoreFlag = 1;
						return "game player2";
	
					}
					
			case 4:
					switch (p2) {
					case 0: case 1: case 2:
						scoreFlag = 1;
						return "game player1";
					case 3: 
						advantage = 1;
						return "Advantage player1";

					case 4:
						return "deuce";
					default: 
						scoreFlag = 1;
						return "game player2";
					}
			case 5:
					switch (p2) {
					case 1: case 2: case 3:
						scoreFlag = 1;
						return "game player1";
					case 4:
						advantage = 1;
						return "advantage player1";
					case 5: 
						p1 = 3;
						p2 = 3;
						return "deuce";
					}
		}
		return "Error";
	}
}
