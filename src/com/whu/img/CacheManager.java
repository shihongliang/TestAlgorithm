/**
 * 
 */
package com.whu.img;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

/**
 * @author hongliang
 *
 */
public class CacheManager {
	
	private static HashMap cacheMap=new HashMap();
	

	public CacheManager() {
		// TODO Auto-generated constructor stub
	}
	
	//获取布尔值的缓存
	public static boolean getSimpleFlag(String key)
	{
		try
		{
			return (boolean) cacheMap.get(key);
		}
		catch(Exception ex)
		{
			return false;
		}
		
	}
	
	public static long getServerStartdt(String key)
	{
		try
		{
			return (long) cacheMap.get(key);
		}
		catch(Exception ex)
		{
			return 0;
		}
	}
	
	//设置时的缓存 
	public synchronized static boolean setSimpleFlag(String key,boolean flag)
	{
		
		if(flag&&getSimpleFlag(key))
		{
			return false;
		}
		else
		{
			cacheMap.put(key, flag);
			return true;
		}
		
	}
	
	public synchronized static boolean setSimpleFlag(String key,long serverbegrundt)
	{
		if(cacheMap.get(key)==null)
		{
			cacheMap.put(key, serverbegrundt);
			return true;
		} 
		else
		{
			return false;
		}
	}
	
	//得到缓存获取静态方法
	private synchronized static Cache getCache(String key)
	{
		return (Cache) cacheMap.get(key);
		
	}
	
	//判断是否存在一个缓存
	public synchronized static boolean hasCache(String key)
	{
		return cacheMap.containsKey(key);
				
	}
	//清楚所有缓存
	private synchronized static void clearAll()
	{
		cacheMap.clear();
	}
	
	
	//清除某一类缓存，通过hashmap对象，
	public synchronized static void clearAll(String type)
	{
		Iterator i=cacheMap.entrySet().iterator();
		String key;
		ArrayList<String> arr=new ArrayList<String>();
		try
		{
			while(i.hasNext())
			{
				Entry entry=(Entry) i.next();
				key=(String) entry.getKey();
				if(key.startsWith(type)) //如果匹配则
				{
					arr.add(key);
				}
			}
			for(int k=0;k<arr.size();k++)
			{
				clearOnly(arr.get(k));
				
			}
			
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		
	}

	/**
	 * @param string
	 */
	private static void clearOnly(String key) {
		cacheMap.remove(key);
		
	}
	//载入缓存
	public synchronized static void  putCache(String key,Cache obj)
	{
		cacheMap.put(key, obj);
	}
	
	public static Cache getCacheInfo(String key)
	{
		if(hasCache(key))
		{
			Cache cache=getCache(key);
			if(cacheExpired(cache)) //判断是否是终止
			{
				cache.setExpired(true);
			}
			return cache;
		}
		else
		{
			return null;
		}
		
	}

	//载入缓存信息
	public static void putCacheInfo(String key,Cache obj,long dt,boolean expired)
	{
		Cache cache=new Cache();
		cache.setKey(key);
		cache.setTimeout(dt+System.currentTimeMillis()); //设置多久新缓存
		cache.setValue(obj);
		cache.setExpired(expired);
		cacheMap.put(key, obj);
		
		
	}
	
	//重写缓存信息
	public static void putCacheInfo(String key,Cache obj,long dt)
	{
		Cache cache=new Cache();
		cache.setKey(key);
		cache.setTimeout(dt+System.currentTimeMillis()); //设置多久新缓存
		cache.setValue(obj);
		cache.setExpired(false);
		cacheMap.put(key, obj);
		
	}
	
	
	
	
	/**
	 * @param cache
	 * @return
	 */
	public  static boolean cacheExpired(Cache cache) {
		if(cache==null) //传入缓存
			return false;
		long nowDt=System.currentTimeMillis();
		long cacheDt=cache.getTimeout();
		if(cacheDt<=0||cacheDt>nowDt)
		{
			return false;
		}
		else
		{
			return true;
		}
		
	}
	
	public static int getCacheSize()
	{
		return cacheMap.size();
	}
	//获取指定类型
	
	public static int getCacheSize(String type)
	{
		int k=0;
		Iterator i=cacheMap.entrySet().iterator();
		String key;
		try
		{
			while(i.hasNext())
			{
				Entry entry=(Entry) i.next();
				key=(String) entry.getKey();
				if(key.indexOf(type)!=-1)
				{
					k++;
				}
			}
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		return k;
	}
	
	//获取缓存对象所有键值名称
	@SuppressWarnings("finally")
	public static ArrayList<String> getCacheListKey(String type)
	{
		ArrayList<String> a=new ArrayList();
		String key;
		try
		{
			Iterator i=cacheMap.entrySet().iterator();
			while(i.hasNext())
			{
				Entry entry=(Entry) i.next();
				key=(String) entry.getKey();
				if(key.indexOf(type)!=-1)
				{
					a.add(key);
				}
			}
		}
		catch(Exception ex){}
		finally
		{
			return a;
		}
	}
	
	
	
	
	
	
}
