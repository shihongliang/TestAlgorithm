/**
 * 
 */
package com.whu.MultiThread;

/**
 * @author hongliang
 *
 */
public class CountOperate extends Thread {
	
	public CountOperate(){
		System.out.println("CountOperator--begin");
		System.out.println("Thread.currentThread().getName()="+Thread.currentThread().getName());
		System.out.println("this.getName()= "+this.getName());
		System.out.println("CountOperator--end");
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Thread#run()
	 */
	@Override
	public void run() {
		System.out.println("CountOperator--begin");
		System.out.println("Thread.currentThread().getName()="+Thread.currentThread().getName());
		System.out.println("this.getName()= "+this.getName());
		System.out.println("CountOperator--end");
	}
	
}
