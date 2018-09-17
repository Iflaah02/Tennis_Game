public class TennisGame {

	private int p1;
	private int p2;
	private int scoreFlag = 0;

	public TennisGame() {
		p1 = 0;
		p2 = 0;
		System.out.println("1 = player1 scores");
		System.out.println("2 = player2 scores");
	}

	public String selostus() {
		if (scoreFlag == 1) {
			resetti();
			scoreFlag = 0;
		}
		if (tilanneDeuce()) {
			return "deuce";
		}
		if (keulii()) {
			return "advantage " + johdossaOleva();
		}
		if (peliRatkesi()) {
			scoreFlag = 1;
			return "game " + johdossaOleva();
		}
		return tilanneKaannos(p1) + " - " + tilanneKaannos(p2);
	}

	public void ekallePojo() {
		p1++;
	}

	public void tokallePojo() {
		p2++;
	}

	private String tilanneKaannos(int score) {
		switch (score) {
		case 3:
			return "40";
		case 2:
			return "30";
		case 1:
			return "15";
		case 0:
			return "Love";
		}
		return null;
	}

	private String johdossaOleva() {
		if (p1 > p2) {
			return "player1";
		} else {
			return "player2";
		}
	}

	private boolean tilanneDeuce() {
		return p1 >= 3 && p2 == p1;
	}

	private boolean keulii() {
		if (p2 >= 4 && p2 == p1 + 1)
			return true;
		if (p1 >= 4 && p1 == p2 + 1)
			return true;
		return false;
	}

	private boolean peliRatkesi() {
		if (p2 >= 4 && p2 >= p1 + 2)
			return true;
		if (p1 >= 4 && p1 >= p2 + 2)
			return true;
		return false;
	}

	public void resetti() {
		p1 = 0;
		p2 = 0;
	}
}
