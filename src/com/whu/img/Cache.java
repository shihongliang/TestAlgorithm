/**
 * 
 */
package com.whu.img;

/**
 * @author hongliang
 *
 */
public class Cache {
	
	private String key;
	private Object value;
	private long timeout;
	private boolean expired;
	/**
	 * @return the key
	 */
	public String getKey() {
		return key;
	}
	/**
	 * @param key the key to set
	 */
	public void setKey(String key) {
		this.key = key;
	}
	/**
	 * @return the value
	 */
	public Object getValue() {
		return value;
	}
	/**
	 * @param value the value to set
	 */
	public void setValue(Object value) {
		this.value = value;
	}
	/**
	 * @return the timeout
	 */
	public long getTimeout() {
		return timeout;
	}
	/**
	 * @param timeout the timeout to set
	 */
	public void setTimeout(long timeout) {
		this.timeout = timeout;
	}
	/**
	 * @return the expired
	 */
	public boolean isExpired() {
		return expired;
	}
	/**
	 * @param expired the expired to set
	 */
	public void setExpired(boolean expired) {
		this.expired = expired;
	}
	

	public Cache() {
	
	}
	/**
	 * @param key
	 * @param value
	 * @param timeout
	 * @param expired
	 */
	public Cache(String key, Object value, long timeout, boolean expired) {
		super();
		this.key = key;
		this.value = value;
		this.timeout = timeout;
		this.expired = expired;
	}
	
	
	
	
}
