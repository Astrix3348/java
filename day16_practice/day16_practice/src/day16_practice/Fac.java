package day16_practice;

import java.util.Scanner;

public class Fac {
	
	public static void factorial() {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter string");
		String n = s.next();
		for(int i=n.length()-1; i>=0; i--) {
			System.out.print(n.charAt(i));
		}
		
	}
	
     public static void main(String[] args) {
		factorial();
	}

}
