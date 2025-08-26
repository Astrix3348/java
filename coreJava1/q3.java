package coreJava1;
import java.util.Scanner;

public class q3 {
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		
		int n1 = myObj.nextInt();
		int n2 = myObj.nextInt();
		int n3 = myObj.nextInt();
		
		if(n1>n2 && n1>n3) {
			System.out.println(n1);
		}
		else if(n2>n1 && n2>n3) {
			System.out.println(n2);
		}
		else {
			System.out.println(n3);
		}
	}

}
