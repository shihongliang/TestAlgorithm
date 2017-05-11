/**
 * 
 */
package com.whu.leecode;

import java.util.LinkedList;
import java.util.List;

/**
 * @author hongliang
 *
 */
public class pathSum {
	
	private List<List<Integer>> result;
	private List<Integer> l;
	private int sum;
	private int curSum=0;
	

	
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
    	
    	result=new LinkedList<>();
    	
    	if(root!=null)
    	{
    		this.sum=sum;
    		l=new LinkedList<Integer>();
    		pathSum(root);
    	}
    	
    	return result;
        
    }



	/**
	 * @param root
	 */
	private void pathSum(TreeNode root) {
		if(root!=null)
		{
			l.add(root.val);
			curSum+=root.val;
			if(root.left==null&&root.right==null&&curSum==sum)
			{
				List<Integer> list=new LinkedList<>();
				for(Integer i:l)
				{
					list.add(i);
				}
				result.add(list);
			}
			
			if(root.left!=null)
			{
				pathSum(root.left);
			}
			
			if(root.right!=null)
			{
				pathSum(root.right);
			}
			curSum-=root.val;
			//删除最后一个
			l.remove(l.size()-1);
		}
		
	}
	
}
