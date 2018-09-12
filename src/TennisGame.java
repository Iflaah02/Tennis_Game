import java.util.*;
public class TennisGame {
	
	static private int p1;
	static private int p2;
	private int scoreFlag;
	
	public TennisGame() {
		// TO BE IMPLEMENTED
		this.p1 = 0;
		this.p2 = 0;
		this.scoreFlag = 0;
		System.out.println("I am constructor");
		
	}

	public String getScore() {
		System.out.println("I am method for displaying score");
		// Here is the format of the scores: "player1Score - player2Score"
		// "0 - 0"
		// "15 - 15"
		// "30 - 30"
		// "deuce"
		// "15 - 0", "0 - 15"
		// "30 - 0", "0 - 30"
		// "40 - 0", "0 - 40"
		// "30 - 15", "15 - 30"
		// "40 - 15", "15 - 40"
		// "advantage player1"
		// "advantage player2"
		// "game player1"
		// "game player2"

		// TO BE IMPLEMENTED
		//win the score
		TennisGame game1 = new TennisGame();
		while(this.scoreFlag!=1){	
		//System.out.println(this.p1 + "-" + this.p2);
		System.out.print("Input 1 or 2 for player1 or player2");
		Scanner scan = new Scanner(System.in);
		int read = scan.nextInt();
		game1.gainScore(read);
		//judge the score display
		if(this.p1 >= 4 && (this.p1- this.p2) >= 2){
			this.scoreFlag = 1;
			System.out.println("player1 win:" + this.p1 + "-" + this.p2);
			break;
		}
		else if (this.p2 == 4 && (this.p2-this.p1)>=2){
			this.scoreFlag = 1;
			System.out.println("player2 win:" + this.p1 + "-" + this.p2);
			break;
		}else if (this.p1 == 4 && this.p2 == 4){
			this.scoreFlag = 0;
			System.out.println("deduce");
			continue;
		}else if (this.p1 == this.p2+1 && this.p2 == 4){
			this.scoreFlag = 0;
			System.out.println("advantage player2");
			continue;
		}else if(this.p1 ==4 && this.p2 == this.p2+1){
			this.scoreFlag = 0;
			System.out.println("advantage player1");
			continue;
		}
		else {
			System.out.println(this.p1 +"-" + this.p2);
		    this.scoreFlag = 0;
		    continue;
		}
		
		
		}
		return "this.scoreFlag";
	}

	public int gainScore(int score){		
		if(score == 1){
			this.p1++;
		}if (score == 2){
			this.p2++;
		}
		
		return this.p1;
}
	}
