/**
 * 
 */
package com.whu.Thinking;

import java.lang.reflect.Method;

/**
 * @author hongliang
 *
 */

class Mime{
	public void walkAgainsTheWInd(){}
	public void sit(){
		System.out.println(" Pending to sit");
		
	}
	
	public void pushInvisibleWalls(){}
	
	public String toString(){
		return "Meme";
	}
	
}

class SmartDog{
	public void speak(){
		System.out.println("Woof");
	}
	
	public void sit(){
		System.out.println("Sitting");
	}
	
	public void reproduce(){}
	
}

class CommunicateReflectively{
	public static void perform(Object speaker){
		Class<?> spkr=speaker.getClass();
		
		try{
			
			try{
				Method speak=spkr.getMethod("speak");
				speak.invoke(speak);
				
			}catch(Exception e){
				System.out.println(speaker+" cannot speak");
			}
			
			try{
				
				Method sit=spkr.getMethod("speak");
				sit.invoke(speaker);
				
			}catch(Exception ex){
				System.out.println(speaker+" cannot sit");
			}
			
			
		}catch(Exception ex){
			throw new RuntimeException(speaker.toString(),ex);
		}
		
		
	}
}


public class LantentReflection {
	public static void main(String[] args) {
		CommunicateReflectively.perform(new SmartDog());
		CommunicateReflectively.perform(new Mime());
	//	CommunicateReflectively.perform(new R());
	}
}
