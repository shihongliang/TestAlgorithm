/**
 * 
 */
package com.whu.lock;

/**
 * @author hongliang
 *
 */
public class Run11 {
	
	public static void main(String[]args)
	{
		Service5 service=new Service5();
		ThreadA5 a=new ThreadA5(service);
		a.setName(" A");
		ThreadB5 b=new ThreadB5(service);
		b.setName("B");
		a.start();
		b.start();
		
	}
	
}
