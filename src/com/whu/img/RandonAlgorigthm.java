/**
 * 
 */
package com.whu.img;

import java.text.DecimalFormat;

/**
 * @author hongliang
 *
 */
public class RandonAlgorigthm {
	
	private static DecimalFormat df=new DecimalFormat("#.0000");
	private static int pred_size=1,train_size=0;
	private static double[][] pred_var;
	private static double[] crit_var;
	
	private static double[] para=new double[pred_size+1];
	private static double rate=0.0002;
	private static double cost_fun=0;
	
	public static void main(String[]args)
	{
		 pred_var=new double[][]{{9,15,25,14,10,18},{1,1,1,1,1,1}};  
	     crit_var=new double[]{39,56,93,61,50,75};
	     
	     for(double d:para)
	     {
	    	 d=0;
	     }
	     RandonAlgorigthm.obtainParaByGD();
	     for(int i=0;i<pred_size+1;i++)
	     {
	    	 System.out.println("para["+i+"]="+df.format(para[i])+" ");
	     }
	     System.out.println("cost: "+df.format(cost_fun));
	     System.out.println("cost: "+df.format(cost_fun));
	}
	
	public static void obtainParaByGD()
	{
		double hy_value;
		for(int i=0;i<train_size;i++)
		{
			hy_value=0;
			for(int j=0;j<pred_size;j++)
			{
				hy_value+=para[j]*pred_var[j][i];
			}
			cost_fun=(hy_value-crit_var[i])*(hy_value-crit_var[i]);

		}
		cost_fun=cost_fun/2;
		double min_fun=cost_fun;
		int flag=0;
		while(true)
		{
			double[] temp_para=new double[pred_size];
			for(double d:temp_para)
			{
				d=0;
			}
			for(int j=0;j<pred_size;j++)
			{
				for(int i=0;i<train_size;i++)
				{
					hy_value=0;
					for(int h=0;h<pred_size;h++)
					{
						hy_value=para[h]*pred_var[h][i];
					}
					temp_para[j]+=((hy_value-crit_var[i])*pred_var[j][i]);
					
				}
			}
			for(int i=0;i<train_size;i++)
			{
				hy_value=0;
				for(int j=0;j<pred_size;j++)
				{
					hy_value+=para[j]*pred_var[j][i];
				}
				cost_fun+=(hy_value-crit_var[i])*(hy_value-crit_var[i]);
			}
			cost_fun=cost_fun/2;
			if(cost_fun<min_fun)
			{
				min_fun=cost_fun;
				flag=0;
				
			}
			else
			{
				flag++;
			}
			if(flag==1000)
			{
				break;
			}
		}
	}
	
	
}
