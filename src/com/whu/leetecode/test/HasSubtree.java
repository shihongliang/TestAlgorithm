package com.whu.leetecode.test;

/**
 * @author hongliang
 */
public class HasSubtree {

    public boolean HasSubtree(TreeNode root1, TreeNode root2) {
        if (root2 == null)
            return false;
        if (root1 == null && root2 == null)
            return false;
        boolean flag = false;
        if (root1.val == root2.val)
            flag = isSubTree(root1, root2);
        if (!flag) {
            flag = HasSubtree(root1.left, root2);
            if (!flag) {
                flag = HasSubtree(root1.right, root2);
            }
        }
        return flag;
    }

    /**
     * @param root1
     * @param root2
     * @return
     */
    private boolean isSubTree(TreeNode root1, TreeNode root2) {
        // TODO Auto-generated method stub
        if (root2 == null)
            return false;
        if (root1 == null && root2 != null)
            return false;
        if (root1.val == root2.val)
            return isSubTree(root1.left, root2.left) && isSubTree(root2.left, root2.left);
        return false;
    }

}
