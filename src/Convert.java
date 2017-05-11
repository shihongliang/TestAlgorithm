/**
 * 
 */

/**
 * @author hongliang
 *
 */
public class Convert {
    public static TreeNode Convert(TreeNode pRootOfTree) {
        
        if(pRootOfTree==null)
        	return null;
        if(pRootOfTree==null&&pRootOfTree==null)
        	return pRootOfTree;
        TreeNode left=Convert(pRootOfTree.left);
        TreeNode p=left;
        while(p!=null&&p.right!=null)
        	p=p.right;
        if(left!=null)
        {
        	p.right=pRootOfTree;
        	pRootOfTree=p;
        }
        TreeNode right=Convert(pRootOfTree.right);
        if(right!=null)
        {
        	pRootOfTree.left=left;
        	pRootOfTree.right=right;
        }
        return left!=null?left:pRootOfTree;
        
    }

	public static void main(String[]args)
    {
    	TreeNode newNodeA=new TreeNode(1);
    	TreeNode newNodeB=new TreeNode(2);
    	TreeNode newNodeC=new TreeNode(3);
    	TreeNode newNodeD=new TreeNode(4);
    	TreeNode root=new TreeNode(0);
    	root.left=newNodeA;
    	root.right=newNodeB;
    	root.left.left=newNodeC;
    	root.left.right=newNodeD;
    	System.out.println(Convert(root));
    	
    }
    
    
}
