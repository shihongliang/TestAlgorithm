/**
 * 
 */
package com.whu.MultiThread;

/**
 * @author hongliang
 *
 */
public class Run11 {
	
	public static void main(String[]args)
	{
		try {
			MyThread11 thread=new MyThread11();
			thread.start();
			Thread.sleep(1000);
			
			thread.interrupt();
			
			System.out.println("是否停止1？  ="+thread.isInterrupted());
			System.out.println("是否停止2？  ="+thread.isInterrupted());
			
			
			
		} catch (InterruptedException e) {
			System.out.println(" main catch");
			e.printStackTrace();
		}
		System.out.println(" end!!!!!!!!!!!!!!!!!!!!!!");
	}
	
}
