/**
 * 
 */
package com.whu.leecode;

/**
 * @author hongliang
 *
 */
public class sortedArrayToBST {
	
    public TreeNode sortedArrayToBST(int[] nums) {
		
    	if(nums==null||nums.length<1)
    	{
    		return null;
    	}
    	
    	
    	
    	return solve(nums,0,nums.length-1);
    }

	/**
	 * @param nums
	 * @param i
	 * @param j
	 * @return
	 */
	private TreeNode solve(int[] nums, int start, int end) {
		
		
		if(start<=end)
		{
			int mid=((end-start)>>1);
			TreeNode root=new TreeNode(nums[mid]);
			
			root.left=solve(nums,start,mid-1);
			root.right=solve(nums,mid+1,end);
			
			return root;
		}
		
		return null;
	}
	
}
