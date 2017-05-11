/**
 * 
 */
package com.whu.leecode;

/**
 * @author hongliang
 *
 */
public class reverseList {
	
	  public ListNode reverseList(ListNode head) {
		  
		  ListNode p;
		  ListNode p2;
		  p=head;
		  p2=head;

		  ListNode q;
		  q=p.next;
		  p=p.next;
		  while(p.next!=null){
			  p.next.next=q;
			 p2.next=p.next.next.next;
			q=p.next;
		  }
		  
		  return head;
	        
	    }
	
}
