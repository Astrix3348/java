package cdac;

import java.io.Serializable;

public class Student implements Serializable
{
     int id;
     String name;
     int mark;
	public Student(int id, String name, int mark) {
		
		this.id = id;
		this.name = name;
		this.mark = mark;
	}
	
	void displayStudent()
	{
		System.out.print(id+name+mark);
	}
	
}
