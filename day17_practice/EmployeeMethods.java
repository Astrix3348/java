package day17_practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class EmployeeMethods {
	Scanner s = new Scanner(System.in);
	
	public static Connection gotConnection() throws SQLException {
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/company_db","root","cr7aakash1234");
		return con;
	}
	
	public void insertEmployee() throws SQLException{
		try(Connection con = gotConnection()){
			
			System.out.println("Enter the number of employees to add");
			int n = s.nextInt();
			int id;
			String name;
			String dept;
			float salary;
			
			for(int i=0; i<n; i++) {
				System.out.println("Enter id, name, dept, salary");
				id = s.nextInt();
				name = s.next();
				dept = s.next();
				salary = s.nextFloat();
				
				
				String q = "insert into employee(id,name,dept,salary) values (?,?,?,?)";
				PreparedStatement pmt = con.prepareStatement(q);
				pmt.setInt(1, id);
				pmt.setString(2, name);
				pmt.setString(3, dept);
				pmt.setFloat(4, salary);
				
				pmt.executeUpdate();
			}
		}
	}
	
	public void displayEmp() throws SQLException {
		try(Connection con = gotConnection()){
			String q = "select * from employee";
			PreparedStatement pmt = con.prepareStatement(q);
			ResultSet rs = pmt.executeQuery();

			while(rs.next()) {
				System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getFloat(4));
			}
	    }
	}
	
	public void displayById() throws SQLException {
		try(Connection con = gotConnection()){
			
			System.out.println("Enter id :");
			int check = s.nextInt();
			String q = "select * from employee where id = ?";
			PreparedStatement pmt = con.prepareStatement(q);
			pmt.setInt(1, check);
			
			ResultSet rs = pmt.executeQuery();
			
			while(rs.next()) {
				System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getFloat(4));
			}		
		}
	}
	
	public void deleteEmp() throws SQLException {
		try(Connection con = gotConnection()){
			System.out.println("Enter emp Id");
			int check = s.nextInt();
			String q = "delete from employee where id = ?";
			PreparedStatement pmt = con.prepareStatement(q);
			pmt.setInt(1, check);
			pmt.executeUpdate();
		}
	}
	
	public void updateSalary() throws SQLException {
		try(Connection con = gotConnection()){
			System.out.println("Enter id of employee");
			int check = s.nextInt();
			System.out.println("Enter change in new salary");
			float newSal = s.nextFloat();
			String q = "update employee set salary = salary + ? where id = ?";
			PreparedStatement pmt = con.prepareStatement(q);
			pmt.setFloat(1, newSal);
			pmt.setInt(2, check);
			
			pmt.executeUpdate();
		}	
	}
	
	public void netSalary() throws SQLException {
		try(Connection con = gotConnection()){
			System.out.println("Enter emp id");
			int check = s.nextInt();
			System.out.println("Enter leaves taken");
			int leaves = s.nextInt();
			String q = "select name, salary from employee where id = ?";
			PreparedStatement pmt = con.prepareStatement(q);
			pmt.setInt(1, check);
			
			ResultSet rs = pmt.executeQuery();
			if(rs.next()) {
				String name = rs.getString("name");
				float salary = rs.getFloat("salary");
				
				float netSal = salary - (leaves*500);
				
				System.out.println(name + " " + netSal);
				
			}	
		}
	}
}
