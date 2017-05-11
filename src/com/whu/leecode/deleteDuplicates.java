/**
 * 
 */
package com.whu.leecode;

/**
 * @author hongliang
 *
 */
public class deleteDuplicates {
	
    public ListNode deleteDuplicates(ListNode head) {
	
    	ListNode root=new ListNode(0);
    	root.next=head;
    	ListNode p=head;
    	ListNode q=root;
    	int delta=0;
    	while(p!=null&&p.next!=null)
    	{
    		if(p.val==p.next.val)
    		{
    			delta++;
    			p=p.next;
    		}
    		else{
    			if(delta==0)
    			{
    				q.next=p;
    				q=p;
    				p=p.next;
    			}
    			else{
    				p=p.next;
    				q.next=p.next;
    				delta=0;
    			}
    			
    		}
    	}
    	
    	if(delta!=0)
    	{
    		q.next=null;
    		
    	}else{
    		q.next=p;
    	}
    	
    	
    	
    	
    	return head;
        
    }

}
