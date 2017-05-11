/**
 * 
 */
package com.whu.Producer;

import java.util.Date;

/**
 * @author hongliang
 *
 */
public class ThreadLocalExt extends ThreadLocal {
	
	/* (non-Javadoc)
	 * @see java.lang.ThreadLocal#initialValue()
	 */
	@Override
	protected Object initialValue() {
		
		return new Date().getTime();
		
	}
	
	
}
