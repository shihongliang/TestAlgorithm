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
public class preorderTraversal {
	
	private List<Integer> result;
	
	
    public List<Integer> preorderTraversal(TreeNode root) {
        result=new LinkedList();
        preOrder(root);
        return result;
    }


	/**
	 * @param root
	 */
	private void preOrder(TreeNode root) {
		if(result!=null)
		{
			result.add(root.val);
			preOrder(root.left);
			preOrder(root.right);
			
		}
		
	}
	
}
