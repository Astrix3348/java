package day13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Student {
	int roll;
	double marks;
	
	public Student(int roll, double marks) {
		
		this.roll = roll;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Rollnumber: " + roll + ", Marks: " + marks;
	}
}

class Methods{
	HashMap<Integer, Student> h = new HashMap<>();
	ArrayList<Double> al = new ArrayList<>();
	Scanner s = new Scanner(System.in);
	
	public HashMap<Integer, Student> addStudent(){
		System.out.println("Enter the number of students you want to enter");
		int n = s.nextInt();
		for(int i=0; i<n; i++) {
			System.out.println("Enter rollnumber, marks");
			Student t = new Student(s.nextInt(), s.nextDouble());
			al.add(t.marks);
			h.put(t.roll, t);
		}
		return h;
	}
	
	public void removeStudent() {
		System.out.println("Enter the roll number of the student you want to remove");
	    int n = s.nextInt();
	    h.remove(n);
	    
	    System.out.println("Student removed");
	}
	
	public void searchMarks() {
		System.out.println("Enter the student's roll number");
		int n = s.nextInt();
		Student t = h.get(n);
		System.out.println(t.marks);
	}
	
	public void display() {
		for(Map.Entry<Integer, Student> m : h.entrySet()) {
			System.out.println(m.getValue());
		}
	}
	
	public void topper() {
		double max = 0;
		int num = 0;
		for(Student tt : h.values()) {
			if(tt.marks>max) {
				max = tt.marks;
				num = tt.roll;
			}
		}
		System.out.println("Topper is "+ h.get(num));
	}
	
	public void average() {
		double total = 0;
		for(Student tt : h.values()) {
			total += tt.marks;
		}
		System.out.println("Class average is : " + total/h.size());
	}
	
	public void updateMarks() {
		System.out.println("Enter the id of student whose marks you want to update");
	    int n = s.nextInt();
	    Student old = h.get(n);
	    System.out.println("What change to marks you want to do?");
	    double newMarks = s.nextDouble();
	    Student newStu = new Student(old.roll, newMarks);
	    
	    h.replace(n, newStu);
	}
	
	public void ascending() {
		Collections.sort(al);
		System.out.println(al);
	}
	
	public void descending() {
		Collections.sort(al.reversed());
		for(Double n : al) {
			System.out.println(n);
		}
	}
	
}
