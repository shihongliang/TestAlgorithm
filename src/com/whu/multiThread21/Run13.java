/**
 * 
 */
package com.whu.multiThread21;

import com.whu.multiThread21.OutClass.Inner;

/**
 * @author hongliang
 *
 */
public class Run13 {
	
	
	public static void main(String[]args)
	{

		final Inner inner=new Inner();
		Thread t1=new Thread(new Runnable(){

			@Override
			public void run() {
				inner.method1();
				
			}
			
		});
		Thread t2=new Thread(new Runnable(){
			
			@Override
			public void run() {
				inner.method2();
				
			}
			
		});
		
		t1.start();
		t2.start();
	}
	
	
	
}
