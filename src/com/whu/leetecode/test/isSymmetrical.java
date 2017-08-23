package com.whu.leetecode.test;

/**
 * @author hongliang
 */
public class isSymmetrical {
    
    boolean isSymmetrical(TreeNode pRoot){
        if(pRoot==null)
            return true;
        
        return isSymmer(pRoot.left,pRoot.right); 
    }

    /**
     * @param left
     * @param right
     * @return
     */
    private boolean isSymmer(TreeNode left, TreeNode right) {
        // TODO Auto-generated method stub
        if(left==null&&right==null)
            return true;
        if(left.val==right.val)
            return isSymmer( left.left, right.right)&&isSymmer( left.right, right.left);
        return false;
    }

}
