package assignment2;

public class COMMANDLINE_Q6 {

	public static void main(String[] args) {
		System.out.println(args[0]);
		System.out.println(args[1]);
		System.out.println(args[2]);
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		int c=Integer.parseInt(args[2]);
		int max=Math.max(a,b);
		int max1=Math.max(max,c);
		int min=Math.min(a,b);
		int min1=Math.min(min,c);
		
		int middle_value=(a+b+c-min1-max1);
		
		System.out.println("The number is ascending order "+min1+" "+middle_value+" "+max1);
		

	}

}
