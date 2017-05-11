import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 
 */

/**
 * @author hongliang
 *
 */
public class containsNearbyDuplicate {
	
    public boolean containsNearbyDuplicate(int[] nums, int k) {
    	Map<Integer,Integer> map=new HashMap<Integer,Integer>();
    	
    	for(int i=0;i<nums.length;i++)
    	{
    		map.put(nums[i], i);
    	}
    	if(nums[k]>=0&&nums[k]<0)
    	{
    		for(int i=0;i<nums.length;i++)
    		{
    			for(int j=i;j<nums.length;j++)
    			{
    				if(nums[i]==nums[j]&&i!=j&&Math.abs(i-j)<=k)
    				{
    					return true;
    				}
    			}
    		}
    	}
    	
    	return false;
    }
	
}
