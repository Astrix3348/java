package assignment4;
import java.util.Scanner;

public class Student {
	
	String name;
    int rollNo;
    int[] marks;
	
	Student(String name ,int rollNo, int[] marks){
		this.name = name;
		this.rollNo = rollNo;
		this.marks = marks;	
	}
	
	public void display() {
		System.out.println("Your name is : " + name);
		System.out.println("Your roll number is: " + rollNo);
		int total=0;
		for(int i=0; i<3; i++) {
			total += marks[i];
		}
		float aver = total/3;
		System.out.println("Your average score is: " + aver);
		
		String g;
		if(aver >= 8) {
			g = "A";
		}
		else if(aver>=7 && aver<8) {
			g = "B";
		}
		else {
			g = "C";
		}
		System.out.println(g);
		
	}
	
	
	
	public static void main(String[] args) {
		int n;
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter the number of students you input the data for");
		n = myObj.nextInt();
		Student[] s = new Student[n];
		
		for(int i=0; i<n; i++) {
			System.out.println("Enter details of student : " + (i+1));
			String name = myObj.next();
			int rollNo = myObj.nextInt();
			
			int[] marks = new int[3];
			for(int j=0; j<3; j++) {
				marks[j] = myObj.nextInt();
			}
			s[i] = new Student(name, rollNo, marks);
			s[i].display();
		}	
	}
}
