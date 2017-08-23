package com.whu.leetecode.test;

/**
 * @author hongliang
 */
public class ReverseList {
    
    public ListNode ReverseList(ListNode pHead) {
        if(pHead==null)
            return null;
        ListNode head=pHead;
        head.next=null;
        pHead=pHead.next;
        while(pHead!=null){
            ListNode next=pHead.next;
            pHead.next=head;
            head=pHead;
            pHead=next;
        }
        
        return head;

    }

}
