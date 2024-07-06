package assignment4;

public class HOMEASSIGNMENT_Q3 {

	public static void main(String[] args) {
		int i,sum=0;
		for(i=1;i<1000;i++)
		{
		if(i%3==0||i%5==0)
		sum+=i;

		}
		System.out.println("Sum of multiples of 3&5 below 1000 is = "+sum);

	}

}
