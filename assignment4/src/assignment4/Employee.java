package assignment4;
import java.util.Scanner;

public class Employee {
	
	int empId;
	String name;
	int basicSalary;
	
	public double gross(int basicSalary) {
		double total=0;
		total = basicSalary + (0.2 * basicSalary) + (0.1 * basicSalary);
		
		return total;
	}
	
	public void display() {
		System.out.println(empId);
		System.out.println(name);
		System.out.println(gross(basicSalary));
	}
	
	
	public Employee(int empId, String name, int basicSalary) {
		this.empId = empId;
		this.name = name;
		this.basicSalary = basicSalary;
	}
	
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		
		Employee[] e = new Employee[5];
		for(int i=1; i<5; i++) {
			System.out.println("Enter details of Employee :" + i);
			e[i] = new Employee(myObj.nextInt(), myObj.next(), myObj.nextInt());
			e[i].display();
		}
	}

}
