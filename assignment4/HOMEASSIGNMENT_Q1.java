package assignment4;

public class HOMEASSIGNMENT_Q1 {

	public static void main(String[] args) {
		int SumOfSquares = 0;
        int SquareOfSum = 0;

        for (int i = 1; i <= 10; i++) {
            SumOfSquares += i * i;
            SquareOfSum += i;
        }

        SquareOfSum *= SquareOfSum;

        int difference = SquareOfSum - SumOfSquares;
        System.out.println("The sum of the square of the first ten natural numbers are : "+SumOfSquares+"" );
        System.out.println("The sqaure of the sum of the first ten natural numbers are : "+SquareOfSum+"");
        System.out.println("The difference is: " + difference);

	}

}
