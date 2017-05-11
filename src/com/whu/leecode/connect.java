/**
 * 
 */
package com.whu.leecode;

/**
 * @author hongliang
 *
 */
public class connect {

    public void connect(TreeLinkNode root) {
        TreeLinkNode queue=root;
        TreeLinkNode level=new TreeLinkNode(0);
        while(queue!=null)
        {
        	level.next=null;
        	TreeLinkNode current=level;
        	if(queue.left!=null)
        	{
        		level.next=queue.left;
        		current=current.next;
        	}
        	
        	if(queue.right!=null)
        	{
        		level.next=queue.right;
        		current=current.next;
        	}
        	queue=level.next;
        }
    }
}
