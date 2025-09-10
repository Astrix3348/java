package cdac;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class FileObjectWrite 
{


	public static void main(String[] args) throws IOException 
	{
	
		Student s1 = new Student(1001,"nathan",30);
		Student s2 = new Student(1002,"shan",50);
		Student s3 = new Student(1003,"raj",40);
		
		FileOutputStream fs = new FileOutputStream("dac1");
		ObjectOutputStream os = new ObjectOutputStream(fs);
		
		os.writeObject(s1);
		os.writeObject(s2);
		os.writeObject(s3);
		System.out.println("object write is over");
		
			
	}
	
}
