/**
 * 
 */
package com.whu.lock;

/**
 * @author hongliang
 *
 */
public class Run7 {
	
	public static void main(String[]args)
	{
		final MyService5 service=new MyService5();
		
		Runnable runnableRef=new Runnable(){

			@Override
			public void run() {
				service.waitMethod();
				
			}
			
		};
		
		Thread threadA=new Thread(runnableRef);
		threadA.setName("A");
		threadA.start();
		Thread threadB=new Thread(runnableRef);
		threadB.setName("B");
		threadB.start();
		
		
	}
	
}
