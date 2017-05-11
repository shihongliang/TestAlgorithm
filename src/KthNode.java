import java.util.Stack;

/**
 * 
 */

/**
 * @author hongliang
 *
 */
public class KthNode {

    TreeNode KthNode(TreeNode pRoot, int k)
    {
    	if(pRoot==null)
    		return pRoot;
    	//创建一个变量指向第K大的节点
    	int p=0;
    	//创建一个站用于保存队列
    	Stack<TreeNode> s=new Stack<TreeNode>();
    	TreeNode curNode=pRoot;
    	while(curNode!=null||!s.isEmpty())
    	{
    		while(curNode!=null)
    		{
    			s.add(curNode);
    			curNode=curNode.left;
    		}
    		if(!s.isEmpty())
    		{
    			curNode=s.pop();
    			p++;
    			if(p==k)
    				return curNode;
    			curNode=curNode.right;
    		}
    	}
    	return null;
    }
	
}
