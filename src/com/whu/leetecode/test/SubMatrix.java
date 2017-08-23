package com.whu.leetecode.test;

/**
 * @author hongliang
 */
public class SubMatrix {
    
    public int sumOfSubMatrix(int[][] mat, int n){
        int[] temp=new int[n];
        for(int i=0;i<n;i++){
            temp[i]=0;
        }
        int max=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            temp=mat[i];
            max=(maxSubArray(temp,n)>max)?maxSubArray(temp,n):max;
            for(int j=i+1;j<n;j++){
                for(int k=0;k<n;k++){
                    temp[k]+=mat[j][k];
                }
                max=(maxSubArray(temp,n)>max)?maxSubArray(temp,n):max;
            }
        }
        
        return max;
    }

    /**
     * @param temp
     * @param n
     * @return
     */
    private int maxSubArray(int[] array, int n) {
        // TODO Auto-generated method stub
        int sum=0;
        int max=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            sum+=array[i];
            if(sum<0){
                sum=0;
                if(sum>max)
                    max=sum;
            }
        }
        return 0;
    }

}
