/**
 * 
 */
package com.whu.leecode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author hongliang
 *
 */
public class isIsomorphic {
	
    public boolean isIsomorphic(String s, String t) {
		
    	//两个字符串为空
    	if(s==null&&t==null)
    		return true;
    	//只有一个为空
    	if(s==null||t==null)
    		return false;
    	//两个字符串为空
    	else if(s.length()==0&&t.length()==0)
    		return true;
    	else if(s.length()!=t.length())
    		return false;
    	
    	//保存映射关系
    	Map<Character,Character> map=new HashMap<>();
    	Set<Character> set=new HashSet<>(t.length());
    	char sChar;
    	char tChar;
    	for(int i=0;i<s.length();i++)
    	{
    		sChar=s.charAt(i);
    		tChar=t.charAt(i);
    		//建未出现过
    		if(!map.containsKey(sChar))
    		{
    			if(set.contains(tChar))
    			{
    				return false;
    			}
    			else
    			{
    				map.put(s.charAt(i), t.charAt(i));
    				set.add(tChar);
    			}
    		}
    		//如果键是已出现过
    		else
    		{
    			if(map.get(sChar)!=tChar)
    			{
    				return false;
    			}
    		}
    		
    		
    	}
    	
    	return true;
    }
	
}
