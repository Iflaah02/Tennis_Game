
public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TennisGame play = new TennisGame();
		int i = 0;
		int j = 0;
		int k = 0;
		while (i < 4) {
			System.out.println("" +j +" - " +k);
			j = play.getScore();
			play.setp1(j);
			k = play.getScore();
			play.setp2(k);
			
			i++;
		}
	}
}


