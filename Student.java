package cdac;
import java.util.Scanner;

public class Student {
	
	int rollNo;
	String name;
	String cname;
	int mark;
	
	public void acceptDetails() {
		Scanner myObj = new Scanner(System.in);
		
		rollNo = myObj.nextInt();
		name = myObj.next();
		cname = myObj.next();
		mark = myObj.nextInt();
	}
	
	public void displayStudentInfo() {
		System.out.println(rollNo);
		System.out.println(name);
		System.out.println(cname);
		System.out.println(mark);
	}
	
	public String findResult() {
		String res;
		if(mark>=40) {
			res = "Pass";
		}
		else {
			res = "Fail";
		}
		return res;
	}
	
	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		Student s4 = new Student();
		Student s5 = new Student();
		
		System.out.println("Enter details of 1st student");
		s1.acceptDetails();
		s1.displayStudentInfo();
		System.out.println(s1.findResult());
		
		System.out.println("Enter details of 2st student");
		s2.acceptDetails();
		s2.displayStudentInfo();
		System.out.println(s2.findResult());
		
		System.out.println("Enter details of 3st student");
		s3.acceptDetails();
		s3.displayStudentInfo();
		System.out.println(s3.findResult());
		
		System.out.println("Enter details of 4st student");
		s4.acceptDetails();
		s4.displayStudentInfo();
		System.out.println(s4.findResult());
		
		System.out.println("Enter details of 5st student");
		s5.acceptDetails();
		s5.displayStudentInfo();
		System.out.println(s5.findResult());
	}

}























