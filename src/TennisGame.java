
public class TennisGame {

	private int p1;
	private int p2;

	public TennisGame(int p1, int p2) {
		this.p1 = p1;
		this.p2 = p2;
	}

	public String getScore() throws TennisGameException {
		// 0 to 3
		if (p1 <= 3 && p2 <= 3) {
			if (p1 == 3 && p2 == 3) {
				return "deuce";
			}
			return getScoreName(p1) + " - " + getScoreName(p2);
		}

		// deuce
		if (p1 == p2) {
			return "deuce";
		}

		// advantage
		// -1 advantage to player 2.
		int diff = p1 - p2;
		switch (diff) {
		case 1:
			return "advantage player1";
		case -1:
			return "advantage player2";
		}

		if (diff <= -2) {
			return "game player2";
		}
		if (diff >= 2) {
			return "game player1";
		}

		throw new TennisGameException();
	}

	private String getScoreName(int score) throws TennisGameException {
		switch (score) {
		case 0:
			return "0";
		case 1:
			return "15";
		case 2:
			return "30";
		case 3:
			return "40";
		default:
			throw new TennisGameException();
		}
	}
}
