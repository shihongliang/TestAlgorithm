/**
 * 
 */
package com.whu.multiThread21;

/**
 * @author hongliang
 *
 */
public class Run3 {
	
	public static void main(String[]args)
	{
		MyService service=new MyService();
		ThreadA2 a=new ThreadA2(service);
		a.setName("a");
		ThreadB2 b=new ThreadB2(service);
		b.setName("B");
		a.start();
		b.start();
	}
	
}
