
public class TennisGame {
	
	private int player1Points = 0;
	private int player2Points = 0;
		
	public TennisGame() {
		
	}

	public void increasePlayer1Points() {
		player1Points++;
	}
	
	public void increasePlayer2Points() {
		player2Points++;
	}
	
	private String calculateScore(int points) {
		String scoreString = "0";
		switch (points) {
		case 0:
			scoreString = "0";
			break;
		case 1: 
			scoreString = "15";
			break;
		case 2:
			scoreString = "30";
			break;
		case 3:
			scoreString = "40";
			break;
		}
		
		return scoreString;
	}
	
	public String getScore() {
				
		if (player1Points == player2Points && player1Points >= 3) {
			System.out.println("deuce");
			return "";
		}
			
		
		if (player1Points >= 3 && player2Points >= 3) {
			if (player1Points == (player2Points + 1)) {
				System.out.println("advantage player1");
				return "";
			}
			
			if (player2Points == (player1Points + 1)) {
				System.out.println("advantage player2");
				return "";
			}
			
			if (player1Points == (player2Points + 2)) {
				System.out.println("game player1");
				return "";
			}
			
			if (player2Points == (player1Points + 2)) {
				System.out.println("game player2");
				return "";
			}

		}
		
		if (player1Points == 4) {
			System.out.println("game player1");
			return "";
		}
		
		if (player2Points == 4) {
			System.out.println("game player2");
			return "";
		}
		
		System.out.print(calculateScore(player1Points));
		System.out.print(" - ");
		System.out.println(calculateScore(player2Points));
		
		return "";
	}
}
