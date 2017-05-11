/**
 * 
 */
package com.whu.MultiThread;

/**
 * @author hongliang
 *
 */
public class Run3 {
	
	public static void main(String[]args)
	{
		MyThread3 run=new MyThread3();
		Thread t1=new Thread(run);
		Thread t2=new Thread(run);
		Thread t3=new Thread(run);
		Thread t4=new Thread(run);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
	
}
