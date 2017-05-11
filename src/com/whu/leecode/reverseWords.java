/**
 * 
 */
package com.whu.leecode;

/**
 * @author hongliang
 *
 */
public class reverseWords {
    
	public String reverseWords(String s) {
		
		if(s==null)
			return null;
		char[] chars=s.toCharArray();
		//字符压缩
		int readLength=conpressWhiteSpace(chars);
		
		//交换整个字符
		swapRange(chars,0,readLength);
		//记录单个字符
		int start=0;
		//记录终点字符
		int end;
		while(start<readLength)
		{
			end=start-1;
			while(start<readLength&& chars[end] != ' ')
			{
				end++;
			}
			//反转字符
			swapRange(chars,start,end-1);
			//记录新的开始位置
			start=end;
		}
		
		
		return new String(chars, 0, readLength);
        
    }

	/**
	 * @param chars
	 * @param i
	 * @param readLength
	 */
	private void swapRange(char[] chars, int x, int y) {
		char z=chars[x];
		chars[x]=chars[y];
		chars[y]=z;
		
	}

	/**
	 * @param chars
	 * @return
	 * 对字符串压缩的开始字符
	 */
	private int conpressWhiteSpace(char[] chars) {
		
		if(chars==null||chars.length==0)
			return 0;
		//放在字符的位置
		int pos=0;
	     for (int i = 0; i < chars.length; i++) {
	    	    // 从i位置开始找第一个非空白字符
	    	 while(i<chars.length&&chars[i]== ' ')
	    	 {
	    		 i++;
	    	 }
	    	 //已经处理完了
	    	 if(i>=chars.length)
	    	 {
	    		 break;
	    	 }
	    	 //从位置开始处理非空白的位置
	    	 while(i<chars.length&&chars[i]!= ' ')
	    	 {
	    		 chars[pos]=chars[i];
	    		 pos++;
	    		 i++;
	    	 }
	    	 //处理完一个空字符串，最后一个空格
	    	 if(pos<chars.length)
	    		 chars[pos]=' ';
	    	 pos++;
	    	 
	     }
	     
	     if(pos==0)
	    	 return 0;
	     else
	    	 return pos-1;
	
	}
}
