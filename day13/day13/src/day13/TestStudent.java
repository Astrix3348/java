package day13;

import java.util.Scanner;

public class TestStudent {
	
	public static void main(String[] args) {
		Methods m = new Methods();
		Scanner s = new Scanner(System.in);
		int n;
		do {
			System.out.println("1--->Add Student");
			System.out.println("2--->Remove Student");
			System.out.println("3--->Display Student");
			System.out.println("4--->Search marks");
			System.out.println("5--->Find Topper");
			System.out.println("6--->Find average of class");
			System.out.println("7--->Update marks of a student");
			System.out.println("8--->Sorting in ascending order");
			System.out.println("9--->Sorting in descending order");
			
			
			n = s.nextInt();
			
			switch(n) {
			case 1 : m.addStudent();
				break;
			case 2 : m.removeStudent();
				break;
			case 3 : m.display();
				break;
			case 4 : m.searchMarks();
				break;
			case 5 : m.topper();
				break;
			case 6 : m.average();
				break;
			case 7 : m.updateMarks();
			    break;
			case 8 : m.ascending();
			    break;
			case 9 : m.descending();
		        break;
				
			}
		}while(n!=10);
		
		s.close();
	}

}
