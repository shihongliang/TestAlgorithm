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
public class generateParenthese {
	
    public List<String> generateParenthesis(int n) {
		
    	List<String> result=new ArrayList<String>();
    	if(n>0){
    		char[] parenthese=new char[2*n];
    		solve(n,n,parenthese,result);
    	}
    	
    	
    	
    	return null;
        
    }

	/**
	 * @param n
	 * @param n2
	 * @param parenthese
	 * @param result
	 */
	private void solve(int left, int right, char[] parenthese, List<String> result) {
		
		if(left<0||right<0||right<left){
			
		}
		else if(left==0&&right==0){
			result.add(new String(parenthese));
		}
		else{
			int idx=parenthese.length-left-right;
			parenthese[idx]='(';
			solve(left-1,right,parenthese,result);
			parenthese[idx]=')';
			solve(left,right-1,parenthese,result);
		}
		
		
	}

}
