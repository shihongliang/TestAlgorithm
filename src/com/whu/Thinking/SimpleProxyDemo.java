/**
 * 
 */
package com.whu.Thinking;

/**
 * @author hongliang
 *
 */
public class SimpleProxyDemo {
	
	public static void consume(Interface iface)
	{
		iface.doSomething();
		iface.somethidElse("bonono");
	}
	
	public static void main(String[]args)
	{
		consume(new RealObject());
		consume(new SimpleProxy(new RealObject()));
		
	}
	
}
