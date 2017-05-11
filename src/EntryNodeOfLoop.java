import java.util.LinkedList;

/**
 * 
 */

/**
 * @author hongliang
 *
 */
public class EntryNodeOfLoop {
	
	   public ListNode EntryNodeOfLoop(ListNode pHead)
	    {
		//	LinkedList<ListNode> list=new LinkedList<ListNode>();
			
			int flag=0;
			
			
			while(pHead.next!=null)
			{
				if(pHead!=null)
				{
					flag=1;
					pHead=pHead.next;
				}
				if(flag==1)
				{
					return pHead;
				}
					
			}

		   return null; 
	    }
	
}
