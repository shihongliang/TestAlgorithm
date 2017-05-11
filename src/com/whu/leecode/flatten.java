/**
 * 
 */
package com.whu.leecode;

/**
 * @author hongliang
 *
 */
public class flatten {
	
    public void flatten(TreeNode root) {
    	
    	TreeNode head=new TreeNode(-1);
    	head.right=root;
    	TreeNode node=head;
    	
    	while(node.right!=null)
    	{
    		node=node.right;
    		if(node.left!=null)
    		{
    			TreeNode end=node.left;
    			while(end.right!=null)
    			{
    				end=end.right;
    				
    			}
    			
    			TreeNode tmp=node.right;
    			node.right=node.left;
    			node.left=null;
    			end.right=tmp;
    			
    		}
    	}
    	head.right=null;
        
    }
	

}
