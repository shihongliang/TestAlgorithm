/**
 * 
 */
package com.whu.multiThread21;

/**
 * @author hongliang
 *
 */
public class Service21 {
	
	Object object1=new Object();
	
 public void methodA()
	{
	 
		synchronized (object1) {
			System.out.println("methodA begin");
			boolean isContinue=true;
			while(isContinue)
			{
				
			}
			System.out.println("methodA end");
		}	
	 
	
	}
	Object object2=new Object();
	public void methodB()
	{
		synchronized (object2) {
			System.out.println(" methodB begin");
			System.out.println(" methodB end");
		}
		
	
	}
	
}
