package com.whu.leetecode.test;

/**
 * @author hongliang
 */
public class deleteNode {

    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        ListNode temp = node.next;
        node.next = node.next.next;
        temp = null;
    }
}
