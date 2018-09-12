import java.util.Random;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rng = new Random();
		Scanner reader = new Scanner(System.in);
		TennisGame play = new TennisGame();
		int n = 0;
		
		while(!play.getGameEnded()){
		
			System.out.println(play.getScore(rng.nextInt(2)+1));
			try {
			Thread.sleep(1000);
			}catch(InterruptedException ie) {
				
			}
		}
		
		play.restartGame();
		
		while(!play.getGameEnded()) {
			
			System.out.print("Choose player to score (1 or 2) > ");
			n = reader.nextInt();
			if(n == 1 || n == 2) {
				System.out.println(play.getScore(n));
			}else {
				System.out.println("Invalid input!");
			}
		}
	}
}
