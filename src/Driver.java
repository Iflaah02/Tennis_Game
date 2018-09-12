import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TennisGame play = new TennisGame();
		play.getScore();
		
		Scanner scanner = new Scanner(System.in); 
		
		while(play.getScoreFlag() == 0){
			System.out.println("Enter 1 for giving 'player 1' a point, enter 2 for giving 'player 2' a point");
			
			int player = scanner.nextInt();
			
			if(player == 1)
			{
				int newScore = play.getP1() + 1; 
				System.out.println("Player 1 scores");
				play.setP1(newScore);
			}
			else if(player == 2){
				int newScore = play.getP2() + 1; 
				System.out.println("Player 2 scores");
				play.setP2(newScore); 
			}
			else {
				System.out.println("Wrong input! Follow instructions.");
			}
			System.out.println(play.getScore()); 
		}
		
		play.getScore(); 
	}

}
