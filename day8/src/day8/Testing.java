package day8;

public class Testing {
	public static void main(String[] args) {
		Book[] b = new Book[10];
		Library l = new Library("PPS", "dwarka", b);
		
		l.addBook(b);
		l.showBook(b);
		l.removeBook(b);
		l.showBook(b);
		
	}

}
