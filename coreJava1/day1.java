package coreJava1;
import java.util.Scanner;

public class day1 {
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		
		int num1 = myObj.nextInt();
		int num2 = myObj.nextInt();
		
		int add = num1 + num2;
		System.out.println(add);
		
		int sub = num1 - num2;
		System.out.println(sub);
		
		int multiply = num1 * num2;
		System.out.println(multiply);
		
		int div = num1 / num2;
		System.out.println(div);
	}
	

}
