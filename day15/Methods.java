package day15;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Methods {
	
	Scanner s = new Scanner(System.in);
	public void insertStudents() throws SQLException {
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","password");
        System.out.println("Enter id, name, marks");
	
		int id = s.nextInt();
		String name = s.next();
		float marks = s.nextFloat();
		
		
		String q = "insert into student(id, name, marks) values(?, ?, ?)";
		PreparedStatement pmt = con.prepareStatement(q);
		
		pmt.setInt(1,  id);
		pmt.setString(2, name);
		pmt.setFloat(3, marks);
		
		pmt.executeUpdate();		
		

		
	}
	
	public void display() throws SQLException {
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","password");
		
		String q = "select * from student";
		PreparedStatement pmt = con.prepareStatement(q);
		
		ResultSet rs = pmt.executeQuery();
		while(rs.next()) {
			System.out.println(rs.getInt(1) +" "+ rs.getString(2) +" "+ rs.getFloat(3));
		}

	}
	
	public void removeStudent() throws SQLException {
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","password");
	    
		System.out.println("Enter id you want to delete");
		int n = s.nextInt();
		String q = "delete from student where id = ?";
		PreparedStatement pmt = con.prepareStatement(q);
		pmt.setInt(1, n);
		
		pmt.executeUpdate();
		System.out.println("Deleted");
	}
	
	public void updateStudent() throws SQLException {
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","password");
		System.out.println("Enter the id whose marks you want to update");
		int n = s.nextInt();
		
		System.out.println("Enter how much marks you want to update");
		float newMarks = s.nextFloat();
		
		String q = "update student set marks = marks + ? where id = ?";
		PreparedStatement pmt = con.prepareStatement(q);
		pmt.setFloat(1, newMarks);
		pmt.setInt(2, n);
		
		pmt.executeUpdate();
		
	}

}
