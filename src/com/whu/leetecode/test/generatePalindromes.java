package com.whu.leetecode.test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hongliang
 */
public class generatePalindromes {
    
    private List<String> list=new ArrayList<String>();
    
    public List<String> generatePalindromes(String s){
        int numOdds=0;
        int[] map=new int[256];
        for(char c:s.toCharArray()){
            map[c]++;
            numOdds=(map[c]&1)==1?numOdds+1:numOdds-1;
        }
        if(numOdds>1)
            return list;
        String mid="";
        int halfLen=0;
        for(int i=0;i<256;i++){
            if(map[i]==0) continue;
            if((map[i]&1)==1){
                mid=""+i;
                map[i]--;
            }
            map[i]=map[i]/2;
            halfLen+=map[i];
        }  
        generatePalindoremoe("",map,halfLen,mid);
        
        return list;
    }

    /**
     * @param string
     * @param map
     * @param halfLen
     * @param mid
     */
    private void generatePalindoremoe(String half, int[] map, int halfLen, String mid) {
        // TODO Auto-generated method stub
        if(half.length()==halfLen){
            StringBuilder sb=new StringBuilder(half).reverse();
            list.add(half+mid+sb);
            return ;
        }
        
        for(int i=0;i<256;i++){
            if(map[i]>0){
                map[i]--;
                generatePalindoremoe(half+i, map, halfLen, mid);
                map[i]++;
            }
        }
        
    }

}
