/**
 * 
 */
package com.whu.leecode;

/**
 * @author hongliang
 *
 */
public class deleteDuplicate {
	
	   public ListNode deleteDuplicates(ListNode head) {
	
		   ListNode point;
		   ListNode tail=head;
		   if(head!=null)
		   {
			   point=head.next;
			   while(point!=null)
			   {
				   if(tail.val!=point.val)
				   {
					   tail.next=point;
					   point=point.next;
				   }
				   point=point.next;
				   
			   }
			   
			   tail.next=null;
			   
		   }
		   
		   
		   
		   return head;
	        
	  }

}
