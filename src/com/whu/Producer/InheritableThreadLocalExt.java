/**
 * 
 */
package com.whu.Producer;

import java.util.Date;

/**
 * @author hongliang
 *
 */
public class InheritableThreadLocalExt extends InheritableThreadLocal{
	
	/* (non-Javadoc)
	 * @see java.lang.ThreadLocal#initialValue()
	 */
	@Override
	protected Object initialValue() {
		// TODO Auto-generated method stub
		return new Date().getTime();
	}
	
}
