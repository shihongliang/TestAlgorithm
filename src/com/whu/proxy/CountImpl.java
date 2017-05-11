/**
 * 
 */
package com.whu.proxy;

/**
 * @author hongliang
 *
 */
public class CountImpl implements Count{

	/* (non-Javadoc)
	 * @see com.whu.proxy.Count#queryCount()
	 */
	@Override
	public void queryCount() {
		System.out.println("查看账户方法");
		
	}

	/* (non-Javadoc)
	 * @see com.whu.proxy.Count#updateCount()
	 */
	@Override
	public void updateCount() {
		
		System.out.println("修改账户方法");
	}
	
	
	
}
