/**
 * 
 */
package com.whu.JavaBook;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**
 * @author hongliang
 *
 */
public class DynamicClassLoader extends ClassLoader{
	
	/**
	 * 
	 */
	public DynamicClassLoader(ClassLoader parent) {
		// TODO Auto-generated constructor stub
	}
	
	public Class loadClass(String classPath,String className)
	{
		
	
		try {
			String url=classPathParser(classPath)+classNameParser(className);
			System.out.println(url);
			URL myUrl=new URL(url);
			URLConnection connection=myUrl.openConnection();
			InputStream input=connection.getInputStream();
			ByteArrayOutputStream buffer=new ByteArrayOutputStream();
			int data=input.read();
			while(data!=-1)
			{
				buffer.write(data);
				data=input.read();
			}
			input.close();
			byte[] classData=buffer.toByteArray();
			return defineClass(noSuffix(className),classData,0,classData.length);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}

	/**
	 * @param className
	 * @return
	 */
	private String noSuffix(String className) {
		
		return className.substring(0,className.lastIndexOf("."));
	}

	/**
	 * @param className
	 * @return
	 */
	private String classNameParser(String className) {
		
		return className.substring(0,className.lastIndexOf(".")).replaceAll("\\.", "/")+className.substring(className.lastIndexOf("."));
		
	}

	/**
	 * @param className
	 * @return
	 */
	private String pathParser(String path) {
		
		return path.replace("\\\\", "/");
	}

	/**
	 * @param classPath
	 * @return
	 */
	private String classPathParser(String path) {
		String classPath=pathParser(path);
		
		if(!classPath.startsWith("file: "))
		{
			classPath=" file: "+classPath;
		}
		if(!classPath.endsWith("/"))
		{
			classPath=classPath+"/";
		}
		
		return  classPath;
	}
	
	public static void main(String[]args)
	{
		
			
	}
	
	
	
}
