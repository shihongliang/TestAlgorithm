/**
 * 
 */
package com.whu.leecode;

/**
 * @author hongliang
 *
 */
public class isPalindrome {
	
	  public boolean isPalindrome(String s) {
		  
		  for(int i=0;i<s.length()/2+1;i++)
		  {
			  if(s.charAt(i)==s.charAt(s.length()-i))
			  {
				  continue;
			  }
			  else 
				  return false;
		  }
		  
		  return true;
	        
	    }
	
}
