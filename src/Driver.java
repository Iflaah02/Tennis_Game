
public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TennisGame play = new TennisGame();
		System.out.print(play.getScore()+"\n");
		while(true) {
			play.setScore(play.getp1score(),play.getp2score());
			System.out.println("\n"+play.getScore());
			if(play.getGameFlag() == 1) {
				break;
			}
		}
	}

}
