
public class Driver {

	public static void main(String[] args) {
		TennisGame play = new TennisGame();
		System.out.println(play.getScore());
		
		while (!play.gameHasEnded()) {
			play.playSingleRandomMatch();
			System.out.println(play.getScore());
		}
	}
}
