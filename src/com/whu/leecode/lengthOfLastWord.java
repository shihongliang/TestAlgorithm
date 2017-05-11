/**
 * 
 */
package com.whu.leecode;

/**
 * @author hongliang
 *
 */
public class lengthOfLastWord {
	
    public int lengthOfLastWord(String s) {
	
    	int index=s.length()-1;
    	
    	while(index>=0&&s.charAt(index)==' ')
    	{
    		index--;
    	}
    	
    	if(index<0)
    		return 0;
    	int tmp=index;
    	
    	while(index>=0&&s.charAt(index)!=' ')
    	{
    		index--;
    	}
    	
    	
    	return tmp-index;
        
    }
	

}
