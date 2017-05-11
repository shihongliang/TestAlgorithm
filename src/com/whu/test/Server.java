/**
 * 
 */
package com.whu.test;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;

/**
 * @author hongliang
 *
 */
public class Server {
	
	private static String ip;
	
	public static void main(String[]args)
	{
		try {
			  @SuppressWarnings("resource")  
		        ServerSocket ss = new ServerSocket(5432);  
		  
		        java.net.Socket s = ss.accept();  
		        
		        ip=s.getInetAddress().toString();
		        ip=ip.substring(ip.indexOf("/")+1);
		        
		        InputStream in=s.getInputStream();
		        OutputStream out=s.getOutputStream();
		        
		        DataInputStream din=new DataInputStream(in);
		        DataOutputStream dout=new DataOutputStream(out);
		        SendThread it=new SendThread(dout);
		        PrintThread ot=new PrintThread(din,ip);
		        new Thread(ot).start();  
		        new Thread(it).start();  
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
