package com.whu.leetecode.test;

/**
 * @author hongliang
 */
public class KthNode {
    int index=0;
    TreeNode KthNode(TreeNode root, int k){
        if(root!=null){
            TreeNode node=KthNode(root.left,k);
            if(node!=null)
                return node;
            index++;
            if(index==k)
                return root;
            node=KthNode(root.right,k);
            if(node!=null){
                return node;
            }
        }
        return null;
    }
    
}
