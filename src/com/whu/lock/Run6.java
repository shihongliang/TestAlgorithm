/**
 * 
 */
package com.whu.lock;

/**
 * @author hongliang
 *
 */
public class Run6 {
	
	final Service2 service=new Service2();
	
	Runnable runnable=new Runnable(){

		@Override
		public void run() {
			service.waitMethod();
			
		}
		
	};
	
	Thread threadA=new Thread(runnable);
	
	
}
