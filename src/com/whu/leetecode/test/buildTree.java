package com.whu.leetecode.test;

/**
 * @author hongliang
 */
public class buildTree {

    public TreeNode buildTree(int[] inorder, int[] postorder) {

        if (inorder == null || postorder == null || inorder.length == 0 || inorder.length != postorder.length) {
            return null;
        }

        return solve(inorder, 0, inorder.length - 1, postorder, 0, postorder.length - 1);
    }

    /**
     * @param inorder
     * @param i
     * @param j
     * @param postorder
     * @param k
     * @param l
     * @return
     */
    private TreeNode solve(int[] inorder, int x, int y, int[] postorder, int i, int j) {
        // TODO Auto-generated method stub
        if (x >= 0 && x < y && i >= 0 && i <= j) {
            if (x == y) {
                return new TreeNode(postorder[i]);
            } else if (x < y) {
                TreeNode root = new TreeNode(postorder[i]);
                int idx = x;
                while (idx < y && inorder[idx] != postorder[j]) {
                    idx++;
                }
                int leftLength = idx - x;
                if (leftLength > 0) {
                    root.left = solve(inorder, x, idx - 1, postorder, i, i + leftLength - 1);
                }
                int rightLength = y - idx;
                if (rightLength > 0) {
                    root.right = solve(inorder, idx + 1, y, postorder, i + leftLength, j - 1);
                }
                return root;
            } else {
                return null;
            }
        }
        return null;
    }

}
