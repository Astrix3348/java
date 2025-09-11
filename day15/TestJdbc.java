package day15;


import java.sql.SQLException;
import java.util.Scanner;


public class TestJdbc {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Methods m = new Methods();
		Scanner s = new Scanner(System.in);
		
		int n;
		
		do {
			System.out.println("1---->Insert student in database");
			System.out.println("2---->Delete student from database");
			System.out.println("3---->Display students from database");
			System.out.println("4---->Update student marks in database");
			
			n = s.nextInt();
			switch(n) {
			case 1: m.insertStudents();
				break;
			case 2: m.removeStudent();
				break;
			case 3: m.display();
				break;
			case 4: m.updateStudent();
				break;
			}
		
		}
		while(n!=5);
        s.close();
	}
}
