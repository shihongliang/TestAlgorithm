package com.whu.leetecode.test;

import java.util.Arrays;

/**
 * @author hongliang
 */
public class findContentChildren {
    
  public int findContentChildren(int[] g, int[] s) {
      Arrays.sort(g);
      Arrays.sort(s);
      int count=0;
      for(int i=0;i<g.length&&i<s.length;i++){
          if(g[i]<=s[i]){
              count++;
          }
      }
      
      return count;
        
    }

}
