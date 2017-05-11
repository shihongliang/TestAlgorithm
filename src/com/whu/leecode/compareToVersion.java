/**
 * 
 */
package com.whu.leecode;

/**
 * @author hongliang
 *
 */
public class compareToVersion {
	
    public int compareVersion(String version1, String version2) {
    	int len=version1.length();
    	int verseion1Before=version1.lastIndexOf(".");
    	int version2Before=version2.lastIndexOf(".");
    	if(verseion1Before>version2Before)
    	{
    		return Integer.parseInt(version1);
    	}else if(verseion1Before<version2Before){
    		return Integer.parseInt(version2);
    	}else{
    		String v1After=version1.substring(verseion1Before, len-1);
    		String v2After=version2.substring(verseion1Before, len-1);
    		int v1AfterInt=Integer.parseInt(v1After);
    		int v2AfterInt=Integer.parseInt(v2After);
    		if(v1AfterInt>v2AfterInt)
    		{
    			return Integer.parseInt(version1);
    		}
    		else if(v1AfterInt<v2AfterInt)
    		{
    			return Integer.parseInt(version2);
    		}
    		
    	}
    	
    	
    	return 0;
    }
	
    public static void main(String[]args)
    {
    	String version="12.1223";
    	System.out.println(version.lastIndexOf("."));
    }
    
    
}
