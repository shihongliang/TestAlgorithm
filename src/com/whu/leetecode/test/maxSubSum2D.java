package com.whu.leetecode.test;

/**
 * @author hongliang
 */
public class maxSubSum2D {
    
    public static int maxSubSum2D(int[][] matrix, int N, int M) {
        int sum=Integer.MAX_VALUE;
        int[][] totalColSum=new int[N][M];
        int[] subColSum=new int[M];
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                if(i==0)
                    totalColSum[i][j]=matrix[i][j];
                else
                    totalColSum[i][j]=totalColSum[i-1][j]+matrix[i][j];
            }
        }
        for(int r=0;r<N-1;r++){
            for(int k=r;k<N;k++){
                if(r==1&&k==3){
                    System.out.println("");
                }
                for(int j=0;j<M;j++){
                    if(r==k){
                        subColSum[j]=matrix[r][j];
                    }else if(r==0){
                        subColSum[j]=totalColSum[k][j];
                    }else{
                        subColSum[j]=totalColSum[k][j]-totalColSum[r-1][j];
                    }
                }
             //   sum=Math.max(sum, MaxSubSum.maxSubSum(subColSum));//转为最大子段和
            }
        }
        
        return M;
    }

}
