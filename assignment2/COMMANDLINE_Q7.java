package assignment2;

public class COMMANDLINE_Q7 {

	public static void main(String[] args) {
		System.out.println(args[0]);
		System.out.println(args[1]);
		System.out.println(args[2]);
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		int c=Integer.parseInt(args[2]);
		boolean result = (a<=b*c)|| b<=(a*c)||c<=(a*b);
		System.out.println(result);

	}

}
