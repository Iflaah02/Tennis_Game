import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TennisGame play = new TennisGame();
        Random random = new Random();

		while (!play.isSetOver()) {
		    play.setScore(random.nextInt(2) + 1);
		    System.out.println(play.getScore());

            try {
                TimeUnit.MILLISECONDS.sleep(250);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println(play.getSetDetails());
	}

}
