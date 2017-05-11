import java.util.HashMap;
import java.util.Map;

/**
 * 
 */

/**
 * @author hongliang
 *
 */
public class deleteDuplication {
	
	   public ListNode deleteDuplication(ListNode pHead)
	    {
		   
		   	if(pHead==null||pHead.next==null)
		   		return pHead;
		   	
		   	
		   	ListNode anchorHead=new ListNode(0);
		   	anchorHead.next=pHead;
		   	ListNode preNode=anchorHead;
		   	ListNode postNode=pHead;
		   	boolean flag=false;
		   	while(postNode.next!=null)
		   	{
		   		if(postNode.next.val==postNode.val)
		   		{
		   			postNode.next=postNode.next.next;
		   			flag=false;
		   			if(postNode==null)
		   				preNode.next=null;
		   		}
		   		else
		   		{
		   			if(flag)
		   			{
		   				postNode=postNode.next;
		   				preNode.next=postNode;
		   				flag=false;
		   			}
		   			else
		   			{
		   				preNode=postNode;
		   				postNode=postNode.next;
		   			}
		   		}
		   	}
		   	return anchorHead.next;
		   	
		   	
	    }
	
}
