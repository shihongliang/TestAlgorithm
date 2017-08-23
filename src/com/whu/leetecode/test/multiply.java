package com.whu.leetecode.test;

/**
 * @author hongliang
 */
public class multiply {
    
    public int[] multiply(int[] A) {
        int[] B=new int[A.length];
        B[0]=1;
        for(int i=1;i<A.length;i++){
            B[i]=B[i-1]*A[i-1];
        }
        int tmp=1;
        for(int i=A.length-2;i>=0;i--){
            tmp*=A[i+1];
            B[i]*=tmp;
        }
        return B;
    }

}
