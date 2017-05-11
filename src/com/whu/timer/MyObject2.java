/**
 * 
 */
package com.whu.timer;

/**
 * @author hongliang
 *
 */
public class MyObject2 {
	
	private static MyObject2 myObject;
	
	/**
	 * 
	 */
	public MyObject2() {
		// TODO Auto-generated constructor stub
	}
	
	  public static MyObject2 getInstance(){
		
		//延迟加载
		
				try {
					if(myObject!=null)
					{
						
					}
					else{
						Thread.sleep(3000);
						  synchronized(MyObject2.class){
						  myObject =new MyObject2();
						
						  }
							
						
					}
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		 
	
		return myObject;
	}
	
	
}
