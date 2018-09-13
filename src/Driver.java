import java.util.Random;

public class Driver {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TennisGame play = new TennisGame();
		
		//variable for random number, which will be either 1 or 2
		int point = 0;
		
		//I use random for 'game engine'
		//java.util.Random is needed for this
		Random rand = new Random();
		while (!play.gameEnd()){
			point = rand.nextInt(2)+1;
			if (point == 1)
				play.pointP1();
			else
				play.pointP2();
			
			//let's print out the score after each point and we'll know
			//whether this game works or not
			System.out.println(play.getScore());
			
			if (play.gameEnd())
				System.out.println("Game over man, game over");
		
		}
	}

}
