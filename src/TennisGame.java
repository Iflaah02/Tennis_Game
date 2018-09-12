import java.io.*;

public class TennisGame {
	
	private int p1;
	private int p2;
	private int scoreFlag;
	private String score;
	private boolean adv1;
	private boolean adv2;
	
	public TennisGame(){
		// TO BE IMPLEMENTED
		System.out.println("I am constructor");
		
        //InputStreamReader in = new InputStreamReader(System.in);
        //BufferedReader br = new BufferedReader(in);		
		
		
		//System.out.println("Point to:");
		//String point=br.readLine();
		
		p1 = 40;
		p2 = 15;
		p2 = 30;
		p1 = 40;
		p2 = 40;
		//p2 = 40;
		//p1 = 50;
		//p2 = 50;
		
	}

	public String getScore() {
		//System.out.println("I am method for displaying score");
		// Here is the format of the scores: "player1Score - player2Score"
		
		//draws
		if (p1==0 && p2==0)
			score = "love-love)";
		else if (p1==15 && p2==15)
			score = "fifteen-fifteen";
		else if (p1==30 && p2==30)
			score = "thirteen-thirteen";
		else if (p1==40 && p2==40)
			score = "forty-forty";
		else if (p1 == p2)
			score = "deuce";
		
		// "30 - 30"
		// "deuce"
		
		//leading
		if (p1 == 15 && p2 == 0 || p1 == 0 && p2 == 15)
			score = (p1 + "-" + p2);
		
		// "15 - 0", "0 - 15"

		if (p1 == 30 && p2 == 0 || p1 == 0 && p2 == 30)
			score = (p1 + "-" + p2);		
		
		// "30 - 0", "0 - 30"

		if (p1 == 40 && p2 == 0 || p1 == 0 && p2 == 40)
			score = (p1 + "-" + p2);
		
		if (p1 > 40 && p2 < 40)
			score = ("game player1");
		
		if (p2 > 40 && p1 < 40)
			score = ("game player2");
		
		
		// "40 - 0", "0 - 40"

		
		if (p1 == 30 && p2 == 15 || p1 == 15 && p2 == 30)
			score = (p1 + "-" + p2);		
		// "30 - 15", "15 - 30"

		if (p1 == 40 && p2 == 15 || p1 == 15 && p2 == 40)
			score = (p1 + "-" + p2);		
		// "40 - 15", "15 - 40"

		if (p1 == 40 && p2 == 30 || p1 == 30 && p2 == 40)
			score = (p1 + "-" + p2);		
		
		//else if (p2 <= 40 && p1 < 40)
		//	score = (p1 + "-" + p2);
		
		//else if (p1 == 40 && p2 == 40)
		//	score = ("deuce");
		
		//else if (p1 > 40 && p2 == 40)
		//	score = ("advantage player 1");

		//else if (p2 > 40 && p1 == 40)
		//	score = ("advantage player 2");				
				
		// "advantage player1"
		// "advantage player2"
		// "game player1"
		// "game player2"

		// TO BE IMPLEMENTED
		return score;
	}

}
