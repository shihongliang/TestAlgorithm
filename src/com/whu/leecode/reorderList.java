/**
 * 
 */
package com.whu.leecode;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author hongliang
 *
 */
public class reorderList {
	
    public void reorderList(ListNode head) {
      //  if(head==null)
        	Deque<ListNode> dq=new ArrayDeque<>();
        	while(head!=null)
        	{
        		dq.add(head);
        		head=head.next;
        	}
        	ListNode sentinal=new ListNode(0);
        	ListNode tail=sentinal;
        	boolean formFirst=true;
        	while(dq.size()!=0)
        	{
        		if(formFirst)
        		{
        			tail.next=dq.pollFirst();
        			formFirst=false;
        		}
        		else
        		{
        			tail.next=dq.pollFirst();
        			formFirst=true;
        		}
        		tail=tail.next;
        		tail.next=null;
        	}
        
    }
	
}
