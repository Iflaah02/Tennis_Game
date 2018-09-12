
public class TennisGame {

	private int p1 = 0;
	private int p2 = 0;
	private boolean gameOver = false;

	public TennisGame() {

	}

	public void playGame() {
		writeScore();
		System.out.println();
		while (!gameOver) {
			if (Math.random() > 0.49) {
				System.out.println("Player1 scored");
				p1 += 1;
			} else {
				System.out.println("Player2 scored");
				p2 += 1;
			}
			if(p2 == p1 && p1 == 3)
			{
				p1 = 0;p2 =0;
			}
			System.out.println(getScore());
		}
	}

	private String writtenScore(int playerScore) {
		if (playerScore == 0)
			return "love";
		if (playerScore == 3)
			return "fourty";
		switch (playerScore % 4) {
		case 1:
			return "fifteen";
		case 2:
			return "thirty";
		case 3:
			return "fourty";
		}
		return "";
	}

	private void writeScore() {
		System.out.print(new StringBuilder().append(writtenScore(p1)).append("-").append(writtenScore(p2))
				.append("    ").toString());
	}

	private boolean isGameOver()
	{
		if(p1 >=3 && Math.abs(p1-p2) >= 2) return true;
		if(p2 >=3 && Math.abs(p2-p1) >= 2) return true;
		return false;
	}
	public String getScore() {
		gameOver = isGameOver();
		if(gameOver) return "game player" + (p1 > p2 ? "1" : "2");
		writeScore();
		int score = p1-p2;
		if(score == 0) return "deuce";
		if(score < 0 && Math.abs(score) <= 2) return "advantage player 2";
		if(score > 0 && Math.abs(score) <= 2) return "advantage player 1";
		return "";
		
	}
}
