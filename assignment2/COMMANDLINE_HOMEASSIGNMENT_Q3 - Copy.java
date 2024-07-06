package assignment2;

public class COMMANDLINE_HOMEASSIGNMENT_Q3 {

	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		int lastD = n%10;
		int firstD = n/1000;
		int sum = lastD + firstD;
		System.out.println(n);
		System.out.println(lastD);
		System.out.println(firstD);
		System.out.println("Sum = "+sum);

	}

}
