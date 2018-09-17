
import java.util.Scanner;
public class Driver {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int syote;

		TennisGame pelaa = new TennisGame();
		while (true) {
			syote = scan.nextInt();
			System.out.println(syote);
			if (syote == 1) {
				pelaa.ekallePojo();
				System.out.println(pelaa.selostus());
			}
			if (syote == 2) {
				pelaa.tokallePojo();
				System.out.println(pelaa.selostus());
			}
		}
	}
}
