/**
 * 
 */
package com.whu.leecode;

import java.util.LinkedList;
import java.util.List;

/**
 * @author hongliang
 *
 */
public class letterComibinations {
	
	private String[] map={ "abc",
            "def",
            "ghi",
            "jkl",
            "mno",
            "pqrs",
            "tuv",
            "wxyz",};
	private List<String> result;
	private char[] chars;
	private char[] curResult;
	private int end=0;
	private int handle=0;
	
    public List<String> letterCombinations(String digits) {
    	
    	result=new LinkedList<>();
    	if(digits!=null&&digits.length()>0){
    		chars=digits.toCharArray();
    		
    		//对字符串进行处理，去掉0和1
    		while(end<digits.length()&&chars[end]!='0'&&chars[end]!='1'){
    			end++;
    		}
    		handle=end+1;
    		while(handle<chars.length){
    			if(chars[handle]!='0'&&chars[handle]!='1'){
    				chars[end]=chars[handle];
    				end++;
    			}
    			handle++;
    		}
    		curResult=new char[end];
    		handle=0;
    		letterCombinations();
    		
    		
    	}
    	
    	
		return result;
        
    }

	/**
	 * 
	 */
	private void letterCombinations() {
		if(handle>end){
			result.add(new String(curResult));
		}else{
			int num=chars[handle]-'2';
			for(int i=0;i<map[num].length();i++){
				curResult[handle]=map[num].charAt(i);
				handle++;
			    letterCombinations();
                handle--;
			}
		}
		
	}

}
