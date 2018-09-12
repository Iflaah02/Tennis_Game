
public class TennisGame {
	
	private int p1;
	private int p2;
	private int scoreFlag;
	
	
	public TennisGame() {
		this.p1=0;
		this.p2=0;
		this.scoreFlag=0;
		System.out.println("I am constructor");
		
	}
	
	public void addPointPlayer(int player) {
		if(player == 1)
		{
			if(p1 == 3 && p2 < 3)
			scoreFlag = 16;	
			if(p1 < 3)
			{
				p1++;
			}
			
			if(scoreFlag == 3)
			{
				scoreFlag = 14;
			}
			else
			{
				if(scoreFlag == 14)
				scoreFlag=16;
				
			}
			if(scoreFlag == 15)
			scoreFlag = 3;
		}
		if(player == 2)
		{
			if(p2 == 3 && p1 < 3)
			scoreFlag = 17;
			if(p2 < 3)
			{
				p2++;
			}
			if(scoreFlag == 3)
			scoreFlag = 15;
			else 
			{
				if(scoreFlag == 15)
				scoreFlag=17;
			}
			if(scoreFlag == 14)
			scoreFlag = 3;
		}
		if(p1 == p2 && p1 == 3 && p2 == 3 && scoreFlag != 14 && scoreFlag != 15 && scoreFlag != 16 && scoreFlag != 17)
		scoreFlag = 3;
		if(scoreFlag == 16 || scoreFlag == 17)
		System.out.println("Game already finished, check the score! \n");
		
		/*else
		{
			System.out.println("Wrong player selected!!!\n");
		}*/
		
	}
	

	public String getScore() {
		System.out.println("I am method for displaying score: \n");
		String result = "Match not begun.";
		if(p1==0 && p2 == 0)
		result = "0-0 \n";
		if(p1==1 && p2 == 1)
		result = "15-15 \n";
		if(p1==2 && p2==2)
		result = "30-30 \n";
		if(scoreFlag == 3)
		result = "deuce \n";
		if(p1==1 && p2==0)
		result = "15 - 0 \n";
		if(p1==0 && p2==1)
		result = "0 - 15 \n";
		if(p1==2 && p2==0)
		result = "30 - 0 \n";
		if(p1==0 && p2==2)
		result = "0 - 30 \n";
		if(p1==3 && p2==0)
		result = "40 - 0 \n";
		if(p1==0 && p2==3)
		result = "0 - 40 \n";
		if(p1==2 && p2==1)
		result = "30 - 15 \n";
		if(p1==1 && p2==2)
		result = "15 - 30 \n";
		if(p1==3 && p2==1)
		result = "15 - 40 \n";
		if(p1==1 && p2==3)
		result = "15 - 40 \n";
		if(p1==3 && p2==2)
		result = "40 - 30";
		if(p1==2 && p2==3)
		result = "30 - 40";
		if(scoreFlag==3)
		result = "Deuce \n";
		if(scoreFlag==14)
		result = "Advantage player 1. \n";
		if(scoreFlag==15)
		result = "Advantage player 2. \n";
		if(scoreFlag==16)
		result = "Game player 1. \n";
		if(scoreFlag==17)
		result = "Game player 2. \n";
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
		// "advantage player1" 14
		// "advantage player2" 15
		// "game player1" 16
		// "game player2" 17

		// TO BE IMPLEMENTED
		return result;
	}
}
