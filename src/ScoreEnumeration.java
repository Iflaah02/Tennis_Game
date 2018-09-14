
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

    LOVE(0, "Love"),
    FIFTEEN(15, "15"),
    THIRTY(30, "30"),
    FORTY(40, "40"),
    ADVANCE(41, "Advance");

    private final int scoreInt;
    private final String scoreText;

    /**
     * ScoreEnumeration
     * The Constructor class
     * @param scoreInt - The score is numbers
     * @param scoreText - The score as a String
     */
    ScoreEnumeration(int scoreInt, String scoreText){
        this.scoreInt = scoreInt;
        this.scoreText = scoreText;

    }

    /**
     * getScoreInt
     * Returns the int value of the score
     * @return scoreInt - The given score
     */
    public int getScoreInt() {
        return scoreInt;
    }

    /**
     * getScoreText
     * Returns the String value of the score
     * @return scoreText
     */
    public String getScoreText() {
        return scoreText;
    }
}
