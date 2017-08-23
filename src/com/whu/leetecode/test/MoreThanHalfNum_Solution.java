package com.whu.leetecode.test;

/**
 * @author hongliang
 */
public class MoreThanHalfNum_Solution {
    
    public int MoreThanHalfNum_Solution(int [] array){
        int length=array.length;
        if(array==null||length<1){
            return 0;
        }
        int result=array[0];
        int times=0;
        for(int i=1;i<array.length;i++){
            if(times==0){
                result=array[i];
                times++;
            }else{
                if(array[i]==result){
                    times++;
                }else{
                    times--;
                }
            }
        }
        times=0;
        for(int i=0;i<length;i++){
            if(result==array[i]){
                times++;
            }
        }
        if(times*2<result){
            times=0;
        }
        return result;
    }

}
