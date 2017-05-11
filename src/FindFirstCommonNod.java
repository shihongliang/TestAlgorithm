import java.util.HashMap;

/**
 * 
 */

/**
 * @author hongliang
 *
 */
public class FindFirstCommonNod {
	
	  public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
		   ListNode p1=pHead1;
		   ListNode p2=pHead2;
		   
		   
		   while(p1!=null)
		   {
			   while(p2!=null)
			   {
				   if(p1.equals(p2))
					   return p2;
				   p2=p2.next;
			   }
			   p1=p1.next;
		   }
		
		  
		  return null;
	  }
	  
	
}
