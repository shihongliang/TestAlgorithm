/**
 * 
 */
package com.whu.lock;

/**
 * @author hongliang
 *
 */
public class Run9 {
	
	public static void main(String[]args)
	{
		Service4 service=new Service4();
		MyThreadAA myThreadA=new MyThreadAA(service);
		myThreadA.start();
	}
	
}
