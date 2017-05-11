/**
 * 
 */
package com.whu.test;

import java.io.IOException;
import java.net.ServerSocket;

/**
 * @author hongliang
 *
 */
public class Socket extends Thread {
	
	private ServerSocket server=null;
	Object obj=new Object();
	
/* (non-Javadoc)
 * @see java.lang.Thread#run()
 */
	@Override
	public void run() {
		
		
		try {
			while(true)
			{
				server=new ServerSocket(25535);
				java.net.Socket client=server.accept();
				synchronized (obj) {
					
					new Thread(new Client(client)).start();;
				}
				
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		super.run();
	}
	

}
