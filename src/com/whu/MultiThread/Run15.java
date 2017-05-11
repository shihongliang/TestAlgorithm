/**
 * 
 */
package com.whu.MultiThread;

/**
 * @author hongliang
 *
 */
public class Run15 {
	
	public static void main(String[]args)
	{
		try {
			MyThread15 thread=new MyThread15();
			thread.start();
			Thread.sleep(5000);
			//A段
			thread.suspend();
			System.out.println("A= "+System.currentTimeMillis()+" i= "+thread.getI());
			Thread.sleep(5000);
			System.out.println("A= "+System.currentTimeMillis()+" i= "+thread.getI());
			
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
