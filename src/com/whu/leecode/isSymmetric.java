/**
 * 
 */
package com.whu.leecode;

/**
 * @author hongliang
 *
 */
public class isSymmetric {
	
    public boolean isSymmetric(TreeNode root) {
		
    	
    	if(root==null)
    		return true;
    	else{
    		return isSame(root.left,root.right);
    	}


        
    }

	/**
	 * @param left
	 * @param right
	 * @return
	 */
	private boolean isSame(TreeNode left, TreeNode right) {
		
		if(left==null&&right==null)
			return true;
		else if(left!=null&&right==null||left==null&&right!=null)
			return false;
		else
	    	return left.val==right.val&&isSame(left.left,right.right)&&isSame(left.right,right.left);
	    	
	    	
	
	}

}
