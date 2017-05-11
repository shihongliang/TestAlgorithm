/**
 * 
 */
package com.whu.test;

import java.util.concurrent.TimeUnit;

/**
 * @author hongliang
 *
 */
public class Cleaner implements Runnable {


	Cleaner(){
		final Thread cleanerThread=new Thread(this,"Cleaner");
		cleanerThread.start();
	}
	
	@Override
	public void run() {
		
		while(true){
			cleanUp();
			
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		
		
	}

	/**
	 * 
	 */
	private void cleanUp() {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
