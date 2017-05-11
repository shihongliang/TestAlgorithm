/**
 * 
 */
package com.whu.MultiThread2;

/**
 * @author hongliang
 *
 */
public class Task {

	private String getData1;
	private String getData2;
	
	public synchronized void doLongTimeTask(){
		try {
			System.out.println(" begin time");
			Thread.sleep(3000);
			getData1="长时间处理的任务后从远程返回值1 threadNum= "+Thread.currentThread().getName();
			getData2="长时间处理的任务从远程返回值2 threadNum= "+Thread.currentThread().getName();
			System.out.println(getData1);
			System.out.println(getData2);
			System.out.println(" end task");
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
}
