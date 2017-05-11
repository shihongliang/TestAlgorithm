/**
 * 
 */
package com.whu.job;

import java.util.Timer;
import java.util.TimerTask;

/**
 * @author hongliang
 *
 */
public class TimerTest extends TimerTask {

	private String jobName="";
	
	
	/**
	 * @param jobName
	 */
	public TimerTest(String jobName) {
		super();
		this.jobName = jobName;
	}



	@Override
	public void run() {
			
		System.out.println("execute: "+jobName);
	}
	
	public static void main(String[]args)
	{
		Timer timer=new Timer();
		long delay1=1*1000;
		long period1=1000;
		timer.schedule(new TimerTest("job1"), delay1,period1);
		long delay2=2000;
		long period2=2000;
		//从现在开始2分钟之后，每隔一分钟执行1次
		timer.schedule(new TimerTest("job2"), delay2,period2);
		
	}
	
	
}
