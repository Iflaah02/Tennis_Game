
public class TennisGame {
	
	private int p1;
	private int p2;
	private int scoreFlag;
	private int p1Score;
	private int p2Score;
	
	public TennisGame() {
		// TO BE IMPLEMENTED
		System.out.println("I am constructor");
		
	}
	
	public void playerATurn(int points) {
		this.p1 = points;
		switch(points) {
		case 0:
			this.p1Score = 0;
			break;
		case 1:
			this.p1Score = 15;
			break;
		case 2:
			this.p1Score = 30;
			break;
		case 3:
			this.p1Score = 40;
			break;
		default:
			this.p1Score = 50;
		}
	};
	
	public void playerBTurn(int points) {
		this.p2 = points;
		switch(points) {
		case 0:
			this.p2Score = 0;
			break;
		case 1:
			this.p2Score = 15;
			break;
		case 2:
			this.p2Score = 30;
			break;
		case 3:
			this.p2Score = 40;
			break;
		default:
			this.p2Score = 50;
		}
	};

	public String getScore() {
		if (this.p1 >= 4) {
			if (this.p1 - this.p2 >= 2) {
				System.out.println("Winner: Player 1");
			}
			else if (this.p1 - this.p2 == 0) {
				System.out.println("Deuce");
			}
			else if (this.p1 - this.p2 == 1) {
				System.out.println("Advantage Player 1");
			};
			
		};
		if (this.p2 >= 4) {
			if (this.p2 - this.p1 >= 2) {
				System.out.println("Winner: Player 2");
			}
			else if (this.p2 - this.p1 == 1) {
				System.out.println("Advantage Player 2");
			};
		};
		
		if (this.p1 < 4 && this.p2 < 4) {
			if (this.p1 == 3 && this.p2 == 3) {
				System.out.println("Deuce");
			} else {
				System.out.println(this.p1Score + " - " + this.p2Score);
			};
		};

		return "";
	}
}
