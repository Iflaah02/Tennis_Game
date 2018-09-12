
public class Driver {
	static int MAX_GAMES = 20;

	public static void main(String[] args) {
		for (int i = 0; i < MAX_GAMES; i++) {
			System.out.println("\n----New Game----");
			TennisGame play = new TennisGame();
			play.playGame();
		}
	}

}
