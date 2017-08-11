package com.whu.leetecode.test;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * @author hongliang
 */
public class maxSlidingWindow {
    
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(nums==null||k<=0)
            return new int[0];
        int n=nums.length;
        int[] r=new int[n-k+1];
        int ri=0;
        Deque<Integer> q=new ArrayDeque<Integer>();
                
        for(int i=0;i<n;i++){
            while(!q.isEmpty()&&q.peek()<i-k+1){
                System.out.println(q.poll());
                q.poll();
            }
            
            while(!q.isEmpty()&&nums[q.peekLast()]<nums[i]){
                System.out.println(q.pollLast());
                q.pollLast();
            }
          
            q.offer(i);
            if(i>=k-1){
                r[ri++]=nums[q.peek()];
                System.out.println(r[ri]);
            }
            
        }
        return r;
    }
    
    public static void main(String[]args){
        int[] arr={1,3,-1,-3,5,3,6,7};
        maxSlidingWindow m= new maxSlidingWindow();
        m.maxSlidingWindow(arr, 3);
    }

}
