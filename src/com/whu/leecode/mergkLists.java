/**
 * 
 */
package com.whu.leecode;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @author hongliang
 *
 */
public class mergkLists {
	
    public ListNode mergeKLists(ListNode[] lists) {
		
    	//为空或者没有元素
    	if(lists==null||lists.length<1){
    		return null;
    	}
    	
    	//只有一个元素
    	if(lists.length==1){
    		return lists[0];
    	}
    	
    	MinHeap<ListNode> minHeap=new MinHeap<ListNode>(new Comparator<ListNode>(){

			@Override
			public int compare(ListNode o1, ListNode o2) {
				
				if(o1==null){
					return -1;
				}
				
				if(o2==null){
					return 1;
				}
				
			    return o1.val - o2.val;
			}
    		
    	});
    	
    	for(ListNode node:lists){
    		if(node!=null){
    			minHeap.add(node);
    		}
    	}
    	
    	//头结点，做辅助节点
    	ListNode head=new ListNode(0);
    	//处理当前节点
    	ListNode curr=head;
    	
    	while(!minHeap.isEmpty()){
    		ListNode node=minHeap.deleteTop();
    		
    		//节点下一个节点不为空就进入下一个节点入堆
    		
    		if(node.next!=null){
    			minHeap.add(node.next);
    		}
    		curr.next=node;
    		curr=node;
    		
    	}
    	
    	
    	return head.next;
        
    }
    
    //小顶堆
    public static class MinHeap<T>{
    	
    	//堆中存放元素的集合
    	private List<T> items;
    	
    	private Comparator<T> comp;
    	
    	//构造一个堆，始大小的是32
        public MinHeap(Comparator<T> comp) {
          
        }
        //构造一个初始大小的堆
        public MinHeap(int size, Comparator<T> comp) {
            items = new ArrayList<>(size);
            this.comp = comp;
        }
        
        //向上调整堆
        public void siftUp(int index){
        	T intent=items.get(index);
        	
        	while(index>0){
        		int parentIndex=(index-1)/2;
        		
        		T parent=items.get(parentIndex);
        		
        		if(comp.compare(intent, parent)<0){
        			items.set(index, parent);
        			index=parentIndex;
        		}else{
        			break;
        		}
        		
        		
        	}
            // index此时记录是的最后一个被下放的父节点的位置（也可能是自身），
            // 所以将最开始的调整的元素值放入index位置即可
            items.set(index, intent);
        }
        
        //向下调整
        public void siftDown(int index){
        	
        	//获取开始调整的元素
        	T intent=items.get(index);
        	//获取开始调整的节点的左节点的位置
        	int leftIndex=2*index+1;
        	
        	while(leftIndex<items.size()){
        		T minChild=items.get(leftIndex);
        		int minIndex=leftIndex;
        		int rightIndex=leftIndex+1;
        		
        		if(rightIndex<items.size()){
        			T rightChild=items.get(rightIndex);
        			
        			if(comp.compare(rightChild, minChild)<0){
        				minChild=rightChild;
        				minIndex=rightIndex;
        			}
        			
        		}
        		
        		//如果最小节点是父节点，则需要向下调整
        		if(comp.compare(minChild, intent)<0){
        			items.set(index, minChild);
        			index=minIndex;
        			leftIndex=index*2+1;
        		}else{
        			break;
        		}
        		
        		
        	}
        	
        	items.set(index, intent);
        	
        	
        }
        
        //向堆中添加一个元素
        public void add(T item){
        	
        	items.add(item);
        	 siftUp(items.size() - 1); // 循环上移，以完成重构
        }
    
        public T deleteTop(){
            if (items.isEmpty()) { // 如果堆已经为空，就报出异常
                throw new RuntimeException("The heap is empty.");
            }
            
            T maxItem=items.get(0);
            T lastItem=items.remove(items.size()-1);
            
            if(items.isEmpty()){
            	return lastItem;
            }
            
            items.set(0, lastItem);
            siftDown(0);
            
            
			return maxItem;
            
            
        }
        
        public boolean isEmpty(){
        	return items.isEmpty();
        }
        
        
    	
    }

}
