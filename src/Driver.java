import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		TennisGame play = new TennisGame();

		Scanner input = new Scanner(System.in);

		String currentScore = play.getScore();

		do {
			System.out.println("Who scored?");
			System.out.println("1. Player 1?");
			System.out.println("2. Player 2?");
			System.out.print("> ");
			int value = input.nextInt();

			if(value == 1) {
				play.playerOneScore();
			} else if(value == 2) {
				play.playerTwoScores();
			}
			currentScore = play.getScore();
			System.out.println("Current score is " + currentScore);
		} while(!currentScore.startsWith("game"));



	}

}
