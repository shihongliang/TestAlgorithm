/**
 * 
 */
package com.whu.leecode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hongliang
 *
 */
public class sortListToBST {
	
    public TreeNode sortedListToBST(ListNode head) {
		
    	//链表为空
    	if(head==null)
    		return null;
    	//链表只有一个节点
    	if(head.next==null)
    		return new TreeNode(head.val);
    	
    	//快速移动，每次移动两个位置
    	ListNode fast=head.next.next;
    	ListNode mid=head;
    	
    	while(fast!=null&&fast.next!=null)
    	{
    		fast=fast.next.next;
    		mid=mid.next;
    	}
    	
    	TreeNode root=new TreeNode(mid.next.val);
    	root.right=sortedListToBST(mid.next.next);
    	ListNode midNext=mid.next;
    	mid.next=null;
    	root.left=sortedListToBST(head);
    	mid.next=midNext;
    	
    	
    	return root;
        
    }
	
}
