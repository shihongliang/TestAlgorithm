/**
 * 
 */
package com.whu.multiThread21;

/**
 * @author hongliang
 *
 */
public class MyObject {
	
	synchronized public void speedPrintString(){
		System.out.println("speedPrintString __getLock time= "+System.currentTimeMillis()+" run ThreadName= "+Thread.currentThread().getName());
		
		System.out.println("-----------------");
		System.out.println("speedPrintString releaseLock time= "+System.currentTimeMillis()+" run ThreadName= "+Thread.currentThread().getName());
		
		
	}
	
}
