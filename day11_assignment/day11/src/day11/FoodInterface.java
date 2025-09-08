package day10;


public interface FoodInterface {
	public void placeOrder(String item, int qty);
	public void trackOrder(int orderId);
	public void cancelOrder(int orderId);

}

class ZomatoDelivery implements FoodInterface{
	
	int orderId;
	String restaurantName;
	String status;
	
	public ZomatoDelivery(int orderId, String restaurantName, String status) {
		this.orderId = orderId;
		this.restaurantName = restaurantName;
		this.status = status;
	}
	

	@Override
	public void placeOrder(String item, int qty) {
		double price = qty*150;
		double finalPrice = price + 20;
		status = "placed";
		System.out.println("Your order has been placed : " + item + "for: " + finalPrice);
	}

	@Override
	public void trackOrder(int orderId) {
		if(this.orderId == orderId) {
			
			System.out.println("Zomato order has been: " + status);
		}
		
	}

	@Override
	public void cancelOrder(int orderId) {
		if(this.orderId == orderId) {
			status = "cancelled";
			System.out.println("Zomato order has been: " + status);
		}
		
	}
	
}

class SwiggyDelivery  implements FoodInterface{
	
	int orderId;
	String restaurantName;
	String status;
	
	public SwiggyDelivery(int orderId, String restaurantName, String status) {
		this.orderId = orderId;
		this.restaurantName = restaurantName;
		this.status = status;
	}

	@Override
	public void placeOrder(String item, int qty) {
		double price = qty*150;
		double finalPrice = price - 50;
		status = "placed";
		System.out.println("Your order has been placed : " + item + "for: " + finalPrice);
	}
		

	@Override
	public void trackOrder(int orderId) {
		if(this.orderId == orderId) {
			System.out.println("Swiggy order has been: " + status);
		}
		
	}

	@Override
	public void cancelOrder(int orderId) {
		if(this.orderId == orderId) {
			status = "cancelled";
			System.out.println("Swiggy order has been: " + status);
		}
		
	}
	
}
