
public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TennisGame play = new TennisGame();
		
		play.playerBTurn(1);
		System.out.println(play.getScore());
		
		play.playerATurn(1);
		System.out.println(play.getScore());
		
		play.playerBTurn(2);
		System.out.println(play.getScore());
		
		play.playerBTurn(3);
		System.out.println(play.getScore());
		
		play.playerATurn(2);
		System.out.println(play.getScore());
		
		play.playerATurn(3);
		System.out.println(play.getScore());
		
		play.playerATurn(4);
		System.out.println(play.getScore());
		
		play.playerBTurn(4);
		System.out.println(play.getScore());
		
		play.playerATurn(5);
		System.out.println(play.getScore());
		
		play.playerATurn(6);
		System.out.println(play.getScore());
	}

}
