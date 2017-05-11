/**
 * 
 */
package com.whu.leecode;

import java.util.Set;

/**
 * @author hongliang
 *
 */
public class wordBreak {
	
    public boolean wordBreak(String s, Set<String> wordDict) {

    	if(s==null||s.length()<1||wordDict==null||wordDict.size()<0)
    		return false;
    	//标记为是否匹配
    	int length=s.length();
    	boolean[] match=new boolean[length+1];
    	match[0]=true;
    	for(int i=1;i<length;i++)
    		for(int j=0;j<i;j++)
    			if(match[i]&&wordDict.contains(s.substring(j,i)))
    			{
    				match[i]=true;
    				break;
    			}
    		
    	return true;
        
    }
    
    
    
	
}
