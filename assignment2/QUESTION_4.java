package assignment2;

import java.util.Scanner;

public class QUESTION_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number between 0 and 1000: ");
        int num = sc.nextInt();

        int sum = 0;
        while (num > 0) {
            sum = sum + num % 10;
            num = num / 10;
        }

        System.out.println("The sum of the digits is " + sum);

	}

}
