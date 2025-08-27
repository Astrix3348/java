package cdac;
import java.util.Scanner;


public class q4 {
	
	public static String grade(int marks) {
		String res;
		if(marks>90) {
			res = "A";
		}
		else if(marks<90 && marks>80) {
			res = "B";
		}
		else if(marks<=80 && marks>=70) {
			res = "B";
		}
		else if(marks<70 && marks>60) {
			res = "B";
		}
		else {
			res = "F";
		}
		
		return res;
	}
	
	public static void main(String[] args) {
		int marks;
		Scanner myObj = new Scanner(System.in);
		marks = myObj.nextInt();
		
		System.out.println(grade(marks));
		
		
		
	}

}
