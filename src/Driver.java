
public class Driver {

	public static void main(String[] args) {
		for (int i = 0; i <= 6; i++) {
			for (int j = 0; j <= 6; j++) {
				TennisGame play = new TennisGame(i, j);
				try {
					System.out.println("(p1: " + i + " p2: " + j + "): " + play.getScore());
				} catch (TennisGameException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
