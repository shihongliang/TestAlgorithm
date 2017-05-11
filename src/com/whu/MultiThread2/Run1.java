/**
 * 
 */
package com.whu.MultiThread2;

/**
 * @author hongliang
 *
 */
public class Run1 {
	
	public static void main(String[]args)
	{
		Task task=new Task();
		MyThread1 thread1=new MyThread1(task);
		thread1.start();
		MyThread2 thread2=new MyThread2(task);
		thread2.start();
		
		try {                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		long beginTime=commonUtils.beginTime1;
		if(commonUtils.beginTime2<commonUtils.beginTime1)
		{
			beginTime=commonUtils.beginTime2;
		}
		long endTime=commonUtils.endTime1;
		if(commonUtils.endTime1>commonUtils.endTime1){
			endTime=commonUtils.endTime2;
		}
		System.out.println("耗时： "+(endTime-beginTime)/1000);
		
	}
	
}
