/**
 * 
 */
package com.whu.Producer;

/**
 * @author hongliang
 *
 */
public class Test {
	
	public static void main(String[]args)
	{
		try {
			MyThread threadTest=new MyThread();
			threadTest.start();
			threadTest.join();
			System.out.println("我想当");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
