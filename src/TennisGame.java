
public class TennisGame
{
//	private int p1;
//	private int p2;
//	private int scoreFlag;
	private long oneScore=0;	//9,223,372,036,854,775,807 rounds should be sufficient to figure out the winner. A potential down side to not using the flag is the fact the we have to use ~4 bytes of additional data (depends on implementation) to store the long.
	private long twoScore=0;
	public TennisGame()
	{
		// TO BE IMPLEMENTED
		//System.out.println("I am constructor");
		this.oneScore=0;
		this.twoScore=0;
	}

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
	}
// -------------------------------------------------------------------
	private String getScoreAmount (long value)
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
	public String getScore()
	{
	//System.out.println("I am method for displaying score");
	//See if we have a winner
	long difference = Math.abs(this.oneScore - this.twoScore);
	

	System.out.println("----------------------------------");
	System.out.println("difference: "+ difference);
//	System.out.println("one: "+ this.oneScore);
//	System.out.println("one: "+ this.twoScore);
	
	
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
		//Round is done. Let's reset the scores for the next round.
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
			if(difference<2)
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

		// TO BE IMPLEMENTED
		return "";
	}
}
