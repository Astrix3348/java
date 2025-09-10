package day13;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;


public class FileObjectRead {
	
	public static void findResult(Student1 stu) {
		if(stu.marks>20) {
			System.out.println("Pass");
		}
		else if(stu.marks<=20){
			System.out.println("Fail");
		}
	}
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		FileInputStream fs = new FileInputStream("New.txt");
		ObjectInputStream os = new ObjectInputStream(fs);
		Student1 stu;
		ArrayList<Student1> al = new ArrayList<>();
		
		try {
			while((stu = (Student1)os.readObject())!=null) {
				al.add(stu);
				stu.display();
				findResult(stu);
			}
		}
		catch(EOFException e) {
			
		}	
	}
}
