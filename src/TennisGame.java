import java.util.InputMismatchException;
import java.util.Scanner;

public class TennisGame {
	
	Scanner reader = new Scanner (System.in);
	
	private int p1;
	private int p2;
	private int p1_scoreFlag;
	private int p2_scoreFlag;
	
	public TennisGame() {
		p1 = 0;
		p2 = 0;
		p1_scoreFlag = 0;
		p2_scoreFlag = 0;
	}
	
	public void gameLogic(int n) {
		
		while (n != 1 && n != 2) {
			System.out.println("Enter number 1 [player 1] or 2 [player 2]");
			try {
				n = reader.nextInt();
				
			}
			catch(InputMismatchException e) {
				System.out.println("Values must be in int format");
				reader.nextLine();
				continue;
			}
		}
		
		if (n == 1) { 
			if (p1 == 0) {
				p1 = 15;
				} 
			else if (p1 == 15) {
				p1 = 30;
				}
			else if (p1 == 30) {
				p1 = 40;
				}
			//1 stands for advantage
			else if (p1 == 40 && p2 == 1) {
				p2 = 40;
				}
			else if (p1 == 40 && p2 <= 40 ) {
				p1 = 1;
				}
			else if (p1 == 1) {
				p1 = 9999;
				p1_scoreFlag++;
				System.out.println("Total score for p1 is: " + p1_scoreFlag);
				}
			else if (p2 == 9999 || p1 == 9999 ){
				p2 = 0;
				p1 = 0;
				}
			}
		
		
		if (n == 2) { 
			if (p2 == 0) {
				p2 = 15;
				} 
			else if (p2 == 15) {
				p2 = 30;
				}
			else if (p2 == 30) {
				p2 = 40;
				}
			//1 stands for advantage
			else if (p2 == 40 && p1 == 1) {
				p1 = 40;
				}
			else if (p2 == 40 && p1 <= 40 ) {
				p2 = 1;
				}
			else if (p2 == 1) {
				p2 = 9999;
				p2_scoreFlag++;
				System.out.println("Total score for p2 is: " + p2_scoreFlag);
				}
			else if (p2 == 9999 || p1 == 9999){
				p2 = 0;
				p1 = 0;
				}
			}
	}
	
		public void getScore() {
			
			if (p1 == 0 && p2==0) {
				System.out.println("0-0");
			}
			else if (p1 == 40 && p2==40) {
				System.out.println("Deuce");
			}
			else if (p1 == 9999) {
				System.out.println("Game p1");
			}
			else if (p2 == 9999) {
				System.out.println("Game p2");
			}
			else if (p1 == 1 && p2 <= 40 )
				System.out.println("Advantage - " + p2);
			else if (p2 == 1 && p1 <= 40 )
				System.out.println(p1 + " - Advantage");
			else {
				System.out.println(p1 + " - " + p2);
			}
			
		}
		
		public int p1_getScoreFlag() {
			return p1_scoreFlag;
		}
		
		public int p2_getScoreFlag() {
			return p2_scoreFlag;
		}
}



