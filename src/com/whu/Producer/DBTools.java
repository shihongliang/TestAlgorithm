/**
 * 
 */
package com.whu.Producer;

/**
 * @author hongliang
 *
 */
public class DBTools {
	private volatile boolean prevIsA=false;
	
	public synchronized void backupA(){
		
		try {
			while(prevIsA==true)
			{
				wait();
			}
			
			for(int i=0;i<5;i++)
			{
				System.out.println("=======");
			}
			prevIsA=true;
			notifyAll();
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public synchronized void backupB()
	{
		try {
			while(prevIsA==false)
			{
				wait();
			}
			
			for(int i=0;i<5;i++)
			{
				System.out.println("+++++");
			}
			prevIsA=false;
			notifyAll();
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
}
