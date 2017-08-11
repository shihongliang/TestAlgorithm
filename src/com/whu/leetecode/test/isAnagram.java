package com.whu.leetecode.test;

/**
 * @author hongliang
 */
public class isAnagram {
    
    public boolean isAnagram(String s, String t) {
       int[] alphabet=new int[26];
       for(int i=0;i<s.length();i++){
           alphabet[s.charAt(i)-'a']++;
       }
       
       for(int i=0;i<t.length();i++){
           alphabet[t.charAt(i)-'a']--;
           if(alphabet[t.charAt(i)-'a']<0)
               return false;
       }
       for(int i:alphabet){
           if(i!=0)
               return false;
       }
           
        return true;
    }
    
    public static void main(String[]args){
        isAnagram ia=new isAnagram();
        ia.isAnagram("rat", "cat");
    }

}
