package assignment2;

import java.util.Scanner;

public class QUESTION_5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        System.out.print("Enter the radius of the hemisphere:");
        double radius = scan.nextDouble();
        double pi = Math.PI;

        // Surface Area of Hemisphere = 3 * π * r^2
        double surfaceArea = 3 * pi * Math.pow(radius, 2);

        // Volume of a hemisphere = (2/3) * π * r^3
        double volume = (2.0 / 3.0) * pi * Math.pow(radius, 3);

        System.out.println("Surface Area of the Hemisphere: " + surfaceArea);
        System.out.println("Volume of the Hemisphere: " + volume);

	}

}
