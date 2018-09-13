import java.util.Scanner;
import java.util.InputMismatchException;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int ip = 0;
		
		TennisGame play = new TennisGame();
		System.out.println("Choose which player wins the point. 1 for player 1 and 2 for player 2");
		while(play.getScoreFlag() != 1) {
			try {
				play.getScore();
				ip = input.nextInt();
				input.nextLine();
				play.addScore(ip);
			}
			catch(InputMismatchException e) {
				System.out.println("An error occurred. Please use either int value 1 or 2");
				input.nextLine();
				continue;
			}
		}
		
		play.getScore();
		input.close();
	}
}
