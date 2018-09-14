
/**
 * public class Driver
 * The main class for the Tennis Game. Calls the main function on run.
 */
public class Driver {

	/**
	 * public static void main
	 * The main class for playing the tennis game.
	 *
	 * First calls the TennisGame constructor.
	 * Then calls the score for the game.
	 *
	 * @param args - The cmd line arguments
	 */
	public static void main(String[] args) {
		TennisGame play = new TennisGame();
		play.playTennis();
	}

}
