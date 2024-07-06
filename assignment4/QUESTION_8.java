package assignment4;
import java.util.*;
public class QUESTION_8 {

	public static void main(String[] args) {
		while(true) {
			// Computer generating a number //
			int Computer_guess=(int)((Math.random()*(10-1+1))+1);
			// User Guessing a number // 
			Scanner sc = new Scanner (System.in);
			System.out.println("Guess a number in between 1 to 10 ");
			int User_guess = sc.nextInt();
			System.out.println("You guess" +User_guess);
			System.out.println("Computer guess" +Computer_guess);
			if (Computer_guess==User_guess)
			{
				System.out.println("Good Guess");
				break;
			}
			else if (User_guess>Computer_guess)
			{
				System.out.println("Too high, try again");
			}
			else
			{
				System.out.println("Too low, try again");
			}
			
		}

	}

}
