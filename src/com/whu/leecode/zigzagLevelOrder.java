/**
 * 
 */
package com.whu.leecode;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;


/**
 * @author hongliang
 *
 */
public class zigzagLevelOrder {

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

    	List<List<Integer>> result=new LinkedList<>();
    	
    	if(root==null)
    		return null;
    	int flag=0;
    	TreeNode node;
    	List<Integer> lay=new LinkedList<>();
    	Deque<TreeNode> stack=new LinkedList<>();
    	Deque<TreeNode> nextStack=new LinkedList<>();
    	stack.add(root);
    	while(!stack.isEmpty())
    	{
    		node=stack.removeFirst();
    		//结果入队
    		lay.add(node.val);
    		
    		if(flag==0)
    		{
    			if(node.left!=null)
    			{
    				nextStack.addLast(node.left);
    			}
    			
    			if(node.right!=null)
    			{
    				nextStack.addLast(node.right);
    			}
    			
    		}
    		else {
    			if(node.right!=null)
    			{
    				nextStack.addLast(node.right);
    			}
    			if(node.left!=null)
    			{
    				nextStack.addLast(node.left);
    			}
    		}
    		if(stack.isEmpty())
    		{
    			Deque<TreeNode> temp=new LinkedList<>();
    			nextStack=stack;
    			
    			stack=temp;
    			flag=1-flag;
    			result.add(lay);
    			lay=new LinkedList<>();
    			
    		}
    		
    	}
    	
    	
    	return result;
        
    }
	
}
