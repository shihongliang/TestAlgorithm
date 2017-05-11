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
    	//����һ������ָ���K��Ľڵ�
    	int p=0;
    	//����һ��վ���ڱ������
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
