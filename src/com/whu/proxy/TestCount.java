/**
 * 
 */
package com.whu.proxy;

/**
 * @author hongliang
 *
 */
public class TestCount {
	
	public static void main(String[]args)
	{
		CountImpl countImpl=new CountImpl();
		CountProxy countProxy=new CountProxy();
		countProxy.updateCount();
		countProxy.queryCount();

	}
	
}
