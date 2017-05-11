/**
 * 
 */
package com.whu.huawei;

/**
 * @author hongliang
 *
 */
public class Tree {
	
	private int max=0;
	private int min=99999;
	private StringBuilder maxcodec;
	private StringBuilder mincodec;
	
	void Preorder(TreeNode T,char code,StringBuilder codec)
	{
		if(T!=null)
		{
			codec.append(code);
			
			if(T.left==null||T.right==null)
			{
				if(max<T.val)
				{
					max=T.val;
					maxcodec=codec;
				}
				if(min>T.val)
				{
					min=T.val;
					mincodec=codec;
				}
				
			}
			
			 Preorder(T.left,'0', new StringBuilder(codec));
			 Preorder(T.left,'1', new StringBuilder(codec));
			 
			
		}
	}
	public int getDis(TreeNode root)
	{
		Preorder(root,'0',new StringBuilder());
		int index=0;
		for(index=0;index<(maxcodec.length()>mincodec.length()?maxcodec.length():mincodec.length());index++)
		{
			if(maxcodec.charAt(index)!=mincodec.charAt(index))
			{
				break;
			}
		}
		return (maxcodec.substring(index).length()+mincodec.substring(index).length());
	     
	}
	

}
