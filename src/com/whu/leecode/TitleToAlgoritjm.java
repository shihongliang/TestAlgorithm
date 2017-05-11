/**
 * 
 */
package com.whu.leecode;

/**
 * @author hongliang
 *
 */
public class TitleToAlgoritjm {
	
    public int titleToNumber(String s) {
		int result=0;
		for(int i=0;i<s.length();i++)
		{
			result=result*26+(s.charAt(i)-'A'+1);
		}
    	
    	return result;
        
    }
	
}
