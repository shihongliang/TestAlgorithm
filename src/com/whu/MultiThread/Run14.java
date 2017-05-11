/**
 * 
 */
package com.whu.MultiThread;

/**
 * @author hongliang
 *
 */
public class Run14 {
	
	public static void main(String[]args)
	{
		try {
			SynchronizedObject object=new SynchronizedObject();
			MyThread14 thread=new MyThread14(object);
			thread.start();
			Thread.sleep(500);
		    thread.stop();
		    System.out.println(object.getUsername()+" "+object.getPassword());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
