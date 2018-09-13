import java.util.Random;

public class Driver {

	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TennisGame play = new TennisGame();
		Random luku = new Random();
		int whowins;
		int go=0; // gameover = go (should probably use boolean, but cant be bothered with longer text)
		
		
		System.out.println("\nThis is an example of a randomized tennis game (not match) between player 1 and player 2 as per request\n");

		int a = play.getP1();
		int b = play.getP2();
		
		do {
		whowins=luku.nextInt(2) + 1;
		
		
		if (whowins == 1) 
			{
			System.out.println("Player 1 wins the ball");
			if (b==4 && a==3) b--; // if player2 had the advantage, this should return the game to 40-40
			else a++;
			if (a - b > 1 && a>=4)  
				{
				go++;
				System.out.println("\nPlayer 1 wins the game\n");
				}
			}
		else 
			{
			System.out.println("Player 2 wins the ball");
			if (a==4 && b==3) a--; // if player1 had the advantage, it should return to 40-40
			else b++;
			if (b - a > 1 && b>=4) 
				{
				go++;
				System.out.println("\nPlayer 2 wins the game\n");
				}
			}
		play.setP1(a);
		play.setP2(b);
			
		
		
		
		if (go==0) play.getScore();		
		
		
		} while (go < 1);
		
		
			
	
		
		
	}

}
