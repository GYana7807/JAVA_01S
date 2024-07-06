package assignment2;

public class COMMANDLINE_Q4 {

	public static void main(String[] args) {
		System.out.println(args[0]);
		double t=Double.parseDouble(args[0]);
		t=Math.toRadians(t);
		double a=Math.cos(5*t);
		double b=Math.sin(7*t);
		System.out.println("The result is: "+(a+b));

	}

}
