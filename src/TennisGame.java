import java.util.Scanner;

public class TennisGame {
	
	private int p1;
	private int p2;
	private int p1Tennis;
	private int p2Tennis;
	private char oneLetter;
	private int scoreFlag;
	private boolean GameON;
	
	public TennisGame() {
		// TO BE IMPLEMENTED
		//System.out.println("I am constructor");
	}
	public String getScore() {
		
		//System.out.println("I am method for displaying score");
		p1 = 0;
		p2 = 0;
		GameON = true;
				
		System.out.println("Beggining of the GAME -> A = " +p1+ " vs B = "+p2);


		while (GameON) 
		{
			Scanner reader = new Scanner(System.in);  // Reading from System.in
			System.out.println("Enter a player that scores next: ");

			char oneLetter = reader.next().charAt(0);
			//reader.close();
			
			
			//assigning points to players
			if (oneLetter=='A' || oneLetter=='a') 
			{
				p1 += 1;
			} 
			
			else 
				
			{
				p2 += 1;
			} 
			
			//converting to Tennis score
			switch (p1) {
            case 1:  p1Tennis = 15;
                     break;
            case 2:  p1Tennis = 30;
            		break;
            case 3:  p1Tennis = 40;
                     break;
			}
			
			switch (p2) {
            case 1:  p2Tennis = 15;
                     break;
            case 2:  p2Tennis = 30;
            		break;
            case 3:  p2Tennis = 40;
                     break;
           
			}
			
			
			//deuce
			if (p1==p2)
			{
				System.out.println("Deuce");
			}
			
			//defining advantage
			if (p1>2 && p2>2) 
			{
				
				if (p1==p2+2){
					System.out.println("GAME -> A WIN");
					GameON = false;
				}
				else if (p2==p1+2){
					System.out.println("GAME -> B WIN");
					GameON = false;
				}
				
				else if (p1>p2) {
					System.out.println("GAME -> A = ADVANTAGE");
				}
				else if (p2>p1) {
					System.out.println("GAME -> B = ADVANTAGE");
				}
				
			}
			
			//without advantage
			else 
			{
				System.out.println("GAME -> A = " +p1Tennis+ " vs B = "+p2Tennis);
				
				if (p1==4 && p2<3){
					System.out.println("GAME -> A WIN");
					GameON = false;
				}
				else if (p2==4 && p1<3){
					System.out.println("GAME -> B WIN");
					GameON = false;
				}
				
				
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
