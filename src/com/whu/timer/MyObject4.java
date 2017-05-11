/**
 * 
 */
package com.whu.timer;

/**
 * @author hongliang
 *
 */
public class MyObject4 {
	
	private static  MyObject4 instance=null;
	
	/**
	 * 
	 */
	public MyObject4() {
		// TODO Auto-generated constructor stub
	}
	
	static {
		instance=new MyObject4();
	}
	
	public static MyObject4 getInstance(){
		return instance;
	}
	
	
}
