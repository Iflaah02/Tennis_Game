
public class Driver {

	public static void main(String[] args) {
		TennisGame play = new TennisGame();
		
		play.setPlayerOneScore(1);
		System.out.println(play.getScore());
		
		play.setPlayerTwoScore(1);
		System.out.println(play.getScore());
		
		play.setPlayerTwoScore(2);
		System.out.println(play.getScore());
		
		play.setPlayerOneScore(2);
		System.out.println(play.getScore());
		
		play.setPlayerTwoScore(3);
		System.out.println(play.getScore());
		
		play.setPlayerOneScore(3);
		System.out.println(play.getScore());
		
		play.setPlayerTwoScore(4);
		System.out.println(play.getScore());
		
		play.setPlayerTwoScore(5);
		System.out.println(play.getScore());
	}

}
