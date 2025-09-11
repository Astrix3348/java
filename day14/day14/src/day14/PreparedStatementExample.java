package day14;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class PreparedStatementExample {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","cdacacts");
        
		System.out.println("Enter id, name, marks");
		Scanner s = new Scanner(System.in);
		int sid = s.nextInt();
		String sname = s.next();
		float smarks = s.nextFloat();
		
		String q = "insert into dacstudents(id, name, marks) values (?,?,?)";
		PreparedStatement pmt = con.prepareStatement(q);
		pmt.setInt(1, sid);
		pmt.setString(2, sname);
		pmt.setFloat(3, smarks);
		
		pmt.executeUpdate();
		
		System.out.println("Insertion complete");
		
		String q1 = "select * from dacstudents where id = ?";
		pmt = con.prepareStatement(q1);
		int nid = s.nextInt();
		pmt.setInt(1, nid);
		ResultSet rs = pmt.executeQuery();
		
		while(rs.next()) {
			System.out.println(rs.getInt(1) + rs.getString(2) + rs.getFloat(3));
		}
		
		
		
		
		
		
		
	}

}
