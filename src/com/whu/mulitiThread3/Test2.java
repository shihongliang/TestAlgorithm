/**
 * 
 */
package com.whu.mulitiThread3;

/**
 * @author hongliang
 *
 */
public class Test2 {
	
	public static void main(String[]args)
	{
		try {
			String lock=new String();
			System.out.println("sys上面");
			
			synchronized (lock) {
				
				System.out.println("sys第一行");
				lock.wait();
				System.out.println("wait 下面");
			}
			
			System.out.println("sys下面代码");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
