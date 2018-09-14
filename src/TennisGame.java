
public class TennisGame {
	
	private int p1, p2; 							//player scores
	private String player1, player2;				//player score display
	private String playerAdvantage;					//player who is winning
	
	public TennisGame() {
		p1=0;
		p2=0;
		player1 = "love";
		player2 = "love";
		
	}

	public boolean getScore() {

		if (p1==0 && p2==0) {
			System.out.println("love - love");
			return false;
		}else if (p1==3 && p2 ==3) {
			System.out.println("deuce");
			return false;
		}else if ((p1==3 && p2==4) || (p1==4 && p2==3)) {
			System.out.println("adv " + playerAdvantage);
			return false;
		} else if (p1<4 && p2<4){
			System.out.println(player1 +  " - " + player2);
			return false;
		}else
			System.out.println(playerAdvantage + " wins");
		return true;
	} //getScore

	public void update(int player) {

		if (player == 1){

			if (p2==4){
				p2--;

			}else if (p1 < 5){
				p1++;

				if (p1==1){
					player1 = "15";
				}else if (p1==2){
					player1 = "30";
				}else if (p1==3){
					player1 = "40";
				}else if (p1==4){
					playerAdvantage = "p1";
				}
			} // if player == 1

		} else /*player == 2*/{

			if (p1==4){
				p1--;
			} else if (p2 < 5) {
				p2++;

				if (p2==1){
					player2 = "15";
				}else if (p2==2){
					player2 = "30";
				}else if (p2==3){
					player2 = "40";
				}else if (p2==4){
					playerAdvantage = "p2";
				}
			}
		} // if player == 2



	} //update
}
