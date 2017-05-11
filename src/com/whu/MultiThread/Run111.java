/**
 * 
 */
package com.whu.MultiThread;

/**
 * @author hongliang
 *
 */
public class Run111 {
	
	public static void main(String[]args)
	{
		
		try {
			MyThread111 thread=new MyThread111();
			thread.setDaemon(true);
			thread.start();
			Thread.sleep(1000);
			System.out.println("end。。。。");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
