import java.util.InputMismatchException;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		TennisGame play = new TennisGame();
		Scanner reader = new Scanner(System.in);
		int input = 0;
		while((!play.getScore().equals("game player1")) || (play.getScore().equals("game player2"))) {
			System.out.println("Who wins this round? Input 1 for player 1 and 2 for player 2 >");
			try {
				input = reader.nextInt();
				if((input == 1) || (input == 2)) {
					play.winRoundForPlayer(input);
				}else {
					System.out.println("Not a valid player number!");
				}
			}catch(InputMismatchException ime) {
				System.out.println("Not a number!");
				reader.nextLine();
			}
			System.out.println("Results after this round: " + play.getScore());
		}
		System.out.println("Game finished.");
		reader.close();
	}
}
