package day16_practice;

import java.util.Scanner;

public class Student {
	
	int id;
	String name;
	String cname;
	double marks;
	
	public Student(int id, String name, String cname, double marks) {
		this.id = id;
		this.name = name;
		this.cname = cname;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return id + " " + name + " " + cname + " " + marks;
	}
}

class Methods{
	Scanner s = new Scanner(System.in);
	int n;
	
	public void accept(Student[] stu) {
		System.out.println("Enter the number of students you want to add");
	    n = s.nextInt();
	    for(int i=0; i<n; i++) {
	    	System.out.println("Enter id, name, cname, marks");
	    	stu[i] = new Student(s.nextInt(), s.next(), s.next(), s.nextDouble());
	    	
	    }
	}
	
	public void display(Student[] stu) {
		for(int i=0; i<n; i++) {
			System.out.println(stu[i].toString());
		}
		
	}
	
	public void findResult(Student[] stu) {
		System.out.println("Enter the id whose result you wanna see");
		int check = s.nextInt();
		for(int i=0; i<n; i++) {
			if(check == stu[i].id) {
			   if(stu[i].marks>40) {
				   System.out.println("Pass");
			   }
			   else {
				   System.out.println("Fail");
			   } 	
			}
		}
	}

}
