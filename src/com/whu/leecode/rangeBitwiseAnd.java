/**
 * 
 */
package com.whu.leecode;

/**
 * @author hongliang
 *
 */
public class rangeBitwiseAnd {
	
	  public static int rangeBitwiseAnd(int m, int n) {
		  int offset=0;
		  while(m!=n)
		  {
			  m>>=1;
			  n>>=1;
			  offset++;
			  
		  }
		  
		  return m<<offset;    
	   }
	  
	  public static void main(String[]args)
	  {
		 int m=rangeBitwiseAnd(5,7);
		 System.out.println(m);
	  }
	  
	
}
