/**
 * 
 */
package com.whu.leecode;

/**
 * @author hongliang
 *
 */
public class isBanlanced {
	
	private int minDepth=0;
	private int maxDepth=0;
	
    public boolean isBalanced(TreeNode root) {
		
    	if(root==null)
    		return true;
    	int left=Depth(root.left);
    	int right=Depth(root.right);
    	
    	if(left-right>1||left-right<-1)
    		return false;
    	else{
    		return isBalanced(root.left)&&isBalanced(root.right);
    	}
    	
        
    }

	/**
	 * @param right
	 * @return
	 */
	private int Depth(TreeNode node) {
		
		if(node==null)
			return 0;
		else if(node.left==null&&node.right==null)
		{
			return 1;
		}else{
			
			int left=Depth(node.left);
			int right=Depth(node.right);
			
			return 1+(left>right?left:right);
		}
		
	
	}


}
