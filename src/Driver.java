import java.util.Random;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TennisGame play = new TennisGame();
		Random luku = new Random();
		int whowins;
		boolean gameover=false;
		
		
		System.out.println("\nThis is an example of a randomized tennis game (not match) between player 1 and player 2 as per request\n");

		int a = play.getP1();
		int b = play.getP2();
		
		do {
		whowins=luku.nextInt(2) + 1;
		if (whowins == 1) 
			{
			a++;
			play.setP1(a);
			}
		
		else {
			 b++;
			 play.setP2(b);
			 }
		if (a > 5 && b < 4) gameover=true;
		if (b < 5 && b < 4) gameover=true;
	
		
		play.getScore();
		}
		while (gameover == false);
		
		
			
	
		
		
	}

}
