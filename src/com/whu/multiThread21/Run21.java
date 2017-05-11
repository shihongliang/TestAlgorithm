/**
 * 
 */
package com.whu.multiThread21;

/**
 * @author hongliang
 *
 */
public class Run21 {
	
	public static void main(String[]args)
	{
		Service21 service=new Service21();
		ThreadAA athread=new ThreadAA(service);
		athread.start();
		ThreadBB bthread=new ThreadBB(service);
		bthread.start();
	}
	
}
