package cdac;
import java.util.Scanner;

public class q1 {
	
	public static int findFactorial(int n) {
		int fact=1;
		for(int i=1; i<=n; i++) {
			fact = fact*i;
		}
		return fact;
	}
	
	public static void main(String[] args) {
		
		int n;
		Scanner myObj = new Scanner(System.in);
		n = myObj.nextInt();
		if(n==0) {
			System.out.println("Invalid");
		}
		else {
		System.out.println(findFactorial(n));
		}
	}

}
