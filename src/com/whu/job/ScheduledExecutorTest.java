/**
 * 
 */
package com.whu.job;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @author hongliang
 *
 */
public class ScheduledExecutorTest implements Runnable{

	private String jobName="";
	
	/**
	 * @param jobName
	 */
	public ScheduledExecutorTest(String jobName) {
		super();
		this.jobName = jobName;
	}



	@Override
	public void run() {
		System.out.println("execut: "+jobName);
		
	}
	
	public static void main(String[]args)
	{
		ScheduledExecutorService service=Executors.newScheduledThreadPool(10);
		long initialDelay1=1;
		long period1=1;
		//�����ڿ�ʼÿ��1����֮��ÿ��1��ִ��1��job
		service.scheduleAtFixedRate(new ScheduledExecutorTest("job2"), initialDelay1, period1, TimeUnit.SECONDS);
		
		
	}
	
	
	
}
