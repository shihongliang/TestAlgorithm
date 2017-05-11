/**
 * 
 */
package com.whu.leecode;

/**
 * @author hongliang
 *
 */
public class partition {
	
    public ListNode partition(ListNode head, int x) {
		
    	ListNode bHead=null;
    	ListNode node=head;
    	
    	while(node.next!=null||node!=null)
    	{
    		if(node.val<x)
    		{
    			bHead.val=node.val;
    			bHead=bHead.next;
    			
    		}
    		node=node.next;
    	}
    	
    	while(bHead.next!=null)
    	{
    		bHead=bHead.next;
    	}
    	
    	bHead=bHead.next;
    	while(node.next!=null||node!=null)
    	{
    		if(node.val>=x)
    		{
    			bHead.next.val=node.val;
    		}
    		node=node.next;
    	}
    	
    	
    	return bHead;
        
    }
	
}
