/**
 * 
 */
package com.whu.test;

import java.io.DataInputStream;
import java.io.IOException;

/**
 * @author hongliang
 *
 */
public class PrintThread implements Runnable{

	
	private DataInputStream din;
	private String ip;
	
	
	/**
	 * @param din
	 * @param ip
	 */
	public PrintThread(DataInputStream din, String ip) {
		super();
		this.din = din;
		this.ip = ip;
	}

	@Override
	public void run() {
		
		while(true)
		{
			try {
				String msg=din.readUTF();
				System.out.println("["+ip+"]"+msg);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
	}
		
	
	
	
}
