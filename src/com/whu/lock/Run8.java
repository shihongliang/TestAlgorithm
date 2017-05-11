/**
 * 
 */
package com.whu.lock;

/**
 * @author hongliang
 *
 */
public class Run8 {
	
	public static void main(String[]args)
	{
		try {
			Service3 service=new Service3();
			MyThread myThread=new MyThread(service);
			myThread.start();
			Thread.sleep(3000);
			myThread.interrupt();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
