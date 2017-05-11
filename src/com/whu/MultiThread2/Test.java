/**
 * 
 */
package com.whu.MultiThread2;

/**
 * @author hongliang
 *
 */
public class Test {
	
	public static void main(String[]args)
	{
		try {
			publicVar publicVarRef=new publicVar();
			ThreadA thread=new ThreadA(publicVarRef);
			thread.start();
			Thread.sleep(2000);
			publicVarRef.getValue();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
