public class Driver
{
	public static void main(String[] args)
	{
		//Hard-coding was selected to make it easy to show that each situation can be satisfied.
		//Player 2 wins easily
		TennisGame play = new TennisGame();
		play.getScore();
		play.Score(1);			//Player 1 scores
		play.getScore();
		play.Score(2);			//Player 2 scores
		play.Score(3);			//Test the functoin with incorrect input. There is no player 3.
		play.getScore();
		play.Score(2);
		play.getScore();
		play.Score(2);
		play.getScore();
		play.Score(2);
		play.getScore();		
		
		//Next round---------------------------------
		play.Score(1);
		play.getScore();
		play.Score(2);
		play.getScore();
		play.Score(1);
		play.getScore();
		play.Score(2);
		play.getScore();
		play.Score(1);
		play.getScore();
		play.Score(2);
		play.getScore();	//Deuce 40 - 40
		play.Score(2);
		play.getScore();	//Advantage player 2
		play.Score(2);
		play.getScore();	//game player 2

		//player 1 wins after a long round --------------------------
		int i=0;
		do
		{
			play.Score(1);
			play.getScore();
			play.Score(2);
			play.getScore();
			i++;
		}while(i<8);
		play.Score(1);
		play.getScore();
		play.Score(1);
		play.getScore();
	}
}
