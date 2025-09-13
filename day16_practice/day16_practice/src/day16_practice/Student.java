package day16_practice;

import java.io.Serializable;

public class Student implements Serializable{
	private static final long serialVersionUID = -6472032985610302552L;
	int id;
	String name;
	String course;
	double marks;
	
	public Student(int id, String name, String course, double marks) {
		this.id = id;
		this.name = name;
		this.course = course;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", course=" + course + ", marks=" + marks + "]";
	}
	
	public String getGrade() {
		if(marks>=90) {
			return "A";
		}
		else if(marks>=80 && marks <=89) {
			return "B";
		}
		else {
			return "C";
		}
	}
	

}
