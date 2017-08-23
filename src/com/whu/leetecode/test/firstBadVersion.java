package com.whu.leetecode.test;

/**
 * @author hongliang
 */
public class firstBadVersion {

    public int firstBadVersion(int n) {
        int start=1,end=n;
        while(start<end){
            int mid=start + (end-start) / 2;
            if(!isBadVersion(mid))
                start=mid+1;
            else
                end=mid;
        }
        return start;
    }

    /**
     * @param mid
     * @return
     */
    private boolean isBadVersion(int mid) {
        // TODO Auto-generated method stub
        return false;
    }
    
}
