/**
 * 
 */
package com.whu.leecode;

/**
 * @author hongliang
 *
 */
public class rotateRight {

    public ListNode rotateRight(ListNode head, int k) {
	
    	ListNode node=head;
    	ListNode prev=node;
    	node=node.next;
    	for(int i=1;i<k;i++)
    	{
    		prev=node;
    		node=node.next;
    		
    	}
    	
    	prev.next=null;
    	
    	while(node!=null)
    	{
    		node=node.next;
    		
    	}
    	
    	node.next=head;
    	
    	return node;
        
    }
	
}
