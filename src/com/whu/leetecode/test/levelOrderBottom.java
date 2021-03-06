/**
 * 
 */
package com.whu.leetecode.test;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * @author hongliang
 *
 */
public class levelOrderBottom {
    
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> list=new LinkedList<>();
        if(root==null)
            return list;
        Deque<TreeNode> cur=new LinkedList<>();
        Deque<TreeNode> nxt=new LinkedList<>();
        Deque<TreeNode> exc=new LinkedList<>();
        TreeNode tmp;
        cur.add(root);
        while(!cur.isEmpty()){
            List<Integer> layout=new ArrayList<>();
            while(!cur.isEmpty()){
                tmp=cur.remove();
                if(tmp.left!=null){
                    nxt.add(tmp.left);
                }
                if(tmp.right!=null){
                    nxt.add(tmp.right);
                }
                layout.add(tmp.val);
            }
            exc=cur;
            cur=nxt;
            nxt=exc;
            list.add(0,layout);
        }
        
        return list;
    }

}
