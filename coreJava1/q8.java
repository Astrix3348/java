package coreJava1;
import java.util.Scanner;

public class q8 {
 public static void main(String[]args) {
	 Scanner myObj = new Scanner(System.in);
	 int principal = myObj.nextInt();
	 double rate = myObj.nextDouble();
	 int time = myObj.nextInt();
     double si = (principal*rate*time)/100;
     System.out.println(si);
	 
 }
}
