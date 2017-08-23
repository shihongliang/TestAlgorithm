package com.whu.leetecode.test;

/**
 * @author hongliang
 */
public class StringArrange {
    
    public void recursionArrange(char[] arrayA,int start,int end){
        if(end<=1)
            return ;
        if(start==end){
            for(int i=0;i<arrayA.length;i++){
                System.out.println(arrayA[i]);
            }
        }else{
            for(int i=start;i<=end;i++){
                swap(arrayA,i,start);
                recursionArrange(arrayA,start+1,end);
                swap(arrayA,i,start);
            }
        }
    }

    /**
     * @param arrayA
     * @param i
     * @param start
     */
    private void swap(char[] arrayA, int m, int n) {
        // TODO Auto-generated method stub
        char temp=arrayA[m];
        arrayA[m]=arrayA[n];
        arrayA[n]=temp;
    }

}
