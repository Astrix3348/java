package day15;

import java.sql.SQLException;
import java.util.Scanner;

public class EmployeeMain {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Method m = new Method();
		Scanner s = new Scanner(System.in);
		
		int n;
		
		do {
			System.out.println("1---->Insert employee in database");
			System.out.println("2---->Delete employee from database");
			System.out.println("3---->Display employee from database");
			System.out.println("4---->Update employee marks in database");
			System.out.println("5---->Search employee in database");
			
			n = s.nextInt();
			switch(n) {
			case 1: m.insert();
				break;
			case 2: m.removeEmp();
				break;
			case 3: m.displayEmp();
				break;
			case 4: m.updateEmp();
				break;
			case 5: m.searchEmp();
			    break;
			}
		
		}
		while(n!=6);
        s.close();
	}

}
