import java.io.Console;
import java.util.Scanner;

public class TennisGame {
	
	private int p1;
	private int p2;
	private int scoreFlag;
	//public Console console;
	
	public TennisGame() {
		// TO BE IMPLEMENTED
		System.out.println("I am constructor");
		
	}
	
	public void RunGame() {
		boolean gameIsOn = true;
		
		while(gameIsOn) {
			
			this.getInput();
		}
			
	}

	public String getScore() {
		System.out.println("I am method for displaying score");
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
	
	public int getInput() {
		Scanner reader = new Scanner(System.in);  // Reading from System.in
		System.out.println("Which player will win? ");
		int n = reader.nextInt();
		System.out.println("Player "+n+" won that one");
		return n;
		
	}
	
}
