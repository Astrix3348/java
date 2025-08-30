package day6;

class Employee{
	String name;
	int salary;
	
	public void displayDetails() {
		System.out.println(name);
		System.out.println(salary);
	}
}

class Manager extends Employee{
	int teamSize;
	
	Manager(String name, int salary, int teamSize){
		this.name = name;
		this.salary = salary;
		this.teamSize = teamSize;
	}
	
	public void calculateBonus() {
		if (teamSize>=5) {
		    salary += 10000;
		}
	}
}

public class Q3 {
	
	public static void main(String[] args) {
		Manager m = new Manager("Aakash", 200000, 7);
		m.calculateBonus();
		m.displayDetails();
		
	}

}
