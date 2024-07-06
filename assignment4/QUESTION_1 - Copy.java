package assignment4;
import java.util.*;
public class QUESTION_1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number: ");
		int NUM1=sc.nextInt();
		System.out.println("Enter second number: ");
		int NUM2=sc.nextInt();
		System.out.println("Enter third number: ");
		int NUM3=sc.nextInt();
		int sum=0;
		System.out.println("The numbers are ");
		for (int i=NUM1;i<=NUM2;i=i+NUM3)
		{
			System.out.println(i);
			sum=sum+i;
		}
		System.out.println("The sum of number displayed is "+sum);
		
	}

}
