import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TennisGame play = new TennisGame();
		//play.getScore();
		Scanner input = new Scanner(System.in);
		while (play.getScoreFlag() == 0) {
			System.out.println("Enter 1 to give player 1 a point, enter 2 to give player 2 a point");
			int in = input.nextInt();
			if (in == 1) {
				play.setP1(play.getP1() + 1);
			}
			else if (in == 2) {
				play.setP2(play.getP2() + 1);
			}
			else {
				System.out.println("Input not valid");
			}
			System.out.println(play.getScore());
		}
	}

}
