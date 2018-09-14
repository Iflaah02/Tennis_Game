import java.util.Scanner;

public class Driver {
 	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean running = true;
		Scanner scan= new Scanner(System.in);
 
 	    int readed;
	    int a =0;
		TennisGame play = new TennisGame();
		while(running) {
			readed= scan.nextInt();
			System.out.println(readed);
		if (readed == 1) {
			System.out.println(play.getScore());
			
		}
		if (readed == 2) {
			System.out.println(play.getScore());
			
		}
		if (readed == 0) {
			running = false;
			System.out.println("Game Ended");
		}
		
		
		}
	}
 }