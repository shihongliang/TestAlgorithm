package com.whu.leetecode.test;

/**
 * @author hongliang
 */
public class Convert {
    public TreeNode Convert(TreeNode pRootOfTree){
        
        if(pRootOfTree==null||pRootOfTree.left==null&&pRootOfTree.right==null){
            return pRootOfTree;
        }
        TreeNode cur1=pRootOfTree;
        TreeNode cur2,pre=null;
        TreeNode result=null;
        while(cur1!=null){
            cur2=cur1.left;
            if(cur2==null||cur2.right==cur1){
                if(result==null){
                    result=cur1;
                }else{
                    pre.right=cur1;
                }
                cur1.left=pre;
                pre=cur1;
                cur1=cur1.left;
            }else{
                while(cur2.right!=null){
                    cur2=cur2.right;
                }
                cur2.right=cur1;
                cur1=cur1.left;
                cur2.right.left=cur2;
            }
        }
        
        return result;
    }
}
