/**
 * 
 */
package com.whu.leecode;

import java.util.LinkedList;
import java.util.List;

/**
 * @author hongliang
 *
 */
public class insert {

    public List<Interval> insert(List<Interval> intervals, Interval newInterval) {
		
    	List<Interval> result=new LinkedList<>();
    	
    	if(intervals!=null)
    	{
    		for(Interval item:intervals)
    		{
    			if(newInterval==null||item.end<newInterval.start)
    			{
    				result.add(item);
    			}
    			
    			if(item.start>newInterval.end)
    			{
    				result.add(newInterval);
    				result.add(item);
    				newInterval=null;
    			}
    			else{
    				newInterval.start=Math.min(newInterval.start, item.start);
    				newInterval.end=Math.min(newInterval.end, item.end);
    			}
    			
    		}
    	}
    	
    	if(newInterval!=null)
    	{
    		result.add(newInterval);
    	}
    	
    	
    	return result;
        
    }
	
}
