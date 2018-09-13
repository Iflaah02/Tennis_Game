import java.util.Scanner;

public class Driver {

	private static TennisGame play;
	private static Scanner input = new Scanner(System.in);
	private static boolean driverRun = true;

	private static String MESSAGE_UNKNOWN_COMMAND = "Unknown command";
	private static String MESSAGE_TRY_AGAIN = "Please try again.";

	public static void main(String[] args) {

		do {
			System.out.print("\nNew Game(N)  Quit(Q) > ");

			switch (input.nextLine().toLowerCase()){
				case "n":
					play = new TennisGame();
					gameOn();
					input.nextLine();
					break;
				case "q":
					driverRun = false;
					break;
				default:
					System.out.println(MESSAGE_UNKNOWN_COMMAND);
					System.out.println(MESSAGE_TRY_AGAIN);
					break;
			}
		}while (driverRun);
	}

	private static void gameOn (){

		boolean win;

		play.getScore();

		do {
			System.out.println("Which wins the set, player1(1) or player2(2)?");
			play.update(checkInput());

			win = play.getScore();

		}while (!win);


	}

	private static int checkInput (){

		String MESSAGE_ENTER_1_OR_2 = "Please enter either 1 or 2";
		int player;

		while (true) {
			try {

				player = Integer.parseInt(input.next());

				if (player == 1 || player == 2) {
					return player;
				}

				System.out.println(MESSAGE_UNKNOWN_COMMAND);
				System.out.println(MESSAGE_ENTER_1_OR_2);

			} catch (NumberFormatException ignore) {
				System.out.println(MESSAGE_UNKNOWN_COMMAND);
				System.out.println(MESSAGE_ENTER_1_OR_2);
			}// try

		}//while loop



	}

}
