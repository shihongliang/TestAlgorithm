/**
 * 
 */
package com.whu.MultiThread2;

import java.util.ArrayList;
import java.util.List;

import com.sun.swing.internal.plaf.synth.resources.synth;

/**
 * @author hongliang
 *
 */
public class MyList {
	
	private List list=new ArrayList();
	
	synchronized public void add(String username){
		System.out.println("ThreadName= "+Thread.currentThread().getName()+" 执行了add方法");
		list.add(username);
		System.out.println("ThreadName= "+Thread.currentThread().getName()+"退出了add方法");
		
	}
	
	synchronized public int getSize(){
		System.out.println("Thread= "+Thread.currentThread().getName()+" 执行了add方法");
		int sizeValue=list.size();
		System.out.println("ThreadName= "+Thread.currentThread().getName()+" 退出了方法");
		return sizeValue;
		
	}
	
	
}
