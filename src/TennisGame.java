
public class TennisGame {

    private int p1;
    private int p2;
    private int scoreFlag;
    private int p1GameWon;
    private int p2GameWon;

    public TennisGame() {
        System.out.println("The game is starting");
        p1GameWon = 0;
        p2GameWon = 0;
        this.newGame();
    }

    public boolean isSetOver() {
        if (p1GameWon > 5 && p1GameWon >= p2GameWon + 2) {
            return true;
        } else return p2GameWon > 5 && p2GameWon >= p1GameWon + 2;

    }

    public String getSetDetails() {
        if (p1GameWon > p2GameWon) {
            return "Set won by Player 1, " + p1GameWon + " - " + p2GameWon;
        } else if (p2GameWon > p1GameWon) {
            return "Set won By Player 2, " + p2GameWon + " - " + p1GameWon;
        }

        return "ERROR: Invalid state of p1GameWon or p2GameWon, " + p1GameWon + ", " + p2GameWon;
    }

    public void newGame() {
        p1 = 0;
        p2 = 0;
        scoreFlag = 0;
    }

    public void setScore(int player) {
        if (player == 1) {
            if (p1 == 0) {
                p1 = 15;
            } else if (p1 == 15) {
                p1 = 30;
            } else if (p1 == 30) {
                p1 = 40;
            } else if (p1 == 40 && scoreFlag == 1 || p1 == 40 && p1 > p2 ) {
                p1 = 60;
            } else if (p1 == 40) {
                scoreFlag = 1;
            }
        } else if (player == 2) {
            if (p2 == 0) {
                p2 = 15;
            } else if (p2 == 15) {
                p2 = 30;
            } else if (p2 == 30) {
                p2 = 40;
            } else if (p2 == 40 && scoreFlag == 2 || p2 == 40 && p2 > p1) {
                p2 = 60;
            } else if (p1 == 40) {
                scoreFlag = 2;
            }
        } else {
            System.out.println("ERROR: Invalid setScore method's parameter");
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

        if (p1 > 40) {
            this.newGame();
            this.p1GameWon++;
            return "Game Player 1";
        } else if (p2 > 40) {
            this.newGame();
            this.p2GameWon++;
            return "Game Player 2";
        } else if (scoreFlag != 0) {
            if (scoreFlag == 1) {
                return "Advantage Player 1";
            } else if (scoreFlag == 2) {
                return "Advantage Player 2";
            }
            return "ERROR: scoreflag has invalid value, " + scoreFlag;
        } else if (p1 <= 40 && p2 <= 40) {
            if (p1 == 40 && p2 == 40) {
                return "Deuce";
            }
            return p1 + " - " + p2;
        } else {
            return "ERROR: p1 or p2 has invalid value, " + p1 + ", " + p2;
        }
    }
}
