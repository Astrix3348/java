package day11;

import java.util.Scanner;

public class TestEnroll {
	public static void main(String[] args) {
		Test t = new Test();
		
		int n;
		Scanner s = new Scanner(System.in);
		
		do {
			System.out.println("1-->Add Student");
			System.out.println("2-->Remove Student");
			System.out.println("3-->Display Student");
			System.out.println("4-->Calculate total fee of Course");
			System.out.println("5-->Show the courses enrolled by a student");
			System.out.println("6-->List the unique courses");
			System.out.println("7-->Highest paying Student");
			System.out.println("8-->Update course of student");
			System.out.println("9-->Show the students enrolled in a particular course");
			System.out.println("10-->Exit");
			
			n = s.nextInt();
			
			switch(n) {
			case 1 : t.addEnrollment();
				break;
			case 2 : t.removeEnrollment();
				break;
			case 3 : t.displayEnrollments();
				break;
			case 4 : t.totalFee();
				break;
			case 5 : t.search();
				break;
			case 6 : t.uniqueCourses();
				break;
			case 7 : t.highest();
			    break;
			case 10 : System.out.println("Goodbye, Exiting....");    
			    break;	
			case 8 : t.updateDetails();
			    break;
			case 9 : t.showStudents();
			    break;
			}
			
		}while(n!=10);	
	s.close();
		
	}
}

