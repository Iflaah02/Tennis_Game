import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TennisGame {

	private int p1;
	private int p2;
	private int scoreFlag;
	private int do_once = 0;
	private String[] score;
	private BufferedReader br;
	private StringBuilder sb;

	public TennisGame() {
		// TO BE IMPLEMENTED
		System.out.println("I am constructor");
		sb = new StringBuilder();
		sb.append(String.format("p1: %d\tp2: %d\n", 0, 0));
		try {
			br = new BufferedReader(new FileReader("input.txt"));
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	private void increase(char ch) {
		if (ch == 'A') {
			if (p1 < 30) {
				p1 += 15;
			} else if (p1 == 30) {
				p1 += 10;
			} else {
				if (scoreFlag == -1) {
					scoreFlag = 1;
				} else {
					scoreFlag += 1;					
				}
			}
		} else if (ch == 'B') {
			if (p2 < 30) {
				p2 += 15;
			} else if (p2 == 30) {
				p2 += 10;
			} else {
				if (scoreFlag == 1) {
					scoreFlag = -1;
				} else {
					scoreFlag -= 1;					
				}
			}
		}
		if (p1 == 40 && p2 == 40) {
			if (do_once == 0) {
				sb.append(String.format("p1: %d\tp2: %d\n", 40, 40));
				do_once = 1;
			}
		} else {
			sb.append(String.format("p1: %d\tp2: %d\n", p1, p2));			
		}

	}

	private void checkscore() {
		if (p1 == p2 && p1 == 30 && p2 == 30) {
			sb.append("deuce\n");
		} else if (p1 == p2 && p1 == 40 && p2 == 40) {
			if (scoreFlag == 2) {
				sb.append("game player1\n");
				return;
			} else if (scoreFlag == -2) {
				sb.append("game player2\n");
				return;
			} else if (scoreFlag == 1) {
				sb.append("advantage player1\n");
			} else if (scoreFlag == -1) {
				sb.append("advantage player2\n");
			} else {
				
			}
			
		} else {

		}
	}

	public String getScore() {
		System.out.println("I am method for displaying score");
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
		String line;
		try {
			line = br.readLine();
			while (line != null) {
				increase(line.charAt(0));
				checkscore();
				line = br.readLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return sb.toString();
	}
}
