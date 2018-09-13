import java.util.InputMismatchException;
import java.util.Scanner;

public class TennisGame {
	
	Scanner input = new Scanner(System.in);
	
	private int p1;
	private int p2;
	private int scoreFlag;
	
	public TennisGame() {
		p1 = 0;
		p2 = 0;
		scoreFlag = 0;
	}
	
	public void addScore(int choose) {
		while(choose != 1 && choose != 2) {
			System.out.println("Please choose either 1 for player 1, or 2 for player 2");
			
			try {
				choose = input.nextInt();
			}
			catch(InputMismatchException e) {
				System.out.println("An error occurred, use only int values.");
				input.nextLine();
				continue;
			}
		}
		if(choose == 1) {
			if(p1 == 0) {
				p1 = 15;
			}else if(p1 == 15) {
				p1 = 30;
			}else if(p1 == 30) {
				p1 = 40;
			}else if(p1 == 40 && p2 == 100) {
				p2 = 40;
			}else if(p2 <= 40 && p1 == 40) {
				p1 = 100;
			}else if(p1 == 100) {
				p1 = 404;
				scoreFlag = 1;
			}
		}
		if(choose == 2) {
			if(p2 == 0) {
				p2 = 15;
			}else if(p2 == 15) {
				p2 = 30;
			}else if(p2 == 30) {
				p2 = 40;
			}else if(p2 == 40 && p1 == 100) {
				p1 = 40;
			}else if(p1 <= 40 && p2 == 40) {
				p2 = 100;
			}else if(p2 == 100) {
				p2 = 404;
				scoreFlag = 1;
			}
		}
	}

	public void getScore() {
		//System.out.println("I am method for displaying score");
		if(p1 == 0 && p2 == 0) {
			System.out.println("0 - 0");
		}else if(p1 == 40 && p2 == 40) {
			System.out.println("Deuce");
		}else if(p1 == 100 && p2 <= 40) {
			System.out.println("advantage - " + p2);
		}else if(p1 <= 40 && p2 == 100) {
			System.out.println(p1 + " - advantage");
		}else if(p1 == 404) {
			System.out.println("game player 1");
		}else if(p2 == 404) {
			System.out.println("game player 2");
		}else {
			System.out.println(p1 + " - " + p2);
		}
	}
	
	public int getScoreFlag() {
		return scoreFlag;
	}
}
