package day13;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class TestOutput {
	
	public static void main(String[] args) throws IOException {
		Scanner s = new Scanner(System.in);
		
		FileOutputStream fo = new FileOutputStream("New.txt");
		@SuppressWarnings("resource")
		ObjectOutputStream os = new ObjectOutputStream(fo);
		
		for(int i=0; i<3; i++) {
			Student1 t = new Student1(s.nextInt(), s.next(), s.nextInt());
			os.writeObject(t);
		}
     s.close();
	}
	

}
