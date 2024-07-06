package assignment2;

import java.util.Scanner;

public class QUESTION_1 {

	public static void main(String[] args) {
		 Scanner sc=new Scanner (System.in);
			double F,C;
			System.out.println("Enter the temperature of your city in Farenheit");
			F=sc.nextDouble();
			C=((F-32)*5/9);
			System.out.println("The temperature of your city in Centigrade is "+C+"");

	}

}
