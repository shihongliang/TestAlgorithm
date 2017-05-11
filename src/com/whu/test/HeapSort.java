/**
 * 
 */
package com.whu.test;

import java.util.Arrays;

/**
 * @author hongliang
 *
 */
public class HeapSort {
	
	public static void main(String[]args)
	{
		  int[] a={49,38,65,97,76,13,27,49,78,34,12,64};
		  int arrayLength=a.length;
		  //循环建堆
		  
		  for(int i=0;i<arrayLength;i++)
		  {
			  //建堆
			  buildMaxHeap(a,arrayLength-i-1);
			  swap(a,0,arrayLength-i-1);
			  System.out.println(Arrays.toString(a));
			  
		  }
		  
	}

	/**
	 * @param a
	 * @param i
	 * @param j
	 */
	private static void swap(int[] data, int i, int j) {
		int temp=data[i];
		data[i]=data[j];
		data[j]=temp;
		
	}

	/**
	 * @param a
	 * @param i
	 */
	private static void buildMaxHeap(int[] data, int lastIndex) {
		// TODO Auto-generated method stub
		//从lastIndex最后一个节点父节点开始
		for(int i=(lastIndex-1)/2;i>=0;i--)
		{
			//k保存正在判断的节点
			int k=i;
			while(k*2+1<lastIndex)
			{
				//k节点保存左节点的索引节点
				int biggerIndex=2*k+1;
				//如果biggerIndex小于lastIndex，即biggerIndex+1代表k节点右节点存在
				if(biggerIndex<lastIndex)
				{
					//如果右子节点存在
					if(data[biggerIndex]<data[biggerIndex+1])
						biggerIndex++;
				}
				
				//如果k节点的值小于其较大的节点的值
				if(data[k]<data[biggerIndex])
				{
					//交换他们
					swap(data,k,biggerIndex);
					k=biggerIndex;
				}else{
					break;
				}
				
			}
		
			
		}
		
	}

}
