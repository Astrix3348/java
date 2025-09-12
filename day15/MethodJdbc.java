package day15;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class MethodJdbc {
	
	Scanner s = new Scanner(System.in);
	
	public void insertEmp() throws SQLException {
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/company","root","cdacacts");
		System.out.println("Enter number of employees to add");
		int n = s.nextInt();
		for(int i=0; i<n; i++) {
			System.out.println("Enter id, name, dept");
			int eid = s.nextInt();
			String ename = s.next();
			String edept = s.next();
			
			String q = "insert into employee(id, name, dept) values (?,?,?)";
			PreparedStatement pmt = con.prepareStatement(q);
			pmt.setInt(1, eid);
			pmt.setString(2, ename);
			pmt.setString(3, edept);
			
			pmt.executeUpdate();	
		}
	}
	
	public void removeEmp() throws SQLException {
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/company","root","cdacacts");
		System.out.println("Enter the id of employee to remove");
		int n = s.nextInt();
		
		String q = "delete from employee where id = ?";
		PreparedStatement pmt = con.prepareStatement(q);
		pmt.setInt(1, n);
		pmt.executeUpdate();
	}
	
	public void display() throws SQLException {
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/company","root","cdacacts");
	    
	    String q = "select * from employee";
	    PreparedStatement pmt = con.prepareStatement(q);
	    ResultSet rs = pmt.executeQuery();
	    
	    while(rs.next()) {
	    	System.out.println(rs.getInt(1) + rs.getString(2) + rs.getString(3));
	    }
	}
	
	public void updateEmp() throws SQLException {
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/company","root","cdacacts");
		System.out.println("Enter id of employee to update");
		int n = s.nextInt();
		System.out.println("Enter the change in dept");
		String change = s.next();
		
		String q = "update employee set dept = ? where id = ?";
		PreparedStatement pmt = con.prepareStatement(q);
		pmt.setString(1, change);
		pmt.setInt(2, n);
		
		pmt.executeUpdate();
	}
	
	public void searchByDept() throws SQLException {
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/company","root","cdacacts");
		System.out.println("Enter the dept");
		String check = s.next();
		
		String q = "select * from employee where dept = ?";
		PreparedStatement pmt = con.prepareStatement(q);
		pmt.setString(1, check);
		
		ResultSet rs = pmt.executeQuery();
		while(rs.next()) {
			System.out.println(rs.getString(2));
		}
	
		
	}
	
	public void countEmp() throws SQLException {
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/company","root","cdacacts");
		String q = "select count(*) from employee";
		PreparedStatement pmt = con.prepareStatement(q);
		ResultSet rs = pmt.executeQuery();
		if(rs.next()) {
			System.out.println("Number of epmloyees are: " + rs.getInt(1));
		}
	}
	
	public void checkIfExists() throws SQLException {
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/company","root","cdacacts");
		System.out.println("Enter emp to check");
		int n = s.nextInt();
		String q = "select * from employee where id = ?";
		PreparedStatement pmt = con.prepareStatement(q);
		pmt.setInt(1, n);
		ResultSet rs = pmt.executeQuery();
		
		if(rs.next()) {
			System.out.println("Yes emp exists");
		}
		else {
			System.out.println("Doesnt exists");
		}
	}
}
