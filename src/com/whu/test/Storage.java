/**
 * 
 */
package com.whu.test;

import java.util.LinkedList;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;



/**
 * @author hongliang
 *
 */
public class Storage {
	
	//仓库最大存储
	private final int MAX_SIZE=10;
	//仓库存储的载体
	private LinkedList<Object> list=new LinkedList<Object>();
	
	//生产num个产品
	public void produce(int num)
	{
		//同步的代码段
		synchronized(this)
		{
			while(list.size()+num>MAX_SIZE)
			{
				System.out.println("要生产的数量为： "+num+" t库存量"+list.size());
				try{
					list.wait();
				}
				catch(Exception ex)
				{
					ex.printStackTrace();
				}
			}
			
			//生产条件满足的情况下,s生成num个产品
			for(int i=1;i<=num;i++)
			{
				list.add(new Object());
			}
		    System.out.println("【已经生产产品数】:" + num + "/t【现仓储量为】:" + list.size());  
		    list.notifyAll();
		}
	}
	
	//消费某个产品
	public void consume(int num)
	{
		synchronized (list) {
			
			//如果存储藏量不足
			while(list.size()<num)
			{
			      System.out.println("【要消费的产品数量】:" + num + "/t【库存量】:"  
	                        + list.size() + "/t暂时不能执行生产任务!");  
			      try{
			    	  //由于条件不满足，消费阻塞
			    	  list.wait();
			      }
			      catch(Exception ex)
			      {
			    	  ex.printStackTrace();
			      }
			}
			
			
			for(int i=1;i<=num;i++)
			{
				list.remove();
			}
			  System.out.println("【已经消费产品数】:" + num + "/t【现仓储量为】:" + list.size());  
			  
	            list.notifyAll();  
			
		}
		
		
		
	}
	
    // get/set方法  
    public LinkedList<Object> getList()  
    {  
        return list;  
    }  
  
    public void setList(LinkedList<Object> list)  
    {  
        this.list = list;  
    }  
  
    public int getMAX_SIZE()  
    {  
        return MAX_SIZE;  
    }  
	
	
}
