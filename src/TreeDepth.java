/**
 * 
 */

/**
 * @author hongliang
 *
 */
public class TreeDepth {
	
	public int TreeDepth(TreeNode pRoot)
    {
		if(pRoot!=null)
			return 0;
		return getDepth(pRoot,0);
    
    }

	/**
	 * @param pRoot
	 * @param i
	 * @return
	 */
	private int getDepth(TreeNode root, int depth) {
		
		if(root==null)
			return depth;
		depth++;
		
		return Math.max( getDepth(root.left,depth), getDepth(root.right,depth));
	}
	
}
