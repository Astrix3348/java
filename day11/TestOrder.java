package day10;

import java.util.ArrayList;
import java.util.Scanner;

class Order {
	
	int orderId;
	String customerName;
	String foodItem;
	double price;
	
	public Order(int orderId, String customerName, String foodItem, double price) {
	
		this.orderId = orderId;
		this.customerName = customerName;
		this.foodItem = foodItem;
		this.price = price;

	}
	
	public void display() {
		System.out.println("ID: " + orderId + " Name: " + customerName + " Item : "+ foodItem + " price : "+ price);
	}
}
	class Testing{
		
		static boolean isCartEmpty = true;
		ArrayList<Order> a = new ArrayList<>();
		Scanner s = new Scanner(System.in);
		int n;
		
		public ArrayList<Order> addOrder(){
			
			isCartEmpty = false;
			System.out.println("How many products you want to add?");
			n = s.nextInt();
			
			for(int i=0; i<n; i++) {
			
			    System.out.println("Enter OrderId, Your name, item name and price.");
			    Order o = new Order(s.nextInt(), s.next(), s.next(), s.nextDouble());
			    a.add(o);

			}
			return a;
		}
		
		public void removeOrder() {
			if(isCartEmpty==false) {
			System.out.println("Enter the Order ID you want to remove");
			int id = s.nextInt();
			
			int pos = 0;
			for(Order obj : a) {
				if(obj.orderId == id) {
					pos = a.indexOf(obj);
				}	
			}
			a.remove(pos);
			System.out.println("Your product has been removed.");
		 }
			else {
				System.out.println("Your Cart is empty");
			}
		}
		
		public void displayOrders() {
			if(isCartEmpty==false) {
				
			    for(Order o : a) {
				    o.display();
			    }
			}
			else {
				System.out.println("Your Cart is empty");
			}
		}
		
		public void searchOrder() {
			if(isCartEmpty==false) {
			System.out.println("Enter the name of the customer : ");
			String t = s.next();
			for(Order o : a)
			 {
				if(o.customerName.equalsIgnoreCase(t)){	
			    	o.display();
			     }
			 }
	    }
			else {
				System.out.println("Your Cart is empty");
			}
	}
		
		public void calculateTotalRevenue() {
			if(isCartEmpty!=false) {
			double revenue = 0;
			System.out.println("Enter name of the customer whose total you want to claculate: ");
			String t = s.next();
			for(Order o : a)
			 {
				if(o.customerName.equalsIgnoreCase(t)){	
			    	revenue += o.price;
			     }
			 }
			
			System.out.println("Total for " + t + " is :  " + revenue);
			}
			else {
				System.out.println("Cart is empty");
			}
		}
		
		
		public void highestValueOrder() {
			double max = 0;
			int pos=0;
			for(Order o : a) {
				if(o.price>max) {
					max = o.price;
					pos = o.orderId;
				}
			}
			System.out.println("Id number " + pos + " " + "has the maximum order of" + " " + max);
			
		}
   }

public class TestOrder {
	
	public static void main(String[] args) {
		Testing t = new Testing();
		int n;
		Scanner s = new Scanner(System.in);
		
		do {
			System.out.println("1-->Add Product");
			System.out.println("2-->Remove Product");
			System.out.println("3-->Show Product");
			System.out.println("4-->Calculate total price of Product");
			System.out.println("5-->Show Product with highest price");
			System.out.println("6-->Show the products ordered by a person");
			
			n = s.nextInt();
			
			switch(n) {
			case 1 : t.addOrder();
				break;
			case 2 : t.removeOrder();
				break;
			case 3 : t.displayOrders();
				break;
			case 4 : t.calculateTotalRevenue();
				break;
			case 5 : t.highestValueOrder();
				break;
			case 6 : t.searchOrder();
				break;
			}
			
		}while(n!=7);
	
		s.close();
	}

}
