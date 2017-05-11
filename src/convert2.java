/**
 * 
 */

/**
 * @author hongliang
 *
 */
public class convert2 {
	protected TreeNode leftLast=null;
	public TreeNode Convert(TreeNode root) {
		
		if(root==null||root.left==null||root.right==null)
			return root;
		TreeNode left=Convert(root.left);
		
		if(left!=null)
		{
			leftLast.right=root;
			root.left=leftLast;
		}
		
		leftLast=root;
		
		TreeNode right=Convert(root.right);
		if(right!=null)
		{
			leftLast.left=root;
			root.right=leftLast;
		}
		
		return left!=null?left:root;
		
		
		
	}

	
	
}
