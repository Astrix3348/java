package day17_practice;

import java.io.IOException;
import java.util.Scanner;

public class StudentMain {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Methods m = new Methods();
		Scanner s = new Scanner(System.in);
		int n;
		
		do {
			System.out.println("1-->Insert Students");
			System.out.println("2-->remove Students");
			System.out.println("3-->display Students");
			System.out.println("4-->update Students marks");
			
			
			n = s.nextInt();
			
			switch(n) {
			case 1:m.acceptStudents();
				break;
			case 2:m.deleteStudent();
				break;
			case 3:m.showStudents();
				break;
			case 4:m.updateStudents();
				break;
			case 5:System.out.println("GoodBye..");
				break;
			
				
			}

		}while(n!=5);
		s.close();
	}

}
