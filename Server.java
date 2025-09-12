package cdac;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server 
{

	
	public static void main(String[] args) throws IOException 
	{
	
		ServerSocket ss = new ServerSocket(888);
		 
		     Socket s= ss.accept();
		             
		  System.out.println("got connect from client to the server");           
		             

		  //read from socket
		  
		  
		   InputStream is=s.getInputStream();
		   InputStreamReader ir = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(ir);
		   String cmsg = br.readLine();
		   
		   
		   //write to the console
		   
		   
		   System.out.println("message received from client is "+cmsg);
		   
		   
		   
		 //read from console
			
			
			InputStreamReader ir1 = new InputStreamReader(System.in);
			BufferedReader br1 = new BufferedReader(ir1);
			System.out.println("enter the message to the client");
			String smsg = br1.readLine();
		   
		   

			//write to socket
			
			
			   OutputStream os=  s.getOutputStream();
			   PrintStream pr = new PrintStream(os);
			   pr.println(smsg);
			
			
		   
		   ss.close();
		   s.close();
		   
		   
		   
		   
		   
		   
		   
		  
		  
		  
		  
		  

		
	}
	
}
