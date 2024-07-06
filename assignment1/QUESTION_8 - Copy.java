package assignment1;

public class QUESTION_8 {

	public static void main(String[] args) {
		// Initialize X and Y
        int X = 10;
        int Y = 20;

        System.out.println("Before swapping:");
        System.out.println("Value of X: " + X+"");
        System.out.println("Value of Y: " + Y+"");

        // Use a temporary variable Z to swap X and Y
        int Z = X;
        X = Y;
        Y= Z;

        System.out.println("After swapping:");
        System.out.println("Value of X: " + X);
        System.out.println("Value of Y: " + Y);
    }
}
