package cdac;
import java.util.Scanner;

public class q7 {
	
	public static double simple(double p, double r, double t) {
		double si = (p*r*t)/100;
		return si;
	}
	
	public static void main(String[] args) {
		double p, r, t;
		Scanner myObj = new Scanner(System.in);
		p = myObj.nextDouble();
		r = myObj.nextDouble();
		t = myObj.nextDouble();
		
		System.out.println(simple(p,r,t));
	}

}
