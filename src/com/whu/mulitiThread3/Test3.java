/**
 * 
 */
package com.whu.mulitiThread3;

/**
 * @author hongliang
 *
 */
public class Test3 {
	
	public static void main(String[]args)
	{
		Object lock=new Object();
		ThreadA1 a=new ThreadA1(lock);
		a.start();
		ThreadB1 b=new ThreadB1(lock);
		b.start();
	}
	
}
