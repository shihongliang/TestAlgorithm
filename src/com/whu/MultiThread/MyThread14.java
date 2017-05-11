/**
 * 
 */
package com.whu.MultiThread;

/**
 * @author hongliang
 *
 */
public class MyThread14 extends Thread {
	
	public SynchronizedObject object;

	/**
	 * @param object
	 */
	public MyThread14(SynchronizedObject object) {
		super();
		this.object = object;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Thread#run()
	 */
	@Override
	public void run() {
		object.printString("b", "bb");
	}
	
}
