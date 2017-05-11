/**
 * 
 */
import java.util.ArrayList;
import java.util.ArrayDeque;
/**
 * @author hongliang
 *
 */
public class MaxNumInWindow {
	
	  public ArrayList<Integer> maxInWindows(int[] num, int size)
	  {
		  ArrayList<Integer> maxList=new ArrayList<Integer>();
		  if(size<=0)
			  return maxList;
		  ArrayDeque<Integer> queue=new ArrayDeque<Integer>();
		  int start=0;
		  for(int i=0;i<num.length;i++)
		  {
			  start=i+1-size;
			  if(queue.isEmpty())
			  {
				  queue.add(i);
			  }
			  else if(start>queue.peekFirst())
			  {
				  queue.pollFirst();
			  }
			  while(!queue.isEmpty()&&num[queue.peekLast()]<=num[i])
			  {
				  queue.pollFirst();
			  }
			  queue.add(i);
			  if(start>=0)
			  {
				  maxList.add(queue.peekFirst());
				  
			  }
		  }
		return maxList;

		  
	  }
	  
	  public static void main(String[]args)
	  {
		  int[] num={2,3,4,3,2,6,5};
		  ArrayList<Integer> list=new MaxNumInWindow().maxInWindows(num, 3);
		  System.out.println(list);
		  
	  }
	
}
