import java.util.List;
import java.util.ArrayList;
/**
 * 
 */

/**
 * @author hongliang
 *
 */
public class GetMedian {
	
	private static List<Integer> list=new ArrayList<Integer>();
	
    public void Insert(Integer num) {
        int index=0;
        int size=list.size();
        while(index<size)
        {
        	if(num<=list.get(index))
        	{
        		break;
        	}
        	size++;
        }
        list.add(index,num);
    }

    public Double GetMedian() {
        int size=list.size();
        if((size & 1)==0)
        	return  (double)((list.get(size/2)+list.get(size/2-1))/2.0);
       return (double)list.get(size/2)*1.0;
        		
    }
	
}
