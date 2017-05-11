/**
 * 
 */
package com.whu.multiThread21;

/**
 * @author hongliang
 *
 */
public class PrintString {
	
	private boolean isContinuePrint=true;

	/**
	 * @return the isContinuePrint
	 */
	public boolean isContinuePrint() {
		return isContinuePrint;
	}

	/**
	 * @param isContinuePrint the isContinuePrint to set
	 */
	public void setContinuePrint(boolean isContinuePrint) {
		this.isContinuePrint = isContinuePrint;
	}
	
	public void printStringMethod(){
		
		while(isContinuePrint==true)
		{
			System.out.println(" run PrintStringMethod threadName="+Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	
}
