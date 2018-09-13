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
		Random rand = new Random();
		int  n = rand.nextInt(2) + 1;
		if(n<2)
		{
			p1=p1+1;
			if(p1==1)
			{
				actual1=15;
			}
			if(p2==2)
			{
				actual1=30;
			}
			if(p2==3)
			{
				actual1=40;
			}
		}
		else
		{
			p2=p2+1;
			if(p2==1)
			{
				actual2=15;
			}
			if(p2==2)
			{
				actual2=30;
			}
			if(p2==3)
			{
				actual2=40;
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
}
