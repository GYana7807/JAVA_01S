package assignment2;

public class COMMANDLINE_Q2 {

	public static void main(String[] args) {
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		double power=Math.pow(a,b);
		System.out.println("Power is  "+power);

	}

}
