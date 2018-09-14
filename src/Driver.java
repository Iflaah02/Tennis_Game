import java.util.InputMismatchException;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner (System.in);
		int ip = 0;
		
		TennisGame play = new TennisGame();
		
		while (play.p1_getScoreFlag() != 4 && play.p2_getScoreFlag() != 4) {
			try {
				play.getScore();
				ip = reader.nextInt();
				reader.nextLine();
				play.gameLogic(ip);
			}
			catch (InputMismatchException e) {
				System.out.println("Use number 1 or 2");
				reader.nextLine();
				continue;
			}
		}
		reader.close();
	}

}
