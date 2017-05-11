import java.util.LinkedList;
import java.util.Queue;

/**
 * 
 */

/**
 * @author hongliang
 *
 */
public class invertTree {
	
	 public TreeNode invertTree(TreeNode root)
	 {
		 if(root!=null)
		 {
			 Queue<TreeNode> queue=new LinkedList<TreeNode>();
			 queue.offer(root);
			 while(!queue.isEmpty())
			 {
				 TreeNode node=queue.poll();
				 TreeNode temp=node.left;
				 node.left=node.right;
				 node.right=node.left;
				 if(node.left!=null)
					 queue.offer(node.left);
				 if(node.right!=null)
					 queue.offer(node.right);
				 
			 }
		 }
		return root;
		
	 }


}
