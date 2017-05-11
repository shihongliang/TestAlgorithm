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
public class TestTimer {
	
	static class MyTimerTask extends TimerTask
	{

		/* (non-Javadoc)
		 * @see java.util.TimerTask#run()
		 */
		@Override
		public void run() {
			System.out.println("±¬Õ¨");
			
		}
		
		
	}
	
	public static void main(String[]args)
	{
		Timer timer=new Timer();
		timer.schedule(new MyTimerTask(), 2000);
	}
	
	
}
