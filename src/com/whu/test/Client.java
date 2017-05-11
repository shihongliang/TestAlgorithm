/**
 * 
 */
package com.whu.test;

/**
 * @author hongliang
 *
 */
public class Client extends Thread {

	/**
	 * @param client
	 */
	public Client(java.net.Socket client) {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		
		try {
			while(true)
			{
				ClientSender.getInstance().send();
				synchronized (Client.class) {
					Thread.sleep(2000);
				}
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public static void main(String[]args)
	{
/*		Client client=new Client();
		client.start();*/
	}

}
