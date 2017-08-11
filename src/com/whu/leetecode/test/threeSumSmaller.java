package com.whu.leetecode.test;

import java.util.Arrays;

/**
 * @author hongliang
 */
public class threeSumSmaller {

    public int threeSumSmaller(int[] nums, int target) {
        Arrays.sort(nums);
        int cnt=0;
        for(int i=0;i<nums.length;i++){
            int left=i+1,right=nums.length;
            while(left<right){
                int sum=nums[i]+nums[left]+nums[right];
                if(sum<target){
                    cnt+=right-left;
                    left++;
                }else{
                    right--;
                }
            }
        }
        return target;  
    }
    
}
