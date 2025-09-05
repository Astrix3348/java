package day10;

import java.util.ArrayList;
import java.util.Scanner;

class Employee{
	String name;
	int id;
	int salary;
	public Employee(String name, int id, int salary) {
		
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	
	public void display() {
		System.out.println(name + " " + id + " " + salary);
	}
}



public class ArrayListExample {
				
		ArrayList<Employee> al = new ArrayList<>();	
		Scanner s = new Scanner(System.in);
		Employee[] e = new Employee[10];
		
		public ArrayList<Employee> getDetails() {
			
			System.out.println("Enter the numbe of employees you want to add:");
			
			int n = s.nextInt();
			for(int i=0; i<n; i++) {
				e[i] = new Employee(s.next(), s.nextInt(), s.nextInt());
				al.add(e[i]);
			}
			return al;
		}
		
		public void displayEmp() {
			for(Employee obj : al) {
				obj.display();
			}
		}
		
		public void updateSalary(Employee[] e) {
			System.out.println("Enter the id of the employee whose salary you want to increase");
			int eid = s.nextInt();
		
			for(Employee obj : al) {
				if(eid == obj.id) {
					obj.salary += 20000;
				}
			}
		}
		
		public void removeEmployee(Employee[] e) {
			int pos=0;
			System.out.println("Enter the id of the employee who you want to remove");
			int eid = s.nextInt();
			
			for(Employee obj : al) {
				if(eid == obj.id) {
					pos = al.indexOf(obj);
				}
			} 
			al.remove(pos);
			System.out.println(eid + " " +"id has been deleted");
		
		}
		
		


}
