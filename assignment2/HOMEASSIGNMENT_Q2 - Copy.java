package assignment2;

import java.util.Scanner;

public class HOMEASSIGNMENT_Q2 {

	public static void main(String[] args) {
		int num,dozen,gross;
		Scanner sc=new Scanner(System.in);
		System.out.println("How many eggs do you have?");
		num=sc.nextInt();
		gross=num/144;
		num=num%144;
		dozen=num/12;
		num=num%12;
		System.out.println("Your number of eggs is "+gross+" gross,"+dozen+" dozens,"+"and "+num);
	}

}
