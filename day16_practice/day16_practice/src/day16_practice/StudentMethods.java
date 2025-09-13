package day16_practice;


import java.io.FileOutputStream;
import java.io.IOException;

import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentMethods {
	ArrayList<Student> al = new ArrayList<>();
	Student stu;
	Scanner s = new Scanner(System.in);
	
	public void addStudent() throws IOException {
		FileOutputStream fo = new FileOutputStream("student.dat");
		ObjectOutputStream os = new ObjectOutputStream(fo);
		
		System.out.println("Enter the number of students");
		
		int n = s.nextInt();
		for(int i=0; i<n; i++) {
			System.out.println("Enter id, name, course, marks");
			Student stu = new Student(s.nextInt(), s.next(), s.next(), s.nextDouble());
			os.writeObject(stu);
			al.add(stu);
		}
		
		os.close();
		
	}
	
	public void showStudents() throws IOException, ClassNotFoundException {
		for(Student ss : al) {
			System.out.println(ss.toString());
			
		}
		
	}
	
	public void displayGrade() throws IOException {
		FileOutputStream fo = new FileOutputStream("student.dat");
		ObjectOutputStream os = new ObjectOutputStream(fo);
		
		
		System.out.println("Enter Student id to show grades");
		int sid = s.nextInt();
		
		
		for(Student ss : al) {
			if(ss.id == sid) {
				System.out.println(ss.getGrade());
			}
		}
		os.close();
		
	}
	
	public void updateDetails() throws IOException {
		FileOutputStream fo = new FileOutputStream("student.dat");
		ObjectOutputStream os = new ObjectOutputStream(fo);
		
		System.out.println("Enter id for whom to update");
		int sid = s.nextInt();
		for(Student ss : al) {
			if(ss.id==sid) {
				System.out.println("What do you want to update? marks/course");
				String check = s.next();
				if(check.equalsIgnoreCase("marks")) {
					System.out.println("How many marks to increase?");
					double newMarks = s.nextDouble();
					ss.marks += newMarks;
					for (Student st : al) {
					    os.writeObject(st);
					}
				}
				else {
					System.out.println("What course to change");
					String newCourse = s.next();
					ss.course = newCourse;
					for (Student st : al) {
					    os.writeObject(st);
					}
				}
			}
		}
		os.close();
	}
	
	public void removeStudents() throws IOException {
		FileOutputStream fo = new FileOutputStream("student.dat");
		ObjectOutputStream os = new ObjectOutputStream(fo);
		
		System.out.println("Enter sid to remove");
		int sid = s.nextInt();
		int pos = 0;
		for(Student ss : al) {
			if(ss.id == sid) {
				pos = al.indexOf(ss);
			}
			
		}
		al.remove(pos);
		for(Student ss : al) {
			os.writeObject(ss);
		}
		os.close();
		
		
	}
}
