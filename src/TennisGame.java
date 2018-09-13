
public class TennisGame {
	
	private int p1 = 0;
	private int p2 = 0;
	
	public TennisGame(int p1, int p2) {
		this.p1 = p1;
		this.p2 = p2;		
	}

	public String getScore() {
		if(p1 >= 3 && p2 >= 3) {
			if ((Math.abs(p2) - p1) >= 2) {
				return "Game "+getLead();
			}
			else if ((Math.abs(p1) - p2) >= 2) {
				return "Game "+getLead();
			}
			else if (p1 == p2) {
				return "Deuce";
			}
			else {
				return "Advantage " + getLead();
			}
		} 
		//Sorry
		else {
			if (p1 == 1)
				p1 = 15;
			else if (p1 == 2)
				p1 = 30;
			else if (p1 == 3)
				p1 = 40;
			else if (p1 >= 4)
				return "Game Player 1";
			
			if (p2 == 1)
				p2 = 15;
			else if (p2 == 2)
				p2 = 30;
			else if (p2 == 3)
				p2 = 40;
			else if (p2 >= 4)
				return "Game Player 2";
			return String.valueOf(p1) + " - " + String.valueOf(p2);
		}
	}
	
	
	public String getLead() {
		if (p1 < p2)
			return "Player 2";
		else
			return "Player 1";
	}
}
