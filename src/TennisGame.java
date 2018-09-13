
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
		switch (p1) {
            case 0:  
					switch (p2) {
						case 0: System.out.println("0 - 0");
								break;
						case 1: System.out.println("0 - 15");
								break;
						case 2: System.out.println("0 - 30");
								break;
						case 3: System.out.println("0 - 40");
								break;
						case 4: System.out.println("player2 win the game");
								break;
						default: System.out.println("player2 invalid score");
								break;
					}
					break;
            case 1:  
					switch (p2) {
						case 0: System.out.println("15 - 0");
								break;
						case 1: System.out.println("15 - 15");
								break;
						case 2: System.out.println("15 - 30");
								break;
						case 3: System.out.println("15 - 40");
								break;
						case 4: System.out.println("player2 win the game");
								break;
						default: System.out.println("player2 invalid score");
								break;
					}
					break;
            case 2:  
					switch (p2) {
						case 0: System.out.println("30 - 0");
								break;
						case 1: System.out.println("30 - 15");
								break;
						case 2: System.out.println("30 - 30");
								break;
						case 3: System.out.println("30 - 40");
								break;
						case 4: System.out.println("player2 win the game");
								break;
						default: System.out.println("player2 invalid score");
								break;
					}
					break;
            case 3:  
					switch (p2) {
						case 0: System.out.println("40 - 0");
								break;
						case 1: System.out.println("40 - 15");
								break;
						case 2: System.out.println("40 - 30");
								break;
						case 3: System.out.println("deuce");
								break;
						case 4: System.out.println("advantage player2");
								break;
						case 5: System.out.println("player2 win the game");
								break;
						default: System.out.println("player2 invalid score");
								break;
					}
					break;
            case 4:  
					switch (p2) {
						case 0: System.out.println("player1 win the game");
								break;
						case 1: System.out.println("player1 win the game");
								break;
						case 2: System.out.println("player1 win the game");
								break;
						case 3: System.out.println("advantage player1");
								break;
						case 4: System.out.println("deuce");
								p1--;
								p2--;
								break;
						default: System.out.println("player2 invalid score");
								break;
					}
					break;
            case 5:  
					switch (p2) {
						case 3: System.out.println("player1 win the game");
								break;
						default: System.out.println("player2 invalid score");
								break;
					}
					break;
            default: System.out.println("player1 invalid score");
                     break;
		}			 

		return "";
	}
	
}
