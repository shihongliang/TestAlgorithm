/**
 * 
 */
package com.whu.Producer;

/**
 * @author hongliang
 *
 */
public class Run1 {
	
	public static void main(String[]args)
	{
		try {
			ThreadB b=new ThreadB();
			b.start();
			Thread.sleep(500);
			ThreadC c=new ThreadC(b);
			c.start();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
