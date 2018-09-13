import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		TennisGame play = new TennisGame();
        
		System.out.println("Welcome to Tennis Score Calculator.");
		System.out.println("Commands: 1 = player1 win, 2 = player2 win, q = quit");
		System.out.println("Score is " + play.getScore());
        Scanner scanner = new Scanner(System.in);
		
		while (!play.gameHasEnded()) {
			System.out.print("> ");
            String line = scanner.nextLine().trim();
            
            if (line.equals("1")) {
                play.addWinForPlayer1();
                System.out.println("Score is " + play.getScore());
            } else if (line.equals("2")) {
                play.addWinForPlayer2();
                System.out.println("Score is " + play.getScore());
            } else if (line.equals("q")) {
                break;
            } else {
                System.out.println("Unknown command. Please try again.");
            }
		}
	}
}
