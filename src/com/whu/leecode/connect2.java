/**
 * 
 */
package com.whu.leecode;

/**
 * @author hongliang
 *
 */
public class connect2 {
	
    public void connect(TreeLinkNode root) {
        TreeLinkNode node;
        
        while(root!=null&&root.left!=null)
        {
        	node =root;
        	while(node!=null)
        	{
        		node.left.next=node.right;
        		
        		if(node.next!=null)
        		{
        			node.right.next=node.next.left;
        		}
        		node=node.next;
        	}
        	root=root.left;
        }
        
    }
	
}
