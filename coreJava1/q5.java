package coreJava1;
import java.util.Scanner;

public class q5 {
	public static void main(String[] args) {
		 Scanner myObj = new Scanner(System.in);
		 
		 int year = myObj.nextInt();
		 
		 if((year%4==0 && year%100==0 && year%400==0) || year%4==0 && year%100!=0) {
			 System.out.println("Yes its a leap year");
		 }
		 else {
			 System.out.println("Not a leap year");
		 }
	}

}
