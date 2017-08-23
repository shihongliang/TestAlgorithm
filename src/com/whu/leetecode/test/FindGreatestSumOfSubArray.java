package com.whu.leetecode.test;

/**
 * @author hongliang
 */
public class FindGreatestSumOfSubArray {

    public int FindGreatestSumOfSubArray(int[] array){
        if(array==null||array.length==0)
            return -1;
        int curSum=0;
        int generateSum=0;
        for(int i=0;i<array.length;i++){
            if(curSum<0)
                curSum=array[i];
            else{
                curSum+=array[i];
            }
            if(curSum>generateSum){
                generateSum=curSum;
            }
        }
        return generateSum;
    }
}
