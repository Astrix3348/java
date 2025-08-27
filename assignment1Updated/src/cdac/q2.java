package cdac;
import java.util.Scanner;

public class q2 {
	
	public static String classifyNumber(int n) {
		
		String res;
		if(n>0) {
			res = "Positive";
		}
		else if(n<0) {
			res = "Negative";
		}
		else {
			res = "Zero";
		}
		
		return res;

	}
	
	public static void main(String[] args) {
		
		int n;
		Scanner myObj = new Scanner(System.in);
		n = myObj.nextInt();
		
		System.out.println(classifyNumber(n));
	}

}
