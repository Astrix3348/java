package day16_practice;

public class Employee {
	String name;
	double salary;
	
	public Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}
	public void display() {
		System.out.println(name + " " + salary);
	}
	

}

class Manager extends Employee{
	
	int size;

	Manager(String name, double salary, int size) {
		super(name, salary);
		this.size = size;
		
	}
	public void calculateBonus() {
		if(size>5) {
			salary += 5000;
		}
	}
	
}
