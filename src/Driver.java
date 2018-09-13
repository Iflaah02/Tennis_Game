import java.util.Scanner;

public class Driver{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TennisGame play = new TennisGame("John", "Simon");
		System.out.println("1 = John wins, 2 = Simon wins, q = quit");
		System.out.println(play.getScore());
		Scanner scanner = new Scanner(System.in);
	
	
		while(!play.game_over()){
			System.out.print("> ");
			String line = scanner.nextLine().trim();
			if(line.equals("1")){
				play.p1_wins_ball();
				System.out.println(play.getScore());
			}
			else if(line.equals("2")){
				play.p2_wins_ball();
				System.out.println(play.getScore());
			}
			else if(line.equals("q")){
				break;
			}
			else{
				System.out.println("Invalid command");
			}
		}
	}
}

