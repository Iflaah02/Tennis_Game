
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int finish = 0;
		int value=0;
		TennisGame play = new TennisGame();
		do {
			System.out.println("Enter 1 for Player one points ");
			System.out.println("Enter 2 for Player two points");
			value = input.nextInt();
			if (value == 1) {
				play.setP1(play.getP1() + 1);
			} else {
				
				play.setP2(play.getP2() + 1);
			}		
			finish=play.getScoreFlag();
			System.out.println(play.getScore());
			//do it
			
		} while (finish!=3);

	}

}
