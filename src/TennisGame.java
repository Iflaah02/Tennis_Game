
public class TennisGame {
	
	private int p1 = 0;
	private int p2 = 0;
	int piste = 15;
	private int scoreFlag = 4;
	
	public TennisGame() {
		// TO BE IMPLEMENTED
		System.out.println("I am constructor");
		
	}

	public String getScore() {
		System.out.println("I am method for displaying score");
		
		//for (int p1 = 0; < scoreFlag; p1++)
		int p1 = 0;
		int p2 = 0;
		int piste = 15;

		System.out.println (p1 + " - " + p2 );	
		
		int p1  = 0;
		int p2 = 0;	
		
		System.out.println (p1);
		 p1=+p1+piste;
		 p2=+p2+piste;
		
			System.out.println (p1 + " - " + p2 );	
				
			
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
