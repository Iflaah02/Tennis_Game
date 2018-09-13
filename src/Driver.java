import java.util.Scanner;

public class Driver {

	private static TennisGame play;
	private static Scanner input = new Scanner(System.in);
	private static boolean driverRun = true;

	private static String MESSAGE_UNKNOWN_COMMAND = "Unknown command";

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		do {
			System.out.print("\nNew Game(N)  Quit(Q) > ");

			switch (input.nextLine().toLowerCase()){
				case "n":
					System.out.println("Default player names");
					play = new TennisGame();


					break;
				case "q":
					driverRun = false;
					break;
				default:
					System.out.println(MESSAGE_UNKNOWN_COMMAND);
					break;
			}
		}while (driverRun);
	}

}
