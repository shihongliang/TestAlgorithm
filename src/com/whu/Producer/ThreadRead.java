/**
 * 
 */
package com.whu.Producer;

import java.io.PipedInputStream;

/**
 * @author hongliang
 *
 */
public class ThreadRead extends Thread {
	
	private ReadData read;
	private PipedInputStream input;
	/**
	 * @param read
	 * @param input
	 */
	public ThreadRead(ReadData read, PipedInputStream input) {
		super();
		this.read = read;
		this.input = input;
	}
	
	
	/* (non-Javadoc)
	 * @see java.lang.Thread#run()
	 */
	@Override
	public void run() {
		read.readMethod(input);
	}
	
	
}
