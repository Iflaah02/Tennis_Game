import java.util.Scanner;

import javax.xml.ws.handler.MessageContext.Scope;

public class TennisGame {
	
	private int p1;
	private int p2;
	private int scoreFlag;
	
	public TennisGame() {
		
		this.p1 = 0;
		this.p2 = 0;
		this.scoreFlag = 0;
		
	}
	
	public void addPointPlayer(int Noplayer) {
		
		if(Noplayer == 1) {
			
			System.out.println("Player 1 scored !\n");
			
			if(scoreFlag == 15) {
				
				p2--;
				
			}
			
			else if(p1 < 5) {
				
				p1++;
				
			}
			
		}
		
		if(Noplayer == 2) {
			
			System.out.println("Player 2 scored !\n");
			
			if(scoreFlag == 14) {
				
				p1--;
				
			}
			
			else if(p2 < 5) {
				
				p2++;
				
			}
			
		}
		
	}

	public String getScore() {
		
		if(p1 == 0 && p2 == 0) {
			
			scoreFlag = 0;
			
		}
		
		if(p2 == 1 && p2 == 1) {
			
			scoreFlag = 1;
			
		}
		
		if(p1 == 2 && p2 == 2) {
			
			scoreFlag = 2;
			
		}
		
		if(p1 == 3 && p2 == 3) {
			
			scoreFlag = 3;
			
		}
		
		
		if(p1 == 1 && p2 == 0) {
			
			scoreFlag = 4;
			
		}
		
		if(p1 == 0 && p2 == 1) {
			
			scoreFlag = 5;
			
		}
		
		if(p1 == 2 && p2 == 0) {
			
			scoreFlag = 6;
			
		}
		
		if(p1 == 0 && p2 == 2) {
			
			scoreFlag = 7;
			
		}
		
		if(p1 == 3 && p2 == 0) {
			
			scoreFlag = 8;
			
		}
		
		if(p1 == 0 && p2 == 3) {
			
			scoreFlag = 9;
			
		}
		
		if(p1 == 2 && p2 == 1) {
			
			scoreFlag = 10;
			
		}
		
		if(p1 == 1 && p2 == 2) {
			
			scoreFlag = 11;
			
		}
		
		if(p1 == 3 && p2 == 1) {
			
			scoreFlag = 12;
			
		}
		
		if(p1 == 1 && p2 == 3) {
			
			scoreFlag = 13;
			
		}
		
		if(p1 == 4 && p2 == 3) {
			
			scoreFlag = 14;
			
		}
		
		if(p1 == 3 && p2 == 4) {
			
			scoreFlag = 15;
			
		}
		
		if(p1 == 3 && p2 == 2) {
			
			scoreFlag = 18;
			
		}
		if(p1 == 2 && p2 == 3) {
			
			scoreFlag = 19;
			
		}
		
		if(p1 == 5) {
			
			scoreFlag = 16;
			
		}
		
		if(p2 == 5) {
			
			scoreFlag = 17;
			
		}
	
	
	
		String result = "";
		
		switch (scoreFlag) {
		
		case 0:  result = "0 - 0";
        		 break;
        case 1:  result = "15 - 15";
                 break;
        case 2:  result = "30 - 30";
                 break;
        case 3:  result = "deuce";
                 break;
        case 4:  result = "15 - 0";
                 break;
        case 5:  result = "0 - 15";
                 break;
        case 6:  result = "30 - 0";
                 break;
        case 7:  result = "0 - 30";
                 break;
        case 8:  result = "40 - 0";
                 break;
        case 9:  result = "0 - 40";
                 break;
        case 10: result = "30 - 15";
                 break;
        case 11: result = "15 - 30";
                 break;
        case 12: result = "40 - 15";
                 break;
        case 13: result = "15 - 40";
        		 break;
        case 14: result = "advantage player1";
        		 break;
        case 15: result = "advantage player2";
        		 break;
        case 16: result = "game player1";
        		 break;
        case 17: result = "game player2";
        		 break;      		 
        case 18: result = "40 - 30";
        		 break;
        case 19: result = "30 - 40";
				 break;
        default: result = "wrong score";
                 break;
    }
		
    return result + "\n";
    
	}
}
