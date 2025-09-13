package day16_practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class LibraryMethods {
	Scanner s = new Scanner(System.in);
	
	public static Connection gotConnection() throws SQLException {
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/library_db","root","cr7aakash1234");
		
		return con;
		
	}
	
	public void insertBooks() throws SQLException {
		try(Connection con = gotConnection()){
		   System.out.println("Enter the number of books to add");
		   int n = s.nextInt();
		   int id;
		   String title;
		   String author;
		   float price;
		   int quantity;
		
		   for(int i=0; i<n; i++) {
			   System.out.println("Enter id,title,author,price,quantity");
			   id = s.nextInt();
			   title = s.next();
			   author = s.next();
			   price = s.nextFloat();
			   quantity = s.nextInt();
			
			   String q = "insert into books(id,title,author,price,quantity) values (?,?,?,?,?)";
			   PreparedStatement pmt = con.prepareStatement(q);
			   pmt.setInt(1, id);
			   pmt.setString(2, title);
			   pmt.setString(3, author);
			   pmt.setFloat(4, price);
			   pmt.setInt(5, quantity);
			   
			   pmt.executeUpdate();
		   }
	    }
	}
	
	public void showBooks() throws SQLException {
		try(Connection con = gotConnection()){
			
			String q = "select * from books";
			PreparedStatement pmt = con.prepareStatement(q);
			
			ResultSet rs = pmt.executeQuery();
		    while(rs.next()) {
		    	System.out.println(rs.getInt(1) + rs.getString(2) + rs.getString(3) + rs.getFloat(4) + rs.getInt(5));
		    }
			
		}
				
	}
	
	public void showById() throws SQLException {
		try(Connection con = gotConnection()){
			System.out.println("Enter id you want to check");
			int check = s.nextInt();
			
			String q = "select * from books where id = ?";
			PreparedStatement pmt = con.prepareStatement(q);
			pmt.setInt(1, check);
			
			ResultSet rs = pmt.executeQuery();
			
			while(rs.next()) {
				System.out.println(rs.getInt(1) + rs.getString(2) + rs.getString(3) + rs.getFloat(4) + rs.getInt(5));
			}
		}
		 
	}
	
	public void updateBook() throws SQLException {
		try(Connection con = gotConnection()){
			System.out.println("What do you want to update? price/quantity");
			String check = s.next();
			if(check.equalsIgnoreCase("price")) {
				String q = "update books set price = ? where id = ?";
				System.out.println("Enter Book id");
				int n = s.nextInt();
				System.out.println("What price do you want to change it to");
				float newPrice = s.nextFloat();
				PreparedStatement pmt = con.prepareStatement(q);
				pmt.setFloat(1, newPrice);
				pmt.setInt(2, n);
				pmt.executeUpdate();
			}
			else {
				String q = "update books set quantity = ? where id = ?";
				System.out.println("Enter Book id");
				int n = s.nextInt();
				System.out.println("What quantity do you want to change it to");
				int newQuan = s.nextInt();
				PreparedStatement pmt = con.prepareStatement(q);
				pmt.setFloat(1, newQuan);
				pmt.setInt(2, n);
				pmt.executeUpdate();
			}
		}
	}
	
	public void deleteBook() throws SQLException {
		try(Connection con = gotConnection()){
			System.out.println("Enter book id to remove");
			int n = s.nextInt();
			String q = "delete from book where id = ?";
			PreparedStatement pmt = con.prepareStatement(q);
			pmt.setInt(1, n);
			pmt.executeUpdate();
			
		}	
	}
	
	public void checkAvail(int reqQuan) throws SQLException {
		try(Connection con = gotConnection()){
			System.out.println("Enter book id");
			int n = s.nextInt();
			String q = "select quantity from books where id = ?";
			PreparedStatement pmt = con.prepareStatement(q);
			pmt.setInt(1, n);
			ResultSet check = pmt.executeQuery();
			if(check.next()) {
				if(check.getInt("quantity") >= reqQuan) {
					System.out.println("Book issued");
				}
				else {
					System.out.println("Book not available");
				}	
			}
		}
	}	
}
