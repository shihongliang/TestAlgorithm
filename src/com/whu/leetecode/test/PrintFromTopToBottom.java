package com.whu.leetecode.test;

import java.util.ArrayList;

/**
 * @author hongliang
 */
public class PrintFromTopToBottom {
    
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<TreeNode> listNode=new ArrayList<TreeNode>();
        ArrayList<Integer> listVal=new ArrayList<Integer>();
        if(root==null)
            return null;
        listNode.add(root);
        listVal.add(root.val);
        for(int i=0;i<listNode.size();i++){
            TreeNode node=listNode.get(i);
            if(node.left!=null){
                listNode.add(node.left);
                listVal.add(node.left.val);
            }
            if(node.right!=null){
                listNode.add(node.right);
                listVal.add(node.right.val);
            }
        }
        return listVal;
    }

}
