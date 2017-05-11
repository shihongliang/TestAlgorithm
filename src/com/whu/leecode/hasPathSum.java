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
public class hasPathSum {
	
	private List<List<Integer>> result;
	private List<Integer> l;
	private int curSum=0;
	private int sum;
	private  boolean flag=false;
	
    public boolean hasPathSum(TreeNode root, int sum) {
    	
    		result=new LinkedList<>();
    	
    		
    		if(root!=null)
    		{
    			this.sum=sum;
    			l=new LinkedList<>();
    		 boolean flag=	hasPathSum(root);
    		}
    	
    	
    	
    	
    	return flag;
        
    }

	/**
	 * @param root
	 */
	private boolean  hasPathSum(TreeNode root) {
		
		if(root!=null)
		{
			l.add(root.val);
			curSum+=root.val;
			if(root.left==null&&root.right==null&&curSum==sum)
			{
				return true;
			}
			
			if(root.left!=null)
			{
				hasPathSum(root.left);
			}
			
			if(root.right!=null)
			{
				hasPathSum(root.right);
			}
			
			curSum-=root.val;
			l.remove(l.size()-1);
		}
		return false;
		
		
	}
	
}
