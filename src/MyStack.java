import java.util.LinkedList;
import java.util.List;

/**
 * 
 */

/**
 * @author hongliang
 *
 */
public class MyStack {
	
	private List<Integer> aList=new LinkedList<>();
	private List<Integer> bList=new LinkedList<>();
	
	 
    public void push(int x) {
    	if(!aList.isEmpty())
    	{
    		aList.add(x);
    	}
    	else
    		bList.add(x);
    }

    // Removes the element on top of the stack.
    public void pop() {
        if(aList.isEmpty())
        {
        	List<Integer> tmp=bList;
        	bList=aList;
        	aList=tmp;
        }
        if(aList.size()>1)
        	bList.add(aList.remove(0));
        aList.clear();
        
    }

    // Get the top element.
    public int top() {
		if(aList.isEmpty())
		{
			List<Integer> tmp=bList;
			bList=aList;
			aList=tmp;
		}
		if(aList.size()<1)
			bList.add(aList.remove(0));
			
    	bList.add(aList.remove(0));
    	
    	return aList.remove(0);
        
    }

    // Return whether the stack is empty.
    public boolean empty() {
		return aList.isEmpty()&&bList.isEmpty();
        
    }
	
}
