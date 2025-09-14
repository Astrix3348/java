package day17_practice;

public class BookMain {
	public static void main(String[] args) {
		BookMethod bm = new BookMethod();
		bm.addBook();
		bm.display();
		bm.iterateKeySet();
		bm.updateDetails();
		bm.display();
		bm.clearBooks();
		bm.display();
	}

}
