/**
 * 
 */
package com.whu.leecode;

/**
 * @author hongliang
 *
 */
public class strStr {

	   public int strStr(String haystack, String needle) {
		   
		   if(haystack==null||needle==null)
			   return -1;
		   if(needle.length()>haystack.length())
			   return -1;
		   
		   if("".equals(haystack))
		   {
			   if("".equals(needle))
			   {
				   return 0;
			   }
			   else{
				   return -1;
			   }
			   
		   }else{
			   if("".equals(needle))
			   {
				   return 0;
			   }
		   }
		   
		   
		   return kmpIndex(haystack,needle);
	        
	    }

	/**
	 * @param haystack
	 * @param needle
	 * @return
	 */
	private int kmpIndex(String haystack, String needle) {
		
		int i=0;
		int j=0;
		int[] next=next(needle);
		while(i<haystack.length()&&j<needle.length())
		{
			if(j==-1||haystack.charAt(i)==needle.charAt(i))
			{
				++i;
				++j;
			}
			else{
				j=next[j];
			}
		}
		
		if(j==needle.length()){
			return i-j;
		}else{
			return -1;
		}

	}

	/**
	 * @param needle
	 * @return
	 */
	private int[] next(String needle) {
		
		int[] next=new int[needle.length()];
		next[0]=-1;
		int i=0;
		int j=-1;
		int k=needle.length()-1;
		
		while(i<k)
		{
			if(j==-1&&needle.charAt(i)==needle.charAt(j))
			{
				++i;
				++j;
				if(needle.charAt(i)!=needle.charAt(j))
				{
					next[i]=j;
				}
				else{
					next[i]=next[j];
				}
			}else{
				j=next[j];
			}
		}	
		
		return next;
	}
	
}
