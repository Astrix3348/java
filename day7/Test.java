package day7;

class Person{
	int id;
	String name;
	String add;
	
	Person(int id, String name, String add){
		this.id = id;
		this.name = name;
		this.add = add;
		
	}
	
	public void displayPerson() {
		System.out.print(id+ " " + name + " " + add);
	}
	
}

class Student extends Person{
	int marks;
	
	Student(int id, String name, String add, int marks){
		super(id, name, add);
		this.marks = marks;
	}
	
	public void displayStudent() {
		super.displayPerson();
		System.out.println(" " + marks);
	}
}

class Teacher extends Person{
	float sal;
	
	Teacher(int id, String name, String add, float sal){
		super(id, name, add);
		this.sal = sal;
		
	}
	
	public void displayTeacher() {
		super.displayPerson();
		System.out.println(" " + sal);
	}
}

public class Test {

	public static void main(String[] args) {
		Student s = new Student(1, "aakash", "radhika", 100);
		s.displayStudent();
		Teacher t = new Teacher(2, "gargi", "swarna", 300000);
		t.displayTeacher();
	}

}
