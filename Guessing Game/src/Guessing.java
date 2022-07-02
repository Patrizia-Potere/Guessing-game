import java.util.Scanner;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Guessing {
// general variable for all methods of class Guessing
	boolean guess = true;		//looping till guess is false
	int attempt = 1;			//evaluate number of attempts
	Scanner sc = new Scanner(System.in);		//user input

//	Checking if user guessed the number
	public void Loop(Scanner value, int r) {
		while (guess) {
//			Ask user for the number
			System.out.println("Enter your number:");
//			Reading user input
			int number = value.nextInt();
			if (number<r) {
				System.out.println("Your number is too low! Try again.");
				attempt++;
			} else if (number>r) {
				System.out.println("Your number is too high! Try again.");
				attempt++;
			} else {
				System.out.println("Congratulation the number was:"+number);
				System.out.println("You guessed in "+attempt+" attempts");
				guess = false;
			} 
		}
	}
	
//----------------------------------------------------------------------------
	
//	Generate random number with first method
	public void One() {
//		Generate random number
		Random rand = new Random();
//		random number till range value
		int range = 100;
		int random = rand.nextInt(range);
//		Calling Loop method passing parameters to evaluate the guessing
		Loop(sc, random);		
	}
	
//------------------------------------------------------------------------
	
//	Generate random number with second method
	public void Two() {
//		Generate a random number between 0-100
		int random = (int)Math.floor(Math.random()*101);
//		Calling Loop method passing parameters to evaluate the guessing
		Loop(sc, random);		
	}
	
//------------------------------------------------------------------------
	
//	Generate random number with third method
	public void Three() {
//		Generate a random number between 0-100		
		int random = ThreadLocalRandom.current().nextInt(0,101);
//		Calling Loop method passing parameters to evaluate the guessing		
		Loop(sc, random);	
	}
}

