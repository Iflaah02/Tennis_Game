import java.util.Random;

public class TennisGame {
	
	//private int p1 = 0;
	//private int p2 = 0;

    Random random = new Random();
    public boolean getBoolean() {
    return random.nextBoolean();
    }
	
	public TennisGame() {
		// TO BE IMPLEMENTED something that is not defined at all. Am I supposed to create somekind of a game or just some random generator and fake tennis results?
		// it is a pretty frustrating that we are teached how to code Java in a proper way in one course and then the next course uses totally different ways for teaching... where is the Main? 
		// i guess the assignment assumes we all follow sports and know the rules of tennis?
		// System.out.println("I am constructor");
		
        TennisGame randomBoolean = new TennisGame();
        int p1 = 0;
        int p2 = 0;
        
		//matching code to the quality of the assignment here
		while (p1 < 5 && p2 < 5)
		{
			//random true or false
			if (randomBoolean.getBoolean()) //if true
					{
				p1 ++;
				if (p1 == 4 && p1 - 1 > p2)
				{
					System.out.println("Player 1 won");
				}
					}
			else {
			p2 ++;	
			if (p2 == 4 && p2 - 1 > p1)
			{
				System.out.println("Player 2 won");
			}
			}
			}
					
			// we have played until one of the players has reached 4, that is maybe in tennis the win condition 15, 30, 40, win? no idea if it goes like that is the silly game
		while (p1 < p2 +2  || p2 < p1 +2)
		{
			if (randomBoolean.getBoolean()) //if true
			{
				p1 ++;
			}
			else {
			
				p2 ++;
			}
		}
		
		if (p1 > p2)
		{
			System.out.println("Player 1 won");
		}
		else System.out.println("Player 1 won");
		
		}

}
