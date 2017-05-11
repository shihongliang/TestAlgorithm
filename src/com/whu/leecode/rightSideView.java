/**
 * 
 */
package com.whu.leecode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;


/**
 * @author hongliang
 *
 */
public class rightSideView {
	
	public List<Integer> rightSideView(TreeNode root) {
		
		List<Integer> list=new ArrayList<Integer>();
		
		if(root!=null)
		{
			Deque<TreeNode> deque=new LinkedList<>();
			int current=1;
			int next=0;
			TreeNode node;
			deque.addLast(root);
			while(deque.size()>0)
			{
				node=deque.removeFirst();
				current--;
				if(node.left!=null)
				{
					next++;
					deque.addLast(node.left);
				}
				if(node.right!=null)
				{
					next++;
					deque.addLast(node.right);
				}
				
				if(current==0)
				{
					list.add(node.val);
					current=next;
					next=0;
				}
				
			}
		}
		
		return list;
        
    }
	
}
