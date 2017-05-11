/**
 * 
 */
package com.whu.leecode;

/**
 * @author hongliang
 *
 */
public class plusOne {

    public int[] plusOne(int[] digits) {
		
    	int carry=1;
    	
    	int tmp=0;
    	
    	for(int i=digits.length-1;i>=0;i--)
    	{
    		tmp=digits[i];
    		digits[i]=(tmp+carry)%10;
    		carry=(tmp+carry)/10;
    		
    		if(carry==0)
    		{
    			break;
    		}
    		
    	}
    	
    	
    	if(carry==1)
    	{
    		int[] result=new int[digits.length+1];
    		System.arraycopy(digits, 0, result, 1, digits.length-1);
    		result[0]=carry;
    		return result;
    	}
    	else{
    		return digits;
    	}
    	
    }
	
}
