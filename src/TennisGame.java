
public class TennisGame {
	
	private int p1 =0;
	private int p2 = 0;
	private int scoreFlag = 0;
	private boolean gameOver = false;
	
	public TennisGame() {

	}
	public void playGame(){
		writeScore();
		System.out.println();
		while(!gameOver)
		{
			if(Math.random() > 0.49)
			{
				System.out.println("Player1 scored");
				addScore(0);
			}
			else{
			System.out.println("Player2 scored");
			addScore(1);}
			System.out.println(getScore());
		}
	}

	public void addScore(int player)
	{

		if(player == 0){
		p1 += addScoreToPlayer(p1);
		}
		if(player == 1){
		p2 += addScoreToPlayer(p2);
		}

	}

	private int addScoreToPlayer(int currPoints)
	{
		switch(currPoints)
		{
			case 0:
			case 15:
			return (int)15;
			case 30:
			return (int)10;
			default:
			return 15;
		}
	}
private String writtenScore(int playerScore)
{
	if(playerScore == 0)
		 return "love";
	if(playerScore == 40)
		 return "fourty";
	switch(playerScore % 40)
	{
		case 15: return "fifteen";
		case 30: return "thirty";
		case 40: return "fourty";
	}
	return "";
}
private void writeScore(){System.out.print(new StringBuilder()
	.append(writtenScore(p1))
	.append("-")
	.append(writtenScore(p2))
	.append("    ")
	.toString());
}
	public String getScore() {
		//System.out.println("I am method for displaying score");
		// Here is the format of the scores: "player1Score - player2Score"
		// "0 - 0"// "15 - 15"
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
		writeScore();

		int score = p1-p2;
		//Player 1 winning
		if(score < 0)
		{
			return new StringBuilder()
			// .append(p1)
			// .append("-")
			// .append(p2)
			.append(getScoreString(Math.abs(score), Math.max(p1,p2)))
			.append("2")
			.toString();
		}
		if(score == 0)
		{
			return new StringBuilder()
			// .append(p1)
			// .append("-")
			// .append(p2)
			.append("deuce")
			.toString();
		}
		if(score > 0)
		{
			return new StringBuilder()
			// .append(p1)
			// .append("-")
			// .append(p2)
			.append(getScoreString(Math.abs(score), Math.max(p1,p2)))
			.append("1")
			.toString();
		}

		return "Error";
	}
	private String getScoreString(int score, int betterP)
	{
		switch(score)
		{
			case 10:
			case 15:
			return "advantage player";
			case 40:
			case 25:
			gameOver = true;
			return "game player";
			case 30:
			if(betterP >=40)
			{
				gameOver = true;
				return "game player";
			}
			return "advantage player";
			
		}
		gameOver = true;
		return "Error";
	}
}
