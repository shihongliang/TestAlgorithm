/**
 * 
 */
package com.whu.Thinking;

/**
 * @author hongliang
 *
 */
public class SimpleProxy implements Interface {


	private Interface proxied;
	/**
	 * 
	 */
	public SimpleProxy(Interface proxied) {
		this.proxied=proxied;
	}
	
	@Override
	public void doSomething() {
	
		System.out.println("SimpleProxy doSomething...");
		proxied.doSomething();
		
	}

	/* (non-Javadoc)
	 * @see com.whu.Thinking.Interface#somethidElse(java.lang.String)
	 */
	@Override
	public void somethidElse(String arg) {
		System.out.println("SimpleProxy somethingElse "+arg);
		proxied.somethidElse(arg);
	}

}
