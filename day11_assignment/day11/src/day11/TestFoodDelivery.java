package day10;

public class TestFoodDelivery {
	public static void main(String[] args) {
		ZomatoDelivery zomato = new ZomatoDelivery(1,"mcd", "new");
		SwiggyDelivery swiggy = new SwiggyDelivery(2, "dominoes", "new");
		
		zomato.placeOrder("burger", 2);
		zomato.trackOrder(1);
		zomato.cancelOrder(1);
		
		swiggy.placeOrder("pizza", 3);
		swiggy.trackOrder(2);
		swiggy.cancelOrder(2);
	}

}
