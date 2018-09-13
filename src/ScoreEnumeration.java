
/**
 * public class scoreEnumeration
 * An enumeration class for the score values.
 *
 * Love - 0 points
 * Fifteen - 15 points
 * Thirty - 30 points
 * Forty - 40 points
 * Advance - The player is about to win
 */
public enum ScoreEnumeration {

    Love(0),
    Fifteen(15),
    Thirty(30),
    Forty(40),
    Advance(41);

    private final int score;

    ScoreEnumeration(int score){
        this.score = score;
    }

    public int getScore() {
        return score;
    }
}
