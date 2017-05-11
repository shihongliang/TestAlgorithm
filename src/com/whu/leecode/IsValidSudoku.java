/**
 * 
 */
package com.whu.leecode;

/**
 * @author hongliang
 *
 */
public class IsValidSudoku {
	
    public boolean isValidSudoku(char[][] board) {
		
    	int number=board[0].length;
    	int[] record=new int[10+2];
    	boolean isValid;
    	reset(record);
    	
    	for(int i=0;i<number;i++)
    	{
    		for(int j=0;j<number;j++)
    		{
    			record[board[i][j]-'.']++;
    		}
    		
    		if(!check(record))
    		{
    			return false;
    		}
    		else{
    			reset(record);
    		}
    		
    	}
    	
    	//检查3*3块
    	for(int i=0;i<3;i++)
    	{
    		for(int j=0;j<3;j++)
    		{
    			
    			for(int k=i*3;k<(i+1)*3;k++)
    			{
    				for(int l=j*3;j<(j+1)*3;l++)
    				{
    					record[board[i][j]-'.']++;
    				}
    			}
    			
    			if(!check(record)) 
    			{
    				return false;
    			}
    			else{
    				reset(record);
    			}
    			
    			
    		}
    		
    		
    	}
    	
    	
    	
    	return true;
        
    }

	/**
	 * @param record
	 * @return
	 */
	private boolean check(int[] a) {
		
		for(int i=2;i<a.length;i++)
		{
			if(a[i]>1)
				return false;
		}
		
		return true;
	}

	/**
	 * @param record
	 */
	private void reset(int[] a) {
		
		for(int i=0;i<a.length;i++)
			a[i]=0;
	}

}
