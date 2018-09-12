 import java.util.Scanner;
public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean running = true;
		Scanner scan= new Scanner(System.in);

	    //For string

	    int readed;

	    //System.out.println(text);

	    //for int
	    int a =0;
	    //int num= scan.nextInt();
	    
		TennisGame play = new TennisGame();
		while(running) {
			//a = Integer.parseInt(scan.nextLine());
			readed= scan.nextInt();
			System.out.println(readed);
		if (readed == 1) {
			play.p1s();
			System.out.println(play.getScore());
			
		}
		if (readed == 2) {
			play.p2s();
			System.out.println(play.getScore());
			
		}
		if (readed == 0) {
			running = false;
			System.out.println("Game end");
		}
		
		
		}
	}

}
