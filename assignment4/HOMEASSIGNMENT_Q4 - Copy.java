package assignment4;
import java.util.*;
public class HOMEASSIGNMENT_Q4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int N = sc.nextInt();
        int evenSum = 0;
        int oddProduct = 1;

        for (int i = 1; i <= N; i++) {
            if (i % 2 == 0) {
                evenSum += i;
            } else {
                oddProduct *= i;
            }
        }

        System.out.println("The sum of all even numbers " + N + " is : " + evenSum);
        System.out.println("The product of all odd number " + N + " is : " + oddProduct);
    }

	}



