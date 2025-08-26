package coreJava1;
import java.util.Scanner;

public class q7 {
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		
		char input = myObj.next().charAt(0);
		
		int Ascii = (int)input;
		if(Ascii >= 33 && Ascii <= 47) {
			System.out.println("its a special character");
		}
		else if(Ascii >= 48 && Ascii <= 57) {
			System.out.println("it is a digit");
		}
				
		else if(input == 'a' || input == 'e' || input == 'i'|| input == 'o' || input == 'u') {
			System.out.println("its a vowel");
	
		}
		else {
			System.out.println("it is a consonant");
		}
		
		
	}

}
