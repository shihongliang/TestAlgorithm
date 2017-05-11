/**
 * 
 */
package com.whu.leecode;

/**
 * @author hongliang
 *
 */
public class deleteCycle {
	
    public ListNode detectCycle(ListNode head) {
		
    	ListNode fast=head;
    	ListNode slow=head;
    	while(fast!=slow)
    	{
    		fast=fast.next.next;
    		slow=slow.next;
    		
    		if(fast==slow)
    		{
    			break;
    		}
    		
    	}
    	
    	if(fast==null||fast.next==null)
    		return null;
    	
    	slow=head;
    	while(fast!=slow)
    	{
    		fast=fast.next;
    		slow=slow.next;
    	}
    		
    	
    	
    	
    	
    	return slow;
        
    }
	
}
