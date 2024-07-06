package assignment2;

import java.util.Scanner;

public class QUESTION_6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        System.out.print("Enter the time in seconds:");
        double time = scan.nextDouble();
        double g = 32.174;
        double distance = 0.5 * g * Math.pow(time, 2);
        System.out.println("The distance travelled is: " + distance +"");

	}

}
