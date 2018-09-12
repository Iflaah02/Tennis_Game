import java.util.Random;

//Solution to assignment 1 of SQaT lab#1, Frogell Sami 1866421, Dalzedur@gmail.com

public class TennisGame {
	
	private int p1;
	private int p2;
	private int difference;
	private String score;
	private int round;
	
	public TennisGame() 
	{
	 round = 0;		 
//plays until either player has 4 score and difference is at least 2
		while( ((p1 < 4 || p2 < 4)) || difference < 2  
             )
		{ 
		 //a bit kludge, but hey, it works!	
		 if(score == "Player one wins!" || score == "Player two wins!")
		 break;
		 round++;
		 System.out.println("---\nRound "+round);
		 Random ran = new Random();
		 int x = ran.nextInt(2);
		 
         if(x == 0)
         {
          p1++;
          System.out.println("Player one scores.");
         }
         else
         {
          p2++;
          System.out.println("Player two scores.");
         }

         if(p1 > p2)
             difference = p1-p2;
             else
             difference = p2-p1;         
         
         //System.out.println("Debug: P1:"+p1+",P2:"+p2+", Difference is "+difference);
         getScore();
		}
		//System.out.println("I am constructor");
		
	}

	public String getScore() 
	{
	 //System.out.println("Debug: getScore");	
	 score = "";
	 switch(p1)
	 {
	 case 0:
	 score += "love";
	 break;
	 case 1:
	 score += "fifteen";
	 break;
	 case 2:
	 score += "thirty";
	 break;
	 case 3:
	 score += "forty";		 
	 break;
	 default:
	 //score += "P1 Advantage";		 
	 break;
	 }
	 
	 score += " | ";
	 
	 switch(p2)
	 {
	 case 0:
	 score += "love";
	 break;
	 case 1:
	 score += "fifteen";
	 break;
	 case 2:
	 score += "thirty";
	 break;
	 case 3:
	 score += "forty";		 
	 break;
	 default:
	 //score += "P2 Advantage";		 
	 break;
	 }
	 
	 if(p1 > 2 && p2 > 2 && p1 == p2)
	 score = "Deuce";
	 
	 if( (p1 > 2 && p2 > 2) && p1 != p2 )
	 {
	  if(p1 > p2)
	  score = "Player one advantage";
	  else
	  score = "Player two advantage";
	 }
     
     if(p1 > p2 && (p1 > 3 && difference > 1) )
     {
      score = "Player one wins!";	 
     }
     else if(p2 > p1 && (p2 > 3 && difference > 1) )
     {
      score = "Player two wins!";	 
     }
	 
     System.out.println("Round "+round+" result: "+score);
	 
		//System.out.println("I am method for displaying score");
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
		return score;
	}
}
