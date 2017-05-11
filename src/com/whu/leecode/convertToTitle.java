/**
 * 
 */
package com.whu.leecode;

/**
 * @author hongliang
 *
 */
public class convertToTitle {
	
    public String convertToTitle(int n) {
    	char[] result=new char[20];
    	int index=20;
    	n--;
    	do{
    		result[--n]=(char)('A'+n%26);
    		n=n/26-1;
    		
    	}while(n>=0);
    	
    	return new String(result,index,20-index);
        
    }
	
}
