package day15;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Method {
	Scanner s = new Scanner(System.in);
	
	public void insert() throws SQLException {
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","cr7aakash1234");
		System.out.println("How many employees you want to enter");
		int n = s.nextInt();
		int eid;
		String ename;
		String edept;
		float esalary;
		for(int i=0; i<n; i++) {
			System.out.println("Enter id, name, dept, salary");
			eid = s.nextInt();
			ename = s.next();
			edept = s.next();
			esalary = s.nextFloat();
			
			String q = "insert into employee(id,name,dept,salary) values (?,?,?,?)";
			PreparedStatement pmt = con.prepareStatement(q);
			pmt.setInt(1, eid);
			pmt.setString(2, ename);
			pmt.setString(3, edept);
			pmt.setFloat(4, esalary);
			
			pmt.executeUpdate();
		}	
	}

	public void removeEmp() throws SQLException {
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","cr7aakash1234");
		
		System.out.println("Enter the id of emp you want to remove");
		int n = s.nextInt();
		String q = "delete from employee where id = ?";
		PreparedStatement pmt = con.prepareStatement(q);
		pmt.setInt(1, n);
		
		pmt.executeUpdate();		
	}

	public void displayEmp() throws SQLException {
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","cr7aakash1234");
		
		String q = "select * from employee";
		PreparedStatement pmt = con.prepareStatement(q);
		ResultSet rs = pmt.executeQuery();
		
		while(rs.next()) {
			System.out.println(rs.getInt(1) + rs.getString(2) + rs.getString(3) + rs.getFloat(4));
		}
		
	}

	public void updateEmp() throws SQLException {
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","cr7aakash1234");
		System.out.println("enter emp id whose salary you want to change");
		int n = s.nextInt();
		System.out.println("What increase in salary you want?");
		float newSal = s.nextFloat();
		
		String q = "update employee set salary = salary + ? where id = ?";
		PreparedStatement pmt = con.prepareStatement(q);
		pmt.setFloat(1, newSal);
		pmt.setInt(2, n);
		
		pmt.executeUpdate();
		
	}

	public void searchEmp() throws SQLException {
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","cr7aakash1234");
		System.out.println("Enter employee id");
		int n = s.nextInt();
		
		String q = "select * from employee where id = ?";
		PreparedStatement pmt = con.prepareStatement(q);
		pmt.setInt(1, n);
		
		ResultSet rs = pmt.executeQuery();
		
		while(rs.next()) {
			System.out.println(rs.getInt(1) + rs.getString(2) + rs.getString(3) + rs.getFloat(4));
		}
		
	}

}
