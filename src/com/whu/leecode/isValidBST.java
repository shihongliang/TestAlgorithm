/**
 * 
 */
package com.whu.leecode;

import java.util.Stack;

/**
 * @author hongliang
 *
 */
public class isValidBST {
	
	private Stack<Integer> stack;
	
    public boolean isValidBST(TreeNode root) {
	
    	if(root==null)
    		return true;
    	stack=new Stack<Integer>();
    	
    	inOrder(root);
    	
    	int i=stack.pop();
    	
    	int j;
    	while(!stack.isEmpty())
    	{
    		j=stack.pop();
    		if(i<=j)
    			return false;
    		i=j;
    	}
    	
    	
    	return true;
        
    }

	/**
	 * @param root
	 */
	private void inOrder(TreeNode root) {
		if(root!=null)
		{
			inOrder(root.left);
			stack.push(root.val);
			inOrder(root.right);
		}
		
	}



}
