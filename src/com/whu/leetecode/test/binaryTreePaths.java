package com.whu.leetecode.test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hongliang
 */
public class binaryTreePaths {

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> answer = new ArrayList<String>();
        if (root != null)
            searchBTree(root, "", answer);

        return answer;
    }

    /**
     * @param root
     * @param string
     * @param answer
     */
    private void searchBTree(TreeNode root, String path, List<String> answer) {
        // TODO Auto-generated method stub
        if(root.left==null&&root.right==null)
            answer.add(path+root.val);
        if(root.left!=null)
            searchBTree(root.left,path+root.val+"->",answer);
        if(root.right!=null)
            searchBTree(root.right,path+root.val+"->",answer);
    }

}
