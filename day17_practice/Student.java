package day17_practice;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

public class Student implements Serializable{
	private static final long serialVersionUID = 1L;
	int id;
	String name;
	float marks;
	
	public Student(int id, String name, float marks) {
		this.id = id;
		this.name = name;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}
	
	public void getGrade() {
		if(marks>=90 && marks<=100) {
			System.out.println("A");
		}
		else if(marks>=80 && marks<90){
			System.out.println("B");
		}
		else {
			System.out.println("C");
		}
	}
}

class Methods{
	
	ArrayList<Student> al = new ArrayList<>();
	Scanner s = new Scanner(System.in);
	
	public void acceptStudents() throws IOException {
		
		FileOutputStream fo = new FileOutputStream("student.dat");
		ObjectOutputStream os = new ObjectOutputStream(fo);
		Student ss;
		
		System.out.println("How many students you want to add?");
		int n = s.nextInt();
		for(int i=0; i<n; i++) {
			System.out.println("Enter id, name, marks");
			ss = new Student(s.nextInt(), s.next(), s.nextFloat());
			al.add(ss);
			os.writeObject(ss);
		}
		os.close();
	}
	
	public void showStudents() throws IOException, ClassNotFoundException {
		FileInputStream fi = new FileInputStream("student.dat");
		ObjectInputStream oi = new ObjectInputStream(fi);
		Student str;
		
		try {
			while((str = (Student)oi.readObject())!=null) {
				System.out.println(str);
				str.getGrade();
			}
			
		}
		catch(EOFException e) {
			
		}
	}
	
	public void updateStudents() throws IOException {
		FileOutputStream fo = new FileOutputStream("student.dat");
		ObjectOutputStream os = new ObjectOutputStream(fo);
		
		System.out.println("Enter id of Student");
		int check = s.nextInt();
		System.out.println("What change in marks you want?");
		float newMarks = s.nextFloat();
		for(Student t : al) {
			if(check == t.id) {
				t.marks = newMarks;
			}
			os.writeObject(t);
		}
		os.close();
	}
	
	public void deleteStudent() throws IOException {
		FileOutputStream fo = new FileOutputStream("student.dat");
		ObjectOutputStream os = new ObjectOutputStream(fo);
		
		System.out.println("Enter Student id");
		int check = s.nextInt();
		Student pos=null;
		for(Student t : al) {
			if(check==t.id) {
				pos = t;
			}
		}
		al.remove(pos);
		for(Student t : al) {
			os.writeObject(t);
		}
		System.out.println("Student removed");
		os.close();
	}
	
	
}
