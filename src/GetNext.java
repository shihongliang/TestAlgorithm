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
    	
    	//�ж�˼���ڵ�
    	if(pNode==null)
    		return null;
    	//�ж��Ƿ����к���
    	if(pNode.right!=null)
    	{
    		pNode=pNode.right;
    		while(pNode.left!=null)
    			pNode=pNode.left;
    		return pNode;
    	}
    	
    	//�����Ҹ��ڵ�
    	while(pNode.next!=null)
    	{
    		if(pNode.next.left==pNode)
    			return pNode.next;
    		pNode=pNode.next;
    	}
    	
    	
    	
    	return null;
        
    }
	
}
