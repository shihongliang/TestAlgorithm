package com.whu.leetecode.test;

/**
 * @author hongliang
 */
public class longestConsecutive {
    
    public int longestConsecutive(TreeNode root) {
        if(root==null)
            return 0;
        return findLongest(root,0,root.val-1);
    }

    /**
     * @param root
     * @param i
     * @param j
     * @return
     */
    private int findLongest(TreeNode root, int length, int preVal) {
        // TODO Auto-generated method stub
        if(root==null)
            return length;
        int currLen = preVal + 1 == root.val ? length + 1 : 1;
        // 返回当前长度，左子树长度，和右子树长度中较大的那个
        return Math.max(currLen, Math.max(findLongest(root.left, currLen, root.val), findLongest(root.right, currLen, root.val)));  
    }

}
