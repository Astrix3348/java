package day16_practice;

import java.io.IOException;
import java.util.Scanner;

public class StudentMain {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		StudentMethods sm = new StudentMethods();
		Scanner s = new Scanner(System.in);
		int n;
		do {
			System.out.println("1-->add Student");
			System.out.println("2-->remove Student");
			System.out.println("3-->display Student");
			System.out.println("4-->update Student");
			System.out.println("6-->Get Grades of Student");
			System.out.println("5-->Exit");
			
			n = s.nextInt();
			
			switch(n) {
			case 1:sm.addStudent();
				break;
			case 2:sm.removeStudents();
				break;
			case 3:sm.showStudents();
				break;
			case 4:sm.updateDetails();
				break;
			case 5:System.out.println("GoodBye....");
				break;
			case 6:sm.displayGrade();
			    break;
			}

		}while(n!=5);
		
		s.close();
	}

}
