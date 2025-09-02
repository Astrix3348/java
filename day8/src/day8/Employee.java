package day8;

public class Employee {
	int id;
	String name;
	String position;
	Address add;
	
	Employee(int id, String name, String position, Address add) {
		
		this.id = id;
		this.name = name;
		this.position = position;
		this.add = add;
	}
	
	 void displayEmployee() {
		System.out.println(id + " " + name + " " + position);
		add.displayAdd();
	}
	
	

}
