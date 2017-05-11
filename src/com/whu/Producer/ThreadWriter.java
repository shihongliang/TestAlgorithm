/**
 * 
 */
package com.whu.Producer;

import java.io.PipedOutputStream;

/**
 * @author hongliang
 *
 */
public class ThreadWriter extends Thread {
	
	private WriteData write;
	private PipedOutputStream out;
	/**
	 * @param write
	 * @param out
	 */
	public ThreadWriter(WriteData write, PipedOutputStream out) {
		super();
		this.write = write;
		this.out = out;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Thread#run()
	 */
	@Override
	public void run() {
		write.writeMethod(out);
	}
	
}
