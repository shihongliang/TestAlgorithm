/**
 * 
 */
package com.whu.Thinking;

/**
 * @author hongliang
 *
 */
public class Joining {
	
	public static void main(String[]args)
	{
		Sleeper sleepy=new Sleeper("Sleepy",1500);
		Sleeper grumpy=new Sleeper("Grumpy",1500);
		Joiner dopy=new Joiner("Dopey",sleepy);
		Joiner doc=new Joiner("Doc",grumpy);
		grumpy.interrupt();
	}
	
}


class Sleeper extends Thread{
	private int duration;
	public Sleeper(String name,int sleepTime)
	{
		duration=sleepTime;
		start();
	}
	
	public void run()
	{
		try {
			sleep(duration);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(getName()+" has awakened");
		
	}
	
}


class Joiner extends Thread{
	private Sleeper sleeper;
	
	public Joiner(String name,Sleeper sleeper)
	{
		super(name);
		this.sleeper=sleeper;
		start();
	}
	public void run(){
		try {
			sleeper.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(getName()+" join comoleted");
	}
	
	
} 


















