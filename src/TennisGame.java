import java.util.Arrays;
import java.util.List;

public class TennisGame {
	
	private int p1 = 0;
	private int p2 = 0;
	
	private final String p1_name;
	private final String p2_name;
	
	private static String[] data = {"0", "15", "30", "40"};
	private static final List<String> points = Arrays.asList(data);
	
	public TennisGame(String p1name, String p2name){
		// TO BE IMPLEMENTED
		this.p1_name = p1name;
		this.p2_name = p2name;
	}

	public void p1_wins_ball(){
		p1++;
	}
	
	public void p2_wins_ball(){
		p2++;
	}
	
	private String p1_get_score(){
		return points.get(p1);
	}
	
	private String p2_get_score(){
		return points.get(p2);
	}
	
	public boolean game_over(){
		if(p1 > p2 + 1 && p1 > 3){
			return true;
		}
		else if(p2 > p1 + 1 && p2 > 3){
			return true;
		}
		else{
			return false;
		}
	}
	
	public String getScore() {
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
		// To be implemented
		String score = "";
		if(p1 >= 3 && p2 >= 3){
			if(Math.abs(p1 - p2) >= 2){
				if(p1 > p2){
					score = p1_name + " won";
				}else{
					score = p2_name + " won";
				}
			} else if(p1 == p2) {
				score = "deuce";
			} else {
				if(p1 > p2){
					score = "advantage " + p1_name;
				}else{
					score = "advantage " + p2_name;
				}
			}
		}else if(p1 > 3 || p2 > 3){
			if(Math.abs(p1 - p2) >= 2){
				if(p1 > p2){
					score = p1_name + " won";
				}else{
					score = p2_name + " won";
				}
			}
		}else{
			score = getScores();
		}
		return score;
	}
	
	private String getScores(){
		return p1_name +  " " + p1_get_score() + " - " + p2_name + " " + p2_get_score();
	}	

}
