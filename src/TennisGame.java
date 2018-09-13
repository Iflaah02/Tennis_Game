import java.security.InvalidParameterException;

public class TennisGame {
	
	private int p1 = 0;
	private int p2 = 0;
	private int scoreFlag = 0;
    private boolean ended = false;

    public TennisGame() {
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


        if(p1 >= 4 && p1 >= 2 + p2){

            return "game player 1";
        }

        if(p2 >= 4 && p2 >= 2 + p1){

            return "game player 2";
        }

        if(p1 == p2 && p1 >= 3){
            return "deuce";
        }

        if(p1 >= 3 && p2 >= 3){

            if(p1 > p2) {
                return "advantage player 1";
            } else {
                return "advantage player 2";
            }
        }

        return getPointsValue(p1) + " - " + getPointsValue(p2);
	}

	String getPointsValue(int points) throws InvalidParameterException {

        if(points == 0){
            return "0";
        }

        if(points == 1){
            return "15";
        }

        if(points == 2){
            return "30";
        }

        if(points == 3){
            return "40";
        }

        throw new InvalidParameterException();
    }

	public boolean isEnded() {
		return ended;
	}

    public boolean handleCommand(String command) {

        if(command.equalsIgnoreCase("p1")){

            ++p1;
            updateWinFlag();
            return true;
        }

        if(command.equalsIgnoreCase("p2")){

            ++p2;
            updateWinFlag();
            return true;
        }

        return false;
    }

    void updateWinFlag(){
        if(p1 >= 4 && p1 >= 2 + p2){

            ended = true;
        }

        if(p2 >= 4 && p2 >= 2 + p1){

            ended = true;
        }
    }
}
