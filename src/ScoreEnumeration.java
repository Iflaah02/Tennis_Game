
/**
 * public class scoreEnumeration
 *
 * An enumeration class for the score values.
 *
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