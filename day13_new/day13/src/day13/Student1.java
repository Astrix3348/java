package day13;

import java.io.Serializable;


public class Student1 implements Serializable{
	
	private static final long serialVersionUID = -1503689566948945496L;

	int id;
	String name;
	int marks;
	
	public Student1(int id, String name, int marks) {
		
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	
	public void display() {
		System.out.println(id +" "+ name + " " + marks);
	}
	
	
}

