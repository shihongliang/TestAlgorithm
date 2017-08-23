package com.whu.leetecode.test;

import java.util.Stack;

/**
 * @author hongliang
 */
public class inorderSuccessor {
    
    public TreeNode inorderSuccessor(TreeNode root, TreeNode p){
        Stack<TreeNode> stk=new Stack<TreeNode>();
        TreeNode cur=root;
        while(cur!=p){
            stk.push(cur);
            if(cur.val>p.val){
                cur=cur.left;
            }else{
                cur=cur.right;
            }
        }
        if(cur.right!=null){
            cur=cur.right;
            while(cur.left!=null){
                cur=cur.left;
            }
            return cur;
        }else{
            while(!stk.isEmpty()&&stk.peek().val<cur.val){
                stk.pop();
            }
            return stk.isEmpty()?null:stk.pop();
        }
    }
}
