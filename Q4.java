package day6;

class Student{
	String name;
	int marks;
	
	
	public void showDetails() {
		System.out.println(name);
		System.out.println(marks);
	}
	
}

class GraduateStudent extends Student {
	String specialization;
	
	GraduateStudent(String name, int marks, String specialization){
		this.name = name;
		this.marks = marks;
		this.specialization = specialization;
	}
	//overriding 
	public void showDetails() {
		super.showDetails();
		System.out.println(specialization);
		
	}
	
	public void checkPass() {
		if(marks >= 50) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
	}
}

public class Q4 {
	public static void main(String[] args) {
		GraduateStudent g = new GraduateStudent("Aakash", 100, "Dac");
		g.showDetails();
		g.checkPass();
	}

}
