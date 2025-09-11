package day14;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

@SuppressWarnings("serial")
public class Employee implements Serializable{
	
	int eno;
	String name;
	double salary;
	
	public Employee(int eno, String name, double salary) {
		
		this.eno = eno;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [eno=" + eno + ", name=" + name + ", salary=" + salary + "]";
	}

}

class WriteTest {
	
	ArrayList<Employee> al = new ArrayList<>();
	Scanner s = new Scanner(System.in);
	public ArrayList<Employee> addEmployee() throws IOException{
		FileOutputStream fs = new FileOutputStream("New2.txt");
		ObjectOutputStream os = new ObjectOutputStream(fs);
		System.out.println("Enter the number of employee");
		int n = s.nextInt();
		for(int i=0; i<n; i++) {
			System.out.println("Enter id, name, salary");
			Employee e = new Employee(s.nextInt(), s.next(), s.nextDouble());
			os.writeObject(e);
			al.add(e);
			
		}
		os.close();
		return al;
	}
	
	public void display() throws IOException, ClassNotFoundException {
		FileInputStream fi = new FileInputStream("New2.txt");
		ObjectInputStream oi = new ObjectInputStream(fi);
		Employee e;
		
		try {			
			while((e = (Employee) oi.readObject())!=null) {
				System.out.println(e.toString());
			}
		}
		catch(EOFException e1) {
			
		}
		
	}
	
	public void removeEmployee() throws IOException, ClassNotFoundException {
		System.out.println("Enter Id of employee you want to remove");
		int id = s.nextInt();
		FileInputStream fi = new FileInputStream("New2.txt");
		ObjectInputStream oi = new ObjectInputStream(fi);
		ArrayList<Employee> temp = new ArrayList<>();
		Employee e;
		
		try {			
			while((e = (Employee) oi.readObject())!=null) {
				if(e.eno!=id) {
					temp.add(e);
				}
			}
		}
		catch(EOFException e1) {
			
		}
		
		FileOutputStream fs = new FileOutputStream("New2.txt");
		ObjectOutputStream os = new ObjectOutputStream(fs);
		
		for(Employee emp : temp) {
			os.writeObject(emp);
		}
		os.close();
		
		System.out.println("Employee with id : " + id + " Removed successfully");

	}
	
	public void updateEmp() throws IOException, ClassNotFoundException {
		System.out.println("Enter id of Emp you want to update");
		int n = s.nextInt();
		Employee e;
		ArrayList<Employee> temp = new ArrayList<>();
		
		FileInputStream fi = new FileInputStream("New2.txt");
		ObjectInputStream oi = new ObjectInputStream(fi);
		

		try {
			while((e = (Employee)oi.readObject())!=null) {
				if(e.eno==n) {
					e.salary += 10000;
				}
				temp.add(e);
			}
		}
		catch(EOFException e1) {
			
		}
		oi.close();
		
		FileOutputStream fs = new FileOutputStream("New2.txt");
		ObjectOutputStream os = new ObjectOutputStream(fs);
		
		for(Employee emp : temp) {
			os.writeObject(emp);
		}
		
		os.close();
		
		System.out.println("Empoloyee with ID: " + n + " Updated");
	}
	
	
}
