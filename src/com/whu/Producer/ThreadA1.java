/**
 * 
 */
package com.whu.Producer;

/**
 * @author hongliang
 *
 */
public class ThreadA1 extends Thread {
	
	private ThreadB1 b;

	/**
	 * @param b
	 */
	public ThreadA1(ThreadB1 b) {
		super();
		this.b = b;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Thread#run()
	 */
	@Override
	public void run() {
		
		for(int i=0;i<10;i++)
		{
			//System.out.println(" 在 ThreadA 线程中取值为="+Tools.t);
		}
		
	}
	
	
	
}
