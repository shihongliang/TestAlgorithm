/**
 * 
 */

/**
 * @author hongliang
 *
 */
public class GetNext {
	
    public TreeLinkNode GetNext(TreeLinkNode pNode)
    {
    	
    	//判断思父节点
    	if(pNode==null)
    		return null;
    	//判断是否是有孩子
    	if(pNode.right!=null)
    	{
    		pNode=pNode.right;
    		while(pNode.left!=null)
    			pNode=pNode.left;
    		return pNode;
    	}
    	
    	//向上找父节点
    	while(pNode.next!=null)
    	{
    		if(pNode.next.left==pNode)
    			return pNode.next;
    		pNode=pNode.next;
    	}
    	
    	
    	
    	return null;
        
    }
	
}
