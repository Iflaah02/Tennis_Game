public class TennisGame {
	
	private int p1;
	private int p2;
	private int scoreFlag;
	private int addition;
        
	public TennisGame() {
		// TO BE IMPLEMENTED
		//System.out.println("I am constructor");
		
	}
        public int getp1(){
            return p1;
        }
        public int getp2(){
            return p2;
        }
        public void setp1(int addition){
            p1 += addition;
        }
        public void setp2(int addition){
            p2 += addition;
        }

	public void getScore() {
		//System.out.println("I am method for displaying score");
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
                if (getp1() == 0 && getp2() == 0){
                    addition = 15;
                    setp1(addition);
                    System.out.println("" +p1 +" - " + p2);
                    
                }
		if (getp1() == 15 && getp2() == 0){
                    addition = 15;
                    setp2(addition);
                    System.out.println("" +p1 +" - " + p2);
                }
                if (getp1() == 15 && getp2() == 15){
                    addition = 15;
                    setp1(addition);
                    System.out.println("" +p1 +" - " + p2);
                }
                if (getp1() == 30 && getp2() == 15){
                    addition = 15;
                    setp2(addition);
                    System.out.println("" +p1 +" - " + p2);
                }
                if (getp1() == 30 && getp2() == 30){
                    addition = 10;
                    setp1(addition);
                    System.out.println("" +p1 +" - " + p2);
                }
                if (getp1() == 40 && getp2() == 30){
                    addition = 10;
                    setp2(addition);
                    System.out.println("deuce");
                }
                if (getp1() == 40 && getp2() == 40){
                    addition = 10;
                    setp1(addition);
                    System.out.println("advantage player1");
                }
                if (getp1() == 50 && getp2() == 40){
                    addition = 10;
                    setp1(addition);
                    System.out.println("game player1");
                }
	}
}


        
