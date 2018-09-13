import java.util.Random;

public class TennisGame {
	
	private int p1;
	private int p2;
	private int actual1;
	private int actual2;
	private int scoreFlag;
	
	public TennisGame() {
		// TO BE IMPLEMENTED
		System.out.println("I am constructor");
		
		
	}

	public String getScore() {
		System.out.println("I am method for displaying score");
		Random randomTennis = new Random();
		System.out.println("I formated randomTennis");
		int  n = randomTennis.nextInt(2) + 1;
		System.out.println("I generated n");
		if(n<2)
		{
			System.out.println("Player 1 got a point");
			p1=p1+1;
			if(p1==1)
			{
				setActual1(15);
			}
			if(p1==2)
			{
				setActual1(30);
			}
			if(p1==3)
			{
				setActual1(40);
			}
			if(p1==4&&p2<3)
			{
				System.out.println("Player 1 wins");
			}
		}
		else
		{
			p2=p2+1;
			System.out.println("Player 2 got a point");
			if(p2==1)
			{
				setActual2(15);
			}
			if(p2==2)
			{
				setActual2(30);
			}
			if(p2==3)
			{
				setActual2(40);
			}
			if(p2==4&&p1<3)
			{
				System.out.println("Player 2 wins");
			}
		}
		// Here is the format of the scores: "player1Score - player2Score"
		// "0 - 0"
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
		// "game player1"
		// "game player2"

		// TO BE IMPLEMENTED
		return "";
	}

	public int getActual1() {
		return actual1;
	}

	public void setActual1(int actual1) {
		this.actual1 = actual1;
	}

	public int getActual2() {
		return actual2;
	}

	public void setActual2(int actual2) {
		this.actual2 = actual2;
	}

	public int getScoreFlag() {
		return scoreFlag;
	}

	public void setScoreFlag(int scoreFlag) {
		this.scoreFlag = scoreFlag;
	}
}
