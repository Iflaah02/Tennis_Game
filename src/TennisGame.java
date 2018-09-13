import java.util.Random;

public class TennisGame {
	
	private int p1;
	private int p2;
	private int actual1;
	private int actual2;
	private int scoreFlag;
	private boolean advantagePlayer1=false;
	private boolean advantagePlayer2=false;
	private boolean gameOver=false;
	
	public TennisGame() {
		// TO BE IMPLEMENTED
		System.out.println("I am constructor");
		
		
	}

	public String getScore() {
		String score=null;
		System.out.println("I am method for displaying score");
		Random randomTennis = new Random();
		System.out.println("I formated randomTennis");
		while(gameOver==false)
		{
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
				System.out.println("Game player 1. Player 1 wins in straight game");
				gameOver=true;
			}
			if(p1>4&&advantagePlayer1==false&&advantagePlayer2==false)
			{
				advantagePlayer1=true;
			}
			if(p1>4&&advantagePlayer1==false&&advantagePlayer2==true)
			{
				advantagePlayer2=false;
			}
			if(advantagePlayer1==true)
			{
				System.out.println("Game player 1. Player 1 wins with advantage");
				gameOver=true;
			}
			if(advantagePlayer2==true)
			{
				advantagePlayer2=false;
			}
			if(p1==4&&p2>2)
			{
				advantagePlayer1=true;
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
				System.out.println("Game player 2. Player 2 wins in straight game");
				gameOver=true;
			}
			if(p2>4&&advantagePlayer2==false&&advantagePlayer1==false)
			{
				advantagePlayer2=true;
			}
			if(p2>4&&advantagePlayer2==false&&advantagePlayer1==true)
			{
				advantagePlayer1=false;
			}
			if(advantagePlayer2==true)
			{
				System.out.println("Game player 2. Player 2 wins with advantage");
				gameOver=true;
			}
			if(advantagePlayer2==true)
			{
				advantagePlayer2=false;
			}
			if(p2==4&&p1>2)
			{
				advantagePlayer1=true;
			}
		}
		if(advantagePlayer2==false&&advantagePlayer1==false&&p2<5&&p1<5)
		{
			if(actual1==0&&actual2>0)
			{
				score=String.format("love -"+" %d", actual2);
			}
			if(actual2==0&&actual1>0)
			{
				score=String.format("%d -"+" love", actual1);
			}
			score=String.format("%d -"+" %d", actual1, actual2);
			System.out.println(score);
		}
		if(advantagePlayer2==false&&advantagePlayer1==false&&p2>2&&p1>2)
		{
			score="deuce";
			System.out.println(score);
		}
		if(advantagePlayer2==true&&advantagePlayer1==false&&p2>3&&p1>2)
		{
			score="advantage player2";
			System.out.println(score);
		}
		if(advantagePlayer2==false&&advantagePlayer1==true&&p2>2&&p1>3)
		{
			score="advantage player1";
			System.out.println(score);
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
		}
		return score;
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
