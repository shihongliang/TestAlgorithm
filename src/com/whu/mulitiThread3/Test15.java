/**
 * 
 */
package com.whu.mulitiThread3;

/**
 * @author hongliang
 *
 */
public class Test15 {
	
	public static void main(String[]args)
	{
		try {
			Object lock=new Object();
			ThreadA15 a=new ThreadA15(lock);
			a.start();
			Thread.sleep(5000);
			a.interrupt();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
