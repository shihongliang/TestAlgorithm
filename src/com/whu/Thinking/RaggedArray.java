/**
 * 
 */
package com.whu.Thinking;

import java.util.Arrays;
import java.util.Random;

/**
 * @author hongliang
 *
 */
public class RaggedArray {
	
	public static void main(String[]args)
	{
		Random ran=new Random(47);
		int[][][] a=new int[ran.nextInt(7)][][];
		for(int i=0;i<a.length;i++)
		{
			a[i]=new int[ran.nextInt(5)][];
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j]=new int[ran.nextInt(5)];
			}
			System.out.println(Arrays.deepToString(a));
		}
	}
	
}
