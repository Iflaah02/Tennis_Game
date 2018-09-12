import java.util.Scanner;
public class Driver {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Input=new Scanner (System.in);
		TennisGame Play = new TennisGame();
		
		while(Play.getScoreFlag()==0)
		{
		    System.out.println("Player one=1, Player two=2");
		    int value= Input.nextInt();
		    if(value==1)
		    	Play.setP1(Play.getP1() +1);
		    else if(value==2)
		    	Play.setP2(Play.getP2() +1);
		    else
		    	System.out.println ("Invalid input");
		    }
		
		
	}

}
