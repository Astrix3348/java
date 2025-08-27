package cdac;

import java.util.Scanner;

public class q5 {
	
	public static void reverse(int n) {
		int digit;
		while(n>0) {
			digit = n%10;
			System.out.print(digit);
			n = n/10;
		}
	}
	
	public static void main(String[] args) {
		int n;
		Scanner myObj = new Scanner(System.in);
		n = myObj.nextInt();
		reverse(n);
	}

}
