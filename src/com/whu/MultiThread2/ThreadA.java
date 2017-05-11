/**
 * 
 */
package com.whu.MultiThread2;

/**
 * @author hongliang
 *
 */
public class ThreadA extends Thread {
	
	//private HasSelfPrivateNum numRef;
	
//	private MyObject object;
	private publicVar publicVar;
	/**
	 * @param numRef
	 */
/*	public ThreadA(HasSelfPrivateNum numRef) {
		super();
		this.numRef = numRef;
	}*/
/*	public ThreadA( MyObject object) {
		super();
		this.object = object;
	}*/
	public ThreadA(  publicVar publicVar) {
		super();
		this.publicVar = publicVar;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Thread#run()
	 */
	@Override
	public void run() {
		//numRef.addI("a");
	//	object.methodA();
		publicVar.setValue("B", "BB");
	}
	
	
	
}
