import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Driver {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        TennisGame play = new TennisGame();

        String command = "";

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        do {
            System.out.print("Input command: ");

            try {
                command = reader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
                return;
            }

            if(play.handleCommand(command)){
                System.out.println("Score after command: " + play.getScore());

                if(play.isEnded()) {

                    System.out.print("a new game has started");
                    play = new TennisGame();
                }
            }

        } while (!command.equals("quit"));
    }

}