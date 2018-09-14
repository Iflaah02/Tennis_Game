import java.util.Random;

/**
 * class TennisGame
 * The business logic for the Tennis Game.
 * Executed at the start of the game.
 *
 * private Random seed - The seed for the Random function
 * private ScoreEnumeration p1 - The player 1 score
 * private ScoreEnumeration p2 - The player 2 score
 * private boolean isGameInProgress - Has the winner been decided
 *
 */
class TennisGame {

	private Random seed = new Random();
	private ScoreEnumeration p1;
	private ScoreEnumeration p2;
	private boolean isGameInProgress;

	/**
	 * public TennisGame
	 * The constructor class for initializing the game.
	 */
	TennisGame() {
		System.out.println("Fetching rackets, shaking hands...");
		this.p1 = ScoreEnumeration.LOVE;
		this.p2 = ScoreEnumeration.LOVE;
		this.isGameInProgress = true;
		System.out.println("Play ball!");
	}

	/**
	 * void playTennis
	 * Plays the actual tennis game.
	 * While the game is in progress, calculates the current score and prints it.
	 * Thanks the player for playing upon either P1 or P2 winning.
	 */
	void playTennis() {
		while(isGameInProgress){
			System.out.println(announceScore());
		}
		System.out.println("Good Game! Thank you for playing!");
	}

	/**
	 * String announceScore
	 * Calculates and announces the score of the played round.
	 * @return The score of the round as a string
	 */
	private String announceScore() {

		// Make a record of the previous round
		ScoreEnumeration p1PrevScore = p1;
		ScoreEnumeration p2PrevScore = p2;

		// Get random round winner
		boolean p1WonRound = seed.nextBoolean();
		// Add to player score
		if (p1WonRound) {
			p1 = addToPlayerScore(p1);
		} else {
			p2 = addToPlayerScore(p2);
		}

		//Check if P1 won
		if (p1WonRound && p1 == ScoreEnumeration.ADVANCE) {
			if (p2.getScoreInt() < 40) {
				isGameInProgress = false;
				return "Game Player One!";
			}
			if (p2 == ScoreEnumeration.FORTY && p1PrevScore == ScoreEnumeration.ADVANCE) {
				isGameInProgress = false;
				return "Game Player One!";
			}
			if (p2 == ScoreEnumeration.ADVANCE) {
				p2 = ScoreEnumeration.FORTY;
				return "Advantage Player One!";
			}
			if (p2 == ScoreEnumeration.FORTY) {
				return "Advantage Player One!";
			}
		}

		// Check if P2 won
		if (!p1WonRound && p2 == ScoreEnumeration.ADVANCE) {
			if (p1.getScoreInt() < 40) {
				isGameInProgress = false;
				return "Game Player Two!";
			}
			if (p1 == ScoreEnumeration.FORTY && p2PrevScore == ScoreEnumeration.ADVANCE) {
				isGameInProgress = false;
				return "Game Player Two!";
			}
			if (p1 == ScoreEnumeration.ADVANCE) {
				p1 = ScoreEnumeration.FORTY;
				return "Advantage Player Two!";
			}
			if (p1 == ScoreEnumeration.FORTY) {
				return "Advantage Player Two!";
			}
		}

		// Check for Tie
		if (tie()) {
			if (p1 == ScoreEnumeration.FORTY) {
				return "Deuce";
			} else {
				return p1.getScoreText() + " - All";
			}
		}

		return p1.getScoreText() + " - " + p2.getScoreText();
	}

	/**
	 * ScoreEnumeration addToPlayerScore
	 * Adds a point to the winning player's score.
	 *
	 * @param winningPlayer - The player who is getting their score raised
	 * @return The score of the winning player
	 */
	private ScoreEnumeration addToPlayerScore(ScoreEnumeration winningPlayer) {
		switch (winningPlayer) {
			case LOVE:
				return ScoreEnumeration.FIFTEEN;
			case FIFTEEN:
				return ScoreEnumeration.THIRTY;
			case THIRTY:
				return ScoreEnumeration.FORTY;
			case FORTY:
				return ScoreEnumeration.ADVANCE;
			case ADVANCE:
				return ScoreEnumeration.ADVANCE;
			default:
				return winningPlayer;
		}
	}

	/**
	 * private boolean tie
	 * Checks the player score for a tie.
	 * @return True/False depending on if the score is even or not.
	 */
	private boolean tie(){
		return p1.getScoreInt() == p2.getScoreInt();
	}

}
