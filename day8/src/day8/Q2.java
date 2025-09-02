package day8;

class  Person{
	int age;
	String name;
	String id;
	
	Person(int age,String name,String id){
		this.age = age;
		this.name = name;
		this.id = id;
	}
	
}
class Student extends Person{
	
	Student(int age,String name,String id){
		super(age, name, id);
		
	}
	public String calculateGrade(int marks) {
		if(marks>=90) {
			return "A";
		}
		else if(marks>=80 &&marks<90) {
			return "B";
		}
		else {
			return "C";
			
		}
	}
	
	
	
}
class Teacher extends Person{
 
	Teacher(int age,String name,String id){
		super(age, name, id);
		
		
	}
	public void calculateSalary(int hoursWorked,int ratePerHour) {
		int sal = hoursWorked*ratePerHour;
		System.out.println(sal);
	}
}

public class Q2 {
public static void main(String[] args) {
	Student s = new Student(20,"swi","1");
	System.out.println(s.calculateGrade(90));
	Teacher t = new Teacher(39,"a","2");
	t.calculateSalary(4, 500);
}
	
}
