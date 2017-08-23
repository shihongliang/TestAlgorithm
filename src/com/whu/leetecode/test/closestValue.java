package com.whu.leetecode.test;

/**
 * @author hongliang
 */
public class closestValue {
    public int closestValue(TreeNode root, double target) {
        TreeNode kid=target<root.val?root.left:root.right;
        if(kid==null)
            return root.val;
        int closest=closestValue(kid,target);
        return Math.abs(root.val - target) < Math.abs(closest - target) ? root.val : closest;
    }
}
