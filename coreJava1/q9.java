
package coreJava1;
import java.util.Scanner;

public class q9 {
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		
		int sub1 = myObj.nextInt();
		int sub2 = myObj.nextInt();
		int sub3 = myObj.nextInt();
		int sub4 = myObj.nextInt();
		int sub5 = myObj.nextInt();
		
		double per = (sub1+sub2+sub3+sub4+sub5)/5;
		System.out.println(per);
		
		if(per>90) {
			System.out.println('A');
		}
		else if(per<90 && per>80) {
			System.out.println('B');
		}
		else if(per<80 && per>70) {
			System.out.println('C');
		}
		else {
			System.out.println('D');
		}
		
	}

}
