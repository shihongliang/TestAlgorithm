/**
 * 
 */
package com.whu.leecode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hongliang
 *
 */
public class getRow {
	
	 public List<Integer> getRow(int rowIndex) {
	
		 rowIndex++;
		 int line=0;
		 List<Integer> result=new ArrayList<Integer>();
		 
		 
		 if(rowIndex>=1)
		 {
			 result.add(1);
		 }
		 if(rowIndex>=2)
		 {
			 result.add(2);
		 }
		 
		 if(rowIndex>=3)
		 {
			 int[][] data=new int[2][rowIndex];
			 
			 data[0][0]=1;
			 data[1][0]=1;
			 data[1][1]=1;
			 
			 for(int i=2;i<rowIndex;i++)
			 {
				 
				 line=i%2;
				 int prev=(i-1+2)%2;
				 for(int j=1;j<i;j++)
				 {
					 data[line][j]=data[prev][j]+data[prev][j-1];
				 }
				 data[line][i]=1;
			 }
			 
			 result.clear();
			 
			 for(int i=0;i<rowIndex;i++)
			 {
				 result.add(data[line][i]);
			 }
			 
		 }
		 
		 
		 
		 return result;   
	  }
	
}
