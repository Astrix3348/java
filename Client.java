package cdac;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client
{

	
	public static void main(String[] args) throws UnknownHostException, IOException 
	{
	
		Socket s = new Socket("10.96.215.115",888);
		
		
		//read from console
		
		
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(ir);
		System.out.println("enter the message to the server");
		String cmsg = br.readLine();
		
		//write to socket
		
		
		   OutputStream os=  s.getOutputStream();
		   PrintStream pr = new PrintStream(os);
		   pr.println(cmsg);
		   
		   
		 //read from socket
			  
			  
		   InputStream is=s.getInputStream();
		   InputStreamReader ir1 = new InputStreamReader(is);
			BufferedReader br1 = new BufferedReader(ir1);
		   String smsg = br.readLine();
		   
		   //write to the console
		   
		   System.out.println("message received from server is "+smsg);
		   s.close();
		   
		   
		   
		   
		   
		
		
		
		
		
		
		
	}
	
	
}
