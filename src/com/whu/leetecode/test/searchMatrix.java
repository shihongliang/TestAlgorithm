package com.whu.leetecode.test;

/**
 * @author hongliang
 */
public class searchMatrix {
    
   public boolean searchMatrix(int[][] matrix, int target) {
           
       
  
           int j=matrix[0].length-1;
           int i=0;
           while(j>=0&&i<matrix.length){
               
               int n=matrix[0][matrix.length-1];
               if(n>target){
                   j--;
               }else if(n<target){
                   i++;
               }else{
                   return true;
               }
           }

   
       return false;
        
    }

}
