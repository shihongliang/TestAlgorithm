/**
 * 
 */
package com.whu.huawei;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author hongliang
 *
 */
public class Cmp {
	
	private boolean reachable=false;
	
	public int cmp(int g1,int g2,int[][] records,int n)
	{
		//生成一个有向图
		HashMap<Integer,List<Integer>> map=generateMap(records,n);
		
		if(map.isEmpty())
			return 0;
		depthSearch(g1,g2,map);
		
		if(reachable)
			return -1;
		
		return 0;
		
		
	}

	/**
	 * @param g1
	 * @param g2
	 * @param map
	 */
	private void depthSearch(int g1, int g2, HashMap<Integer, List<Integer>> map) {
	   
		if(!map.containsKey(g1))
			reachable=false;
		else{
			List<Integer> values=map.get(g1);
			for(int value:values)
			{
				if(g2==value)
				{
					reachable=true;
					return ;
				}
				else{
					depthSearch(value,g2,map);
				}
			}
		}
		
	}

	/**
	 * @param records
	 * @param n
	 * @return
	 */
	private HashMap<Integer, List<Integer>> generateMap(int[][] records, int n) {
		HashMap<Integer,List<Integer>> map=new HashMap<Integer,List<Integer>>();
        
		for(int i=0;i<n;i++)
		{
			int key=records[i][0];
			int value=records[i][1];
			if(map.containsKey(key))
				map.get(key).add(value);
			else{
				List<Integer> list=new ArrayList<Integer>();
				list.add(value);
				map.put(key, list);
				
			}
		}
		
		
		
		return map;
	}

}
