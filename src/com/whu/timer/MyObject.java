/**
 * 
 */
package com.whu.timer;

/**
 * @author hongliang
 *
 */
public class MyObject {
	
	//立即加载方式--恶汉模式
	private static MyObject myObject=new MyObject();
	
	/**
	 * 
	 */
	public MyObject() {
		// TODO Auto-generated constructor stub
	}
	
	public static MyObject getInstance(){
		
		//次代码版本为立即加载
		//次代码的缺点是不能有其他实例变量
		//因为getInstance()方法没有同步
		//所以有可能出现非线程安全问题
		
		return myObject;
		
	}
	
	
}
