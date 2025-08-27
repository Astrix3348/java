package cdac;
import java.util.Scanner;

public class q3 {
	
	public static double celciusToFareinheit(double c) {
		double f = ((1.8) * c) + 32;
		
		return f;
	}
	public static double fareinheitToCelcius(double f) {
		double c = (f-32)*(0.555);
		
		return c;
	}
	
	public static void main(String[] args) {
		double c;
		double f;
		int n;
		Scanner myObj = new Scanner(System.in);
		
		System.out.println("Press 1 for celcius to fareinheit");
		System.out.println("Press 2 for fareinheit to celcius");
		
		n = myObj.nextInt();
		
		if(n==1) {
			c = myObj.nextDouble();
			System.out.println(celciusToFareinheit(c));
		}
		else {
			f = myObj.nextDouble();
			System.out.println(fareinheitToCelcius(f));
		}
		
		
		
		
		
		
		
		
		
		
	}
	

}
