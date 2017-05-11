/**
 * 
 */
package com.whu.proxy;

/**
 * @author hongliang
 *
 */
public class CountProxy implements Count {
	
	private CountImpl countImpl;
	
	

	/**
	 * @param countImpl the countImpl to set
	 */
	public void setCountImpl(CountImpl countImpl) {
		this.countImpl = countImpl;
	}

	/* (non-Javadoc)
	 * @see com.whu.proxy.Count#queryCount()
	 */
	@Override
	public void queryCount() {
			System.out.println("事务处理之前");
			countImpl.queryCount();
			System.out.println("事务处理之后");
		
	}

	/* (non-Javadoc)
	 * @see com.whu.proxy.Count#updateCount()
	 */
	@Override
	public void updateCount() {
		System.out.println("事务处理之前。。");
		countImpl.updateCount();
		System.out.println("事务处理之后");
		
	}
		
	
	
	
}
