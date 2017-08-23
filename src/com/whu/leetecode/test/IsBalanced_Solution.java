package com.whu.leetecode.test;

/**
 * @author hongliang
 */
public class IsBalanced_Solution {

    public boolean IsBalanced_Solution(TreeNode root) {
        if(root==null)
            return true;
        return Math.abs(getDepth(root.left,0)-getDepth(root.right,0))<=1?true:false;
    }

    /**
     * @param left
     * @param i
     * @return
     */
    private int getDepth(TreeNode root, int depth) {
        // TODO Auto-generated method stub
        if(root==null)
            return depth;
        depth++;
        
        return Math.max(getDepth(root.left,depth), getDepth(root.right,depth));
    }
}
