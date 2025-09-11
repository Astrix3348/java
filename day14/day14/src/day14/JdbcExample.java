package day14;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class JdbcExample {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","cdacacts");
		
		Statement smt = con.createStatement();
		String q = "update dacstudents set marks = marks + 20";
		int no = smt.executeUpdate(q);
		
		System.out.println(no);
		
		con.close();

		
	}


}
