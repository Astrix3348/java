package day17_practice;

import java.sql.SQLException;
import java.util.Scanner;

public class EmployeeManagement {
	
       public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		EmployeeMethods em = new EmployeeMethods();
		Scanner s = new Scanner(System.in);
		int n;
		
		do {
			System.out.println("1-->Insert Employees");
			System.out.println("2-->remove Employees");
			System.out.println("3-->display Employees");
			System.out.println("4-->search Employees");
			System.out.println("5-->update Employee salary");
			System.out.println("6-->calculate net Salary");
			
			n = s.nextInt();
			
			switch(n) {
			case 1:em.insertEmployee();
				break;
			case 2:em.deleteEmp();
				break;
			case 3:em.displayEmp();
				break;
			case 4:em.displayById();
				break;
			case 5:em.updateSalary();
				break;
			case 6:em.netSalary();
				break;
			case 7:System.out.println("GoodBye...");
				break;
				
			}

		}while(n!=7);
		s.close();
	}
}
