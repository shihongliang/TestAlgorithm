/**
 * 
 */
package com.whu.leecode;

/**
 * @author hongliang
 *
 */
public class mergeTwoLists {
	
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode head=new ListNode(0);
		ListNode tail=head;
		
		while(l1!=null&&l2!=null){
			if(l1.val<=l2.val){
			tail.next=l1;
			l1=l1.next;
		}else{
			tail.next=l2;
			l2=l2.next;
		}
		tail=tail.next;
    }
		
		tail.next=(l1!=null?l1:l2);
    	
    	return head.next;
        
    }

}
