
import java.util.Scanner;


public class TennisGame {
	
	private int p1 = 0;
	private int p2 = 0;
	private int scoreFlag = 0;
	private static Scanner scan = new Scanner(System.in);
	
	public TennisGame() {
		
		System.out.println("This is a Tennis Game simulator");
		System.out.println("Choose the player who gets the game point");
		System.out.println("After each point you'll see the current score and pick the next point's winner");
		System.out.println("Pick the point winner by pressing '1' for player1 or '2' for player2");	
				
		
	}
	public String getScore() {
		
		
		int i = 0; //this value is used for the loop and to express the lower scores
		
				
		
		while (i<50){
			
			System.out.println("Next point goes to: '1' for player1, '2' for player2: ");
			scoreFlag = scan.nextInt();//reads the input to scoreflag
							
			
			while (scoreFlag != 1 && scoreFlag != 2) //value given is not 1 or 2
			{
				System.out.println("Given value must to be '1' or '2'");
				scoreFlag = scan.nextInt();
			}
						
			
			
			if (scoreFlag==1) {
				p1++;
				i=i+10; //all the points going to player1 increases the value of i with 10
				}
				else 
				{
				p2++;
				i=i+1; //all the points going to player2 increases the value of i with 1
				}
			
			
			if (p1 >= 3 && p1==p2) {//game is even (40-40 or more)
				System.out.println("Deuce");
				i=40; //keeps the game going				
			}
			else if (p1 > 3 || p2 > 3) {//one or both have more than 40 points
				
				if (Math.abs(p2-p1) >= 2) {// one is leading with 2 points --> game over
					if (p1 > p2) {
						System.out.println("Game player1");
						i=50; //ends the game
					}
					else {
						System.out.println("Game player2");	
						i=50; //ends the game
					}		
				}
				else if (p1 > p2) {
					System.out.println("Advantage player1");
					i=40; //keeps the game going
				}
				else {
					System.out.println("Advantage player2");
					i=40; //keeps the game going					
				}
			}
			
			//in variable i the number of ones tells the current score of player2 
			//and number of tens current score of player1			
			switch(i){
			case 1: System.out.println("Love - Fifteen");
				break;
			case 2: System.out.println("Love - Thirty");
				break;
			case 3: System.out.println("Love - Forty");
				break;
			case 10: System.out.println("Fifteen - Love");
				break;
			case 11: System.out.println("Fifteen - Fifteen");
				break;
			case 12: System.out.println("Fifteen - Thirty");
				break;
			case 13: System.out.println("Fifteen - Forty");
				break;
			case 20: System.out.println("Thirty - Love");
				break;
			case 21: System.out.println("Thirty - Fifteen");
				break;
			case 22: System.out.println("Thirty - Thirty");
				break;
			case 23: System.out.println("Thirty - Forty");
				break;
			case 30: System.out.println("Forty - Love");
				break;
			case 31: System.out.println("Forty - Fifteen");
				break;
			case 32: System.out.println("Forty - Thirty");
				break;
			

			}
			
			
			
		}
		
		
		return "";
	}
}
