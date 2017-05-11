/**
 * 
 */
package com.whu.Thinking;

/**
 * @author hongliang
 *
 */
public class RealObject implements Interface {

	
	
	@Override
	public void doSomething() {
		
		System.out.println(" do something....");
	}

	/* (non-Javadoc)
	 * @see com.whu.Thinking.Interface#somethidElse(java.lang.String)
	 */
	@Override
	public void somethidElse(String arg) {
		System.out.println("somethingElse "+arg);

	}

}
