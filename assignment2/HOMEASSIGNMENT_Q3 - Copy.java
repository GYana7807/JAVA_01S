package assignment2;
import java.util.*;
public class HOMEASSIGNMENT_Q3 {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		 System.out.println("Enter three points for a triangle");
		 double x1=sc.nextDouble();
		 double y1=sc.nextDouble();
		 double x2=sc.nextDouble();
		 double y2=sc.nextDouble();
		 double x3=sc.nextDouble();
		 double y3=sc.nextDouble();
		 double Side1=Math.sqrt(Math.pow((x1-x2),2)+Math.pow((y1-y2),2));
		 double Side2=Math.sqrt(Math.pow((x1-x3),2)+Math.pow((y1-y3),2));
		 double Side3=Math.sqrt(Math.pow((x2-x3),2)+Math.pow((y2-y3),2));
		 double s=(Side1+Side2+Side3);
		 double area=Math.sqrt(s*(s-Side1)*(s-Side2)*(s-Side3)/2);
		 System.out.println("The area of triangle is:  "+area);

	}

}
