package coreJava1;
import java.util.Scanner;

public class q6 {
 public static void main(String[]args) {
	 Scanner myObj = new Scanner(System.in);
	 int n1 = myObj.nextInt();
	 if(n1>0) {
		 System.out.println("Positive");
	 }
	 else if(n1<0) {
		 System.out.println("Negative");
	 }
	 else {
		 System.out.println("Zero");
	 }
 }
 
}
