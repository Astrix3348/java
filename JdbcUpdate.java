package CDAC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JdbcUpdate
{

	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
	
        Class.forName("com.mysql.cj.jdbc.Driver");
		
        Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/dbda","root","cdacacts");

        System.out.println("got connection");
        
        Statement smt =con.createStatement();
        
//        System.out.println("enter the id,sal");
//        Scanner s = new Scanner(System.in);
//        		int id = s.nextInt();
//        		float sa = s.nextFloat(); 
        		
        String q = "update emp set sal = sal+ 200 where empno = 7369";

               int no =smt.executeUpdate(q);
         System.out.println(no+ "  of rows updated");      
        
         con.close();
         
        
	}
	
	
}
