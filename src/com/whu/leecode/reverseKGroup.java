/**
 * 
 */
package com.whu.leecode;

/**
 * @author hongliang
 *
 */
public class reverseKGroup {
	
    public ListNode reverseKGroup(ListNode head, int k) {
		
    	if(k<=1)
    	{
    		return head;
    	}
    	
    	ListNode root=new ListNode(0);
    	ListNode groupHead=root;
    	//当前处理的节点
    	ListNode curr=head;
    	//处理好链表的为节点
    	ListNode groupTail=head;
    	//当前处理的节点后记
    	ListNode next;
    	
    	//对每个节点处理了多少个节点
    	int count=0;
    	
    	while(curr!=null)
    	{
    		if(count==0)
    		{
    			groupTail=curr;
    		}
    		
    		//处理个数+1
    		count++;
    		//记录下一个节点的特征
    		next=curr.next;
    		//记录下个要处理的节点
    		curr.next=groupHead.next;
    		groupHead.next=curr;
    		curr=next;
    		
    		if(count==k)
    		{
    			groupHead=groupTail;
    			count=0;
    		}
    		
    	}
    	
    	if(count!=0)
    	{
    		curr=groupHead.next;
    		groupHead.next=null;
    		
    		while(curr!=null)
    		{
    			next=curr.next;
    			curr.next=groupHead.next;
    			groupHead.next=curr;
    			curr=next;
    		}
    		
    	}
    	
    	
    	return root.next;
        
    }

}
