package com.whu.leetecode.test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hongliang
 */
public class countUnivalSubtrees {
    
    public int countUnivalSubtrees(TreeNode root){
        if(root==null)
            return 0;
        List<Integer> sum=new ArrayList<Integer>();
        sum.add(0);
        helper(root,sum);
         
        return sum.get(0);
    }

    /**
     * @param root
     * @param sum
     */
    private boolean helper(TreeNode root, List<Integer> sum) {
        // TODO Auto-generated method stub
        if(root==null)
            return true;
        boolean left=helper(root.left,sum);
        boolean right=helper(root.right,sum);
        if(left&&right&&(root.left==null||root.val==root.left.val)&&(root.right==null||root.val==root.right.val)){
            sum.set(0, sum.get(0)+1);
            return true;
        }
        return true;        
    }

}
