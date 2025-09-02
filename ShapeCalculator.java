package day8;

class Hello{
	public void area(int side) {
		int s = side*side;
		System.out.println(s);
		
	}
    public void area(int side, int breadht) {
    	int s = side*breadht;
		System.out.println(s);
		
	}
    public void area(double radius) {
    	double s = 2 * 3.14 * radius;
    	System.out.println(s);
	
    }
    public void area(double base, double height, boolean isTriangle) {
    	if(isTriangle==true) {
    		double s = 0.5 * base * height;
    		System.out.println(s);
    	}
    	else {
    		System.out.println("Not a triangle");
    	}
	
    }
}

public class ShapeCalculator {
	public static void main(String[] args) {
		Hello h = new Hello();
		h.area(2);
		h.area(2, 5);
		h.area(4.0);
		h.area(2, 6, true);
	}

}
