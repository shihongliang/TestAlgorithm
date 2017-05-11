/**
 * 
 */
package com.whu.leecode;

/**
 * @author hongliang
 *
 */
public class minDepth {
	
		private int min=Integer.MIN_VALUE;
		private int cur=0;
	
	   public int minDepth(TreeNode root) {
	       
		   depth(root);
		   
		   return min;
	        
	    }

	/**
	 * @param root
	 */
	private void depth(TreeNode node) {
		
		if(node==null)
		{
			min=cur;
			return ;
		}
		cur++;
		if(node.left==null&&node.right==null&&cur<min)
		{
			min=cur;
		}
		
		if(node.left!=null)
		{
			depth(node.left);
		}
		
		if(node.right!=null)
		{
			depth(node.right);
		}
		cur--;
	}
	
}
