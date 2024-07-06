package assignment2;

import java.util.Scanner;

public class QUESTION_3 {

	public static void main(String[] args) {
		double basic,HRA,DA,gross;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the basic salary of the person");
		basic=sc.nextDouble();
		DA=0.40*basic;
		HRA=0.20*basic;
		gross=basic+DA+HRA;
		System.out.println("DA is: "+DA);
		System.out.println("HRA is: "+HRA);
		System.out.println("The gross salary is: "+gross);

	}

}
