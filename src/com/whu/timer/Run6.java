/**
 * 
 */
package com.whu.timer;

/**
 * @author hongliang
 *
 */
public class Run6 {
	
	public static void main(String[]args)
	{
		System.out.println("线程组名称 "+Thread.currentThread().getThreadGroup().getName());
		System.out.println("线程组名称 "+Thread.currentThread().getThreadGroup().activeCount());
		System.out.println("线程组名称 "+Thread.currentThread().getThreadGroup().activeGroupCount());
	
		
	}
	
	
}
