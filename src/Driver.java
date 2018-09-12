import java.util.Random;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TennisGame play = new TennisGame();
		
		int result;
		int gameOver = 0;
		
		Random rand = new Random();
		
		while(gameOver == 0) {
			
			result = rand.nextInt(2) + 1;
			
			gameOver = play.getScore(result);
			System.out.printf("\n");
			
		}
	}

}
