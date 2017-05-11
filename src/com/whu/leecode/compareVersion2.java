/**
 * 
 */
package com.whu.leecode;

/**
 * @author hongliang
 *
 */
public class compareVersion2 {
	
	  public int compareVersion(String version1, String version2) 
	  {
		  int countA=0;
		  int countB=0;
		  int indexA=0;
		  int indexB=0;
		  
		  int max;
		  int a;
		  int b;
		  
		  while(indexA<version1.length()||indexB<version2.length())
		  {
			  while(indexA<version1.length()||indexA!=version1.indexOf("."))
			  {
				  indexA++;
				  countA++;
			  }
			  
			  while(indexB<version2.length()||indexB!=version2.indexOf("."))
			  {
				  indexB++;
				  countB++;
			  }
			  
			  max=countA>countB?countA:countB;
			  for(int i=max;i>0;i--)
			  {
				  a=countA>=0?version1.charAt(indexA-i)-'0':0;
				  b=countB>=0?version2.charAt(indexB-i)-'0':0;
				  if(a>b)
					  return 1;
				  else
					  return 0;
			  }
			  countA=0;
			  countB=0;
			  indexA++;
			  indexB++;
			  
			  
		  }
		  
		  
		  return 0;
	  }
}
