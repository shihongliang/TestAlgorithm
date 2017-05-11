/**
 * 
 */
package com.whu.MultiThread;

/**
 * @author hongliang
 *
 */
public class SynchronizedObject {
	
	private String username="a";
	private String password="aa";
	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}
	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	
	synchronized public void printString(String username,String password)
	{
		try {
			this.username=username;
			Thread.sleep(1000);
			this.password=password;
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
