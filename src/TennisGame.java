import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TennisGame {

	private int p1;
	private int p2;
	private int scoreFlag;

	private int winner;

	public TennisGame() throws TennisGameException {
		// TO BE IMPLEMENTED
		System.out.println("I am constructor");

		// Initiate variables
		p1 = 0;
		p2 = 0;
		winner = 0;
		
		// Run the game
		game();
	}

	public void game() throws TennisGameException {
		Scanner scan = new Scanner(System.in); // for reading

		while (winner == 0) {
			System.out.print("Please enter winning player (1 or 2): ");
			int test = 0;
			try {
				test = scan.nextInt();
			} catch (InputMismatchException e) {
				e.printStackTrace();
				System.exit(1);
			}
			switch (test) {
			case 1:
				addP1Score();
				break;
			case 2:
				addP2Score();
				break;
			default:
				System.out.println("Something went wrong, try again!");
			}
			System.out.println("Score after this round: " + getScore());
		}
		//System.out.println("Game ended. Final score:");
		System.out.println("Game ended.");
		// Read player points
		scan.close();
	}

	private void addP1Score() {
		if (p1 == 3) {
			if (p2 == 3) {
				// Deuce
				if (scoreFlag == 1) {
					// Player one wins
					winner = 1;
				} else if (scoreFlag == 2){
					// No advantage
					scoreFlag = 0;
				} else {
					// P1 advantage
					scoreFlag = 1;
				}
			} else {
				// Player one wins
				winner = 1;
			}
		} else {
			p1++;
		}
	}

	private void addP2Score() {
		if (p2 == 3) {
			if (p1 == 3) {
				// Deuce
				if (scoreFlag == 2) {
					// Player two wins
					winner = 2;
				} else if (scoreFlag == 1) {
					// No advantage
					scoreFlag = 0;
				} else {
					// P2 advantage
					scoreFlag = 2;
				}
			} else {
				// Player two wins
				winner = 2;
			}
		} else {
			p2++;
		}
	}
	public String getScore() throws TennisGameException {
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

		if (winner != 0)
			return "game player" + winner;
		if (p1 == 3 && p2 == 3)
			if (scoreFlag == 0)
				return "deuce";
			else
				return "advantage player" + scoreFlag;

		// Non-text options
		String p1Score, p2Score, delim = " - ";
		switch(p1) {
		case 0:
			p1Score = "0";
			break;
		case 1:
			p1Score = "15";
			break;
		case 2: 
			p1Score = "30";
			break;
		case 3:
			p1Score = "40";
			break;
		default:
			throw new TennisGameException();
		}
		switch(p2) {
		case 0:
			p2Score = "0";
			break;
		case 1:
			p2Score = "15";
			break;
		case 2: 
			p2Score = "30";
			break;
		case 3:
			p2Score = "40";
			break;
		default:
			throw new TennisGameException();
		} //
		
		return p1Score + delim + p2Score;
	}
}
