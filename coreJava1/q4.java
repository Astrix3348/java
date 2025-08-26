package coreJava1;
import java.util.Scanner;

public class q4 {
	public static void main(String []args) {
		Scanner myObj = new Scanner(System.in);
		int marks = myObj.nextInt();
		if(marks>=50) {
			System.out.println("Passed");
		}
		else {
			System.out.println("Failed");
		}
	}

}
