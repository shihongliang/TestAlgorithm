/**
 * 
 */
package com.whu.leecode;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;

/**
 * @author hongliang
 *
 */
public class buildTree2 {
	
    public TreeNode buildTree(int[] preorder, int[] inorder) {
		
    	if(preorder==null||preorder.length==0)
    		return null;
    	HashMap<Integer,Integer> inorderMap=new HashMap<Integer,Integer>();
    	for(int i=0;i<inorder.length;i++)
    	{
    		inorderMap.put(inorder[i], i);
    	}
    	
    	Deque<TreeNode> stack=new LinkedList<TreeNode>();
    	
    	TreeNode root=new TreeNode(preorder[0]);
    	stack.push(root);
    	
    	for(int i=1;i<preorder.length;i++)
    	{
    		TreeNode top=stack.peek();
    		int indexTop=inorderMap.get(top.val);
    		int indexVal=inorderMap.get(preorder[i]);
    		
    		TreeNode node=new TreeNode(preorder[i]);
    		
    		if(indexVal<indexTop)
    		{
    			top.left=node;
    		}else{
    			 while(indexVal>indexTop)
    			 {
    				 top=stack.pop();
    				 indexTop=stack.isEmpty()?Integer.MAX_VALUE:inorderMap.get(stack.peek().val);
    			 }
    			 top.right=node;
    		}
    		stack.push(node);
    		
    	}
    	
    	
    	
    	return root;
		
    	
        
    }
	

}
