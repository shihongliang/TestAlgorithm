/**
 * 
 */
package com.whu.JavaBook;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.HashMap;
import java.util.Map;

/**
 * @author hongliang
 *
 */
public class HotSwapClassLoader extends URLClassLoader{
	//缓存加载class文件最后最新的修改时间
	public static Map<String,Long> cacheLastModify=new HashMap<String,Long>();
	
	//工程class的类文件
	public static String projectClassPath="E:\\javaSE_workspace\\TestAlgorightm\\src\\com\\whu\\JavaBook\\";
	//测试所有类在同一个文件夹下
	public static String packagePath="E:\\javaSE_workspace\\TestAlgorightm\\src\\com\\whu\\JavaBook\\";
	
	private static HotSwapClassLoader hcl=new HotSwapClassLoader();
	
	/**
	 * 
	 */
	public HotSwapClassLoader() {
		// TODO Auto-generated constructor stub
		super(getMyURLs());
		
	}
	
	public static HotSwapClassLoader getClassLoader(){
		return hcl;
	}


	/**
	 * @return
	 */
	private static URL[] getMyURLs() {
		URL url=null;
		
		try {
			url=new File(projectClassPath).toURI().toURL();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return new URL[]{url};
	}
	
	public Class<?> loadClass(String name,boolean resolve)
	{
		Class clazz=null;
		clazz=findLoadedClass(name);
		if(clazz!=null)
		{
			if(resolve)
			{
				resolveClass(clazz);
			}
			
			if(isModify(name))
			{
				hcl=new HotSwapClassLoader();
				clazz=customLoad(name,hcl);
				
			}	
		}
		return customLoad(name,this);
	}
	
	public Class load(String name) throws ClassNotFoundException
	{
		return loadClass(name);
	
	}
	

	/**
	 * @param name
	 * @param hcl2
	 * @return
	 */
	private Class customLoad(String name, HotSwapClassLoader cl) {
		
		try {
			return customLoad(name,false,cl);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * @param name
	 * @param b
	 * @param cl
	 * @return
	 * @throws ClassNotFoundException 
	 */
	private Class customLoad(String name, boolean resolve, HotSwapClassLoader cl) throws ClassNotFoundException {
		//findClass调用的urlClassLoader方法
		Class clazz=((HotSwapClassLoader)cl).findClass(name);
		if(resolve)
		{
			((HotSwapClassLoader)cl).resolveClass(clazz);
		}
		//缓存加载最后修改时间
		long lastModifyTime=getClassModifyTime(name);
		
		  cacheLastModify.put(name,lastModifyTime);
	        return clazz;
	
	}
	
	public Class<?> loadClass(String name)
	{
		return loadClass(name,false);
		
	}
	

	/**
	 * @param name
	 * @return
	 */
	private long getClassModifyTime(String name) {
		String path=getClassCompletePath(name);
		File file=new File(path);
		if(!file.exists())
		{
			throw new RuntimeException(new FileNotFoundException(name));
		}
		return file.lastModified();
	}
	
	
	
	
	/**
	 * @param name
	 * @return
	 */
	private String getClassCompletePath(String name) {
	    String simpleName = name.substring(name.lastIndexOf(".")+1);
	         return projectClassPath+packagePath+simpleName+".class";
	}

	/**
	 * @param name
	 * @return
	 */
	private boolean isModify(String name) {
		
		long lastModify=getClassModifyTime(name);
		long previousModify=cacheLastModify.get(name);
		if(lastModify>previousModify)
		{
			return true;
		}
		
		return false;
	}
		
	
	
	
}
