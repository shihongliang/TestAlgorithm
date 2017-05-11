/**
 * 
 */
package com.whu.leecode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author hongliang
 *
 */
public class levelOrder {
	
    public List<List<Integer>> levelOrder(TreeNode root) {

    	TreeNode node= root;
    	Queue<Integer> queue=new LinkedList<Integer>();
    	List<List<Integer>> result=new ArrayList<>();
    	
    	
    	while(node!=null)
    	{
    		List<Integer> list=new LinkedList<>();
    		
    		while(node!=null)
    		{
    			if(node.left!=null)
    			{
    				
    				queue.add(node.left.val);
    				node=node.left;
    			}
    			
    			if(node.right!=null)
    			{
    				queue.add(node.right.val);
    			}
    			list.addAll(queue);
    		}
    		result.add(list);
    	}
    	
    	
    	
    	return result;

        
    }
	
}
