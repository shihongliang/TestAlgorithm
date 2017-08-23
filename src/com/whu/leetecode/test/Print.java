package com.whu.leetecode.test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author hongliang
 */
public class Print {

    ArrayList<ArrayList<Integer> > Print(TreeNode pRoot){
        ArrayList<ArrayList<Integer>> result=new ArrayList<>();
        if(pRoot==null)
            return result;
        Queue<TreeNode> layer=new LinkedList<>();
        ArrayList<Integer> layerList=new ArrayList<Integer>();
        layer.add(pRoot);
        int start=0,end=0;
        while(!layer.isEmpty()){
            TreeNode cur=layer.remove();
            layerList.add(cur.val);
            if(cur.left!=null){
                layer.add(cur.left);
            }
            if(cur.right!=null){
                layer.add(cur.right);
            }
            if(start==end){
                end=layer.size();
                start=0;
                result.add(layerList);
                layerList = new ArrayList<Integer>();
            }
        }
        return result;
    }
    
}
