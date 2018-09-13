public class TennisGame {
	
	private int p1;
	private int p2;
	// if used, this was probably meant to use for advantage, but had a different approach int scoreFlag;
	
	public TennisGame() {
		// Constructor
		p1=0;
		p2=0;
		
	}
//setters
	public void setP1 (int a){
	p1 = a;	
	}
	
	public void setP2 (int b) {
	p2 = b;
	}
//getters	
	public int getP1 ()
	{
	return p1;	
	}
	
	public int getP2 ()
	{
	return p2;
	}
	
	
	public String getScore() {
		int a = p1;
		int b = p2;
		if (a == 1) a=15;
		if (a == 2) a=30;
		if (a == 3) a=40;
		if (b == 1) b=15;
		if (b == 2) b=30;
		if (b == 3) b=40;
		System.out.println("\nplayer1Score - player2Score");
		if (p1 != p2 && p1 < 4 && p2 <4) System.out.println(a+"      -      "+b);
		if (p1 == p2) System.out.print(a + "        -       " + b + " deuce\n");
		
		//ing advantage
		if (p1 == 4 && p2 ==3) System.out.println("Advantage player 1 ");
		if (p2 == 4 && p1 ==3) System.out.println("Advantage player 2 ");
		
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

		
		return "";
	}
}
