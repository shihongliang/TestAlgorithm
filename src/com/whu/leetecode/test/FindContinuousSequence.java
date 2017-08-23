package com.whu.leetecode.test;

import java.util.ArrayList;

/**
 * @author hongliang
 */
public class FindContinuousSequence {
    
    public ArrayList<ArrayList<Integer> > FindContinuousSequence(int sum){
        ArrayList<ArrayList<Integer>> list=new ArrayList<ArrayList<Integer>>();
        int startIndex=1;
        int endIndex=2;
        int curSum=3;
        int mid=sum/2;
        while(endIndex<mid||startIndex<endIndex){
            if(curSum==sum){
                list.add(this.saveList(startIndex, endIndex));
            }
            endIndex++;
            curSum+=endIndex;
            while(curSum>sum){
                curSum-=startIndex;
                startIndex++;
            }
        }
        return list;
    }
    
    public ArrayList<Integer> saveList(int startIndex,int endIndex){
        ArrayList<Integer> resList=new ArrayList<Integer>();
        for(int i=startIndex;i<=endIndex;i++){
            resList.add(i);
        }
        return resList;
    }
}
