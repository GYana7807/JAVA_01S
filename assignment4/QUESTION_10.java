package assignment4;
import java.util.*;
public class QUESTION_10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int num , prd = 1;
		System.out.println("Enter the number : ");
		num=sc.nextInt();
		while(3*prd<=num)
		{
		prd = prd *3;
		}
		if(num<3)
		{
		prd = 0;
		}
		System.out.println("The obtained by largest power of 3 less than equal to "+num+" is "+prd);


	}

}
