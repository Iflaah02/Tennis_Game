
public class TennisGame {
	
	private int p1, p2;
	private String player1="p1", player2="p2";
	private String playerAdvantage;
	private int scoreFlag;
	
	public TennisGame() {
		//p1=0; p2=0;

		System.out.println("");
		
	}

	public boolean getScore() {
		System.out.println("I am method for displaying score");

		if (p1==0 && p2==0) {
			System.out.println("love");
		} else if ((p1>0 || p2>0) && !(p1==40 && p2==40) && (p1<=40 || p2<=40)) {
			System.out.println(p1 +  " - " + p2);
		}else if (p1==40 && p2==40) {
			System.out.println("deuce");
		}else if ((p1==40 && p2==41) || (p1==41 && p2==40)) {
			System.out.println("advantage " + playerAdvantage);
		}else
			System.out.println(playerAdvantage + " wins");

		// Here is the format of the scores: "player1Score - player2Score"
		// "0 - 0" "love"
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
		// "win player1"
		// "win player2"

		// TO BE IMPLEMENTED
		return true;
	}
}
