/**
 * 
 */
package com.whu.multiThread21;

/**
 * @author hongliang
 *
 */
public class PublicClass {
	
	private String username;
	private String password;
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
	
	class PrivateClass{
		private String age;
		private String address;
		/**
		 * @return the age
		 */
		public String getAge() {
			return age;
		}
		/**
		 * @param age the age to set
		 */
		public void setAge(String age) {
			this.age = age;
		}
		/**
		 * @return the address
		 */
		public String getAddress() {
			return address;
		}
		/**
		 * @param address the address to set
		 */
		public void setAddress(String address) {
			this.address = address;
		}
		
		public void printPublicProperty(){
			System.out.println(username+" "+password);
		}
		
	}
	
	
}
