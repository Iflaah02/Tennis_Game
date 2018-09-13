import java.util.Scanner;
import java.util.InputMismatchException;

public class TennisGame {
	
	private int p1;
	private String p1string;
	private int p2;
	private String p2string;
	//private int scoreFlag;
	
	public TennisGame() {
		System.out.println("I am constructor");
		p1 = 0;
		p2 = 0;
		p1string = "love";
		p2string = "love";
	}

	public String getScore() {
		System.out.println("I am method for displaying score");
		Scanner reader = new Scanner(System.in);
		int pointsFor;
		
		while(true){
		
		    System.out.println("\np1 " + p1string + " - p2 " + p2string);
		
		    while(true){
		    	try{
		            System.out.println("Select which one gets points (enter 1 or 2, 3 quits)");
		            //pointsFor = reader.nextInt();
		            pointsFor = enterInt(reader);
		            if(pointsFor == 1 || pointsFor == 2 || pointsFor == 3) break;
		        }catch (InputMismatchException ime) {
                    System.out.println(ime.toString());
                    reader.nextLine();
                }
		    }
		
		    if(pointsFor == 1) {
				if(p1 == 0){ p1 = 1; p1string = "fifteen";}
				else if (p1 == 1){ p1 = 2; p1string = "thirty";}
				else if(p1 == 2){ p1 = 3; p1string = "forty";}
				else if(p1 == 3 || p2 == 0){ p1 = 4; System.out.println("p1 wins!"); break;}
				else if(p1 == 3){ p1 = 4;}
				else if(p1 - p2 >= 2 && p1 >= 4){ System.out.println("p1 wins!"); break;}
				else if(p1 == 4){ p1 = 5; p1string = "advantage"; p2string = "";}
				else if(p1 == 5 && p2 == 4){System.out.println("p1 wins!"); break;}
		    }
		    
		    else if(pointsFor == 2) {
				if(p2 == 0){ p2 = 1; p2string = "fifteen";}
				else if (p2 == 1){ p2 = 2; p2string = "thirty";}
				else if(p2 == 2){ p2 = 3; p2string = "forty";}
				else if(p2 == 3 && p1 == 0){ System.out.println("p2 wins!"); break;}
				else if(p2 == 3){ p2 = 4;}
				else if(p2 - p1 >= 2 && p2 >= 4){ System.out.println("p2 wins!"); break;}
				else if(p2 == 4){ p2 = 5; p2string = "advantage"; p1string = "";}
				else if(p2 == 5 && p1 == 4){System.out.println("p2 wins!"); break;}
		    }
		
		    if(p1 >= 3 && p2 >= 3 && p1 == p2){
		    	p1string = "deuce";
		    	p2string = "deuce";
		    	p1 = 4;
		    	p2 = 4;
		    }
		    
		    else if(pointsFor == 3) {
			    break;
		    }
		    
		}
		reader.close();
		
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

		
		return "";
	}
	
	private static int enterInt(Scanner scanner) throws InputMismatchException{
        int input = scanner.nextInt();
        return input;
    }
}
