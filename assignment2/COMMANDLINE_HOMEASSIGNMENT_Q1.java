package assignment2;

public class COMMANDLINE_HOMEASSIGNMENT_Q1 {

	public static void main(String[] args) {
		if(args.length != 3) {
			System.out.println("Please provide exactly three arguments: principle, rate, time.");
				            return;
				        }

				        // Parse the command line arguments
				        double principle = Double.parseDouble(args[0]);
				        double rate = Double.parseDouble(args[1]);
				        double time = Double.parseDouble(args[2]);

				        // Calculate the simple interest
				        double interest = (principle * rate * time) / 100;

				       
	    System.out.println(+ principle);
	    System.out.println( + rate);
		System.out.println(+ time);
		System.out.println("The simple interest is: " + interest);

	}

}
