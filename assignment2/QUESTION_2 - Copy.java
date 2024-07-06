package assignment2;

import java.util.Scanner;

public class QUESTION_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.println("Enter the distance between two cities in kilometers:");
        double distanceInKm;
        distanceInKm=sc.nextDouble();


        // Conversion factors
        double kmToMeters = 1000;
        double kmToFeet = 3280.84;
        double kmToInches = 39370.1;
        double kmToCm = 100000;

        // Conversions
        double distanceInMeters = distanceInKm * kmToMeters;
        double distanceInFeet = distanceInKm * kmToFeet;
        double distanceInInches = distanceInKm * kmToInches;
        double distanceInCm = distanceInKm * kmToCm;

        // Print the results
        System.out.println("Distance in Meters: " + distanceInMeters);
        System.out.println("Distance in Feet: " + distanceInFeet);
        System.out.println("Distance in Inches: " + distanceInInches);
        System.out.println("Distance in Centimeters: " + distanceInCm);

	}

}
