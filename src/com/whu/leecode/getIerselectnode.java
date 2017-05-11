/**
 * 
 */
package com.whu.leecode;

/**
 * @author hongliang
 *
 */
public class getIerselectnode {
	
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		if(headA==null||headB==null)
			return null;
		ListNode ta;
		ListNode ha=headA;
		while(ha.next!=null)
			ha=ha.next;
		ta=ha;
		ta.next=headB;
		//判断是否存在环
		ListNode fast=headA;
		ListNode slow=headB;
		while(fast!=null&&fast.next!=null)
		{
			fast=fast.next.next;
			slow=slow.next;
			
			if(fast==slow)
			{
				break;
			}
			
		}
		
		if(fast==null||fast.next==null)
		{
			ha.next=null;
			return null;
		}
		
		slow=headA;
		
		while(fast!=slow)
		{
			fast=fast.next;
			slow=slow.next;
		}
		ta.next=null;
		
    	return slow;
    	
    	  
    }
	
}
