package assignment4;
import java.util.*;
public class QUESTION_9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a number : ");
		long a = sc.nextLong();
		long newnum=0,i=0;
		while(a!=0)
		{
		long d = a%10;
		if (d!=0)
		{
		newnum=newnum+(int)(d*(Math.pow(10, i)));
		i++;
		}
		a=a/10;
		}
		System.out.println("After removing 0 from given number will become : "+newnum);

	}

}
