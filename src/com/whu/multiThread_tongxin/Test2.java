/**
 * 
 */
package com.whu.multiThread_tongxin;

/**
 * @author hongliang
 *
 */
public class Test2 {
	public static void main(String[]args)
	{
		
		String lock=new String();
		System.out.println("sys上面");
		
		try {
			synchronized (lock) {
				System.out.println("sys第一行");
				lock.wait();
				System.out.println("wait下的代码");
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("sys下面的代码");
		
	}
	
}
