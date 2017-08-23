package com.whu.leetecode.test;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author hongliang
 */
public class ZigzagIterator {
    
    Queue<Iterator<Integer>> q;
    
    public ZigzagIterator(List<Integer> v1, List<Integer> v2) {
        q=new LinkedList<Iterator<Integer>>();
        Iterator<Integer> it1=v1.iterator();
        Iterator<Integer> it2=v2.iterator();
        if(it1.hasNext()){
            q.add(it1);
        }
        
        if(it2.hasNext()){
            q.add(it2);
        }
        
    }

}
