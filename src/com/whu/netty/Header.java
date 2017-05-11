/**
 * 
 */
package com.whu.netty;

import java.util.HashMap;
import java.util.Map;

/**
 * @author hongliang
 *
 */
public class Header {
	
	  private int crcCode = 0xabef0101;  
	  
	  private int length;
	  
	  private long sessionID;
	  
	  private byte type;
	  
	  private byte priority;
	  
	  private Map<String,Object> attachment=new HashMap<String,Object>();

	/**
	 * @return the crcCode
	 */
	public int getCrcCode() {
		return crcCode;
	}

	/**
	 * @param crcCode the crcCode to set
	 */
	public void setCrcCode(int crcCode) {
		this.crcCode = crcCode;
	}

	/**
	 * @return the length
	 */
	public int getLength() {
		return length;
	}

	/**
	 * @param length the length to set
	 */
	public void setLength(int length) {
		this.length = length;
	}

	/**
	 * @return the sessionID
	 */
	public long getSessionID() {
		return sessionID;
	}

	/**
	 * @param sessionID the sessionID to set
	 */
	public void setSessionID(long sessionID) {
		this.sessionID = sessionID;
	}

	/**
	 * @return the type
	 */
	public byte getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(byte type) {
		this.type = type;
	}

	/**
	 * @return the priority
	 */
	public byte getPriority() {
		return priority;
	}

	/**
	 * @param priority the priority to set
	 */
	public void setPriority(byte priority) {
		this.priority = priority;
	}

	/**
	 * @return the attachment
	 */
	public Map<String, Object> getAttachment() {
		return attachment;
	}

	/**
	 * @param attachment the attachment to set
	 */
	public void setAttachment(Map<String, Object> attachment) {
		this.attachment = attachment;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Header [crcCode=" + crcCode + ", length=" + length + ", sessionID=" + sessionID + ", type=" + type
				+ ", priority=" + priority + ", attachment=" + attachment + "]";
	}
	  
	  
	  
			  

}
