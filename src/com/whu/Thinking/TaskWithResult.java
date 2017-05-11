/**
 * 
 */
package com.whu.Thinking;

import java.util.concurrent.Callable;

/**
 * @author hongliang
 *
 */
public class TaskWithResult implements Callable<String>{

	private int id;
	
	
	
	
	/**
	 * @param id
	 */
	public TaskWithResult(int id) {
		super();
		this.id = id;
	}



	@Override
	public String call() throws Exception {
		
		return "result of TaskWithResult"+ id;
	}
	
	
	
}
