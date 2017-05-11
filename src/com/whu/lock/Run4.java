/**
 * 
 */
package com.whu.lock;

/**
 * @author hongliang
 *
 */
public class Run4 {
	
	 public static void main(String[]args)
	 {
		 MyService4 service=new MyService4();
		 MyThreadA4 a=new MyThreadA4(service);
		 a.start();
		 MyThreadB4 b=new MyThreadB4(service);
		 b.start();
	 }
	
}
