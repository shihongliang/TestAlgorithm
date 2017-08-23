package com.whu.leetecode.test;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * @author hongliang
 */
public class postorderTraversal {
    
    public List<Integer> postorderTraversal(TreeNode root){
        List<Integer> list=new LinkedList<>();
        if(root!=null){
            Deque<TreeNode> deque=new LinkedList<>();
            TreeNode prev=null;
            TreeNode curr;
            deque.addLast(root);
            while(!deque.isEmpty()){
                curr=deque.getLast();
                if((curr.left==null&&curr.right==null)||(prev!=null&&(curr.left==prev||curr.right==prev))){
                    curr=deque.removeLast();
                    list.add(curr.val);
                    prev=curr;
                }else{
                    if(curr.right!=null){
                        deque.addLast(curr.right);
                    }
                    if(curr.left!=null){
                        deque.addLast(curr.left);
                    }
                }
            }
                    
        }
        return list;
    }

}
