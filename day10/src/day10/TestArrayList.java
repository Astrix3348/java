package day10;

import java.util.Scanner;

public class TestArrayList {
	public static void main(String[] args) {

		ArrayListExample a = new ArrayListExample();
		Employee[] e = new Employee[10];
		Scanner s = new Scanner(System.in);
		int n = 0; 
		
		do {
			System.out.println("1-->Add Employees");
			System.out.println("2-->Remove Employees");
			System.out.println("3-->Update salary of Employees");
			System.out.println("4-->Show Employees");
			System.out.println("5-->Exit");
			
			n = s.nextInt();
			
			switch(n) {
			
			case 1 : a.getDetails();
				break;
			case 2 : a.removeEmployee(e);
				break;
			case 3 : a.updateSalary(e);
				break;
			case 4 : a.displayEmp();;
			    break;
			
			}
			
		}while(n!=5);
	   
		s.close();

	}

}
