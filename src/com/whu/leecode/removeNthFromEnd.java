/**
 * 
 */
package com.whu.leecode;

/**
 * @author hongliang
 *
 */
public class removeNthFromEnd {
	
    public ListNode removeNthFromEnd(ListNode head, int n) {
		
    	ListNode pa=head;
    	ListNode pb=head;
    	
    	//找到第n个节点
    	for(int i=0;i<n&&pa!=null;i++){
    		pa=pa.next;
    	}
    	
    	if(pa==null){
    		head=head.next;
    		return head;
    	}
    	while(pa.next!=null){
    		pa=pa.next;
    		pb=pb.next;
    	}
    	pb.next=pb.next.next;
    	
    	
    	return head;
        
    }

}
