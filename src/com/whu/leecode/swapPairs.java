/**
 * 
 */
package com.whu.leecode;

/**
 * @author hongliang
 *
 */
public class swapPairs {
	
    public ListNode swapPairs(ListNode head) {
		
    	ListNode node=new ListNode(0);
    	node.next=head;
    	
    	//p指向新的链表的尾节点
    	ListNode p=node;
    	ListNode tmp;
    	
    	//每两个进行操作
    	while(p.next!=null&&p.next.next!=null)
    	{
    		//纪得下一次要处理的位置
    		tmp=p.next.next;
    		p.next.next=tmp.next;
    		tmp.next=p.next;
    		p.next=tmp;
    		//指向返回链表的一个新的节点
    		p=tmp.next;
    	}
    	
    	head=node.next;
    	node.next=null;
    	
    	
    	
    	return head;
        
    }

}
