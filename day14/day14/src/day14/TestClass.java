package day14;

import java.io.IOException;
import java.util.Scanner;

public class TestClass {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		WriteTest wt = new WriteTest();
		Scanner s = new Scanner(System.in);
		int n;
		
		do {
			System.out.println("1-->Add Employee");
			System.out.println("2-->Remove Employee");
			System.out.println("3-->Display Employee");
			System.out.println("4-->Update Employee");
			System.out.println("5-->Exit");
			
			n = s.nextInt();
			
			switch(n) {
			
			case 1 : wt.addEmployee();
				break;
			case 2 : wt.removeEmployee();
				break;
			case 3 : wt.display();
				break;
			case 4 : wt.updateEmp();
				break;
			case 5 : System.out.println("Goodbye....");
				break;
			
			}
			
			
		}while(n!=5);
		
		s.close();
	}

}
