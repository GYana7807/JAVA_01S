package assignment4;
import java.util.*;
public class HOMEASSIGNMENT_Q5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the numbers : ");
		int n = sc.nextInt();
		String a = " ";
		for(int i = 1 ;i<=n;i++)
		{
		System.out.println(a+i+a);
		a=a+i+a;


	}

}
}
