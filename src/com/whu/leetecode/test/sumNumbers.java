package com.whu.leetecode.test;

/**
 * @author hongliang
 */
public class sumNumbers {

    private int result=0;
    private int num=0;
    public int sumNumbers(TreeNode root){
        sum(root);
        return result;
    }
    /**
     * @param root
     */
    private void sum(TreeNode root) {
        // TODO Auto-generated method stub
        if(root!=null){
            num=num*10+root.val;
            if(root.left==null&&root.right==null){
                result+=num;
            }
            sum(root.left);
            sum(root.right);
            num/=10;
        }
    }
    
}
