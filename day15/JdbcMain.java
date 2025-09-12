package day15;

import java.sql.SQLException;
import java.util.Scanner;

public class JdbcMain {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		MethodJdbc m = new MethodJdbc();
		Scanner s = new Scanner(System.in);
		int n;
		
		do {
			System.out.println("1--->Insert emp");
			System.out.println("2--->Remove emp");
			System.out.println("3--->Display emp");
			System.out.println("4--->update emp");
			System.out.println("5--->Find by dept");
			System.out.println("6--->Number of employees");
			System.out.println("7--->Check if employee exists");
			System.out.println("8--->Exit");
			
			n = s.nextInt();
			
			switch(n) {
			case 1: m.insertEmp();
				break;
			case 2: m.removeEmp();
				break;
			case 3: m.display();
				break;
			case 4: m.updateEmp();
				break;
			case 5: m.searchByDept();
			    break;
			case 6 : m.countEmp();
			    break;
			case 7 : m.checkIfExists();
		        break;

			}
		}while(n!=8);	
		s.close();
	}
}
