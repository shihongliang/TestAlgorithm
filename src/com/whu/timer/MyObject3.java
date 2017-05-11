/**
 * 
 */
package com.whu.timer;

import java.io.Serializable;

/**
 * @author hongliang
 *
 */
public class MyObject3 implements Serializable {
	
	private static class MyObjectHandler{
		private static final MyObject3 myObject=new MyObject3();
	}
	
	/**
	 * 
	 */
	public MyObject3() {
		// TODO Auto-generated constructor stub
	}
	
	public static MyObject3 getInstance(){
		return MyObjectHandler.myObject;
	}
	
}
