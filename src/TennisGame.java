import java.io.Console;
import java.util.Scanner;

public class TennisGame {
	
	private int p1;
	private int p2;
	private int scoreFlag;
	private int[] points = new int[] {0,15,30,40};
	public boolean gameIsOn = true;
	
	public TennisGame() {
		// TO BE IMPLEMENTED
		//System.out.println("I am constructor");
		
	}
	
	public void RunGame() {
		
		
		while(gameIsOn==true) {
			
		int playernro =	this.getInput();
		if (playernro == 1) { p1 += 1;}
		if (playernro == 2) { p2 += 1;}
		
		System.out.println(this.getScore());
		}
		
		String txt = new String ("\n\n The game has ended");
		System.out.println(txt);
		
			
	}

	public String getScore() {
		String txt = new String("-- Score -- ");
		txt += ("\n balls won player 1 : "+p1+" balls won player 2 : "+p2+"\n");
		
		
		if(p1 >= 4 &&  p2 < 3 ) {
			txt += ("\n\nPlayer 1 has won the game.");
			this.gameIsOn=false;
			}	
		
		if(p2 >= 4 &&  p1 < 3) {
			txt += ("\n\nPlayer 2 has won the game.");
			this.gameIsOn=false;
			}	
	
		if(p1 <= 3 && p2 <= 3) {
			txt += ("\n"+points[p1] + " - "+points[p2]);
			//txt += ("\n Player 2 :"+points[p2]);
		}
		
		if(p1 ==  p2 && p1 >= 4) {
			//only when both are over 5 balls found1
			if(p1 == p2) {
				txt += ("Deuce");
			}
		txt+=("\n getting exiting...");	
		}
		
		if(p1>2 && p2>2) {
			if(p1 == p2+1) {
				txt += ("\nPlayer 1 has the advantage");
			}
			
			if(p2 == p1+1) {
				txt += ("\nPlayer 2 has the advantage");
			}
			
			if(p1 == p2+2) {
				txt += ("\n Player 1 won the game");
				this.gameIsOn=false;
			}
			
			if(p2 == p1+2) {
				txt += ("\n Player 2 won the game");
				this.gameIsOn=false;
				
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
		return txt;
	}
	
	public int getInput() {
		Scanner reader = new Scanner(System.in);  // Reading from System.in
		System.out.println("\nWhich player will win this ball? ");
		int n = reader.nextInt();
		//System.out.println("Player "+n+" won that one!");
		return n;
		
	}
	
}
