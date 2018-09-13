import java.util.Scanner;

public class TennisGame {
	
	private int p1;
	private int p2;
	private char oneLetter;
	private int scoreFlag;
	private boolean GameON;
	
	public TennisGame() {
		// TO BE IMPLEMENTED
		System.out.println("I am constructor");
		
	}

	public String getScore() {
		
		System.out.println("I am method for displaying score");
		p1 = 0;
		p2 = 0;
		GameON = true;
		
		System.out.println("Beggining of the GAME -> A = " +p1+ " vs B = "+p2);


		while (GameON = true) 
		{
			Scanner reader = new Scanner(System.in);  // Reading from System.in
			System.out.println("Enter a player that scores next: ");

			Scanner in = new Scanner (System.in);
			char oneLetter = reader.next().charAt(0);
			reader.close();
			
			if (oneLetter!='A') 
			{
				p1 += 15;
				System.out.println("GAME 1 -> A = " +p1+ " vs B = "+p2);
			} 
			
			if (oneLetter!='B') 
			{
				p2 += 15;
				System.out.println("GAME 2 -> A = " +p1+ " vs B = "+p2);
			} 
			
			//GameON = false;
			
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
