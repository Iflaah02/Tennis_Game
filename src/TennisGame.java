import java.util.ArrayList;
import java.util.Collections;


public class TennisGame {
	
	private int p1 = 0;
	private int p2 = 0;
	private int winner = 0;
	private boolean gamePlayed = false;
	private boolean gameStarted = false;
		
	public void playTennis() {

	if (p1==0 && p2==0 && !gameStarted)	getScore();
	else {
			do {
				ArrayList<Integer> numbers = new ArrayList<Integer>();
				numbers.add(1);
				numbers.add(2);
				Collections.shuffle(numbers);
				winner = numbers.get(0);
				
				if (winner == 1) {
					p1++;
					System.out.println("Ball winner is: player" + winner);
					getScore();

				}
				if (winner == 2) {
					p2++;
					System.out.println("Ball winner is: player" + winner);
					getScore();

				} 
			} while (!gamePlayed); 
		}
	}
	
	public boolean getScore() {
		
			while (!gamePlayed) {
				if (p1 == 0 && p2 == 0) {
					System.out.println("0 - 0");
					gameStarted=true;
					playTennis();
				}
				if (p1 == 1 && p2 == 1) {
					System.out.println("15 - 15");
					playTennis();
				}
				if (p1 == 2 && p2 == 2) {
					System.out.println("30 - 30");
					playTennis();
				}
				if (p1 == 1 && p2 == 0) {
					System.out.println("15 - 0");
					playTennis();
				}
				if (p1 == 0 && p2 == 1) {
					System.out.println("0 - 15");
					playTennis();
				}
				if (p1 == 2 && p2 == 0) {
					System.out.println("30 - 0");
					playTennis();
				}
				if (p1 == 0 && p2 == 2) {
					System.out.println("0 - 30");
					playTennis();
				}
				if (p1 == 3 && p2 == 0) {
					System.out.println("40 - 0");
					System.out.println("Game player1");
					gamePlayed=true;
					p1=0;
					p2=0;
					break;
				}
				if (p1 == 0 && p2 == 3) {
					System.out.println("0 - 40");
					System.out.println("Game player2");
					gamePlayed=true;
					p1=0;
					p2=0;
					break;
				}
				if (p1 == 2 && p2 == 1) {
					System.out.println("30 - 15");
					playTennis();
				}
				if (p1 == 1 && p2 == 2) {
					System.out.println("15 - 30");
					playTennis();
				}
				if (p1 == 3 && p2 == 2) {
					System.out.println("40 - 30");
					playTennis();
				}
				if (p1 == 2 && p2 == 3) {
					System.out.println("30 - 40");
					playTennis();
				}
				if (p1 == 3 && p2 == 1) {
					System.out.println("40 - 15");
					System.out.println("Game player1");
					gamePlayed=true;
					p1=0;
					p2=0;
					break;
				}
				if (p1 == 1 && p2 == 3) {
					System.out.println("15 - 40");
					System.out.println("Game player2");
					gamePlayed=true;
					p1=0;
					p2=0;
					break;
				}
				if ((p1 == 3 && p2 == 3)
						|| (p1 == 4 && p2 == 4)){
						System.out.println("Deuce");
						p1 = 3;
						p2 = 3;
						playTennis();
					}
				if (p1 == 4 && p2 == 3) {
					System.out.println("Advantage player1");
					playTennis();
				}
				if (p1 == 3 && p2 == 4) {
					System.out.println("Advantage player2");
					playTennis();
				}
				if ((p1 == 5 && p2 == 3)
						|| (p1 >=4 && p2 <= 3)
						) {
					System.out.println("Game player1");
					gamePlayed=true;
					p1=0;
					p2=0;
					break;
				}
				if ((p1 == 3 && p2 == 5)
						|| (p1 <= 3 && p2 >= 4)
						) {
					System.out.println("Game player2");
					gamePlayed=true;
					p1=0;
					p2=0;
					break;
				} 
			}
		return gamePlayed;
	}
}
