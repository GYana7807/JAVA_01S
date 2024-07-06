package assignment4;
import java.util.*;
public class QUESTION_6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter base: ");
		int base = sc.nextInt();
		System.out.println("Enter power: ");
		int power = sc.nextInt();
		double result = 1;
		for  (int i = 1; i<=power; i++)
		{
			result = result * base;
		}
		System.out.println(base+ " to the power "+power+" is: "+result );

	}

}
