/**
 * 
 */
package com.whu.leecode;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * @author hongliang
 *
 */
public class inorderTraversal {
	
	private List<Integer> stack;
	
    public List<Integer> inorderTraversal(TreeNode root) {
		
    	stack=new LinkedList<Integer>();
    	
    	inOrder(root);
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	return stack;
     
    	
    	
    }

	/**
	 * @param root
	 */
	private void inOrder(TreeNode root) {
		
		inOrder(root.left);
		stack.add(root.val);
		inOrder(root.right);
		
	}
	

}
