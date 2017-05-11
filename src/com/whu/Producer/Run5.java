/**
 * 
 */
package com.whu.Producer;

/**
 * @author hongliang
 *
 */
public class Run5 {
	
	public static void main(String[]args)
	{
		try {
			ThreadB1 b=new ThreadB1();
			ThreadA1 a=new ThreadA1(b);
			a.start();
			b.start();
			b.join(200);
			System.out.println(" main end "+System.currentTimeMillis());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
