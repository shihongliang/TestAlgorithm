/**
 * 
 */
package com.whu.MultiThread;

/**
 * @author hongliang
 *
 */
public class Run4 {
	
	public static void main(String[]args)
	{
		CountOperate c=new CountOperate();
		Thread t1=new Thread(c);
		t1.setName("A");
		t1.start();
	}
	
}
