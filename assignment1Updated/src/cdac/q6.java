package cdac;
import java.util.Scanner;

public class q6 {
	
	public static void reverse(String s) {
		for(int i=s.length()-1; i>=0; i--) {
			System.out.println(s.charAt(i));
		}
		
	}
	public static void main(String[] args) {
		String s;
		Scanner myObj = new Scanner(System.in);
		s = myObj.next();
		reverse(s);
	}

}
