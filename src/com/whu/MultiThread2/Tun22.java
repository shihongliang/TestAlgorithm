/**
 * 
 */
package com.whu.MultiThread2;

/**
 * @author hongliang
 *
 */
public class Tun22 {
	
	public static void main(String[]args)
	{
		ObjectService service=new ObjectService();
		ThreadAA a=new ThreadAA(service);
		a.setName("a");
		a.start();
		ThreadBB b=new ThreadBB(service);
		b.setName("b");
		b.start();
	}
	
	
	
	
}
