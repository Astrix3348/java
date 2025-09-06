package day11;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Enrollment {
	int enrollmentId;
	String studentName;
	String courseName;
	double fee;
	public Enrollment(int enrollmentId, String studentName, String courseName, double fee) {
	
		this.enrollmentId = enrollmentId;
		this.studentName = studentName;
		this.courseName = courseName;
		this.fee = fee;
		
	}
	@Override
	public String toString() {
		return "Enrollment [enrollmentId=" + enrollmentId + ", studentName=" + studentName + ", courseName="
				+ courseName + ", fee=" + fee + "]";
	}
	
}

class Test{
	ArrayList<Enrollment> a = new ArrayList<>();
	HashSet<String> h = new HashSet<>();
	Scanner s = new Scanner(System.in);
	int n;
	
	
	public ArrayList<Enrollment> addEnrollment(){
		System.out.println("How many Students you want to enroll?");
		n = s.nextInt();
		for(int i=0; i<n; i++) {
			System.out.println("Enter ID, Name, Course Name, Fee to pay");
			Enrollment e = new Enrollment(s.nextInt(), s.next(), s.next(), s.nextDouble());
		    a.add(e);
		    h.add(e.courseName);
		}
		return a;
	}
	
	public void removeEnrollment() {
		if(!a.isEmpty()) {
			System.out.println("Enter the Id you want to remove: ");
			int id = s.nextInt();
			int pos = 0;
			for(Enrollment e : a) {
				if(e.enrollmentId==(id)) {
					pos = a.indexOf(e);
				}
			}
			a.remove(pos);
		}
		else {
			System.out.println("No enrollment as of now");
		}
	}	
	public void displayEnrollments() {
	      if(!a.isEmpty()) {
	    	  for(Enrollment e : a) {
	    		  System.out.println(e.toString());
	    	  }
	      }
	      else {
	    	  System.out.println("No enrollments");
	      }
	}
	
	public void search() {
		if(!a.isEmpty()) {
		   System.out.println("Enter the name of student ");
		   String name = s.next();
		   for(Enrollment e : a) {
			   if(e.studentName.equalsIgnoreCase(name)) {
				   System.out.println(e.courseName); 
		  	   }
		    }
	    }
		else {
			System.out.println("Student not in database");
		}
	}
	
	public void totalFee() {
		double fee = 0;
		System.out.println("Enter the course name to calculate total fee");
		String course = s.next();
		
		for(Enrollment e : a) {
			if(e.courseName.equalsIgnoreCase(course)) {
				fee += e.fee;
			}
		}
		
		System.out.println("Fee for " + course + " is : " + fee);
	}
	
	public void uniqueCourses() {
		if(!a.isEmpty()) {
		    for(String course : h) {
			   System.out.println(course);
		    }
		}
		else {
			System.out.println("No courses to display");
		}
	}
	
	public void highest() {
		if(!a.isEmpty()) {
			double max = 0;
			String name = null;
			for(Enrollment e : a) {
				if(e.fee>max) {
					max = e.fee;
					name = e.studentName;
				}
			}
			System.out.println("Highest paying student is :" + name);
		}
	}
	
	public void updateDetails() {
		if(!a.isEmpty()) {
			System.out.println("Enter the name of the student whose course you want to change");
			String name = s.next();
			for(Enrollment e : a) {
				if(e.studentName.equals(name)) {
					System.out.println("Which subject do you want?");
					String course = s.next();
					e.courseName = course;
				}
			}
			System.out.println("Course changed Successfully");
		}
		
	}
	
	public void showStudents() {
		if(!a.isEmpty()) {
			System.out.println("Enter the course for which you want to see the students enrolled");
			String course = s.next();
			for(Enrollment e : a) {
				if(e.courseName.equalsIgnoreCase(course)) {
					System.out.println(e.studentName);
				}
			}
		}
	}
}


