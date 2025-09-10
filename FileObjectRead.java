package cdac;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class FileObjectRead
{

	public static void  findResult(Student s)
	{
		
		if(s.mark>16)
		{
			System.out.print("  pass");
		}else
			System.out.print("  fail");
	}
	
	
	
	public static void main(String[] args) throws IOException, ClassNotFoundException 
	{
	
		FileInputStream fs = new FileInputStream("dac1");
		ObjectInputStream os = new ObjectInputStream(fs);
		Student s;
		
		try
		{
		while((s = (Student) os.readObject())!=null)
		{
			
			
			s.displayStudent();
			findResult(s);
			System.out.println();
		}
		}
		catch(EOFException e)
		{
			System.out.println("end of file");
		}
		
		
		
//		Student s1 =(Student) os.readObject();
//		Student s2 =(Student) os.readObject();
//		Student s3 =(Student) os.readObject();
//		s1.displayStudent();
//		s2.displayStudent();
//		s3.displayStudent();
		
		System.out.println("main ended");
		
		
	} 
	
	
	
}
