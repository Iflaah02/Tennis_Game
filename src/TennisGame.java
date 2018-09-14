import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TennisGame {
	
	private int p1;
	private int p2;
	//private int scoreFlag;
	Scanner sc = new Scanner(System.in);

	public TennisGame() {
		//System.out.println("I am constructor");
		p1 = 0;
		p2 = 0;
		//scoreFlag = 0;
		System.out.println(this.getScore());
		while (!this.getScore().contains("game")) {
			int pId;
			do {
				System.out.println("Type the number of the player who wins the point. Only numbers 1 & 2 are allowed.\n(1 = Player 1, 2 = Player 2) >");
				while (!sc.hasNextInt()) {
					System.out.println("Invalid input!");
					System.out.println("Type the number of the player who wins the point. Only numbers 1 & 2 are allowed.\n(1 = Player 1, 2 = Player 2) >");
					sc.next();
				}
				pId = sc.nextInt();
			} while (pId<1 || pId>2);
			
			if (pId == 1) {
				p1 += 1;
			}
			else {
				p2 += 1;
			}
			System.out.println(this.getScore());
		}
		
	}

	public String getScore() {
		List<String> pointsDescription = Arrays.asList("0", "15", "30", "40");
		//System.out.println("I am method for displaying score");
			
			if (p1 > 3 && p2 <= 2) {
				return "game player1";
			}
			else if (p2 > 3 && p1 <= 2) {
				return "game player2";
			}
			else if (p1 >= 3 && p2 >= 3) {
	            if (p2 - p1 >= 2) {
	                return "game player2";
	            } else if (p1 - p2 >= 2) {
	            	return "game player1";
	            } else if (p1 == p2) {
	                return "deuce";
	            } else {
	            	String inAdv = (p1 > p2) ? "player1" : "player2";
	                return "advantage " +  inAdv;
	            }
	        } else {
	            return "Score: Player 1 - Player 2\n"
	            		+ pointsDescription.get(p1)
	            		+ " - "
	            		+ pointsDescription.get(p2);
	        }

	}
}
