package coreJava1;
import java.util.Scanner;

public class q2 {
	public static void main(String[]args) {
  Scanner myObj = new Scanner(System.in);
  int num1 = myObj.nextInt();
  if(num1%2==0) {
	  System.out.println("even");
  }
  else {
	  System.out.println("odd");
  }
}
}