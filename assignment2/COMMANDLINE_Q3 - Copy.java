package assignment2;

public class COMMANDLINE_Q3 {

	public static void main(String[] args) {
		int max=Integer.parseInt(args[0]);
		int min=Integer.parseInt(args[1]);
		int d1=(int)(Math.random()*(max-min+1))+min;
		int d2=(int)(Math.random()*(max-min+1))+max;
		int sum=d1+d2;
		System.out.println("sum of two random integer "+d1+" and "+d2+" is "+sum);

	}

}
