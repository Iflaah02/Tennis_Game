
public class Driver {

	public static void main(String[] args) {
		TennisGame play = new TennisGame();
		play.addPointPlayer(1);
		play.addPointPlayer(2);
		play.addPointPlayer(1);
		play.addPointPlayer(2);
		play.addPointPlayer(2);
		System.out.println(play.getScore());
	}

}
