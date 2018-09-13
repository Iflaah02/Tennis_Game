public class TennisGame
{
	private int oneScore=0;	//overflow is prevented in the "Score(...)" function
	private int twoScore=0;
	public TennisGame()
	{
		// TO BE IMPLEMENTED
		//System.out.println("I am constructor");
		this.oneScore=0;
		this.twoScore=0;
	}
/*
 * Function will score points for the specified player
 * 
 */
	public void Score(int whoScored)
	{
		if (whoScored == 1)
		{
			this.oneScore=this.oneScore+1;
		}
		else if (whoScored==2)
		{
			this.twoScore=this.twoScore+1;
		}
		else
		{
			System.out.println("WARNING: Incorrect input. You can only score for player \"1\" or  \"2\".");
		}
		
		//Overflow prevention for long matches:
		if(this.oneScore > 6 && this.twoScore>6)
		{
			//Subtract one from each
			this.oneScore=this.oneScore-1;
			this.twoScore=this.twoScore-1;
		}
	}
// -------------------------------------------------------------------
	/*
	 * getScoreAmount	 is a helper function. It transforms
	 * a long value between 0-3 into a tennis score 0-40 
	 */
	private String getScoreAmount (int value)
	{
		String returnVal="0";
		if(value==1)
			returnVal = "15";
		else if(value==2)
			returnVal = "30";
		else if(value==3)
			returnVal = "40";
	return(returnVal);
	}
// -------------------------------------------------------------------
	public void getScore()
	{
		//See if we have a winner
		int difference = Math.abs(this.oneScore - this.twoScore);	//How many points is one player leading by
		if(difference >= 2 && (this.oneScore >= 4 || this.twoScore >= 4))
		{
			if (this.oneScore > this.twoScore)
			{
				System.out.println("game Player 1");
			}
			else			
			{
				System.out.println("game Player 2");
			}
			System.out.println("-----------------------------------");
			//Round is done. Reset scores for the next round.
			this.oneScore=0;
			this.twoScore=0;
		}
		//No winners for the round. Let's show the score:
		else if (this.oneScore <=3 && this.twoScore <=3)
		{
			if(this.oneScore == 3 && this.twoScore==3)
				System.out.println("deuce");
			else
				System.out.println(this.getScoreAmount(this.oneScore)+" - " +this.getScoreAmount(this.twoScore));
		}
		//One player has advantage:
		else
		{
			if(difference<2 && difference > 0)
			{
				if(this.oneScore > this.twoScore)
				{
					System.out.println("advantage player1");
				}
				else
				{
					System.out.println("advantage player2");
				}
			}
			else
			{
				System.out.println("deuce");
			}
			
		}
		// Here is the format of the scores: "player1Score - player2Score"
		// "0 - 0"
		// "15 - 15"
		// "30 - 30"
		// "deuce"  (aka 40-40)
		// "15 - 0", "0 - 15"
		// "30 - 0", "0 - 30"
		// "40 - 0", "0 - 40"
		// "30 - 15", "15 - 30"
		// "40 - 15", "15 - 40"
		// "advantage player1"
		// "advantage player2"
		// "game player1"
		// "game player2"
	}
}
