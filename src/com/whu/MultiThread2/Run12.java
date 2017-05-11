/**
 * 
 */
package com.whu.MultiThread2;

/**
 * @author hongliang
 *
 */
public class Run12 {
	
	
	public static void main(String[]args)
	{
		Service service=new Service();
		ThreadA1 a=new ThreadA1(service);
		a.setName("a");
		a.start();
		ThreadB1 b=new ThreadB1(service);
		b.setName("B");
		b.start();
	}
	

	
	
}
