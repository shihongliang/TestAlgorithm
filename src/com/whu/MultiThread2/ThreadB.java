/**
 * 
 */
package com.whu.MultiThread2;

/**
 * @author hongliang
 *
 */
public class ThreadB extends Thread {
	
	//private HasSelfPrivateNum numRef;

	private MyObject object;
	
	/**
	 * @param numRef
	 */
	/*public ThreadB(HasSelfPrivateNum numRef) {
		super();
		this.numRef = numRef;
	}*/
	public ThreadB(MyObject object) {
		super();
		this.object = object;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Thread#run()
	 */
	@Override
	public void run() {
		
	//	numRef.addI("b");
		object.methodA();
	}
	
	
}
