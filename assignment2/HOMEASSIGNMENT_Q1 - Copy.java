package assignment2;

import java.util.Scanner;

public class HOMEASSIGNMENT_Q1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

        // Prompt the user to enter the minutes
        System.out.print("Enter the number of minutes: ");
        long minutes = scan.nextLong();

        // Compute the number of years and days
        long totalDays = minutes / (60 * 24);
        long years = totalDays / 365;
        long days = totalDays % 365;

        // Display results
        System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days.");

	}

}
