package day10;
import java.util.ArrayList;
import java.util.Scanner;

class Student{
	String name;
	int id;
	public Student(String name, int id) {
	
		this.name = name;
		this.id = id;
	}
	
}

public class ArrayListExample{
	
	public static void main(String[] args) {
		
		Student[] s = new Student[10];
		Scanner t = new Scanner(System.in);
		
		ArrayList<Student> al = new ArrayList<>();
		
		System.out.println("Enter the number of students you want to enter: ");
		int n = t.nextInt();
		
		for(int i=0; i<n; i++) {
			s[i] = new Student(t.next(), t.nextInt());
			al.add(s[i]);
		}
		
		for(Student ele : al) {
			System.out.println("ID : " + ele.id + " " + "Name: " + ele.name);
		}
		
	}	
}
