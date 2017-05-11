/**
 * 
 */
package com.whu.leecode;

/**
 * @author hongliang
 *
 */
public class removeElements {
	
     public ListNode removeElements(ListNode head, int val) {
    	 ListNode p=head;
    	 ListNode q=p.next;
    	 while(q!=null)
    	 {
    		 if(q.val==val)
    		 {
    			 p.next=q.next;
    		 }
    		 p=p.next;
    		 q=q.next;
    	 }
    	 
    	 return p;   
	  }
	
}
