package day9;

public class Employee {
	
	String name;
	int basicSalary;
	Employee(String name, int basicSalary) {

		this.name = name;
		this.basicSalary = basicSalary;
		
	}
	
	public void displaySalary() {
		System.out.println(basicSalary);
	}

}

class Manager extends Employee{
	
	Manager(String name, int basicSalary){
		super(name, basicSalary);
	}
	
	@Override
	public void displaySalary() {
		basicSalary += basicSalary*0.2;
		System.out.println(basicSalary);
	}
}

class SoftwareEngineer extends Employee{
	
	SoftwareEngineer(String name, int basicSalary){
		super(name, basicSalary);
	}
	
	@Override
	public void displaySalary() {
		basicSalary += basicSalary*0.15;
		System.out.println(basicSalary);
	}
	
}
