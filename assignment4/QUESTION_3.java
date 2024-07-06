package assignment4;
import java.util.*;
public class QUESTION_3 {

	public static void main(String[] args) {
		// Taking user input //
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number: ");
		int N=sc.nextInt();
		// Generating Random Numbers //
		int count = 1;
		double sum = 0;
		double avg = 0;
		System.out.println("The random numbers are: ");
		do
		{
			int a = (int)(Math.random()*(N-1+1)+1);
			System.out.println(a);
			sum=sum+a;
			count++;
		}   while (count<=N);
		// Finding Average //
		avg=sum/N;
		System.out.println("Average of " +N+ " random numbers are " + avg);
	}

}
